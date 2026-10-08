package net.zetetic.database.sqlcipher;

import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.SystemClock;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import net.zetetic.database.Logger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteConnectionPool implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SQLiteDatabaseConfiguration f135415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f135416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f135417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f135418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ConnectionWaiter f135419h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ConnectionWaiter f135420j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private SQLiteConnection f135422l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CloseGuard f135412a = CloseGuard.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f135413b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f135414c = new AtomicBoolean();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<SQLiteConnection> f135421k = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final WeakHashMap<SQLiteConnection, AcquiredConnectionStatus> f135423m = new WeakHashMap<>();

    enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    private static final class ConnectionWaiter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConnectionWaiter f135431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Thread f135432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f135433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f135434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f135435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f135436f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f135437g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public SQLiteConnection f135438h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public RuntimeException f135439i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f135440j;

        private ConnectionWaiter() {
        }
    }

    private SQLiteConnectionPool(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.f135415d = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        t0();
    }

    private void C() {
        int size = this.f135421k.size();
        while (true) {
            int i15 = size - 1;
            if (size <= this.f135416e - 1) {
                return;
            }
            y(this.f135421k.remove(i15));
            size = i15;
        }
    }

    private SQLiteConnection C0(String str, int i15) {
        int size = this.f135421k.size();
        if (size > 1 && str != null) {
            for (int i16 = 0; i16 < size; i16++) {
                SQLiteConnection sQLiteConnection = this.f135421k.get(i16);
                if (sQLiteConnection.v(str)) {
                    this.f135421k.remove(i16);
                    I(sQLiteConnection, i15);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection sQLiteConnectionRemove = this.f135421k.remove(size - 1);
            I(sQLiteConnectionRemove, i15);
            return sQLiteConnectionRemove;
        }
        int size2 = this.f135423m.size();
        if (this.f135422l != null) {
            size2++;
        }
        if (size2 >= this.f135416e) {
            return null;
        }
        SQLiteConnection sQLiteConnectionZ = Z(this.f135415d, false);
        I(sQLiteConnectionZ, i15);
        return sQLiteConnectionZ;
    }

    private void E() {
        L(AcquiredConnectionStatus.DISCARD);
    }

    private void H(boolean z15) {
        CloseGuard closeGuard = this.f135412a;
        if (closeGuard != null) {
            if (z15) {
                closeGuard.d();
            }
            this.f135412a.a();
        }
        if (z15) {
            return;
        }
        synchronized (this.f135413b) {
            try {
                u0();
                this.f135417f = false;
                r();
                int size = this.f135423m.size();
                if (size != 0) {
                    Logger.e("SQLiteConnectionPool", "The connection pool for " + this.f135415d.f135466b + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
                }
                T0();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private SQLiteConnection H0(int i15) {
        SQLiteConnection sQLiteConnection = this.f135422l;
        if (sQLiteConnection != null) {
            this.f135422l = null;
            I(sQLiteConnection, i15);
            return sQLiteConnection;
        }
        Iterator<SQLiteConnection> it = this.f135423m.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().w()) {
                return null;
            }
        }
        SQLiteConnection sQLiteConnectionZ = Z(this.f135415d, true);
        I(sQLiteConnectionZ, i15);
        return sQLiteConnectionZ;
    }

    private void I(SQLiteConnection sQLiteConnection, int i15) {
        try {
            sQLiteConnection.J((i15 & 1) != 0);
            this.f135423m.put(sQLiteConnection, AcquiredConnectionStatus.NORMAL);
        } catch (RuntimeException e15) {
            Logger.b("SQLiteConnectionPool", "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i15);
            y(sQLiteConnection);
            throw e15;
        }
    }

    private static int J(int i15) {
        return (i15 & 4) != 0 ? 1 : 0;
    }

    private void K(long j15, int i15) {
        int i16;
        Thread threadCurrentThread = Thread.currentThread();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("The connection pool for database '");
        sb5.append(this.f135415d.f135466b);
        sb5.append("' has been unable to grant a connection to thread ");
        sb5.append(threadCurrentThread.getId());
        sb5.append(" (");
        sb5.append(threadCurrentThread.getName());
        sb5.append(") ");
        sb5.append("with flags 0x");
        sb5.append(Integer.toHexString(i15));
        sb5.append(" for ");
        sb5.append(j15 * 0.001f);
        sb5.append(" seconds.\n");
        ArrayList<String> arrayList = new ArrayList();
        int i17 = 0;
        if (this.f135423m.isEmpty()) {
            i16 = 0;
        } else {
            Iterator<SQLiteConnection> it = this.f135423m.keySet().iterator();
            i16 = 0;
            while (it.hasNext()) {
                String strK = it.next().k();
                if (strK != null) {
                    arrayList.add(strK);
                    i17++;
                } else {
                    i16++;
                }
            }
        }
        int size = this.f135421k.size();
        if (this.f135422l != null) {
            size++;
        }
        sb5.append("Connections: ");
        sb5.append(i17);
        sb5.append(" active, ");
        sb5.append(i16);
        sb5.append(" idle, ");
        sb5.append(size);
        sb5.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb5.append("\nRequests in progress:\n");
            for (String str : arrayList) {
                sb5.append("  ");
                sb5.append(str);
                sb5.append("\n");
            }
        }
        Logger.h("SQLiteConnectionPool", sb5.toString());
    }

    private void L(AcquiredConnectionStatus acquiredConnectionStatus) {
        if (this.f135423m.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f135423m.size());
        for (Map.Entry<SQLiteConnection, AcquiredConnectionStatus> entry : this.f135423m.entrySet()) {
            AcquiredConnectionStatus value = entry.getValue();
            if (acquiredConnectionStatus != value && value != AcquiredConnectionStatus.DISCARD) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f135423m.put((SQLiteConnection) arrayList.get(i15), acquiredConnectionStatus);
        }
    }

    private ConnectionWaiter M(Thread thread, long j15, int i15, boolean z15, String str, int i16) {
        ConnectionWaiter connectionWaiter = this.f135419h;
        if (connectionWaiter != null) {
            this.f135419h = connectionWaiter.f135431a;
            connectionWaiter.f135431a = null;
        } else {
            connectionWaiter = new ConnectionWaiter();
        }
        connectionWaiter.f135432b = thread;
        connectionWaiter.f135433c = j15;
        connectionWaiter.f135434d = i15;
        connectionWaiter.f135435e = z15;
        connectionWaiter.f135436f = str;
        connectionWaiter.f135437g = i16;
        return connectionWaiter;
    }

    public static SQLiteConnectionPool O(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool(sQLiteDatabaseConfiguration);
        sQLiteConnectionPool.V();
        return sQLiteConnectionPool;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    private SQLiteConnection O0(String str, int i15, CancellationSignal cancellationSignal) {
        SQLiteConnection sQLiteConnection;
        RuntimeException runtimeException;
        SQLiteConnection sQLiteConnectionC0;
        SQLiteConnection sQLiteConnectionH0;
        boolean z15 = (i15 & 2) != 0;
        synchronized (this.f135413b) {
            try {
                u0();
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
                if (((this.f135422l != null && this.f135421k.isEmpty()) || z15) && (sQLiteConnectionH0 = H0(i15)) != null) {
                    return sQLiteConnectionH0;
                }
                if (!z15 && (sQLiteConnectionC0 = C0(str, i15)) != null) {
                    return sQLiteConnectionC0;
                }
                int iJ = J(i15);
                final ConnectionWaiter connectionWaiterM = M(Thread.currentThread(), SystemClock.uptimeMillis(), iJ, z15, str, i15);
                ConnectionWaiter connectionWaiter = null;
                for (ConnectionWaiter connectionWaiter2 = this.f135420j; connectionWaiter2 != null; connectionWaiter2 = connectionWaiter2.f135431a) {
                    if (iJ > connectionWaiter2.f135434d) {
                        connectionWaiterM.f135431a = connectionWaiter2;
                        break;
                    }
                    connectionWaiter = connectionWaiter2;
                }
                if (connectionWaiter != null) {
                    connectionWaiter.f135431a = connectionWaiterM;
                } else {
                    this.f135420j = connectionWaiterM;
                }
                final int i16 = connectionWaiterM.f135440j;
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: net.zetetic.database.sqlcipher.SQLiteConnectionPool.1
                        @Override // android.os.CancellationSignal.OnCancelListener
                        public void onCancel() {
                            synchronized (SQLiteConnectionPool.this.f135413b) {
                                try {
                                    ConnectionWaiter connectionWaiter3 = connectionWaiterM;
                                    if (connectionWaiter3.f135440j == i16) {
                                        SQLiteConnectionPool.this.p(connectionWaiter3);
                                    }
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                        }
                    });
                }
                try {
                    long j15 = connectionWaiterM.f135433c + 30000;
                    long j16 = 30000;
                    while (true) {
                        if (this.f135414c.compareAndSet(true, false)) {
                            synchronized (this.f135413b) {
                                T0();
                            }
                        }
                        LockSupport.parkNanos(this, j16 * 1000000);
                        Thread.interrupted();
                        synchronized (this.f135413b) {
                            try {
                                u0();
                                sQLiteConnection = connectionWaiterM.f135438h;
                                runtimeException = connectionWaiterM.f135439i;
                                if (sQLiteConnection != null || runtimeException != null) {
                                    break;
                                    break;
                                }
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                if (jUptimeMillis < j15) {
                                    j16 = jUptimeMillis - j15;
                                } else {
                                    K(jUptimeMillis - connectionWaiterM.f135433c, i15);
                                    j15 = jUptimeMillis + 30000;
                                    j16 = 30000;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        if (cancellationSignal != null) {
                            cancellationSignal.setOnCancelListener(null);
                        }
                        return sQLiteConnection;
                    }
                    d0(connectionWaiterM);
                    if (sQLiteConnection == null) {
                        throw runtimeException;
                    }
                    if (cancellationSignal != null) {
                        cancellationSignal.setOnCancelListener(null);
                    }
                    return sQLiteConnection;
                } catch (Throwable th5) {
                    if (cancellationSignal != null) {
                        cancellationSignal.setOnCancelListener(null);
                    }
                    throw th5;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    private void T0() {
        SQLiteConnection sQLiteConnectionH0;
        ConnectionWaiter connectionWaiter = this.f135420j;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z15 = false;
        boolean z16 = false;
        while (connectionWaiter != null) {
            boolean z17 = true;
            if (this.f135417f) {
                try {
                    if (connectionWaiter.f135435e || z15) {
                        sQLiteConnectionH0 = null;
                    } else {
                        sQLiteConnectionH0 = C0(connectionWaiter.f135436f, connectionWaiter.f135437g);
                        if (sQLiteConnectionH0 == null) {
                            z15 = true;
                        }
                    }
                    if (sQLiteConnectionH0 == null && !z16 && (sQLiteConnectionH0 = H0(connectionWaiter.f135437g)) == null) {
                        z16 = true;
                    }
                    if (sQLiteConnectionH0 != null) {
                        connectionWaiter.f135438h = sQLiteConnectionH0;
                    } else if (z15 && z16) {
                        return;
                    } else {
                        z17 = false;
                    }
                } catch (RuntimeException e15) {
                    connectionWaiter.f135439i = e15;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.f135431a;
            if (z17) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.f135431a = connectionWaiter3;
                } else {
                    this.f135420j = connectionWaiter3;
                }
                connectionWaiter.f135431a = null;
                LockSupport.unpark(connectionWaiter.f135432b);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    private void V() {
        this.f135422l = Z(this.f135415d, true);
        this.f135417f = true;
        this.f135412a.c("close");
    }

    private SQLiteConnection Z(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z15) {
        int i15 = this.f135418g;
        this.f135418g = i15 + 1;
        return SQLiteConnection.y(this, sQLiteDatabaseConfiguration, i15, z15);
    }

    private void b0() {
        SQLiteConnection sQLiteConnection = this.f135422l;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.B(this.f135415d);
            } catch (RuntimeException e15) {
                Logger.c("SQLiteConnectionPool", "Failed to reconfigure available primary connection, closing it: " + this.f135422l, e15);
                y(this.f135422l);
                this.f135422l = null;
            }
        }
        int size = this.f135421k.size();
        int i15 = 0;
        while (i15 < size) {
            SQLiteConnection sQLiteConnection2 = this.f135421k.get(i15);
            try {
                sQLiteConnection2.B(this.f135415d);
            } catch (RuntimeException e16) {
                Logger.c("SQLiteConnectionPool", "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection2, e16);
                y(sQLiteConnection2);
                this.f135421k.remove(i15);
                size += -1;
                i15--;
            }
            i15++;
        }
        L(AcquiredConnectionStatus.RECONFIGURE);
    }

    private boolean c0(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == AcquiredConnectionStatus.RECONFIGURE) {
            try {
                sQLiteConnection.B(this.f135415d);
            } catch (RuntimeException e15) {
                Logger.c("SQLiteConnectionPool", "Failed to reconfigure released connection, closing it: " + sQLiteConnection, e15);
                acquiredConnectionStatus = AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        y(sQLiteConnection);
        return false;
    }

    private void d0(ConnectionWaiter connectionWaiter) {
        connectionWaiter.f135431a = this.f135419h;
        connectionWaiter.f135432b = null;
        connectionWaiter.f135436f = null;
        connectionWaiter.f135438h = null;
        connectionWaiter.f135439i = null;
        connectionWaiter.f135440j++;
        this.f135419h = connectionWaiter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(ConnectionWaiter connectionWaiter) {
        if (connectionWaiter.f135438h == null && connectionWaiter.f135439i == null) {
            ConnectionWaiter connectionWaiter2 = null;
            for (ConnectionWaiter connectionWaiter3 = this.f135420j; connectionWaiter3 != connectionWaiter; connectionWaiter3 = connectionWaiter3.f135431a) {
                connectionWaiter2 = connectionWaiter3;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.f135431a = connectionWaiter.f135431a;
            } else {
                this.f135420j = connectionWaiter.f135431a;
            }
            connectionWaiter.f135439i = new OperationCanceledException();
            LockSupport.unpark(connectionWaiter.f135432b);
            T0();
        }
    }

    private void r() {
        u();
        SQLiteConnection sQLiteConnection = this.f135422l;
        if (sQLiteConnection != null) {
            y(sQLiteConnection);
            this.f135422l = null;
        }
    }

    private void t0() {
        if ((this.f135415d.f135467c & PKIFailureInfo.duplicateCertReq) != 0) {
            this.f135416e = SQLiteGlobal.f();
        } else {
            this.f135416e = 1;
        }
    }

    private void u() {
        int size = this.f135421k.size();
        for (int i15 = 0; i15 < size; i15++) {
            y(this.f135421k.get(i15));
        }
        this.f135421k.clear();
    }

    private void u0() {
        if (!this.f135417f) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    private void y(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.j();
        } catch (RuntimeException e15) {
            Logger.c("SQLiteConnectionPool", "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection, e15);
        }
    }

    void N() {
        Logger.h("SQLiteConnectionPool", "A SQLiteConnection object for database '" + this.f135415d.f135466b + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
        this.f135414c.set(true);
    }

    public void a0(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        synchronized (this.f135413b) {
            try {
                u0();
                boolean z15 = ((sQLiteDatabaseConfiguration.f135467c ^ this.f135415d.f135467c) & PKIFailureInfo.duplicateCertReq) != 0;
                if (z15) {
                    if (!this.f135423m.isEmpty()) {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                    u();
                }
                if (sQLiteDatabaseConfiguration.f135470f != this.f135415d.f135470f && !this.f135423m.isEmpty()) {
                    throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                }
                if (!Arrays.equals(sQLiteDatabaseConfiguration.f135471g, this.f135415d.f135471g)) {
                    this.f135422l.i(sQLiteDatabaseConfiguration.f135471g);
                    this.f135415d.c(sQLiteDatabaseConfiguration);
                    u();
                    b0();
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f135415d;
                if (sQLiteDatabaseConfiguration2.f135467c != sQLiteDatabaseConfiguration.f135467c) {
                    if (z15) {
                        r();
                    }
                    SQLiteConnection sQLiteConnectionZ = Z(sQLiteDatabaseConfiguration, true);
                    r();
                    E();
                    this.f135422l = sQLiteConnectionZ;
                    this.f135415d.c(sQLiteDatabaseConfiguration);
                    t0();
                } else {
                    sQLiteDatabaseConfiguration2.c(sQLiteDatabaseConfiguration);
                    t0();
                    C();
                    b0();
                }
                T0();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        H(false);
    }

    protected void finalize() throws Throwable {
        try {
            H(true);
        } finally {
            super.finalize();
        }
    }

    public SQLiteConnection m(String str, int i15, CancellationSignal cancellationSignal) {
        return O0(str, i15, cancellationSignal);
    }

    public void n0(SQLiteConnection sQLiteConnection) {
        synchronized (this.f135413b) {
            try {
                AcquiredConnectionStatus acquiredConnectionStatusRemove = this.f135423m.remove(sQLiteConnection);
                if (acquiredConnectionStatusRemove == null) {
                    throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                }
                if (!this.f135417f) {
                    y(sQLiteConnection);
                } else if (sQLiteConnection.w()) {
                    if (c0(sQLiteConnection, acquiredConnectionStatusRemove)) {
                        this.f135422l = sQLiteConnection;
                    }
                    T0();
                } else if (this.f135421k.size() >= this.f135416e - 1) {
                    y(sQLiteConnection);
                } else {
                    if (c0(sQLiteConnection, acquiredConnectionStatusRemove)) {
                        this.f135421k.add(sQLiteConnection);
                    }
                    T0();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public String toString() {
        return "SQLiteConnectionPool: " + this.f135415d.f135465a;
    }
}
