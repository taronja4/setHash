import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {
        private static Map<String,CuerpoCeleste> sistemaSolar=new HashMap<>();
        private static Set<CuerpoCeleste> planetas=new HashSet<>();
        private static Set<CuerpoCeleste> lunas=new HashSet<CuerpoCeleste>();

        public static void main(String[] args) {
                CuerpoCeleste Mercurio=new Planeta("Mercurio",88);
                planetas.add(Mercurio);
                sistemaSolar.put("Mercurio",Mercurio);

                CuerpoCeleste venus=new Planeta("Venus",225);
                planetas.add(venus);
                sistemaSolar.put("Venus",venus);

                CuerpoCeleste LaTierra=new Planeta("La Tierra",365);
                planetas.add(LaTierra);
                sistemaSolar.put("La Tierra",LaTierra);

                CuerpoCeleste Marte=new Planeta("Marte",687);
                planetas.add(Marte);
                sistemaSolar.put("Marte",Marte);

                CuerpoCeleste Jupiter=new Planeta("Juepiter",4332);
                planetas.add(Jupiter);
                sistemaSolar.put("Jupiter",Jupiter);

                CuerpoCeleste Saturno=new Planeta("Saturno",10759);
                planetas.add(Saturno);
                sistemaSolar.put("Saturno",Saturno);

                CuerpoCeleste Urano=new Planeta("Urano",30660);
                planetas.add(Urano);
                sistemaSolar.put("Urano",Urano);

                CuerpoCeleste Neptuno=new Planeta("Neptuno",165);
                planetas.add(Neptuno);
                sistemaSolar.put("Neptuno",Neptuno);

                CuerpoCeleste Pluton=new Planeta("Pluto",248);
                planetas.add(Pluton);
                sistemaSolar.put("Pluton",Pluton);

                CuerpoCeleste Luna=new Luna("Luna",27);
                sistemaSolar.put("Luna",Luna);
                LaTierra.addSatelite(Luna);

                CuerpoCeleste Deimos=new Luna("Deimos",1.3);
                CuerpoCeleste Phobos=new Luna("Phobos",0.3);
                sistemaSolar.put("Deimos",Deimos);
                sistemaSolar.put("Phobos",Phobos);
                Marte.addSatelite(Deimos);
                Marte.addSatelite(Phobos);


                CuerpoCeleste lo=new Luna("lo",1.8);
                CuerpoCeleste Europa=new Luna("Europa",3.5);
                CuerpoCeleste Ganymede=new Luna("Ganymede",7.1);
                CuerpoCeleste Callisto=new Luna("Callisto",16.7);
                sistemaSolar.put("lo",lo);
                sistemaSolar.put("Europa",Europa);
                sistemaSolar.put("Ganymede", Ganymede);
                sistemaSolar.put("Callisto",Callisto);
                Jupiter.addSatelite(lo);
                Jupiter.addSatelite(Europa);
                Jupiter.addSatelite(Ganymede);
                Jupiter.addSatelite(Callisto);


                System.out.println("Planetas del sistema solar");
                for (CuerpoCeleste cd: planetas){
                        System.out.println(cd.toString());
                }
                System.out.println("-------------------------");
                System.out.println("Lunas del sistema solar:");
                for (CuerpoCeleste cdt: planetas){
                        lunas.addAll(cdt.getSatelites());
                }
                System.out.println(lunas);




        }
}
