// import ;

public class Lang{
	public static String t(String item, String lang){
		String r="";
		switch(item){
			case "title":
				if(lang=="en"){
					r="Number systems converter";
				} else if(lang=="pl") {
					r="Przelicznik systemow liczbowych";
				}
				break;
			case "settings":
				if(lang=="en"){
					r="Settings";
				} else if(lang=="pl") {
					r="Ustawienia";
				}
				break;
			case "op1":
				if(lang=="en"){
					r="Set color of LEDs";
				} else if(lang=="pl") {
					r="Ustaw kolor LEDow";
				}
				break;
			case "op2":
				if(lang=="en"){
					r="Set color of input panel";
				} else if(lang=="pl") {
					r="Ustaw kolor panelu wejsciowego";
				}
				break;
			case "op3":
				if(lang=="en"){
					r="Set color of output panel";
				} else if(lang=="pl") {
					r="Ustaw kolor panelu wyjsciowego";
				}
				break;
			case "op4":
				if(lang=="en"){
					r="Set color of binary output";
				} else if(lang=="pl") {
					r="Ustaw kolor wyniku binarnego";
				}
				break;
			case "op5":
				if(lang=="en"){
					r="Set color of octal output";
				} else if(lang=="pl") {
					r="Ustaw kolor wyniku osemkowego";
				}
				break;
			case "op6":
				if(lang=="en"){
					r="Set color of hexadecimal output";
				} else if(lang=="pl") {
					r="Ustaw kolor wyniku szesnastkowego";
				}
				break;
			case "op7":
				if(lang=="en"){
					r="Toggle size of LEDs";
				} else if(lang=="pl") {
					r="Zmien rozmiar LEDow";
				}
				break;
			case "op8":
				if(lang=="en"){
					r="Change language to polish";
				} else if(lang=="pl") {
					r="Zmien jezyk na polski";
				}
				break;
			case "op9":
				if(lang=="en"){
					r="Change language to english";
				} else if(lang=="pl") {
					r="Zmien jezyk na angielski";
				}
				break;
			case "in1":
				if(lang=="en"){
					r="Input panel";
				} else if(lang=="pl") {
					r="Panel wejsciowy";
				}
				break;
			case "in2":
				if(lang=="en"){
					r="Input system: ";
				} else if(lang=="pl") {
					r="System wejsciowy: ";
				}
				break;
			case "in3":
				if(lang=="en"){
					r="Input number: ";
				} else if(lang=="pl") {
					r="Wartosc wejsciowa: ";
				}
				break;
			case "in4":
				if(lang=="en"){
					r="Convert";
				} else if(lang=="pl") {
					r="Przelicz";
				}
				break;
			case "out1":
				if(lang=="en"){
					r="Output panel";
				} else if(lang=="pl") {
					r="Panel wyjsciowy";
				}
				break;
			case "out2":
				if(lang=="en"){
					r="Binary";
				} else if(lang=="pl") {
					r="Binarnie";
				}
				break;
			case "out3":
				if(lang=="en"){
					r="Binary (LED)";
				} else if(lang=="pl") {
					r="Binarnie (LED)";
				}
				break;
			case "out4":
				if(lang=="en"){
					r="Octal";
				} else if(lang=="pl") {
					r="Osemkowo";
				}
				break;
			case "out5":
				if(lang=="en"){
					r="Hexadecimal";
				} else if(lang=="pl") {
					r="Szesnastkowo";
				}
				break;
			case "er1":
				if(lang=="en"){
					r="Provided number is too large!";
				} else if(lang=="pl") {
					r="Wprowadzona liczba jest za duza!";
				}
				break;
			case "er1t":
				if(lang=="en"){
					r="Out of range!";
				} else if(lang=="pl") {
					r="Poza zakresem!";
				}
				break;
			case "er2":
				if(lang=="en"){
					r="Binary number only consists of ones and zeros!";
				} else if(lang=="pl") {
					r="Liczby binarne skladaja sie tylko z zer oraz jedynek!";
				}
				break;
			case "er2t":
				if(lang=="en"){
					r="Wrong input!";
				} else if(lang=="pl") {
					r="Niepoprawna wartosc wejsciowa!";
				}
				break;
			case "er3":
				if(lang=="en"){
					r="Octal number only consists of digits from 0 to 7!";
				} else if(lang=="pl") {
					r="Liczny osemkowe skladaja sie z cyfr od 0 do 7!";
				}
				break;
			case "er4":
				if(lang=="en"){
					r="Hexadecimal number only consists of digits from 0 to 9 and letters from A to F!";
				} else if(lang=="pl") {
					r="Liczny szesnastkowe skladaja sie z cyfr od 0 do 9 oraz liter od A do F!";
				}
				break;
		}
		return r;
	}
}