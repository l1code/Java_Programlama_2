/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.isparta.edu.finalOrnek;

/**
 *
 * @author drhal
 */

/**
 * 
 * Java programlama dilinde her sınıf kendi fiziksel dosyasında durur. 
 * Bir fiziksel .java dosyasının içerisinde
birden fazla sınıf tanımlanabileceğini de hatırlatmak isterim.
* Uygulama tarafından kullanılan bu sınıflar,
bulundukları fiziksel dosyalarından bir seferde topluca sınıf yükleyicisi 
* tarafından belleğe yüklenmezler.
Bunun yerine hangi sınıfa ihtiyaç duyuluyor ise, bu sınıf CLASSPATH 
* değişkenin gösterdiği yerlere
* bakılarak yüklenilmeye çalışılır. 
* Peki bir sınıf tam olarak ne zaman yüklenir ? Cevap, eğer bir sınıfa ait
statik global alan veya statik bir yordam çağrıldığında, bu sınıf, 
* sınıf yükleyicisi (Class Loader) tarafından
yüklenir veya bir sınıfa ait bir nesne oluşturmak istersek yine 
* sınıf yükleyicisi (Class Loader) devreye girerek bu sınıfı yükler. ()
 */

public class Bocek {
    int a=10;
    int b;

    public Bocek() {
        ekranaBas("a="+a+", b="+b);
        b=17;
    }
    
    static int x1=ekranaBas("static Bocek.x1 ilk değer verildi");
    
    static int ekranaBas(String s){
        System.out.println(s);
        return 18;
    }    
}

class Bocekcik extends Bocek{
    int k=ekranaBas("Bocekcik.k ilk deger verildi");

    public Bocekcik() {
        ekranaBas("k="+k);
        ekranaBas("b="+b);
    }
    
    static int x1=ekranaBas("static Bocekcik.x2 ilk değer verildi");
    
    public static void main(String[] args){
        ekranaBas("Bocekcik-basla...");
        Bocekcik b=new Bocekcik();
    }   
}
//yukarıdan aşağıya doğru, ana sınıftan yavru sınıfa doğru, ya da 
//miras alınan sınıftan miras alana  doğru;
//statik ifadelerden statik olmayan ifadelere oradan da yapılandırıcılara doğru bir çalışma var. 


/**
 * 
 * Gelişen olaylar adım adım açıklanırsa, öncelikle, Bocekcik sınıfına ait statik 
 * bir yordam olan main()
çağrılıyor (java Bocekcik komutuyla). Sınıf yükleyici Bocekcik.class fiziksel dosyasını,
* sistemin
CLASSPATH değerlerine bakarak bulmaya çalışır. Eğer bulursa bu sınıf yüklenir. 
* Bocekcik sınıfının
bulunduğunu varsayalım. Bu yükleme esnasında Bocekcik sınıfının türetildiği ortaya çıkar
* (Bocekcik
extends Bocek). Kalıtım kavramından dolayı Bocek sınıfı da, sınıf yükleyicisi tarafından
yüklenir (eğer Bocek sınıfı da türetilmiş olsaydı; türetildiği sınıfta yüklenecekti;
 * böyle sürüp gidebilir…).
()
Daha sonra statik olan global alanlara ilk değerleri verilmeye başlanır. 
* Değer verme işlemi en
yukarıdaki sınıftan başlar ve türemiş alt sınıflara doğru devam eder (aşağıya doğru). 
* Burada en yukarıdaki
sınıf Bocek sınıfıdır - (Object sınıfını hesaba katılmazsa). Bu anlatılanlar göz 
* önüne alındığında ekrana
çıkan ilk iki satırın aşağıdaki gibi olması bir şaşkınlığa sebebiyet vermez. ()
 */

/*
static Bocek.x1 ilk deger verildi
static Bocekcik.x2 ilk deger verildi
*/

/*
Sırada main() yordamının çağrılmasına gelmiştir. 
Ekrana çıkan üçüncü satır aşağıdaki gibidir; ()
Bocekcik - basla..
 * Daha sonra Bocekcik nesnesi oluşturulur (Bocekcik b = new Bocekcik()). 
 * Bu oluşturma sırasında
ilk olarak en yukarıdaki sınıfa (Bocek sınıfı) ait statik olmayan (non-static) 
* alanlara ilk değerleri verilir ve
yapılandırıcısı çağrılır. Ekrana çıkan dördüncü satır aşağıdaki gibidir; 
* a = 10, b = 0
 * Son olarak Bocekcik sınıfının içerisindeki statik olmayan (non-static) 
 * alanlara ilk değerleri verilir ve
Bocekcik sınıfının yapılandırıcısı çağrılır. (
Bocekcik.k ilk deger verildi
k = 18
b = 17
*/