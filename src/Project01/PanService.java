package Project01;
import java.util.HashMap;
import java.util.Map;


public class PanService {
    private static Map<String,Pan> panMap = new HashMap<>();

    static {
        panMap.put("EFGGU23045",new Pan("EFGGU23045","23688999624","Stock,FD,MutualFunds","SBI BANK"));
        panMap.put("EFGGP23044",new Pan("EFGGP23044","76543987601","FD,Stock"," BOI BANK"));
    }
    public Pan getPanByAadhaarNumber(String aadhaarNumber)
    {
        for(Pan pan:panMap.values())
        {
            if(pan.getAadhaarNumber().equals(aadhaarNumber))
            {
                return pan;
            }
        }
        return null;
    }
}
