package a44;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"La44/u;", "Lq34/u;", "Lp34/a;", "repository", "Lpx/d;", "remoteLogger", "Ls54/g;", "removeNotificationsForDocumentUseCase", "Lkr0/e;", "bENotifyAboutDocumentRemovalUC", "Lx34/a;", "documentsInteractor", "<init>", "(Lp34/a;Lpx/d;Ls54/g;Lkr0/e;Lx34/a;)V", "Lq34/u$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lq34/u$a;Ltq/e;)Ljava/lang/Object;", "a", "Lp34/a;", "b", "Lpx/d;", "c", "Ls54/g;", "Lkr0/e;", "e", "Lx34/a;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements q34.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p34.a repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s54.g removeNotificationsForDocumentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final kr0.e bENotifyAboutDocumentRemovalUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x34.a documentsInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3225f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f3226g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f3227h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f3228j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f3229k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f3230l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f3231m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3232n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f3233p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3234q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f3235r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f3236s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3237t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f3238v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f3239w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f3240x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f3242z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3240x = obj;
            this.f3242z |= PKIFailureInfo.systemUnavail;
            return u.this.c(null, this);
        }
    }

    public u(p34.a aVar, px.d dVar, s54.g gVar, kr0.e eVar, x34.a aVar2) {
        this.repository = aVar;
        this.remoteLogger = dVar;
        this.removeNotificationsForDocumentUseCase = gVar;
        this.bENotifyAboutDocumentRemovalUC = eVar;
        this.documentsInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x02df A[Catch: Exception -> 0x02c9, c -> 0x02cd, CancellationException -> 0x02d1, TryCatch #12 {c -> 0x02cd, CancellationException -> 0x02d1, Exception -> 0x02c9, blocks: (B:68:0x02b1, B:70:0x02be, B:87:0x02f8, B:89:0x0301, B:79:0x02d5, B:80:0x02d9, B:82:0x02df), top: B:138:0x02b1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x02f3 A[LOOP:0: B:80:0x02d9->B:85:0x02f3, LOOP_END] */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x00c5: MOVE (r6 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:25:0x00c5 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x00ca: MOVE (r6 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:27:0x00ca */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x00cf: MOVE (r6 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:29:0x00cf */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0481 -> B:109:0x0489). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x04d6 -> B:115:0x04e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(q34.u.Params r24, tq.e<? super dx.i<? extends dx.b, oq.i0>> r25) {
        /*
            Method dump skipped, instruction units count: 1404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a44.u.c(q34.u$a, tq.e):java.lang.Object");
    }
}
