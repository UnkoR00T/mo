package net.zetetic.database.sqlcipher;

import android.database.DatabaseUtils;
import android.os.CancellationSignal;
import net.zetetic.database.CursorWindow;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteConnectionPool f135516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SQLiteConnection f135517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f135518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f135519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Transaction f135520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Transaction f135521f;

    private static final class Transaction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Transaction f135522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f135523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SQLiteTransactionListener f135524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f135525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f135526e;

        private Transaction() {
        }
    }

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool == null) {
            throw new IllegalArgumentException("connectionPool must not be null");
        }
        this.f135516a = sQLiteConnectionPool;
    }

    private void a(String str, int i15, CancellationSignal cancellationSignal) {
        if (this.f135517b == null) {
            this.f135517b = this.f135516a.m(str, i15, cancellationSignal);
            this.f135518c = i15;
        }
        this.f135519d++;
    }

    private void c(int i15, SQLiteTransactionListener sQLiteTransactionListener, int i16, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (this.f135521f == null) {
            a(null, i16, cancellationSignal);
        }
        try {
            if (this.f135521f == null) {
                if (i15 == 1) {
                    this.f135517b.n("BEGIN IMMEDIATE;", null, cancellationSignal);
                } else if (i15 != 2) {
                    this.f135517b.n("BEGIN;", null, cancellationSignal);
                } else {
                    this.f135517b.n("BEGIN EXCLUSIVE;", null, cancellationSignal);
                }
            }
            if (sQLiteTransactionListener != null) {
                try {
                    sQLiteTransactionListener.onBegin();
                } catch (RuntimeException e15) {
                    if (this.f135521f == null) {
                        this.f135517b.n("ROLLBACK;", null, cancellationSignal);
                    }
                    throw e15;
                }
            }
            Transaction transactionL = l(i15, sQLiteTransactionListener);
            transactionL.f135522a = this.f135521f;
            this.f135521f = transactionL;
        } catch (Throwable th4) {
            if (this.f135521f == null) {
                o();
            }
            throw th4;
        }
    }

    private void e(CancellationSignal cancellationSignal, boolean z15) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        Transaction transaction = this.f135521f;
        boolean z16 = false;
        boolean z17 = (transaction.f135525d || z15) && !transaction.f135526e;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.f135524c;
        if (sQLiteTransactionListener != null) {
            try {
                if (z17) {
                    sQLiteTransactionListener.onCommit();
                } else {
                    sQLiteTransactionListener.onRollback();
                }
            } catch (RuntimeException e15) {
                e = e15;
            }
        }
        z16 = z17;
        e = null;
        this.f135521f = transaction.f135522a;
        n(transaction);
        Transaction transaction2 = this.f135521f;
        if (transaction2 == null) {
            try {
                if (z16) {
                    this.f135517b.n("COMMIT;", null, cancellationSignal);
                } else {
                    this.f135517b.n("ROLLBACK;", null, cancellationSignal);
                }
                o();
            } catch (Throwable th4) {
                o();
                throw th4;
            }
        } else if (!z16) {
            transaction2.f135526e = true;
        }
        if (e != null) {
            throw e;
        }
    }

    private boolean j(String str, Object[] objArr, int i15, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            b(2, null, i15, cancellationSignal);
            return true;
        }
        if (sqlStatementType == 5) {
            p();
            d(cancellationSignal);
            return true;
        }
        if (sqlStatementType != 6) {
            return false;
        }
        d(cancellationSignal);
        return true;
    }

    private Transaction l(int i15, SQLiteTransactionListener sQLiteTransactionListener) {
        Transaction transaction = this.f135520e;
        if (transaction != null) {
            this.f135520e = transaction.f135522a;
            transaction.f135522a = null;
            transaction.f135525d = false;
            transaction.f135526e = false;
        } else {
            transaction = new Transaction();
        }
        transaction.f135523b = i15;
        transaction.f135524c = sQLiteTransactionListener;
        return transaction;
    }

    private void n(Transaction transaction) {
        transaction.f135522a = this.f135520e;
        transaction.f135524c = null;
        this.f135520e = transaction;
    }

    private void o() {
        int i15 = this.f135519d - 1;
        this.f135519d = i15;
        if (i15 == 0) {
            try {
                this.f135516a.n0(this.f135517b);
            } finally {
                this.f135517b = null;
            }
        }
    }

    private void q() {
        if (this.f135521f == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    private void r() {
        Transaction transaction = this.f135521f;
        if (transaction != null && transaction.f135525d) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    public void b(int i15, SQLiteTransactionListener sQLiteTransactionListener, int i16, CancellationSignal cancellationSignal) {
        r();
        c(i15, sQLiteTransactionListener, i16, cancellationSignal);
    }

    public void d(CancellationSignal cancellationSignal) {
        q();
        e(cancellationSignal, false);
    }

    public void f(String str, Object[] objArr, int i15, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (j(str, objArr, i15, cancellationSignal)) {
            return;
        }
        a(str, i15, cancellationSignal);
        try {
            this.f135517b.n(str, objArr, cancellationSignal);
        } finally {
            o();
        }
    }

    public int g(String str, Object[] objArr, int i15, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (j(str, objArr, i15, cancellationSignal)) {
            return 0;
        }
        a(str, i15, cancellationSignal);
        try {
            return this.f135517b.o(str, objArr, cancellationSignal);
        } finally {
            o();
        }
    }

    public int h(String str, Object[] objArr, CursorWindow cursorWindow, int i15, int i16, boolean z15, int i17, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        }
        if (j(str, objArr, i17, cancellationSignal)) {
            cursorWindow.p();
            return 0;
        }
        a(str, i17, cancellationSignal);
        try {
            return this.f135517b.p(str, objArr, cursorWindow, i15, i16, z15, cancellationSignal);
        } finally {
            o();
        }
    }

    public long i(String str, Object[] objArr, int i15, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (j(str, objArr, i15, cancellationSignal)) {
            return 0L;
        }
        a(str, i15, cancellationSignal);
        try {
            return this.f135517b.q(str, objArr, cancellationSignal);
        } finally {
            o();
        }
    }

    public boolean k() {
        return this.f135521f != null;
    }

    public void m(String str, int i15, CancellationSignal cancellationSignal, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        a(str, i15, cancellationSignal);
        try {
            this.f135517b.A(str, sQLiteStatementInfo);
        } finally {
            o();
        }
    }

    public void p() {
        q();
        r();
        this.f135521f.f135525d = true;
    }
}
