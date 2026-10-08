package q03;

import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lq03/e;", "Lgz/b;", "Lq03/e$a;", "Luv0/d;", "Lq03/c;", "filterScannedPlateCorrectUseCase", "<init>", "(Lq03/c;)V", "params", "d", "(Lq03/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Lq03/c;", "", "b", "Ljava/lang/Object;", "lock", "", "", "c", "Ljava/util/List;", "cachedList", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b<Params, uv0.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q03.c filterScannedPlateCorrectUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<String> cachedList = new ArrayList();

    /* JADX INFO: renamed from: q03.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lq03/e$a;", "Lgz/b$a;", "", "scannedText", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String scannedText;

        public Params(String str) {
            this.scannedText = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getScannedText() {
            return this.scannedText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.scannedText, ((Params) other).scannedText);
        }

        public int hashCode() {
            return this.scannedText.hashCode();
        }

        public String toString() {
            return "Params(scannedText=" + this.scannedText + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f163536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f163537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f163538f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f163539g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f163540h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f163541j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f163542k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f163543l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f163544m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f163546p;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f163544m = obj;
            this.f163546p |= PKIFailureInfo.systemUnavail;
            return e.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"q03/e$c", "Lpq/l0;", "", "b", "()Ljava/util/Iterator;", "element", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements l0<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f163547a;

        public c(Iterable iterable) {
            this.f163547a = iterable;
        }

        @Override // pq.l0
        public String a(String element) {
            return element;
        }

        @Override // pq.l0
        public Iterator<String> b() {
            return this.f163547a.iterator();
        }
    }

    public e(q03.c cVar) {
        this.filterScannedPlateCorrectUseCase = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0076  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d1 A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:25:0x00c9, B:27:0x00d1, B:30:0x00d7, B:32:0x00f5, B:41:0x0128, B:35:0x0100, B:36:0x010d, B:39:0x0122, B:45:0x013a, B:46:0x013f), top: B:51:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f5 A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:25:0x00c9, B:27:0x00d1, B:30:0x00d7, B:32:0x00f5, B:41:0x0128, B:35:0x0100, B:36:0x010d, B:39:0x0122, B:45:0x013a, B:46:0x013f), top: B:51:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:35:0x0100 A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:25:0x00c9, B:27:0x00d1, B:30:0x00d7, B:32:0x00f5, B:41:0x0128, B:35:0x0100, B:36:0x010d, B:39:0x0122, B:45:0x013a, B:46:0x013f), top: B:51:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0120  */
    /* JADX WARN: Code duplicated, block: B:45:0x013a A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #0 {all -> 0x00d5, blocks: (B:25:0x00c9, B:27:0x00d1, B:30:0x00d7, B:32:0x00f5, B:41:0x0128, B:35:0x0100, B:36:0x010d, B:39:0x0122, B:45:0x013a, B:46:0x013f), top: B:51:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b9 -> B:21:0x00bc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object d(q03.e.Params r17, tq.e<? super uv0.d> r18) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q03.e.d(q03.e$a, tq.e):java.lang.Object");
    }
}
