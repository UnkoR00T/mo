package b74;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lb74/h;", "Lv64/b;", "Lu64/b;", "repository", "Lv64/a;", "changeUserPasswordKeyDataUC", "Lpx/d;", "remoteLogger", "Lz64/a;", "userBiometricInteractor", "Lz64/b;", "userCommonInteractor", "<init>", "(Lu64/b;Lv64/a;Lpx/d;Lz64/a;Lz64/b;)V", "Lv64/b$a;", "params", "", "d", "(Lv64/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lu64/b;", "b", "Lv64/a;", "c", "Lpx/d;", "Lz64/a;", "e", "Lz64/b;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements v64.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u64.b repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v64.a changeUserPasswordKeyDataUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z64.a userBiometricInteractor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z64.b userCommonInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f17122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17123f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f17125h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f17123f = obj;
            this.f17125h |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, this);
        }
    }

    public h(u64.b bVar, v64.a aVar, px.d dVar, z64.a aVar2, z64.b bVar2) {
        this.repository = bVar;
        this.changeUserPasswordKeyDataUC = aVar;
        this.remoteLogger = dVar;
        this.userBiometricInteractor = aVar2;
        this.userCommonInteractor = bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r15 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        if (r15 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011b, code lost:
    
        if (r2.b(r0) == r1) goto L50;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(v64.b.Params r14, tq.e<? super java.lang.Boolean> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b74.h.c(v64.b$a, tq.e):java.lang.Object");
    }
}
