package ch1;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, d2 = {"Lch1/k0;", "Lgz/b;", "Lch1/k0$a;", "Loq/i0;", "Ls54/e;", "isNewLocalNotificationMigrationCompletedUseCase", "Ls54/l;", "setNewLocalNotificationMigrationCompleteUseCase", "Ls54/k;", "setLocalNotificationUseCase", "Ls54/f;", "removeAllLocalNotificationsUseCase", "<init>", "(Ls54/e;Ls54/l;Ls54/k;Ls54/f;)V", "params", "d", "(Lch1/k0$a;Ltq/e;)Ljava/lang/Object;", "a", "Ls54/e;", "b", "Ls54/l;", "c", "Ls54/k;", "Ls54/f;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k0 implements gz.b<Params, oq.i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s54.e isNewLocalNotificationMigrationCompletedUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s54.l setNewLocalNotificationMigrationCompleteUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s54.k setLocalNotificationUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s54.f removeAllLocalNotificationsUseCase;

    /* JADX INFO: renamed from: ch1.k0$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lch1/k0$a;", "Lgz/b$a;", "", "Lrq0/b;", "documentsList", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<rq0.b> documentsList;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(List<? extends rq0.b> list) {
            this.documentsList = list;
        }

        public final List<rq0.b> a() {
            return this.documentsList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.documentsList, ((Params) other).documentsList);
        }

        public int hashCode() {
            return this.documentsList.hashCode();
        }

        public String toString() {
            return "Params(documentsList=" + this.documentsList + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f26906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f26907e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f26908f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f26909g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f26910h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f26911j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f26912k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f26913l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f26915n;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f26913l = obj;
            this.f26915n |= PKIFailureInfo.systemUnavail;
            return k0.this.d(null, this);
        }
    }

    public k0(s54.e eVar, s54.l lVar, s54.k kVar, s54.f fVar) {
        this.isNewLocalNotificationMigrationCompletedUseCase = eVar;
        this.setNewLocalNotificationMigrationCompleteUseCase = lVar;
        this.setLocalNotificationUseCase = kVar;
        this.removeAllLocalNotificationsUseCase = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:31:0x00a0->B:44:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r14.c(r2, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
    
        if (r13.c(r14, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(ch1.k0.Params r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch1.k0.d(ch1.k0$a, tq.e):java.lang.Object");
    }
}
