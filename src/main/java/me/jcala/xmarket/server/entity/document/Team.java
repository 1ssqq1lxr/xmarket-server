package me.jcala.xmarket.server.entity.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "team")
@Getter
@Setter
@NoArgsConstructor
public class Team {
    @Id
    private String id;
    private String name;
    private String description;
    private User sponsor;
    private List<String> trades;
    private String schoolName;
}
