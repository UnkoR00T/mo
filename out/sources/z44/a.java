package z44;

import a14.a0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.d;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lz44/a;", "Lr44/b;", "Lz44/c;", "requestWritePermissionUseCase", "Les0/b;", "getConfirmationUseCase", "La14/a0;", "saveFilesOnDeviceUseCase", "Lpx/d;", "remoteLogger", "Lgs0/a;", "getTransactionConfirmationUseCase", "<init>", "(Lz44/c;Les0/b;La14/a0;Lpx/d;Lgs0/a;)V", "Lr44/b$a;", "params", "Ldx/i;", "Ldx/b;", "Lr44/b$b;", "d", "(Lr44/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lz44/c;", "b", "Les0/b;", "c", "La14/a0;", "Lpx/d;", "e", "Lgs0/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements r44.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c requestWritePermissionUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final es0.b getConfirmationUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a0 saveFilesOnDeviceUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d remoteLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final gs0.a getTransactionConfirmationUseCase;

    /* JADX INFO: renamed from: z44.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C6257a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f232888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f232889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f232890f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f232891g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f232892h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f232893j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f232895l;

        C6257a(e<? super C6257a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232893j = obj;
            this.f232895l |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(c cVar, es0.b bVar, a0 a0Var, d dVar, gs0.a aVar) {
        this.requestWritePermissionUseCase = cVar;
        this.getConfirmationUseCase = bVar;
        this.saveFilesOnDeviceUseCase = a0Var;
        this.remoteLogger = dVar;
        this.getTransactionConfirmationUseCase = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x0188  */
    /* JADX WARN: Code duplicated, block: B:66:0x018e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r10 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (r10 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        if (r10 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        if (r10 == r1) goto L53;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00da, please report this as an issue */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(r44.b.a r9, tq.e<? super dx.i<? extends dx.b, ? extends r44.b.EnumC4371b>> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z44.a.c(r44.b$a, tq.e):java.lang.Object");
    }
}
