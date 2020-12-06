package viachaslavau.onlinelibrary.jsfui.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import java.io.Serializable;

// описывает необходимое поведение для всех JSF контроллеров
public abstract class AbstractController<T> implements Serializable {

    // постранично выводит книги
    public abstract Page<T> search(int first, int count, String sortField, Sort.Direction sortDirection);

    // для основных действий (CRUD): create, read, update, delete.
    //В системах, реализующих доступ к базе данных через API в стиле REST, функции реализуются зачастую (но не обязательно)
    // через HTTP-методы POST, GET, PUT и DELETE соответственно.
    public abstract void addAction();
    public abstract void editAction();
    public abstract void deleteAction();
}
