package controller;

import model.KnowledgeRepository;
import model.Putusan;
import model.StatistikPutusan;
import view.ConsoleView;

import java.util.ArrayList;

public class KnowledgeController {

    private KnowledgeRepository repository;
    private ConsoleView view;

    public KnowledgeController(KnowledgeRepository repository, ConsoleView view) {
        this.repository = repository;
        this.view = view;
    }

    public boolean tambahPutusan(String[] data) {
        return false;
    }

    public ArrayList<Putusan> cariPutusan(String keyword, String mode) {
        return new ArrayList<>();
    }

    public ArrayList<Putusan> filterPutusan(String kriteria, String nilai) {
        return new ArrayList<>();
    }

    public boolean hapusPutusan(String nomor) {
        return false;
    }

    public StatistikPutusan getStatistik() {
        return null;
    }

    public void tampilkanSemua() {
        view.tampilkanDaftarPutusan(repository.getDaftarSemua());
    }
}
