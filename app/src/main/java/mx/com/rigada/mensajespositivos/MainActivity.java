package mx.com.rigada.mensajespositivos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private static final String TAG="POSITIVE";
    private int random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.mensaje);
        siguienteMensaje(findViewById(R.id.siguiente));
        editText=(EditText) findViewById(R.id.editText);
        random=(int) (Math.random()*mensajes.length);
        textView.setText(mensajes[random]);
        Toast.makeText(this,"HARD CODE SEXY TEXT ", Toast.LENGTH_LONG).show();
        Log.i(TAG,"Welcome to the jungle "+mensajes.length);
    }
    public void siguienteMensaje(View view){
        random++;
        if(random>=mensajes.length-1) {
            random = 0;
        }
        textView.setText(mensajes[random]);
        Log.i(TAG,"Number: "+random);
    }
    public void mensajeAnterior(View view){
        random--;
        if(random<0){
            random=(int) mensajes.length-1;
        }
        textView.setText(mensajes[random]);
        Log.i(TAG,"Number: "+random);
    }
    private String[] mensajes={
            "Somos lo que pensamos. Todo lo que somos surge con nuestros pensamientos. Con nuestros pensamientos construimos el mundo.\n\n-Buddha.",
            "El pesimista ve dificultad en toda oportunidad. El optimista ve oportunidad en toda dificultad.\n\n-Winston Churchill.",
            "No habrá nada que te pueda asustar si te niegas a tener miedo.\n\n-Gandhi.",
            "Solo te puedes cambiar a ti mismo pero a veces eso lo cambia todo.\n\n-Gary W Goldstein.",
            "Despertamos en otros la misma actitud mental que tenemos hacia ellos.\n\n-Elbert Hubbard.",
            "Eres capaz de mucho más de lo que estas pensando, imaginando o haciendo ahora.\n\n-Myles Munroe",
            "¿Cómo voy a vivir hoy de acuerdo al mañana con el que estoy comprometido?-Tony Robbins.",
            "Un pequeño cambio positivo puede cambiar tu día entero o tu vida entera.\n\n-Nishant Grover.",
            "La única diferencia entre un buen y mal día es tu actitud.\n\n-Dennis S. Brown.",
            "Sin una confianza humilde pero razonable en tus propias fuerzas, no puedes ser exitoso o feliz.\n\n-Norman Vincent Peale.",
            "Todo es o una oportunidad para crecer o un obstáculo que evita que crezcas. Puedes decidir.\n\n-Wayne Dyer.",
            "Una actitud positiva puede realmente convertir los sueños en realidad-lo hizo para mi.\n\n-David Bailey.",
            "Estas son mis últimas palabras hacia ti. No tengas miedo de la vida. Cree que merece la pena vivirla y tu creencia creará el hecho.\n\n-William James.",
            "En lo que te conviertes es mucho más importante que lo que consigues. Lo que consigues esta influenciado por lo que eres.\n\n-Jim Rohn.",
            "Una actitud de expectativa positiva es la marca de una personalidad superior.\n\n-Brian Tracy.",
            "Las buenas cosas ocurren todos los días. Solo nos tenemos que dar cuenta de ellas.\n\n-Anne Wilson Schaef.",
            "Hay una pequeña diferencia en las personas, pero esa diferencia marca una gran diferencia. La pequeña diferencia es la actitud. La gran diferencia es si es positiva o negativa.\n\n-W. Clement Stone.",
            "Es algo maravilloso ser optimista. Te mantiene sano y resiliente.\n\n-Daniel Kahneman.",
            "El único lugar donde tus sueños son imposibles es en tus pensamientos.\n\n-Robert H Schulle.",
            "El aprendizaje es un regalo. Incluso cuando el dolor es tu maestro.\n\n-Maya Watson.",
            "Ama la vida que tienes para poder vivir la vida que amas.\n\n-Huseein Nishah.",
            "Tu sonrisa te dará un semblante positivo que hará que la gente se sienta mejor a tu alrededor.\n\n-Les Brown.",
            "Creo que cualquier cosa es posible si tienes la mentalidad, voluntad y deseo para hacerlo y dedicarle tiempo.\n\n-Roger Clemes.",
            "La persona que puede llevar el espíritu de la risa a una habitación es bendecida.\n\n-Bennet Cerf.",
            "El pensamiento positivo es algo más que un eslogan. Cambia la forma en la que nos comportamos. Creo firmemente que cuando soy positivo, soy mejor y hago mejores a los demás.\n\n-Harvey Mackay.",
            "Cuando eres entusiasta sobre lo que haces, sientes energía positiva. Es muy sencillo.\n\n-Paulo Coelho.",
            "Los ganadores tienen el hábito de crearse sus propias expectativas antes del evento.\n\n-Brian Tracy.",
            "El hombre no es más que el producto de sus pensamientos. Se convierte en lo que piensa.\n\n-Gandhi.",
            "Nunca eres demasiado viejo para tener otra meta u otro sueño.\n\n-C.S Lewis.",
            "Nunca digas nada de ti mismo que no quieres que se convierta en realidad.\n\n-Brian Tracy.",
            "Los peores tiempos pueden ser los mejores si piensas con energía positiva.\n\n-Domenico Dolce.",
            "Todo pensamiento es una semilla. Si plantas semillas podridas, no cuentes con recoger manzanas deliciosas.\n\n-Bill Meyer.",
            "La inspiración viene de tu interior. Uno tiene que ser positivo. Cuando lo eres, ocurren cosas buenas.\n\n-Deep Roy.",
            "Mantén tu cara hacia el sol y no podrás ver una sombra.\n\n-Helen Keller.",
            "Soy un pensador positivo, y creo que es lo que me ayuda en los momentos más difíciles.\n\n-Roger Federer.",
            "Convierte siempre una situación negativa en una positiva.\n\n-Michael Jordan.",
            "Vive la vida al máximo y enfócate en lo positivo.\n\n-Matt Cameron.",
            "El mundo es lo que creemos que es. Si podemos cambiar nuestros pensamientos, podemos cambiar el mundo.\n\n-H.M. Tomlinson.",
            "Muchas veces la gente mira al lado negativo de lo que no pueden hacer. Yo siempre miro al lado positivo de lo que puedo hacer.\n\n-Chuck Norris.",
            "El optimismo perpetuo es una multiplicador de fuerzas.\n\n-Colin Powell.",
            "Todos estamos aquí por una razón especial.Deja de ser un prisionero del pasado. Conviértete en el arquitecto de tu futuro.\n\n-Robin Sharma.",
            "La única cosa que se interpone entre un hombre y lo que quiere en la vida, es a menudo la voluntad de intentarlo y la fe de que es posible conseguirlo.\n\n-Richard M.DeVos.",
            "Si no estas encendidos con entusiasmo, serás encendido con entusiasmo.\n\n-Vince Lombardi.",
            "La preocupación da a menudo una gran sombra a algo pequeño.\n\n-Proverbio suizo.",
            "Adoptando la actitud correcta se puede convertir un estrés negativo en uno positivo.\n\n-Dr. Hans Selye.",
            "No conozco ese hombre, lo debo conocer mejor.\n\n-Abraham Lincoln.",
            "Una autoimagen fuerte y positiva es la mejor preparación posible para el éxito.\n\n-Joyce Brothers.",
            "Encuentra un lugar en tu interior donde haya alegría, y la alegría quemará el dolor.\n\n-Joseph Campbell.",
            "Puede que una actitud positiva no resuelva todos tus problemas, pero molestará las suficientes personas para hacer que el esfuerzo merezca la pena.\n\n-Herm Albright.",
            "Debes comenzar a pensar en ti mismo como la persona que quieres ser.\n\n-David Viscott.",
            "Una actitud fuertemente positiva creará más milagros que cualquier droga.\n\n-Patricia Neal.",
            "El pesimismo lleva a la debilidad, el optimismo al poder.\n\n-William James.",
            "La situación no es mala, tus pensamientos respecto a la situación son negativos. Cámbialos.\n\n-Autor desconocido. ",
            "La diferencia entre ganar y perder es a menudo no rendirse.\n\n-Walt Disney.",
            "La única discapacidad en la vida es una mala actitud.\n\n-Scott Hamilton.",
            "Para realizar una acción positiva, debemos desarrollar aquí una visión positiva.\n\n-Dalai Lama.",
            "Di y haz algo positivo que mejore la situación; no se necesita un cerebro para quejarse.\n\n-Robert A.Cook.",
            "La correción hace mucho, pero el ánimo hace mucho más.\n\n-Johann Wolfgang von Goethe.",
            "No se trata de la situación, sino si reaccionamos negativamente o positivamente a la situación.\n\n-Zig Ziglar.",
            "Si no estas cometiendo errores, no estas haciendo nada.\n\n-John Wooden.",
            "Primero tienes que aprender las reglas del juego. Luego tienes que jugar mejor que nadie.\n\n-Albert Einstein.",
            "Para tener éxito, necesitas encontrar algo a lo que aferrarte, algo que te motive, algo que te inspire.\n\n-Tony Dorsett.",
            "Cuando reemplaces los pensamientos negativos con los positivos, empezarás a tener resultados positivos.\n\n-Willie Nelson.",
            "Un pequeño pensamiento positivo en la mañana puede cambiar todo tu día.\n\n-Desconocido.",
            "Nuestras mentes pueden dar forma a lo que una cosa será porque actuamos de acuerdo a nuestras expectativas.\n\n-Federico Fellini. ",
            "Soy un optimista. No tiene mucho sentido ser otra cosa.\n\n-Winston Churchill.",
            "Tienes que aceptar lo que viene y lo único importante es que lo afrontes con coraje y con lo mejor que tienes.\n\n-Eleanor Roosevelt.",
            "Cuando estés en el valle, mantén tu meta firmemente en mente y tendrás energías renovadas para continuar la escalada.\n\n-Denis Waitley.",
            "Nutre la mente como lo harías con tu cuerpo. La mente no puede sobrevivir con comida chatarra.\n\n-Jim Rohn.",
            "Esta es la ley de la atracción: no atraes lo que quieres. Atraes lo que eres.\n\n-Wayne Dyer.",
            "Escribe en tu corazón que cada día es el mejor día del año.\n\n-Ralph Waldo Emerson.",
            "No puedes tener una vida positiva y una mente negativa.\n\n-Joyce Meyer.",
            "El pensador positivo ve lo imposible, siente lo intangible y consigue lo imposible.\n\n-Desconocido.",
            "Termina el día siempre con un pensamiento positivo. No importa lo duras que fueron las cosas, mañana es una buena oportunidad para hacerlas mejor.\n\n-Desconocido.",
            "La gente se vuelve realmente notable cuando empiezan a pensar que pueden hacer cosas. Cuando creen en si mismos, tienen el primer secreto del éxito.\n\n-Norman Vincent Peale.",
            "Aprende a sonreír en toda situación. Míralo como una oportunidad para probar tu fuerza y habilidad.\n\n-Joe Brown.",
            "El día es lo que haces de él.¿Por qué no hacer un gran día?-Steve Schulte.",
            "Somos responsables de lo que somos, y no importa lo queremos ser, tenemos el poder de hacernos a nosotros mismos.\n\n-Swami Vivekanand.a",
            "Lo has hecho antes y lo puedes hacer ahora. Mira las posibilidades positivas. Redirecciona la energía sustancial de tu frustración y conviértela en determinación positiva, efectiva e imparable.\n\n-Ralph Marston.",
            "No dejes que la negatividad del mundo te desmotive. En lugar de ello, date a ti mismo lo que te motiva.\n\n-Les Brown.",
            "Siempre hay flores para los que quieren verlas.\n\n-Henri Matise.",
            "Ser miserable es un hábito; ser feliz es un hábito; y la elección es tuya.\n\n-Tom Hopkins.",
            "Trabaja duro, se positivo y levántate temprano. Es la mejor parte del día.\n\n-George Allen.",
            "El optimismo es el rasgo humano más importante, porque nos permite mejorar nuestra situación y esperar un mañana mejor.\n\n-Seth Godin.",
            "Niégate a que la situación determine tu actitud.\n\n-Charles R. Swindoll.",
            "El mundo se mueve tan rápido estos días que el hombre que dice que no se puede hacer algo, es interrumpido por alguien que lo esta haciendo.\n\n-Elbert Hubbard.",
            "Si alguien te dice “no puedes”, realmente quiere decir “no puedo”.\n\n-Sean Stephenson.",
            "Hay dos maneras de desprender luz: ser la vela o el espejo que la refleja.\n\n-Edith Wharton.",
            "La frustración, aunque dolorosa a veces, es muy positiva y una parte esencial del éxito.\n\n-Bo Bennett.",
            "El sol no brilla para unas pocas flores y árboles, sino para el placer de todo el mundo.\n\n-Henry Ward.",
            "En lugar de pensar en lo que te hace falta, piensa en qué tienes que le hace falta a los demás.\n\n-Desconocido.",
            "El pensamiento positivo te dejará hacer mejor cualquier cosa que el pensamiento negativo.\n\n-Zig Ziglar.",
            "Si no defiendes algo, caerás por cualquier cosa.\n\n-Malcom X.",
            "Ámate a ti mismo. Es importante mantenerse positivo porque la belleza viene del interior al exterior.\n\n-Jenn Proske.",
            "Una persona es grande por sus grandes cualidades, no por la ausencia de fallos.\n\n-Autor desconocido.",
            "No dejes que la gente te falte el respeto. Rodeate de gente positiva.\n\n-Cuba Gooding, Jr.",
            "El pasado no tiene poder sobre el momento presente.\n\n-Eckhart Tolle.",
            "Cuando hago el bien, me siento bien. Cuando hago el mal, me siento mal. Esa es mi religión.\n\n-Abraham Lincoln.",
            "La mejor forma de ganar autoestima es hacer lo que tememos.\n\n-Autor desconocido.",
            "Tenemos la habilidad para decidir en qué pensamientos vamos a detenernos.\n\n-David DeNotaris.",
            "No puedes parar las olas, pero puedes aprender a surfear.\n\n-Jon Kabat-Zinn.",
            "Una actitud positiva es algo en lo que todos pueden trabajar y aprender a usar.\n\n-Joan Lunden.",
            "Una idea mediocre que genera entusiasmo llegará más lejos que una gran idea que no inspire a nadie.\n\n-Mary Kay Ash.",
            "Es increíble. Si la dejas, la vida cambia rápidamente de forma positiva.\n\n-Lindsey Vonn.",
            "Cuando te encuentres con una situación negativa, no pienses sobre ella. Hazla positiva.\n\n-Yoko Ono.",
            "Trabaja con energía y paz, sabiendo que los pensamientos y esfuerzos correctos traerán inevitablemente los resultados correctos.\n\n-James Allen.",
            "Puede que no haya llegado donde intentaba ir, pero creo que he terminado donde necesitaba estar.\n\n-Douglas Adams.",
            "Cada día trae nuevas posibilidades.\n\n-Martha Beck.",
            "La repetición constante lleva a la convicción.\n\n-Robert Collier.",
            "Cuanto más conscientes somos de qué somos realmente, menos problemas tenemos.\n\n-Lynn Grabhorn.",
            "El odio ha causado muchos problemas en este mundo y no ha solucionado ni uno.\n\n-Maya Angelou.",
            "Lo mejor que puedes dar a tu enemigo es el perdón; a un oponente, tolerancia; a un amigo, tu corazón; a un niño, buen ejemplo; a un padre, respeto; a tu madre, sentirse orgullosa; a ti mismo, quererte; a todo hombre, caridad.\n\n-Benjamin Franklin.",
            "La próxima vez que te sientas algo incómodo con la presión en tu vida, recuerda que sin presión, no hay diamantes. La presión es parte del éxito.\n\n-Eric Thomas.",
            "No puedes poner un limite a nada. Cuanto más sueñas, más lejo llegas.\n\n-Michael Phelps.",
            "Prefiero morir persiguiendo lo que quiero, que vivir haciendo lo que me quita la vida.\n\n-Autor desconocido.",
            "Primero piensa en lo que realmente quieres. Luego persíguelo con perseverancia, no te rindas. Cuando decaigas piensa en las recompensas. Con eso habrás conseguido el 50% de tu meta.\n\n-Autor desconocido.",
            "La actitud lo es todo; engloba lo que hacemos, lo que decimos, lo que pensamos y lo que obtenemos.\n\n-Autor desconocido.",
            "Llamamos buena suerte al resultado de tener una buena actitud, esforzarse, arriesgarse, perseverar y mostrarse.\n\n-Autor desconocido.",
            "Todo el coraje necesario es un pensamiento positivo para eliminar los otros cien negativos.\n\n-Desconocido."
    };
}
