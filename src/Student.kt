/**
 * Created by Mark on 2017/10/31.
 */
import java.util.Date
class Student(val name:String?,var age:Int?){
    val time:String
    get() {
        val date = Date()
        return date.toString()
    }
}