# Discord-webhook

## Maven
```xml
<dependency>
            <groupId>com.github.DarthPresident</groupId>
            <artifactId>discord-webhook</artifactId>
            <version>LATEST</version>
</dependency>

<repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
</repositories>
```

## Example
```xml
import java.util.LinkedList;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        //Creating a field, you can do as many, as you need
        DiscordField field = new DiscordField(
                "name of field",  //
                "value of field",
                true);  //or false
        List<DiscordField> fields = new LinkedList<>();
        fields.add(field);

        //Creating a footer
        DiscordFooter footer = new DiscordFooter(
                "your icon url",
                "footer text",
                "proxy icon url");

        //Creating a thumbnail
        DiscordThumbnail thumbnail = new DiscordThumbnail(
                "your icon url",
                "proxy icon url",
                5000, //use int that you need
                5000); //use int that you need
                  
        //Creating a image
        DiscordImage image = new DiscordImage(
                "your image url",
                "proxy icon url",
                5000, //use int that you need
                5000); //use int that you need
        
        //Creating a video
        DiscordVideo video = new DiscordVideo(
                "your video url",
                5000, //use int that you need
                5000); //use int that you need   

        //Creating a embeds
        DiscordEmbed embed = new DiscordEmbed(
                "embed title",
                "embed url",
                "embed description",
                5000, //use int that you need
                footer,
                thumbnail,
                fields);
        //OR 
        DiscordEmbed embed = new DiscordEmbed(
                "embed title",
                "embed url",
                "embed description",
                5000, //use int that you need
                footer,
                image,
                fields);
        //OR 
        DiscordEmbed embed = new DiscordEmbed(
                "embed title",
                "embed url",
                "embed description",
                5000, //use int that you need
                footer,
                video,
                fields);
         //OR 
        DiscordEmbed embed = new DiscordEmbed(
                "embed title",
                "embed url",
                "embed description",
                5000, //use int that you need
                footer,
                thumbnail,
                image,
                fields);
        //OR 
        DiscordEmbed embed = new DiscordEmbed(
                "embed title",
                "embed url",
                "embed description",
                5000, //use int that you need
                footer,
                thumbnail,     
                video,
                fields);                 
                  
                  
        List<DiscordEmbed> embeds = new LinkedList<>();
        embeds.add(embed);

        //Publising
        DiscordWebhook webhook = new DiscordWebhook(
                "webhook content",
                "webhook username",
                "avatar url",
                embeds,
                "your webhook url");
    }
}
```
