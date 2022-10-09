public class Domain
{
  public Domain()
  {
    Greetings greetings_object = new Greetings();
    Food food_object = new Food();
    Games games_object = new Games();
    Scanner scan2 = new Scanner(System.in);

    String input = new String();
    boolean foundDomain = new boolean();
    boolean ambiguous = new boolean();
    boolean done_in_domain = new boolean();


  }

  public void getInput(scan)
  {
    input = scan;
  }
  public void determineDomain()
  {
    food_object.check(input);
    if (foundDomain = True)
    {
      food_object.isQueryAmbiguous(input);
      food_object.respond();
      scan2 = scan2.nextLine().toLowerCase();
      scan2.respond();
      return;
    }
    games_object.check(input);
    if (foundDomain = True)
    {
      games_object.isQueryAmbiguous(input);
      games_object.respond();
      scan2 = scan2.nextLine().toLowerCase();
      scan2.respond();
      return;
    }
    greeting_object.check(input);
    if (foundDomain = True)
    {
      greeting_object.isQueryAmbiguous(input);
      greeting_object.respond();
      scan2 = scan2.nextLine().toLowerCase();
      scan2.respond();
      return;
    }
  }

}



// Greetings class


public class Greetings extends Domain
{
  public Greetings()
  {
    ArrayList<String> greeting_major = new ArrayList<String>();
    greeting.add("hi");
    greeting.add("hello");
    greeting.add("what's up");
    greeting.add("whats up");
    greeting.add("hey");
  }
  public check(input)
  {
    for (int i = 0; i < len(greeting_major); i++) {
      if (input.contains(greeting_major.get(i)) == true)
      {
        foundDomain = true;
      }
    }
  }
  public isQueryAmbiguous(input)
  {
    ambiguous = false;
  }

  public respond()
  {
    System.out.println("Hello, nice to meet you!");
  }
}




// Food class


public class Food extends Domain
{
  public food()
  {
    ArrayList<String> food_minor = new ArrayList<String>();
    ArrayList<String> food_minor2 = new ArrayList<String>();
    ArrayList<String> food_major = new ArrayList<String>();
    HashMap<String,String> food_cuisine=new HashMap<String,String>();

    food_minor.add("should i eat");
    food_minor.add("i should eat");
    food_minor.add("should i get");


    food_minor2.add("should i go");
    food_minor2.add("places");
    food_minor2.add("restaurants");
    food_minor2.add("takeout");
    food_minor2.add("go out");

    food_major.add("food");

    food_cuisine.put(“italian”,"Try some Lasagne!");
    food_cuisine.put(“japanese”,"Try some Sashimi!");
    food_cuisine.put(“chinese”,"Try some Kung Pao Chicken!");
    food_cuisine.put(“indian”,"Try some Chicken Tikka Masala!");
    food_cuisine.put(“american”,"Try some Apple Pie!");

  }

  public check(input)
  {
    for (int i = 0; i < len(food_major); i++) {
      if (input.contains(food_major.get(i)) == true)
      {
        foundDomain = true;
      }
    }
  }

  public isQueryAmbiguous(input)
  {
    for (int j = 0; j < len(food_minor); j++)
    {
      if( input.contains(food_minor.get(j)) == true)
      {
        ambiguous = false;
      }
    }
  }

  public respond(input)
  {
    for (Map.Entry<String,String> entry : genres.entrySet())
    {
      if input.contains(entry.getKey())
      {
        return entry.getValue();
      }
    }
    for (i = 0; i < len(food_minor); i++)
    {
      if (input.contains(food_minor.getKey(i)))
      {
        System.println(food_minor.getValue(i));
      }
    }
    System.out.println("Do you want a food to try? If so what cuisine?");
  }
}




// Video Games class



public class Games extends Domain
{
  public Games()
  {
    ArrayList<String> video_game_minor = new ArrayList<String>();
    ArrayList<String> video_game_major = new ArrayList<String>();
    HashMap<String,String> genres=new HashMap<String,String>();

    video_game_minor.add("should i get");
    video_game_minor.add("recommend");
    video_game_minor.add("type");
    video_game_minor.add("should i play");

    video_game_major.add("video game");
    video_game_major.add("game");

    genres.put(“sports”,"Try Madden NFL or FIFA!");
    genres.put(“horror”,"Try Amnesia!");
    genres.put(“adventure”,"Try Minecraft!");
    genres.put(“fps”,"Try Overwatch!");
    genres.put(“puzzle”,"Try Tetris!");
  }

  public check(input)
  {
    for (int i = 0; i < len(video_game_major); i++) {
      if (input.contains(video_game_major.get(i)) == true)
      {
        foundDomain = true;
      }
    }
  }

  public isQueryAmbiguous(input)
  {
    for (int j = 0; j < len(video_game_minor); j++)
    {
      if( input.contains(video_game_minor.get(j)) == true)
      {
        ambiguous = false;
      }
    }
  }

  public respond(input)
  {
    for (Map.Entry<String,String> entry : genres.entrySet())
    {
      if input.contains(entry.getKey())
      {
        return entry.getValue();
      }
    }
    System.out.println("What type of genre do you want to play?");

  }
}
