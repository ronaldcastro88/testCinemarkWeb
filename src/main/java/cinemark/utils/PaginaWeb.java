package banco.utils;

public enum PaginaWeb {

    CINEMARK(" https://cinemark-colombia-dev-staging-lqm19h4cv-cinemark-colombia.vercel.app/");

    private String url;

    PaginaWeb(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}