
package fr.univtours.polytech.bookshop.model.openlibrary;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "author_key",
    "author_name",
    "cover_edition_key",
    "cover_i",
    "ebook_access",
    "ebook_count_i",
    "edition_count",
    "edition_key",
    "first_publish_year",
    "has_fulltext",
    "ia",
    "ia_collection",
    "ia_collection_s",
    "isbn",
    "key",
    "language",
    "last_modified_i",
    "lcc",
    "lccn",
    "lending_edition_s",
    "lending_identifier_s",
    "number_of_pages_median",
    "oclc",
    "osp_count",
    "printdisabled_s",
    "public_scan_b",
    "publish_date",
    "publish_place",
    "publish_year",
    "publisher",
    "seed",
    "title",
    "title_suggest",
    "title_sort",
    "type",
    "id_goodreads",
    "id_librarything",
    "subject",
    "place",
    "time",
    "readinglog_count",
    "want_to_read_count",
    "currently_reading_count",
    "already_read_count",
    "publisher_facet",
    "time_facet",
    "place_key",
    "subject_facet",
    "_version_",
    "place_facet",
    "lcc_sort",
    "author_facet",
    "subject_key",
    "time_key",
    "format",
    "ratings_count_1",
    "ratings_count_2",
    "ratings_count_3",
    "ratings_count_4",
    "ratings_count_5",
    "ratings_average",
    "ratings_sortable",
    "ratings_count",
    "ddc",
    "ddc_sort",
    "contributor"
})
@Generated("jsonschema2pojo")
public class Doc {

    @JsonProperty("author_key")
    private List<String> author_key;
    @JsonProperty("author_name")
    private List<String> author_name;
    @JsonProperty("cover_edition_key")
    private String cover_edition_key;
    @JsonProperty("cover_i")
    private Integer cover_i;
    @JsonProperty("ebook_access")
    private String ebook_access;
    @JsonProperty("ebook_count_i")
    private Integer ebook_count_i;
    @JsonProperty("edition_count")
    private Integer edition_count;
    @JsonProperty("edition_key")
    private List<String> edition_key;
    @JsonProperty("first_publish_year")
    private Integer first_publish_year;
    @JsonProperty("has_fulltext")
    private Boolean has_fulltext;
    @JsonProperty("ia")
    private List<String> ia;
    @JsonProperty("ia_collection")
    private List<String> ia_collection;
    @JsonProperty("ia_collection_s")
    private String ia_collection_s;
    @JsonProperty("isbn")
    private List<String> isbn;
    @JsonProperty("key")
    private String key;
    @JsonProperty("language")
    private List<String> language;
    @JsonProperty("last_modified_i")
    private Integer last_modified_i;
    @JsonProperty("lcc")
    private List<String> lcc;
    @JsonProperty("lccn")
    private List<String> lccn;
    @JsonProperty("lending_edition_s")
    private String lending_edition_s;
    @JsonProperty("lending_identifier_s")
    private String lending_identifier_s;
    @JsonProperty("number_of_pages_median")
    private Integer number_of_pages_median;
    @JsonProperty("oclc")
    private List<String> oclc;
    @JsonProperty("osp_count")
    private Integer osp_count;
    @JsonProperty("printdisabled_s")
    private String printdisabled_s;
    @JsonProperty("public_scan_b")
    private Boolean public_scan_b;
    @JsonProperty("publish_date")
    private List<String> publish_date;
    @JsonProperty("publish_place")
    private List<String> publish_place;
    @JsonProperty("publish_year")
    private List<Integer> publish_year;
    @JsonProperty("publisher")
    private List<String> publisher;
    @JsonProperty("seed")
    private List<String> seed;
    @JsonProperty("title")
    private String title;
    @JsonProperty("title_suggest")
    private String title_suggest;
    @JsonProperty("title_sort")
    private String title_sort;
    @JsonProperty("type")
    private String type;
    @JsonProperty("id_goodreads")
    private List<String> id_goodreads;
    @JsonProperty("id_librarything")
    private List<String> id_librarything;
    @JsonProperty("subject")
    private List<String> subject;
    @JsonProperty("place")
    private List<String> place;
    @JsonProperty("time")
    private List<String> time;
    @JsonProperty("readinglog_count")
    private Integer readinglog_count;
    @JsonProperty("want_to_read_count")
    private Integer want_to_read_count;
    @JsonProperty("currently_reading_count")
    private Integer currently_reading_count;
    @JsonProperty("already_read_count")
    private Integer already_read_count;
    @JsonProperty("publisher_facet")
    private List<String> publisher_facet;
    @JsonProperty("time_facet")
    private List<String> time_facet;
    @JsonProperty("place_key")
    private List<String> place_key;
    @JsonProperty("subject_facet")
    private List<String> subject_facet;
    @JsonProperty("_version_")
    private Long _version_;
    @JsonProperty("place_facet")
    private List<String> place_facet;
    @JsonProperty("lcc_sort")
    private String lcc_sort;
    @JsonProperty("author_facet")
    private List<String> author_facet;
    @JsonProperty("subject_key")
    private List<String> subject_key;
    @JsonProperty("time_key")
    private List<String> time_key;
    @JsonProperty("format")
    private List<String> format;
    @JsonProperty("ratings_count_1")
    private Integer ratings_count_1;
    @JsonProperty("ratings_count_2")
    private Integer ratings_count_2;
    @JsonProperty("ratings_count_3")
    private Integer ratings_count_3;
    @JsonProperty("ratings_count_4")
    private Integer ratings_count_4;
    @JsonProperty("ratings_count_5")
    private Integer ratings_count_5;
    @JsonProperty("ratings_average")
    private Double ratings_average;
    @JsonProperty("ratings_sortable")
    private Double ratings_sortable;
    @JsonProperty("ratings_count")
    private Integer ratings_count;
    @JsonProperty("ddc")
    private List<String> ddc;
    @JsonProperty("ddc_sort")
    private String ddc_sort;
    @JsonProperty("contributor")
    private List<String> contributor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("author_key")
    public List<String> getAuthor_key() {
        return author_key;
    }

    @JsonProperty("author_key")
    public void setAuthor_key(List<String> author_key) {
        this.author_key = author_key;
    }

    @JsonProperty("author_name")
    public List<String> getAuthor_name() {
        return author_name;
    }

    @JsonProperty("author_name")
    public void setAuthor_name(List<String> author_name) {
        this.author_name = author_name;
    }

    @JsonProperty("cover_edition_key")
    public String getCover_edition_key() {
        return cover_edition_key;
    }

    @JsonProperty("cover_edition_key")
    public void setCover_edition_key(String cover_edition_key) {
        this.cover_edition_key = cover_edition_key;
    }

    @JsonProperty("cover_i")
    public Integer getCover_i() {
        return cover_i;
    }

    @JsonProperty("cover_i")
    public void setCover_i(Integer cover_i) {
        this.cover_i = cover_i;
    }

    @JsonProperty("ebook_access")
    public String getEbook_access() {
        return ebook_access;
    }

    @JsonProperty("ebook_access")
    public void setEbook_access(String ebook_access) {
        this.ebook_access = ebook_access;
    }

    @JsonProperty("ebook_count_i")
    public Integer getEbook_count_i() {
        return ebook_count_i;
    }

    @JsonProperty("ebook_count_i")
    public void setEbook_count_i(Integer ebook_count_i) {
        this.ebook_count_i = ebook_count_i;
    }

    @JsonProperty("edition_count")
    public Integer getEdition_count() {
        return edition_count;
    }

    @JsonProperty("edition_count")
    public void setEdition_count(Integer edition_count) {
        this.edition_count = edition_count;
    }

    @JsonProperty("edition_key")
    public List<String> getEdition_key() {
        return edition_key;
    }

    @JsonProperty("edition_key")
    public void setEdition_key(List<String> edition_key) {
        this.edition_key = edition_key;
    }

    @JsonProperty("first_publish_year")
    public Integer getFirst_publish_year() {
        return first_publish_year;
    }

    @JsonProperty("first_publish_year")
    public void setFirst_publish_year(Integer first_publish_year) {
        this.first_publish_year = first_publish_year;
    }

    @JsonProperty("has_fulltext")
    public Boolean getHas_fulltext() {
        return has_fulltext;
    }

    @JsonProperty("has_fulltext")
    public void setHas_fulltext(Boolean has_fulltext) {
        this.has_fulltext = has_fulltext;
    }

    @JsonProperty("ia")
    public List<String> getIa() {
        return ia;
    }

    @JsonProperty("ia")
    public void setIa(List<String> ia) {
        this.ia = ia;
    }

    @JsonProperty("ia_collection")
    public List<String> getIa_collection() {
        return ia_collection;
    }

    @JsonProperty("ia_collection")
    public void setIa_collection(List<String> ia_collection) {
        this.ia_collection = ia_collection;
    }

    @JsonProperty("ia_collection_s")
    public String getIa_collection_s() {
        return ia_collection_s;
    }

    @JsonProperty("ia_collection_s")
    public void setIa_collection_s(String ia_collection_s) {
        this.ia_collection_s = ia_collection_s;
    }

    @JsonProperty("isbn")
    public List<String> getIsbn() {
        return isbn;
    }

    @JsonProperty("isbn")
    public void setIsbn(List<String> isbn) {
        this.isbn = isbn;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("language")
    public List<String> getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(List<String> language) {
        this.language = language;
    }

    @JsonProperty("last_modified_i")
    public Integer getLast_modified_i() {
        return last_modified_i;
    }

    @JsonProperty("last_modified_i")
    public void setLast_modified_i(Integer last_modified_i) {
        this.last_modified_i = last_modified_i;
    }

    @JsonProperty("lcc")
    public List<String> getLcc() {
        return lcc;
    }

    @JsonProperty("lcc")
    public void setLcc(List<String> lcc) {
        this.lcc = lcc;
    }

    @JsonProperty("lccn")
    public List<String> getLccn() {
        return lccn;
    }

    @JsonProperty("lccn")
    public void setLccn(List<String> lccn) {
        this.lccn = lccn;
    }

    @JsonProperty("lending_edition_s")
    public String getLending_edition_s() {
        return lending_edition_s;
    }

    @JsonProperty("lending_edition_s")
    public void setLending_edition_s(String lending_edition_s) {
        this.lending_edition_s = lending_edition_s;
    }

    @JsonProperty("lending_identifier_s")
    public String getLending_identifier_s() {
        return lending_identifier_s;
    }

    @JsonProperty("lending_identifier_s")
    public void setLending_identifier_s(String lending_identifier_s) {
        this.lending_identifier_s = lending_identifier_s;
    }

    @JsonProperty("number_of_pages_median")
    public Integer getNumber_of_pages_median() {
        return number_of_pages_median;
    }

    @JsonProperty("number_of_pages_median")
    public void setNumber_of_pages_median(Integer number_of_pages_median) {
        this.number_of_pages_median = number_of_pages_median;
    }

    @JsonProperty("oclc")
    public List<String> getOclc() {
        return oclc;
    }

    @JsonProperty("oclc")
    public void setOclc(List<String> oclc) {
        this.oclc = oclc;
    }

    @JsonProperty("osp_count")
    public Integer getOsp_count() {
        return osp_count;
    }

    @JsonProperty("osp_count")
    public void setOsp_count(Integer osp_count) {
        this.osp_count = osp_count;
    }

    @JsonProperty("printdisabled_s")
    public String getPrintdisabled_s() {
        return printdisabled_s;
    }

    @JsonProperty("printdisabled_s")
    public void setPrintdisabled_s(String printdisabled_s) {
        this.printdisabled_s = printdisabled_s;
    }

    @JsonProperty("public_scan_b")
    public Boolean getPublic_scan_b() {
        return public_scan_b;
    }

    @JsonProperty("public_scan_b")
    public void setPublic_scan_b(Boolean public_scan_b) {
        this.public_scan_b = public_scan_b;
    }

    @JsonProperty("publish_date")
    public List<String> getPublish_date() {
        return publish_date;
    }

    @JsonProperty("publish_date")
    public void setPublish_date(List<String> publish_date) {
        this.publish_date = publish_date;
    }

    @JsonProperty("publish_place")
    public List<String> getPublish_place() {
        return publish_place;
    }

    @JsonProperty("publish_place")
    public void setPublish_place(List<String> publish_place) {
        this.publish_place = publish_place;
    }

    @JsonProperty("publish_year")
    public List<Integer> getPublish_year() {
        return publish_year;
    }

    @JsonProperty("publish_year")
    public void setPublish_year(List<Integer> publish_year) {
        this.publish_year = publish_year;
    }

    @JsonProperty("publisher")
    public List<String> getPublisher() {
        return publisher;
    }

    @JsonProperty("publisher")
    public void setPublisher(List<String> publisher) {
        this.publisher = publisher;
    }

    @JsonProperty("seed")
    public List<String> getSeed() {
        return seed;
    }

    @JsonProperty("seed")
    public void setSeed(List<String> seed) {
        this.seed = seed;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("title_suggest")
    public String getTitle_suggest() {
        return title_suggest;
    }

    @JsonProperty("title_suggest")
    public void setTitle_suggest(String title_suggest) {
        this.title_suggest = title_suggest;
    }

    @JsonProperty("title_sort")
    public String getTitle_sort() {
        return title_sort;
    }

    @JsonProperty("title_sort")
    public void setTitle_sort(String title_sort) {
        this.title_sort = title_sort;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id_goodreads")
    public List<String> getId_goodreads() {
        return id_goodreads;
    }

    @JsonProperty("id_goodreads")
    public void setId_goodreads(List<String> id_goodreads) {
        this.id_goodreads = id_goodreads;
    }

    @JsonProperty("id_librarything")
    public List<String> getId_librarything() {
        return id_librarything;
    }

    @JsonProperty("id_librarything")
    public void setId_librarything(List<String> id_librarything) {
        this.id_librarything = id_librarything;
    }

    @JsonProperty("subject")
    public List<String> getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    @JsonProperty("place")
    public List<String> getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(List<String> place) {
        this.place = place;
    }

    @JsonProperty("time")
    public List<String> getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(List<String> time) {
        this.time = time;
    }

    @JsonProperty("readinglog_count")
    public Integer getReadinglog_count() {
        return readinglog_count;
    }

    @JsonProperty("readinglog_count")
    public void setReadinglog_count(Integer readinglog_count) {
        this.readinglog_count = readinglog_count;
    }

    @JsonProperty("want_to_read_count")
    public Integer getWant_to_read_count() {
        return want_to_read_count;
    }

    @JsonProperty("want_to_read_count")
    public void setWant_to_read_count(Integer want_to_read_count) {
        this.want_to_read_count = want_to_read_count;
    }

    @JsonProperty("currently_reading_count")
    public Integer getCurrently_reading_count() {
        return currently_reading_count;
    }

    @JsonProperty("currently_reading_count")
    public void setCurrently_reading_count(Integer currently_reading_count) {
        this.currently_reading_count = currently_reading_count;
    }

    @JsonProperty("already_read_count")
    public Integer getAlready_read_count() {
        return already_read_count;
    }

    @JsonProperty("already_read_count")
    public void setAlready_read_count(Integer already_read_count) {
        this.already_read_count = already_read_count;
    }

    @JsonProperty("publisher_facet")
    public List<String> getPublisher_facet() {
        return publisher_facet;
    }

    @JsonProperty("publisher_facet")
    public void setPublisher_facet(List<String> publisher_facet) {
        this.publisher_facet = publisher_facet;
    }

    @JsonProperty("time_facet")
    public List<String> getTime_facet() {
        return time_facet;
    }

    @JsonProperty("time_facet")
    public void setTime_facet(List<String> time_facet) {
        this.time_facet = time_facet;
    }

    @JsonProperty("place_key")
    public List<String> getPlace_key() {
        return place_key;
    }

    @JsonProperty("place_key")
    public void setPlace_key(List<String> place_key) {
        this.place_key = place_key;
    }

    @JsonProperty("subject_facet")
    public List<String> getSubject_facet() {
        return subject_facet;
    }

    @JsonProperty("subject_facet")
    public void setSubject_facet(List<String> subject_facet) {
        this.subject_facet = subject_facet;
    }

    @JsonProperty("_version_")
    public Long get_version_() {
        return _version_;
    }

    @JsonProperty("_version_")
    public void set_version_(Long _version_) {
        this._version_ = _version_;
    }

    @JsonProperty("place_facet")
    public List<String> getPlace_facet() {
        return place_facet;
    }

    @JsonProperty("place_facet")
    public void setPlace_facet(List<String> place_facet) {
        this.place_facet = place_facet;
    }

    @JsonProperty("lcc_sort")
    public String getLcc_sort() {
        return lcc_sort;
    }

    @JsonProperty("lcc_sort")
    public void setLcc_sort(String lcc_sort) {
        this.lcc_sort = lcc_sort;
    }

    @JsonProperty("author_facet")
    public List<String> getAuthor_facet() {
        return author_facet;
    }

    @JsonProperty("author_facet")
    public void setAuthor_facet(List<String> author_facet) {
        this.author_facet = author_facet;
    }

    @JsonProperty("subject_key")
    public List<String> getSubject_key() {
        return subject_key;
    }

    @JsonProperty("subject_key")
    public void setSubject_key(List<String> subject_key) {
        this.subject_key = subject_key;
    }

    @JsonProperty("time_key")
    public List<String> getTime_key() {
        return time_key;
    }

    @JsonProperty("time_key")
    public void setTime_key(List<String> time_key) {
        this.time_key = time_key;
    }

    @JsonProperty("format")
    public List<String> getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(List<String> format) {
        this.format = format;
    }

    @JsonProperty("ratings_count_1")
    public Integer getRatings_count_1() {
        return ratings_count_1;
    }

    @JsonProperty("ratings_count_1")
    public void setRatings_count_1(Integer ratings_count_1) {
        this.ratings_count_1 = ratings_count_1;
    }

    @JsonProperty("ratings_count_2")
    public Integer getRatings_count_2() {
        return ratings_count_2;
    }

    @JsonProperty("ratings_count_2")
    public void setRatings_count_2(Integer ratings_count_2) {
        this.ratings_count_2 = ratings_count_2;
    }

    @JsonProperty("ratings_count_3")
    public Integer getRatings_count_3() {
        return ratings_count_3;
    }

    @JsonProperty("ratings_count_3")
    public void setRatings_count_3(Integer ratings_count_3) {
        this.ratings_count_3 = ratings_count_3;
    }

    @JsonProperty("ratings_count_4")
    public Integer getRatings_count_4() {
        return ratings_count_4;
    }

    @JsonProperty("ratings_count_4")
    public void setRatings_count_4(Integer ratings_count_4) {
        this.ratings_count_4 = ratings_count_4;
    }

    @JsonProperty("ratings_count_5")
    public Integer getRatings_count_5() {
        return ratings_count_5;
    }

    @JsonProperty("ratings_count_5")
    public void setRatings_count_5(Integer ratings_count_5) {
        this.ratings_count_5 = ratings_count_5;
    }

    @JsonProperty("ratings_average")
    public Double getRatings_average() {
        return ratings_average;
    }

    @JsonProperty("ratings_average")
    public void setRatings_average(Double ratings_average) {
        this.ratings_average = ratings_average;
    }

    @JsonProperty("ratings_sortable")
    public Double getRatings_sortable() {
        return ratings_sortable;
    }

    @JsonProperty("ratings_sortable")
    public void setRatings_sortable(Double ratings_sortable) {
        this.ratings_sortable = ratings_sortable;
    }

    @JsonProperty("ratings_count")
    public Integer getRatings_count() {
        return ratings_count;
    }

    @JsonProperty("ratings_count")
    public void setRatings_count(Integer ratings_count) {
        this.ratings_count = ratings_count;
    }

    @JsonProperty("ddc")
    public List<String> getDdc() {
        return ddc;
    }

    @JsonProperty("ddc")
    public void setDdc(List<String> ddc) {
        this.ddc = ddc;
    }

    @JsonProperty("ddc_sort")
    public String getDdc_sort() {
        return ddc_sort;
    }

    @JsonProperty("ddc_sort")
    public void setDdc_sort(String ddc_sort) {
        this.ddc_sort = ddc_sort;
    }

    @JsonProperty("contributor")
    public List<String> getContributor() {
        return contributor;
    }

    @JsonProperty("contributor")
    public void setContributor(List<String> contributor) {
        this.contributor = contributor;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
