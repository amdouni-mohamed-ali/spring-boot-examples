package org.spring.boot.examples.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class GithubRepository {

    private Long id;
    private String name;
    private String fullName;
    private String description;
    private String url;
    private Boolean fork;
    private String language;
    private String defaultBranch;
    private GithubUser owner;

    @Id
    public Long getId() {
        return id;
    }

    public GithubRepository setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GithubRepository setName(String name) {
        this.name = name;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public GithubRepository setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GithubRepository setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public GithubRepository setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getFork() {
        return fork;
    }

    public GithubRepository setFork(Boolean fork) {
        this.fork = fork;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public GithubRepository setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Column(name = "default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public GithubRepository setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "user_id")
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    public GithubUser getOwner() {
        return owner;
    }

    public GithubRepository setOwner(GithubUser owner) {
        this.owner = owner;
        return this;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", fork=" + fork +
                ", language='" + language + '\'' +
                ", defaultBranch='" + defaultBranch + '\'' +
                ", owner=" + owner +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubRepository that = (GithubRepository) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}