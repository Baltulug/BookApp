package uz.gita.bookapp.data.source.local.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import uz.gita.bookapp.data.source.local.entity.BookEntity;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class BookDao_Impl implements BookDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BookEntity> __insertionAdapterOfBookEntity;

  private final EntityDeletionOrUpdateAdapter<BookEntity> __updateAdapterOfBookEntity;

  public BookDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookEntity = new EntityInsertionAdapter<BookEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `books` (`author`,`bookUrl`,`coverUrl`,`genre`,`id`,`page`,`rate`,`reference`,`title`,`year`,`readerPages`) VALUES (?,?,?,?,nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookEntity value) {
        if (value.getAuthor() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAuthor());
        }
        if (value.getBookUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBookUrl());
        }
        if (value.getCoverUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCoverUrl());
        }
        if (value.getGenre() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getGenre());
        }
        stmt.bindLong(5, value.getId());
        stmt.bindLong(6, value.getPage());
        stmt.bindLong(7, value.getRate());
        if (value.getReference() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getReference());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTitle());
        }
        if (value.getYear() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getYear());
        }
        stmt.bindLong(11, value.getReaderPages());
      }
    };
    this.__updateAdapterOfBookEntity = new EntityDeletionOrUpdateAdapter<BookEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `books` SET `author` = ?,`bookUrl` = ?,`coverUrl` = ?,`genre` = ?,`id` = ?,`page` = ?,`rate` = ?,`reference` = ?,`title` = ?,`year` = ?,`readerPages` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookEntity value) {
        if (value.getAuthor() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAuthor());
        }
        if (value.getBookUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBookUrl());
        }
        if (value.getCoverUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCoverUrl());
        }
        if (value.getGenre() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getGenre());
        }
        stmt.bindLong(5, value.getId());
        stmt.bindLong(6, value.getPage());
        stmt.bindLong(7, value.getRate());
        if (value.getReference() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getReference());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTitle());
        }
        if (value.getYear() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getYear());
        }
        stmt.bindLong(11, value.getReaderPages());
        stmt.bindLong(12, value.getId());
      }
    };
  }

  @Override
  public void insertBook(final BookEntity book) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfBookEntity.insert(book);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateBook(final BookEntity book) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfBookEntity.handle(book);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<BookEntity> getBooks() {
    final String _sql = "SELECT * FROM books";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfBookUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "bookUrl");
      final int _cursorIndexOfCoverUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "coverUrl");
      final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(_cursor, "page");
      final int _cursorIndexOfRate = CursorUtil.getColumnIndexOrThrow(_cursor, "rate");
      final int _cursorIndexOfReference = CursorUtil.getColumnIndexOrThrow(_cursor, "reference");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
      final int _cursorIndexOfReaderPages = CursorUtil.getColumnIndexOrThrow(_cursor, "readerPages");
      final List<BookEntity> _result = new ArrayList<BookEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final BookEntity _item;
        final String _tmpAuthor;
        if (_cursor.isNull(_cursorIndexOfAuthor)) {
          _tmpAuthor = null;
        } else {
          _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        }
        final String _tmpBookUrl;
        if (_cursor.isNull(_cursorIndexOfBookUrl)) {
          _tmpBookUrl = null;
        } else {
          _tmpBookUrl = _cursor.getString(_cursorIndexOfBookUrl);
        }
        final String _tmpCoverUrl;
        if (_cursor.isNull(_cursorIndexOfCoverUrl)) {
          _tmpCoverUrl = null;
        } else {
          _tmpCoverUrl = _cursor.getString(_cursorIndexOfCoverUrl);
        }
        final String _tmpGenre;
        if (_cursor.isNull(_cursorIndexOfGenre)) {
          _tmpGenre = null;
        } else {
          _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
        }
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpPage;
        _tmpPage = _cursor.getInt(_cursorIndexOfPage);
        final int _tmpRate;
        _tmpRate = _cursor.getInt(_cursorIndexOfRate);
        final String _tmpReference;
        if (_cursor.isNull(_cursorIndexOfReference)) {
          _tmpReference = null;
        } else {
          _tmpReference = _cursor.getString(_cursorIndexOfReference);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpYear;
        if (_cursor.isNull(_cursorIndexOfYear)) {
          _tmpYear = null;
        } else {
          _tmpYear = _cursor.getString(_cursorIndexOfYear);
        }
        final int _tmpReaderPages;
        _tmpReaderPages = _cursor.getInt(_cursorIndexOfReaderPages);
        _item = new BookEntity(_tmpAuthor,_tmpBookUrl,_tmpCoverUrl,_tmpGenre,_tmpId,_tmpPage,_tmpRate,_tmpReference,_tmpTitle,_tmpYear,_tmpReaderPages);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
