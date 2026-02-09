class Netflix {
    public static void main(String[] netflix) {

        String hindiMovieNames[] = {"Laapataa Ladies","Amar Singh Chamkila","Drishyam","Swades","Raat Akeli Hai","Badhaai Do","Article 15","Ludo","Chak De! India","Bulbbul","AK vs AK","Gunjan Saxena","Tribhanga","Khel Khel Mein","The Buckingham Murders","Maharaj","Hichki","Laila Majnu","12th Fail","Bhakshak"};

        String englishMovieNames[] = {"Red Notice","The Gray Man","Don't Look Up","Leave the World Behind","Bird Box","The Adam Project","Extraction II","Glass Onion","Damsel","The Irishman","Rebel Ridge","The Harder They Fall","Murder Mystery","We Can Be Heroes","The Old Guard","I Care a Lot","Uncut Gems","The Trial of the Chicago 7","Pinocchio","Godzilla Minus One"};

        String malayalamMovieNames[] = {"Minnal Murali","Nayattu","Jana Gana Mana","Kurup","Sudani from Nigeria","Iratta","Thallumaala","Kappela","Kuttavum Shikshayum","Aadujeevitham","Irul","Sesham Mike-il Fathima","Vaashi","One","Dear Friend","Thottappan","Anweshippin Kandethum","Kumari","Vikrithi","Rifle Club"};

        String teluguMovieNames[] = {"RRR","Lucky Baskhar","Hi Nanna","Guntur Kaaram","Salaar","Pushpa 2","Devara","Saripodhaa Sanivaaram","Kalki 2898 AD","Kushi","Dasara","Tillu Square","Waltair Veerayya","Bro","Miss Shetty Mr Polishetty","GodFather","Ante Sundaraniki","Mathu Vadalara 2","F3","Cinema Bandi"};

        String spanishMovieNames[] = {"The Platform","The Platform 2","Society of the Snow","Nowhere","Below Zero","Mirage","The Paramedic","Xtreme","The Chalk Line","Infiesto","Sister Death","Sky High","The Legacy of the Bones","Gun City","Cell 211","A Perfect Story","Parallel Mothers","Through My Window","Love at First Kiss","The Perfect Family"};

        System.out.println("Hindi Movie Names:");
        for (String hindiMovieName : hindiMovieNames) {
            System.out.println(hindiMovieName);
        }

        System.out.println("\nEnglish Movie Names:");
        for (String englishMovieName : englishMovieNames) {
            System.out.println(englishMovieName);
        }

        System.out.println("\nMalayalam Movie Names:");
        for (String malayalamMovieName : malayalamMovieNames) {
            System.out.println(malayalamMovieName);
        }

        System.out.println("\nTelugu Movie Names:");
        for (String teluguMovieName : teluguMovieNames) {
            System.out.println(teluguMovieName);
        }

        System.out.println("\nSpanish Movie Names:");
        for (String spanishMovieName : spanishMovieNames) {
            System.out.println(spanishMovieName);
        }
    }
}
