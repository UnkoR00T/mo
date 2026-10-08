package pc;

import ed.f0;
import ed.k;
import er.p;
import fr.t;
import fu.o;
import fu.r;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ju.l0;
import ju.p0;
import ju.q0;
import ju.z2;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.i;
import vv.b0;
import vv.j0;
import vv.l;
import vv.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\b\u0005*\u0001a\b\u0000\u0018\u0000 d2\u00060\u0001j\u0002`\u0002:\u0004<8:6B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0012J#\u0010 \u001a\u00020\u00102\n\u0010\u001d\u001a\u00060\u001cR\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u00102\n\u0010%\u001a\u00060$R\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u0012J\u000f\u0010*\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010#J\u000f\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010\u0012J\u000f\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010\u0012J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010\u0019J\r\u0010/\u001a\u00020\u0010¢\u0006\u0004\b/\u0010\u0012J\u001e\u00101\u001a\b\u0018\u000100R\u00020\u00002\u0006\u0010-\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\b\u0018\u00010\u001cR\u00020\u00002\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010>\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00107R\u0014\u0010@\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R\u0014\u0010B\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00107R$\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060$R\u00020\u00000C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010O\u001a\u00060Kj\u0002`L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00109R\u0016\u0010S\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010;R\u0018\u0010V\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u00103R\u0016\u0010Z\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00103R\u0016\u0010\\\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u00103R\u0016\u0010^\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u00103R\u0016\u0010`\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u00103R\u0014\u0010\u0004\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lpc/c;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lvv/k;", "fileSystem", "Lvv/b0;", "directory", "Ltq/i;", "cleanupCoroutineContext", "", "maxSize", "", "appVersion", "valueCount", "<init>", "(Lvv/k;Lvv/b0;Ltq/i;JII)V", "Loq/i0;", "C0", "()V", "Lvv/f;", "n0", "()Lvv/f;", "", "line", "H0", "(Ljava/lang/String;)V", "u0", "i1", "Lpc/c$b;", "editor", "", "success", "O", "(Lpc/c$b;Z)V", "c0", "()Z", "Lpc/c$c;", "entry", "O0", "(Lpc/c$c;)V", "N", "Y0", "T0", "V", "d0", "key", "d1", "b0", "Lpc/c$d;", "a0", "(Ljava/lang/String;)Lpc/c$d;", "Z", "(Ljava/lang/String;)Lpc/c$b;", "close", "a", "Lvv/b0;", "b", "J", "c", "I", "d", "e", "journalFile", "f", "journalFileTmp", "g", "journalFileBackup", "", "h", "Ljava/util/Map;", "lruEntries", "Lju/p0;", "j", "Lju/p0;", "cleanupScope", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "k", "Ljava/lang/Object;", "lock", "l", "size", "m", "operationsSinceRewrite", "n", "Lvv/f;", "journalWriter", "p", "hasJournalErrors", "q", "initialized", "r", "closed", "s", "mostRecentTrimFailed", "t", "mostRecentRebuildFailed", "pc/c$e", "v", "Lpc/c$e;", "w", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements AutoCloseable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final o f154103x = new o("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 directory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long maxSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int appVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int valueCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0 journalFile;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b0 journalFileTmp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b0 journalFileBackup;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<String, C3817c> lruEntries;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0 cleanupScope;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int operationsSinceRewrite;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private vv.f journalWriter;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean hasJournalErrors;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentTrimFailed;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentRebuildFailed;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final e fileSystem;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lpc/c$b;", "", "Lpc/c$c;", "Lpc/c;", "entry", "<init>", "(Lpc/c;Lpc/c$c;)V", "", "success", "Loq/i0;", "d", "(Z)V", "", "index", "Lvv/b0;", "f", "(I)Lvv/b0;", "e", "()V", "b", "Lpc/c$d;", "c", "()Lpc/c$d;", "a", "Lpc/c$c;", "g", "()Lpc/c$c;", "Z", "closed", "", "[Z", "h", "()[Z", "written", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C3817c entry;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean[] written;

        public b(C3817c c3817c) {
            this.entry = c3817c;
            this.written = new boolean[c.this.valueCount];
        }

        private final void d(boolean success) {
            Object obj = c.this.lock;
            c cVar = c.this;
            synchronized (obj) {
                try {
                    if (this.closed) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (t.c(this.entry.getCurrentEditor(), this)) {
                        cVar.O(this, success);
                    }
                    this.closed = true;
                    i0 i0Var = i0.f148189a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d dVarA0;
            Object obj = c.this.lock;
            c cVar = c.this;
            synchronized (obj) {
                b();
                dVarA0 = cVar.a0(this.entry.getKey());
            }
            return dVarA0;
        }

        public final void e() {
            if (t.c(this.entry.getCurrentEditor(), this)) {
                this.entry.m(true);
            }
        }

        public final b0 f(int index) {
            b0 b0Var;
            Object obj = c.this.lock;
            c cVar = c.this;
            synchronized (obj) {
                if (this.closed) {
                    throw new IllegalStateException("editor is closed");
                }
                this.written[index] = true;
                b0 b0Var2 = this.entry.c().get(index);
                k.b(cVar.fileSystem, b0Var2, false, 2, null);
                b0Var = b0Var2;
            }
            return b0Var;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C3817c getEntry() {
            return this.entry;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }
    }

    /* JADX INFO: renamed from: pc.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR'\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0013\u0010\"R'\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b \u0010\"R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R(\u00105\u001a\b\u0018\u000100R\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00101\u001a\u0004\b\u0018\u00102\"\u0004\b3\u00104R\"\u0010;\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u00107\u001a\u0004\b,\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lpc/c$c;", "", "", "key", "<init>", "(Lpc/c;Ljava/lang/String;)V", "", "strings", "Loq/i0;", "j", "(Ljava/util/List;)V", "Lvv/f;", "writer", "o", "(Lvv/f;)V", "Lpc/c$d;", "Lpc/c;", "n", "()Lpc/c$d;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "b", "[J", "e", "()[J", "lengths", "Ljava/util/ArrayList;", "Lvv/b0;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "l", "(Z)V", "readable", "f", "h", "m", "zombie", "Lpc/c$b;", "Lpc/c$b;", "()Lpc/c$b;", "i", "(Lpc/c$b;)V", "currentEditor", "", "I", "()I", "k", "(I)V", "lockingSnapshotCount", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class C3817c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long[] lengths;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<b0> cleanFiles;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<b0> dirtyFiles;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean readable;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean zombie;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private b currentEditor;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int lockingSnapshotCount;

        public C3817c(String str) {
            this.key = str;
            this.lengths = new long[c.this.valueCount];
            this.cleanFiles = new ArrayList<>(c.this.valueCount);
            this.dirtyFiles = new ArrayList<>(c.this.valueCount);
            StringBuilder sb5 = new StringBuilder(str);
            sb5.append('.');
            int length = sb5.length();
            int i15 = c.this.valueCount;
            for (int i16 = 0; i16 < i15; i16++) {
                sb5.append(i16);
                this.cleanFiles.add(c.this.directory.p(sb5.toString()));
                sb5.append(".tmp");
                this.dirtyFiles.add(c.this.directory.p(sb5.toString()));
                sb5.setLength(length);
            }
        }

        public final ArrayList<b0> a() {
            return this.cleanFiles;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getCurrentEditor() {
            return this.currentEditor;
        }

        public final ArrayList<b0> c() {
            return this.dirtyFiles;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getLockingSnapshotCount() {
            return this.lockingSnapshotCount;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void i(b bVar) {
            this.currentEditor = bVar;
        }

        public final void j(List<String> strings) throws IOException {
            if (strings.size() != c.this.valueCount) {
                throw new IOException("unexpected journal line: " + strings);
            }
            try {
                int size = strings.size();
                for (int i15 = 0; i15 < size; i15++) {
                    this.lengths[i15] = Long.parseLong(strings.get(i15));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + strings);
            }
        }

        public final void k(int i15) {
            this.lockingSnapshotCount = i15;
        }

        public final void l(boolean z15) {
            this.readable = z15;
        }

        public final void m(boolean z15) {
            this.zombie = z15;
        }

        public final d n() {
            if (!this.readable || this.currentEditor != null || this.zombie) {
                return null;
            }
            ArrayList<b0> arrayList = this.cleanFiles;
            c cVar = c.this;
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (!cVar.fileSystem.H(arrayList.get(i15))) {
                    try {
                        cVar.O0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.lockingSnapshotCount++;
            return c.this.new d(this);
        }

        public final void o(vv.f writer) {
            for (long j15 : this.lengths) {
                writer.writeByte(32).k2(j15);
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0005\u001a\u00060\u0003R\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018¨\u0006\u001a"}, d2 = {"Lpc/c$d;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lpc/c$c;", "Lpc/c;", "entry", "<init>", "(Lpc/c;Lpc/c$c;)V", "", "index", "Lvv/b0;", "h", "(I)Lvv/b0;", "Loq/i0;", "close", "()V", "Lpc/c$b;", "b", "()Lpc/c$b;", "a", "Lpc/c$c;", "getEntry", "()Lpc/c$c;", "", "Z", "closed", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class d implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C3817c entry;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public d(C3817c c3817c) {
            this.entry = c3817c;
        }

        public final b b() {
            b bVarZ;
            Object obj = c.this.lock;
            c cVar = c.this;
            synchronized (obj) {
                close();
                bVarZ = cVar.Z(this.entry.getKey());
            }
            return bVarZ;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Object obj = c.this.lock;
            c cVar = c.this;
            synchronized (obj) {
                try {
                    C3817c c3817c = this.entry;
                    c3817c.k(c3817c.getLockingSnapshotCount() - 1);
                    if (this.entry.getLockingSnapshotCount() == 0 && this.entry.getZombie()) {
                        cVar.O0(this.entry);
                    }
                    i0 i0Var = i0.f148189a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        public final b0 h(int index) {
            if (this.closed) {
                throw new IllegalStateException("snapshot is closed");
            }
            return this.entry.a().get(index);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"pc/c$e", "Lvv/l;", "Lvv/b0;", "file", "", "mustCreate", "Lvv/j0;", "N", "(Lvv/b0;Z)Lvv/j0;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends l {
        e(vv.k kVar) {
            super(kVar);
        }

        @Override // vv.l, vv.k
        public j0 N(b0 file, boolean mustCreate) {
            b0 b0VarN = file.n();
            if (b0VarN != null) {
                p(b0VarN);
            }
            return super.N(file, mustCreate);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f154139e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f154139e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            Object obj2 = c.this.lock;
            c cVar = c.this;
            synchronized (obj2) {
                if (!cVar.initialized || cVar.closed) {
                    return i0.f148189a;
                }
                try {
                    cVar.Y0();
                } catch (IOException unused) {
                    cVar.mostRecentTrimFailed = true;
                }
                try {
                    if (cVar.c0()) {
                        cVar.i1();
                    }
                } catch (IOException unused2) {
                    cVar.mostRecentRebuildFailed = true;
                    cVar.journalWriter = v.b(v.a());
                }
                return i0.f148189a;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new f(eVar);
        }
    }

    public c(vv.k kVar, b0 b0Var, i iVar, long j15, int i15, int i16) {
        this.directory = b0Var;
        this.maxSize = j15;
        this.appVersion = i15;
        this.valueCount = i16;
        if (j15 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i16 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.journalFile = b0Var.p("journal");
        this.journalFileTmp = b0Var.p("journal.tmp");
        this.journalFileBackup = b0Var.p("journal.bkp");
        this.lruEntries = ed.c.b(0, 0.0f, 3, null);
        i iVarN0 = iVar.n0(z2.b(null, 1, null));
        l0 l0VarJ = f0.j(iVar);
        this.cleanupScope = q0.a(iVarN0.n0(l0.T1(l0VarJ == null ? ed.e.a() : l0VarJ, 1, null, 2, null)));
        this.lock = new Object();
        this.fileSystem = new e(kVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    private final void C0() throws Throwable {
        vv.g gVarC = v.c(this.fileSystem.O(this.journalFile));
        try {
            String strN1 = gVarC.N1();
            String strN2 = gVarC.N1();
            String strN3 = gVarC.N1();
            String strN4 = gVarC.N1();
            String strN5 = gVarC.N1();
            if (!t.c("libcore.io.DiskLruCache", strN1) || !t.c("1", strN2) || !t.c(String.valueOf(this.appVersion), strN3) || !t.c(String.valueOf(this.valueCount), strN4) || strN5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strN1 + ", " + strN2 + ", " + strN3 + ", " + strN4 + ", " + strN5 + "]");
            }
            int i15 = 0;
            while (true) {
                try {
                    H0(gVarC.N1());
                    i15++;
                } catch (EOFException unused) {
                    this.operationsSinceRewrite = i15 - this.lruEntries.size();
                    if (gVarC.K2()) {
                        this.journalWriter = n0();
                    } else {
                        i1();
                    }
                    i0 i0Var = i0.f148189a;
                    if (gVarC != null) {
                        try {
                            gVarC.close();
                        } catch (Throwable th4) {
                            th = th4;
                            if (th != null) {
                                throw th;
                            }
                        }
                    }
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            if (gVarC != null) {
                try {
                    gVarC.close();
                } catch (Throwable th6) {
                    oq.c.a(th, th6);
                }
            }
            if (th != null) {
                throw th;
            }
        }
    }

    private final void H0(String line) throws IOException {
        String strSubstring;
        int iQ0 = r.q0(line, ' ', 0, false, 6, null);
        if (iQ0 == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i15 = iQ0 + 1;
        int iQ1 = r.q0(line, ' ', i15, false, 4, null);
        if (iQ1 == -1) {
            strSubstring = line.substring(i15);
            if (iQ0 == 6 && r.V(line, "REMOVE", false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i15, iQ1);
        }
        Map<String, C3817c> map = this.lruEntries;
        C3817c c3817c = map.get(strSubstring);
        if (c3817c == null) {
            c3817c = new C3817c(strSubstring);
            map.put(strSubstring, c3817c);
        }
        C3817c c3817c2 = c3817c;
        if (iQ1 != -1 && iQ0 == 5 && r.V(line, "CLEAN", false, 2, null)) {
            List<String> listU0 = r.U0(line.substring(iQ1 + 1), new char[]{' '}, false, 0, 6, null);
            c3817c2.l(true);
            c3817c2.i(null);
            c3817c2.j(listU0);
            return;
        }
        if (iQ1 == -1 && iQ0 == 5 && r.V(line, "DIRTY", false, 2, null)) {
            c3817c2.i(new b(c3817c2));
            return;
        }
        if (iQ1 == -1 && iQ0 == 4 && r.V(line, "READ", false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + line);
    }

    private final void N() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(b editor, boolean success) {
        synchronized (this.lock) {
            C3817c entry = editor.getEntry();
            if (!t.c(entry.getCurrentEditor(), editor)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!success || entry.getZombie()) {
                int i15 = this.valueCount;
                for (int i16 = 0; i16 < i15; i16++) {
                    this.fileSystem.C(entry.c().get(i16));
                }
            } else {
                int i17 = this.valueCount;
                for (int i18 = 0; i18 < i17; i18++) {
                    if (editor.getWritten()[i18] && !this.fileSystem.H(entry.c().get(i18))) {
                        editor.a();
                        return;
                    }
                }
                int i19 = this.valueCount;
                for (int i25 = 0; i25 < i19; i25++) {
                    b0 b0Var = entry.c().get(i25);
                    b0 b0Var2 = entry.a().get(i25);
                    if (this.fileSystem.H(b0Var)) {
                        this.fileSystem.m(b0Var, b0Var2);
                    } else {
                        k.b(this.fileSystem, entry.a().get(i25), false, 2, null);
                    }
                    long j15 = entry.getLengths()[i25];
                    Long size = this.fileSystem.J(b0Var2).getSize();
                    long jLongValue = size != null ? size.longValue() : 0L;
                    entry.getLengths()[i25] = jLongValue;
                    this.size = (this.size - j15) + jLongValue;
                }
            }
            entry.i(null);
            if (entry.getZombie()) {
                O0(entry);
                return;
            }
            this.operationsSinceRewrite++;
            vv.f fVar = this.journalWriter;
            if (success || entry.getReadable()) {
                entry.l(true);
                fVar.k1("CLEAN");
                fVar.writeByte(32);
                fVar.k1(entry.getKey());
                entry.o(fVar);
                fVar.writeByte(10);
            } else {
                this.lruEntries.remove(entry.getKey());
                fVar.k1("REMOVE");
                fVar.writeByte(32);
                fVar.k1(entry.getKey());
                fVar.writeByte(10);
            }
            fVar.flush();
            if (this.size > this.maxSize || c0()) {
                d0();
            }
            i0 i0Var = i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(C3817c entry) {
        vv.f fVar;
        if (entry.getLockingSnapshotCount() > 0 && (fVar = this.journalWriter) != null) {
            fVar.k1("DIRTY");
            fVar.writeByte(32);
            fVar.k1(entry.getKey());
            fVar.writeByte(10);
            fVar.flush();
        }
        if (entry.getLockingSnapshotCount() > 0 || entry.getCurrentEditor() != null) {
            entry.m(true);
            return;
        }
        int i15 = this.valueCount;
        for (int i16 = 0; i16 < i15; i16++) {
            this.fileSystem.C(entry.a().get(i16));
            this.size -= entry.getLengths()[i16];
            entry.getLengths()[i16] = 0;
        }
        this.operationsSinceRewrite++;
        vv.f fVar2 = this.journalWriter;
        if (fVar2 != null) {
            fVar2.k1("REMOVE");
            fVar2.writeByte(32);
            fVar2.k1(entry.getKey());
            fVar2.writeByte(10);
            fVar2.flush();
        }
        this.lruEntries.remove(entry.getKey());
        if (c0()) {
            d0();
        }
    }

    private final boolean T0() {
        for (C3817c c3817c : this.lruEntries.values()) {
            if (!c3817c.getZombie()) {
                O0(c3817c);
                return true;
            }
        }
        return false;
    }

    private final void V() throws IOException {
        close();
        k.c(this.fileSystem, this.directory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0() {
        while (this.size > this.maxSize) {
            if (!T0()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c0() {
        return this.operationsSinceRewrite >= 2000;
    }

    private final void d0() {
        ju.k.d(this.cleanupScope, null, null, new f(null), 3, null);
    }

    private final void d1(String key) {
        if (f154103x.f(key)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + "\"").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i1() {
        Throwable th4;
        synchronized (this.lock) {
            try {
                vv.f fVar = this.journalWriter;
                if (fVar != null) {
                    fVar.close();
                }
                vv.f fVarB = v.b(this.fileSystem.N(this.journalFileTmp, false));
                try {
                    fVarB.k1("libcore.io.DiskLruCache").writeByte(10);
                    fVarB.k1("1").writeByte(10);
                    fVarB.k2(this.appVersion).writeByte(10);
                    fVarB.k2(this.valueCount).writeByte(10);
                    fVarB.writeByte(10);
                    for (C3817c c3817c : this.lruEntries.values()) {
                        if (c3817c.getCurrentEditor() != null) {
                            fVarB.k1("DIRTY");
                            fVarB.writeByte(32);
                            fVarB.k1(c3817c.getKey());
                            fVarB.writeByte(10);
                        } else {
                            fVarB.k1("CLEAN");
                            fVarB.writeByte(32);
                            fVarB.k1(c3817c.getKey());
                            c3817c.o(fVarB);
                            fVarB.writeByte(10);
                        }
                    }
                    i0 i0Var = i0.f148189a;
                    if (fVarB != null) {
                        try {
                            fVarB.close();
                        } catch (Throwable th5) {
                            th4 = th5;
                        }
                    }
                    th4 = null;
                } catch (Throwable th6) {
                    if (fVarB != null) {
                        try {
                            fVarB.close();
                        } catch (Throwable th7) {
                            oq.c.a(th6, th7);
                        }
                    }
                    th4 = th6;
                }
                if (th4 != null) {
                    throw th4;
                }
                if (this.fileSystem.H(this.journalFile)) {
                    this.fileSystem.m(this.journalFile, this.journalFileBackup);
                    this.fileSystem.m(this.journalFileTmp, this.journalFile);
                    this.fileSystem.C(this.journalFileBackup);
                } else {
                    this.fileSystem.m(this.journalFileTmp, this.journalFile);
                }
                this.journalWriter = n0();
                this.operationsSinceRewrite = 0;
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
                i0 i0Var2 = i0.f148189a;
            } catch (Throwable th8) {
                throw th8;
            }
        }
    }

    private final vv.f n0() {
        return v.b(new pc.d(this.fileSystem.b(this.journalFile), new er.l() { // from class: pc.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.t0(this.f154101a, (IOException) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t0(c cVar, IOException iOException) {
        cVar.hasJournalErrors = true;
        return i0.f148189a;
    }

    private final void u0() {
        Iterator<C3817c> it = this.lruEntries.values().iterator();
        long j15 = 0;
        while (it.hasNext()) {
            C3817c next = it.next();
            int i15 = 0;
            if (next.getCurrentEditor() == null) {
                int i16 = this.valueCount;
                while (i15 < i16) {
                    j15 += next.getLengths()[i15];
                    i15++;
                }
            } else {
                next.i(null);
                int i17 = this.valueCount;
                while (i15 < i17) {
                    this.fileSystem.C(next.a().get(i15));
                    this.fileSystem.C(next.c().get(i15));
                    i15++;
                }
                it.remove();
            }
        }
        this.size = j15;
    }

    public final b Z(String key) {
        synchronized (this.lock) {
            N();
            d1(key);
            b0();
            C3817c c3817c = this.lruEntries.get(key);
            if ((c3817c != null ? c3817c.getCurrentEditor() : null) != null) {
                return null;
            }
            if (c3817c != null && c3817c.getLockingSnapshotCount() != 0) {
                return null;
            }
            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                vv.f fVar = this.journalWriter;
                fVar.k1("DIRTY");
                fVar.writeByte(32);
                fVar.k1(key);
                fVar.writeByte(10);
                fVar.flush();
                if (this.hasJournalErrors) {
                    return null;
                }
                if (c3817c == null) {
                    c3817c = new C3817c(key);
                    this.lruEntries.put(key, c3817c);
                }
                b bVar = new b(c3817c);
                c3817c.i(bVar);
                return bVar;
            }
            d0();
            return null;
        }
    }

    public final d a0(String key) {
        d dVarN;
        synchronized (this.lock) {
            N();
            d1(key);
            b0();
            C3817c c3817c = this.lruEntries.get(key);
            if (c3817c != null && (dVarN = c3817c.n()) != null) {
                this.operationsSinceRewrite++;
                vv.f fVar = this.journalWriter;
                fVar.k1("READ");
                fVar.writeByte(32);
                fVar.k1(key);
                fVar.writeByte(10);
                fVar.flush();
                if (c0()) {
                    d0();
                }
                return dVarN;
            }
            return null;
        }
    }

    public final void b0() {
        synchronized (this.lock) {
            try {
                if (this.initialized) {
                    return;
                }
                this.fileSystem.C(this.journalFileTmp);
                if (this.fileSystem.H(this.journalFileBackup)) {
                    if (this.fileSystem.H(this.journalFile)) {
                        this.fileSystem.C(this.journalFileBackup);
                    } else {
                        this.fileSystem.m(this.journalFileBackup, this.journalFile);
                    }
                }
                if (this.fileSystem.H(this.journalFile)) {
                    try {
                        C0();
                        u0();
                        this.initialized = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            V();
                            this.closed = false;
                            i1();
                            this.initialized = true;
                            i0 i0Var = i0.f148189a;
                        } catch (Throwable th4) {
                            this.closed = false;
                            throw th4;
                        }
                    }
                }
                i1();
                this.initialized = true;
                i0 i0Var2 = i0.f148189a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                if (this.initialized && !this.closed) {
                    for (C3817c c3817c : (C3817c[]) this.lruEntries.values().toArray(new C3817c[0])) {
                        b currentEditor = c3817c.getCurrentEditor();
                        if (currentEditor != null) {
                            currentEditor.e();
                        }
                    }
                    Y0();
                    q0.d(this.cleanupScope, null, 1, null);
                    this.journalWriter.close();
                    this.journalWriter = null;
                    this.closed = true;
                    i0 i0Var = i0.f148189a;
                    return;
                }
                this.closed = true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
