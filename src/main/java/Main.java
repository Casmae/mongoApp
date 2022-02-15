import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import model.Skill;
import org.bson.Document;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public  static void main(String[] args){

       //create connection with Mongo
        MongoClient mongoClient = MongoClients.create("mongodb+srv://asmaye:Assouma30@cluster0.xgag5.mongodb.net/skillNeed?retryWrites=true&w=majority");
        MongoDatabase db = mongoClient.getDatabase("skillNeed");
        MongoCollection cl = db.getCollection("skillNeed");
        try {
            //get Data from local csv file
            List<Skill> skills = importListFromCSV();
            List<Document> docs = mapDBListObject(skills);
            cl.insertMany(docs);
        }catch (IOException ex) {
            System.err.println(ex);
        }

    }

    private static List<Document> mapDBListObject(List<Skill> skills){
        return skills.stream().map(skill -> mapDBObject(skill)).collect(Collectors.toList());
    }

    private static Document mapDBObject(Skill skill) {
        Document docBuilder = new Document();

        docBuilder.append("country_code", skill.getCountry_code());
        docBuilder.append("country_name", skill.getCountry_name());
        docBuilder.append("wb_income", skill.getWb_income());
        docBuilder.append("wb_region", skill.getWb_region());
        docBuilder.append("skill_group_id", skill.getSkill_group_id());
        docBuilder.append("skill_group_category", skill.getSkill_group_category());
        docBuilder.append("skill_group_name", skill.getSkill_group_name());
        docBuilder.append("net_per_10k_2015", skill.getNet_per_10k_2015());
        docBuilder.append("net_per_10k_2016", skill.getNet_per_10k_2016());
        docBuilder.append("net_per_10k_2017", skill.getNet_per_10k_2017());
        docBuilder.append("net_per_10k_2018", skill.getNet_per_10k_2018());
        docBuilder.append("net_per_10k_2019", skill.getNet_per_10k_2019());


        return docBuilder;
    }

    private static List<Skill> importListFromCSV() throws IOException {
        List<Skill> skills = new ArrayList<Skill>();
        String csvFilePath = "C:\\Users\\Asmae CHAH\\IdeaProjects\\myProject\\src\\main\\java\\data\\skill_migration__public.csv";
        BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
        String lineText = null;
        lineReader.readLine();
        while ((lineText = lineReader.readLine()) != null) {
            Skill skill = new Skill();
            String[] data = lineText.split(",");
            if(data.length != 0){

                skill.setCountry_code(data[0]);
                skill.setCountry_name(data[1]);
                skill.setWb_income(data[2]);
                skill.setWb_region(data[3]);
                skill.setSkill_group_id(Integer.parseInt(data[4]));

                skill.setSkill_group_category(data[5]);
                skill.setSkill_group_name(data[6]);
                skill.setNet_per_10k_2015(Double.parseDouble(data[7]));
                skill.setNet_per_10k_2016(Double.parseDouble(data[8]));
                skill.setNet_per_10k_2017(Double.parseDouble(data[9]));
                skill.setNet_per_10k_2018(Double.parseDouble(data[10]));
                skill.setNet_per_10k_2019(Double.parseDouble(data[11]));


                skills.add(skill);
            }

        }
        lineReader.close();
        return skills;
    }
    private static Skill createSkill() {
        Skill skill = new Skill("ma","Morocco","Lower middle income",
                "Middle East & North Africa",2407,"Disruptive Tech Skills","Artificial Intelligence (AI)",
                -591.47,-679.55,-1084.38,-1151D,-1256.61);

        return skill;
    }
}
