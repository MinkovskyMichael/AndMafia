package Model;

import java.util.ArrayList;
import java.util.List;

public class BrainObj {


    public UserObj[] createArrayOfUsers(UserObj uo, int size){
      UserObj[] uoArr = new UserObj[size+1];

      uoArr[0] = uo;

      return uoArr;
    }
}
