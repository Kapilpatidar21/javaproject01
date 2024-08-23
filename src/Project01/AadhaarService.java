package Project01;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    private static Map<String,Aadhaar> aadhaarMap = new HashMap<>();
    static {
        aadhaarMap.put("23688999624",new Aadhaar("23688999624","Rohan","Mr Syam Kumar","Indore"));
        aadhaarMap.put("76543987601",new Aadhaar("76543987601","Ram","Mr mohan Ji","Ujjain"));
    }
    public Aadhaar getAadhaarByNumber(String aadhaarNumber){

        return aadhaarMap.get(aadhaarNumber);
    }

}
