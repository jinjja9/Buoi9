# CÁCH MỞ GỢI Ý CODE
# ĐỌC NHIỀU FILE
# TK,PASS CODEPTIT

## GỢI Ý CODE: `TRL + SPACE`

## Tăng id bù 0

```java
 formattedId = String.format("%03d", id);
```

## Đọc toàn bộ dữ liệu:

```java
 while (sc.hasNext()) 
```

##  Kiểm tra một ký tự là số (digit):

```java
Character.isDigit(c)
```

```java
//vd
char c = '5';
if (Character.isDigit(c)) {
    System.out.println(c + " là số.");
} else {
    System.out.println(c + " không phải là số.");
}
```

## Kiểm tra một ký tự là chữ cái (letter):

```java
Character.isLetter(c)
```

```java
//vd
char c = 'A';
if (Character.isLetter(c)) {
    System.out.println(c + " là chữ cái.");
} else {
    System.out.println(c + " không phải là chữ cái.");
}
```

## Kiểm tra là số

```java
  while (sc.hasNext()) {
            String s = sc.next();
            try {
                int n = Integer.parseInt(s);
                ans += n;  // Là số
            } catch (NumberFormatException e) {
                ans += s + " "; // Là Chuỗi
            }
        }
```


## Đổi ký tự (char) sang số (int) và ngược lại

```java
char c='5';
int k = c - '0'; 
```

```java
int num = 5;
char c = (char) (num + '0');
```

## Chuyển đổi chuỗi (String) sang số

```java
int number = Integer.parseInt(str);
```

## Chuyển đổi số sang chuỗi (String)

```java
String str = String.valueOf(number); //Integer.toString()
```

## Sắp xếp chuỗi

```java
String s="HNAKSJF"
char[] chars = s.toCharArray();
Arrays.sort(chars);
````

## SO sánh đối tượng

```java
public class ClassName implements Comparable<ClassName> {
    @Override
    public int compareTo(ClassName other) {
        // logic so sánh
    }
}
```

```java
@Override
    public int compareTo(MonHoc o) {
        return this.ma.compareTo(o.ma); // this.ma<o.ma (tăng dần.)
        // CÒn muốn giảm dần swap 2 biến là đc
    }
```

## Định dạng ngày tháng

```java
if (date.charAt(1) == '/')
    date = "0" + date;
if (date.charAt(4) == '/')
    date = date.substring(0, 3) + "0" + date.substring(3);
this.date = date;
```

## Chuẩn Hóa họ Tên

```java
    String ChuanHoaTen(String s) {
        String[] words = s.trim().toLowerCase().split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            stringBuilder.append(word).append(" ");
        }
        return stringBuilder.toString().trim();
    }
```
**note**
- Mặc dù split("\\s+") bỏ qua các khoảng trắng thừa giữa các từ, nó không trực tiếp xử lý các khoảng trắng ở đầu và cuối chuỗi đầu vào.
- ví dụ:
```java
String s = "   Nguyen Van Binh   ";
String[] words = s.split("\\s+"); // Kết quả: ["", "Nguyen", "Van", "Binh", ""]
```
- Vì vậy cần trim() ở trước: `trim()` giúp loại bỏ khoảng trắng thừa ở đầu và cuối chuỗi.

## Cách lấy Date để so sánh

```java
     Date getDate(){
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

        @Override
    public int compareTo(SinhVien o) {
        return this.getDate().compareTo(o.getDate());
    }
```

## CHuẩn hóa thời gian

```java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeNormalization {

    public static String normalizeTime(String inputTime) {
        try {
            // Định dạng đầu vào và đầu ra đều là dd/MM/yyyy
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            // Chuyển chuỗi thời gian đầu vào thành đối tượng Date
            Date date = dateFormat.parse(inputTime);

            // Chuyển đối tượng Date thành chuỗi thời gian theo định dạng chuẩn
            return dateFormat.format(date);
        } catch (ParseException e) {
            System.out.println("Lỗi: Thời gian không hợp lệ.");
            return null;
        }
    }

    public static void main(String[] args) {
        String inputTime = "09/12/2024";  // Chuỗi thời gian theo định dạng dd/MM/yyyy
        String normalizedTime = normalizeTime(inputTime);
        System.out.println("Thời gian chuẩn hóa: " + normalizedTime);
    }
}
```

## MAP

### HASH MAP 

```java
map.put(n,map.getOrDefault(n,0)+1);  // Thêm giá trị n vào
// getOrDefault(n,0): Kiểm tra n đã xuất hiện trong map chưa, nếu chưa thì set là 0
```

### HASH MAP 
- Sắp xếp thứ tự của `key`
- Sắp xếp thứ tự theo `value`

```java
 // Chuyển Map thành List (các entrySet)
List<Map.Entry<String, Integer>> list = new ArrayList<>(treeMap.entrySet());

// Sắp xếp danh sách theo giá trị (value)
list.sort((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));
```

### Xuất giá trị trong Map
```java
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
```

## VÀO RA FILE

### SCANNER

```java
Scanner sc = new Scanner(new File("DATA.in"));
``` 

### DataInputStream

- `DataInputStream` hỗ trợ việc đọc dữ liệu dưới dạng các kiểu nguyên thủy như int, long, float, double... trực tiếp từ một file nhị phân (binary file)

```java
DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
int number = dis.readInt();  // đọc số nguyên từ file
String text = dis.readUTF(); // đọc chuỗi từ file
``` 

### ObjectInputStream

- `List<Integer>`

```java
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
List<Integer> list = (List<Integer>) ois.readObject();  // Đọc ArrayList<Integer> từ file
``` 

### TreeSet

- Khai báo: Tăng dần:

```java
        TreeSet<String> treeSet=new TreeSet<>();
```
- Đảo ngược thứ tự 

```java
        TreeSet<String> treeSet=new TreeSet<>(Comparator.reverseOrder());
```

