package u34;

import er.l;
import er.p;
import er0.BEDocumentStatus;
import fr.t;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import ju.g1;
import ju.p0;
import ju.z2;
import k34.DocumentSummaryData;
import k34.o;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b#\u0010$J&\u0010'\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u000f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0010H\u0096@¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b)\u0010*J \u0010,\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\"H\u0096@¢\u0006\u0004\b.\u0010\u0013J\"\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eH\u0096@¢\u0006\u0004\b/\u0010\u0013J*\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010002\u0006\u0010\u001b\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b1\u0010*J\u0015\u00104\u001a\b\u0012\u0004\u0012\u00020302H\u0016¢\u0006\u0004\b4\u00105J*\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010002\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b6\u00107J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001b\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b8\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010=¨\u0006>"}, d2 = {"Lu34/c;", "Lu34/b;", "Lpl/gov/coi/mobywatel/technical/documents/data/storage/b;", "documentsSummaryLocalESPDataSource", "Lp34/a;", "documentsRepository", "Lpx/d;", "remoteLogger", "Lez/a;", "currentTimeProvider", "Ls34/a;", "documentsContainersInteractor", "<init>", "(Lpl/gov/coi/mobywatel/technical/documents/data/storage/b;Lp34/a;Lpx/d;Lez/a;Ls34/a;)V", "", "Lrq0/b;", "", "Lk34/n;", "q", "(Ltq/e;)Ljava/lang/Object;", "Lex/b;", "Ldx/b;", "summaries", "", "documentIID", "r", "(Lex/b;Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;", "documentType", "s", "(Lex/b;Ljava/util/Map;Lrq0/b;)Ljava/util/List;", "Lfz/b$c;", "expirationDate", "", "saveNewDocument", "Loq/i0;", "b", "(Lrq0/b;Ljava/lang/String;Lfz/b$c;ZLtq/e;)Ljava/lang/Object;", "Ler0/c;", "statuses", "e", "(Lrq0/b;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "c", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "documentId", "j", "(Lrq0/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "i", "Ldx/i;", "f", "Lmu/g;", "Lk34/o;", "g", "()Lmu/g;", "h", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "d", "Lpl/gov/coi/mobywatel/technical/documents/data/storage/b;", "Lp34/a;", "Lpx/d;", "Lez/a;", "Ls34/a;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements u34.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.mobywatel.technical.documents.data.storage.b documentsSummaryLocalESPDataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p34.a documentsRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final s34.a documentsContainersInteractor;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195047f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f195048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f195049h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c f195050j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ rq0.b f195051k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f195052l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ fz.b.LocalDate f195053m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z15, c cVar, rq0.b bVar, String str, fz.b.LocalDate localDate, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f195049h = z15;
            this.f195050j = cVar;
            this.f195051k = bVar;
            this.f195052l = str;
            this.f195053m = localDate;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00d5 A[PHI: r2
          0x00d5: PHI (r2v6 java.util.List) = (r2v2 java.util.List), (r2v8 java.util.List) binds: [B:32:0x00d2, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            if (r13 == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
        
            if (r13.c(r4, r12) == r1) goto L36;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u34.c.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f195049h, this.f195050j, this.f195051k, this.f195052l, this.f195053m, eVar);
            aVar.f195048g = obj;
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f195055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f195056g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f195057h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f195058j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f195059k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f195060l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f195061m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f195062n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f195063p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f195064q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f195065r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f195066s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f195067t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f195068v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f195069w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ List<BEDocumentStatus> f195070x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ c f195071y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ rq0.b f195072z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<BEDocumentStatus> list, c cVar, rq0.b bVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f195070x = list;
            this.f195071y = cVar;
            this.f195072z = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:104:0x0376 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:20:0x018c  */
        /* JADX WARN: Code duplicated, block: B:22:0x0197  */
        /* JADX WARN: Code duplicated, block: B:55:0x02d8  */
        /* JADX WARN: Code duplicated, block: B:67:0x0325  */
        /* JADX WARN: Code duplicated, block: B:69:0x0329  */
        /* JADX WARN: Code duplicated, block: B:72:0x034a  */
        /* JADX WARN: Code duplicated, block: B:74:0x0362  */
        /* JADX WARN: Code duplicated, block: B:78:0x038c  */
        /* JADX WARN: Code duplicated, block: B:80:0x0392  */
        /* JADX WARN: Code duplicated, block: B:84:0x03d9  */
        /* JADX WARN: Code duplicated, block: B:87:0x03f8  */
        /* JADX WARN: Code duplicated, block: B:91:0x0406  */
        /* JADX WARN: Code duplicated, block: B:95:0x044c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x044c -> B:96:0x044f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 1140
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u34.c.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f195070x, this.f195071y, this.f195072z, eVar);
            bVar.f195069w = obj;
            return bVar;
        }
    }

    /* JADX INFO: renamed from: u34.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class C5080c extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195073e;

        C5080c(tq.e<? super C5080c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f195073e;
            if (i15 == 0) {
                u.b(obj);
                pl.gov.coi.mobywatel.technical.documents.data.storage.b bVar = c.this.documentsSummaryLocalESPDataSource;
                this.f195073e = 1;
                if (bVar.a(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((C5080c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new C5080c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195075e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ rq0.b f195077g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(rq0.b bVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f195077g = bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r5.c(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f195075e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L48
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                u34.c r5 = u34.c.this
                pl.gov.coi.mobywatel.technical.documents.data.storage.b r5 = u34.c.o(r5)
                rq0.b r1 = r4.f195077g
                r4.f195075e = r3
                java.lang.Object r5 = r5.g(r1, r4)
                if (r5 != r0) goto L32
                goto L47
            L32:
                u34.c r5 = u34.c.this
                pl.gov.coi.mobywatel.technical.documents.data.storage.b r5 = u34.c.o(r5)
                k34.o$b r1 = new k34.o$b
                rq0.b r3 = r4.f195077g
                r1.<init>(r3)
                r4.f195075e = r2
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L48
            L47:
                return r0
            L48:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: u34.c.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new d(this.f195077g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f195079f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f195080g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f195081h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f195082j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f195083k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f195084l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f195085m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f195086n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f195087p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f195088q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f195089r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f195090s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ rq0.b f195092v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ String f195093w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(rq0.b bVar, String str, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f195092v = bVar;
            this.f195093w = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean V(String str, DocumentSummaryData documentSummaryData) {
            return t.c(documentSummaryData.getDocumentIID(), str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean X(l lVar, Object obj) {
            return ((Boolean) lVar.b(obj)).booleanValue();
        }

        /* JADX WARN: Code duplicated, block: B:43:0x0162  */
        /* JADX WARN: Code duplicated, block: B:44:0x0163  */
        /* JADX WARN: Code duplicated, block: B:62:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:65:0x01da  */
        /* JADX WARN: Code duplicated, block: B:66:0x01e8  */
        /* JADX WARN: Code duplicated, block: B:68:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:72:0x01fa  */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x019e, code lost:
        
            if (r3.c(r6, r17) == r0) goto L47;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 513
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u34.c.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new e(this.f195092v, this.f195093w, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f195096f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f195097g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f195098h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f195099j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f195100k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f195101l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f195102m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f195103n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f195104p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f195105q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f195106r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f195107s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f195108t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f195110w;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195108t = obj;
            this.f195110w |= PKIFailureInfo.systemUnavail;
            return c.this.q(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f195113f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f195114g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f195115h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f195116j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f195117k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f195118l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f195119m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f195120n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        long f195121p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f195122q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f195123r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f195124s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f195125t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f195127w;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195125t = obj;
            this.f195127w |= PKIFailureInfo.systemUnavail;
            return c.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "", "Lrq0/b;", "", "Lk34/n;", "<anonymous>", "(Lju/p0;)Ljava/util/Map;"}, k = 3, mv = {2, 2, 0})
    static final class h extends k implements p<p0, tq.e<? super Map<rq0.b, ? extends List<? extends DocumentSummaryData>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f195129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f195131h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f195132j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f195133k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f195134l;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
        
            if (r11 == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
        
            if (r11 == r1) goto L34;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u34.c.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Map<rq0.b, ? extends List<DocumentSummaryData>>> eVar) {
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            h hVar = c.this.new h(eVar);
            hVar.f195134l = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "Lk34/n;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class i extends k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends DocumentSummaryData>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f195137f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f195138g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f195139h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f195140j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f195141k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f195142l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f195143m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f195144n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f195145p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f195146q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f195147r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f195148s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f195149t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f195150v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f195151w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ String f195153y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, tq.e<? super i> eVar) {
            super(2, eVar);
            this.f195153y = str;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00f5 A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:39:0x010e A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:46:0x011e  */
        /* JADX WARN: Code duplicated, block: B:48:0x0122 A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0167  */
        /* JADX WARN: Code duplicated, block: B:52:0x0168  */
        /* JADX WARN: Code duplicated, block: B:55:0x0172 A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:57:0x0178 A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:59:0x0187 A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:60:0x018c A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:63:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:68:0x01d4 A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TRY_ENTER, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:76:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:79:0x0202  */
        /* JADX WARN: Code duplicated, block: B:80:0x0210  */
        /* JADX WARN: Code duplicated, block: B:82:0x0214  */
        /* JADX WARN: Code duplicated, block: B:85:0x0221  */
        /* JADX WARN: Instruction removed from duplicated block: B:37:0x00f5, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v32 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVarA;
            Object objF;
            c cVar;
            int i15;
            int i16;
            int i17;
            String str;
            ex.b bVar;
            ex.b bVar2;
            int i18;
            int i19;
            dx.i iVar;
            ex.b bVar3;
            Map map;
            Object objQ;
            String str2;
            c cVar2;
            List listR;
            dx.b bVar4;
            dx.b.Generic generic;
            Object objQ2;
            String str3;
            c cVar3;
            Object objE = uq.b.e();
            int i25 = this.f195151w;
            ?? r15 = 3;
            try {
                try {
                    try {
                        if (i25 == 0) {
                            u.b(obj);
                            c cVar4 = c.this;
                            String str4 = this.f195153y;
                            jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                pl.gov.coi.mobywatel.technical.documents.data.storage.b bVar5 = cVar4.documentsSummaryLocalESPDataSource;
                                this.f195136e = cVar4;
                                this.f195137f = str4;
                                this.f195138g = jVarA;
                                this.f195139h = vq.j.a(aVar);
                                this.f195140j = aVar;
                                this.f195144n = 0;
                                this.f195145p = 0;
                                this.f195146q = 0;
                                this.f195147r = 0;
                                this.f195148s = 0;
                                this.f195151w = 1;
                                objF = bVar5.f(this);
                                if (objF != objE) {
                                    cVar = cVar4;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    str = str4;
                                    bVar = aVar;
                                    bVar2 = bVar;
                                    i18 = 0;
                                    i19 = 0;
                                    iVar = (dx.i) objF;
                                    if (iVar instanceof dx.i.Left) {
                                        bVar4 = (dx.b) ((dx.i.Left) iVar).b();
                                        px.d dVar = cVar.remoteLogger;
                                        List<px.a.Class> listA = px.c.a(bVar);
                                        ex.b bVar6 = bVar2;
                                        if (bVar4 instanceof dx.b.Generic) {
                                            generic = (dx.b.Generic) bVar4;
                                        } else {
                                            generic = null;
                                        }
                                        dVar.T6("DocumentsSummaryLocalRepository error | getDocumentSummaryData parsingError", generic != null ? generic.getE() : null, listA);
                                        this.f195136e = str;
                                        this.f195137f = jVarA;
                                        this.f195138g = vq.j.a(bVar6);
                                        this.f195139h = vq.j.a(bVar);
                                        this.f195140j = vq.j.a(iVar);
                                        this.f195141k = vq.j.a(bVar4);
                                        this.f195142l = bVar;
                                        this.f195143m = cVar;
                                        this.f195144n = i17;
                                        this.f195145p = i19;
                                        this.f195146q = i16;
                                        this.f195147r = i15;
                                        this.f195148s = i18;
                                        this.f195149t = 0;
                                        this.f195150v = 0;
                                        this.f195151w = 2;
                                        objQ2 = cVar.q(this);
                                        if (objQ2 == objE) {
                                            str3 = str;
                                            cVar3 = cVar;
                                            listR = cVar3.r(bVar, (Map) objQ2, str3);
                                        }
                                    } else {
                                        bVar3 = bVar2;
                                        if (iVar instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        map = (Map) ((dx.i.Right) iVar).b();
                                        if (map.isEmpty()) {
                                            this.f195136e = str;
                                            this.f195137f = jVarA;
                                            this.f195138g = vq.j.a(bVar3);
                                            this.f195139h = vq.j.a(bVar);
                                            this.f195140j = vq.j.a(iVar);
                                            this.f195141k = vq.j.a(map);
                                            this.f195142l = bVar;
                                            this.f195143m = cVar;
                                            this.f195144n = i17;
                                            this.f195145p = i19;
                                            this.f195146q = i16;
                                            this.f195147r = i15;
                                            this.f195148s = i18;
                                            this.f195149t = 0;
                                            this.f195150v = 0;
                                            this.f195151w = 3;
                                            objQ = cVar.q(this);
                                            if (objQ != objE) {
                                                str2 = str;
                                                cVar2 = cVar;
                                                listR = cVar2.r(bVar, (Map) objQ, str2);
                                            }
                                        } else {
                                            listR = cVar.r(bVar, map, str);
                                        }
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVarA;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i25 == 1) {
                            int i26 = this.f195148s;
                            int i27 = this.f195147r;
                            int i28 = this.f195146q;
                            int i29 = this.f195145p;
                            int i35 = this.f195144n;
                            ex.b bVar7 = (ex.b) this.f195140j;
                            ex.b bVar8 = (ex.b) this.f195139h;
                            dx.j<dx.b> jVar = (dx.j) this.f195138g;
                            str = (String) this.f195137f;
                            cVar = (c) this.f195136e;
                            try {
                                u.b(obj);
                                i18 = i26;
                                bVar = bVar7;
                                i16 = i28;
                                bVar2 = bVar8;
                                i19 = i29;
                                jVarA = jVar;
                                i17 = i35;
                                i15 = i27;
                                objF = obj;
                                iVar = (dx.i) objF;
                                if (iVar instanceof dx.i.Left) {
                                    bVar4 = (dx.b) ((dx.i.Left) iVar).b();
                                    px.d dVar2 = cVar.remoteLogger;
                                    List<px.a.Class> listA2 = px.c.a(bVar);
                                    ex.b bVar9 = bVar2;
                                    if (bVar4 instanceof dx.b.Generic) {
                                        generic = (dx.b.Generic) bVar4;
                                    } else {
                                        generic = null;
                                    }
                                    dVar2.T6("DocumentsSummaryLocalRepository error | getDocumentSummaryData parsingError", generic != null ? generic.getE() : null, listA2);
                                    this.f195136e = str;
                                    this.f195137f = jVarA;
                                    this.f195138g = vq.j.a(bVar9);
                                    this.f195139h = vq.j.a(bVar);
                                    this.f195140j = vq.j.a(iVar);
                                    this.f195141k = vq.j.a(bVar4);
                                    this.f195142l = bVar;
                                    this.f195143m = cVar;
                                    this.f195144n = i17;
                                    this.f195145p = i19;
                                    this.f195146q = i16;
                                    this.f195147r = i15;
                                    this.f195148s = i18;
                                    this.f195149t = 0;
                                    this.f195150v = 0;
                                    this.f195151w = 2;
                                    objQ2 = cVar.q(this);
                                    if (objQ2 == objE) {
                                        str3 = str;
                                        cVar3 = cVar;
                                        listR = cVar3.r(bVar, (Map) objQ2, str3);
                                    }
                                } else {
                                    bVar3 = bVar2;
                                    if (iVar instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    map = (Map) ((dx.i.Right) iVar).b();
                                    if (map.isEmpty()) {
                                        listR = cVar.r(bVar, map, str);
                                    } else {
                                        this.f195136e = str;
                                        this.f195137f = jVarA;
                                        this.f195138g = vq.j.a(bVar3);
                                        this.f195139h = vq.j.a(bVar);
                                        this.f195140j = vq.j.a(iVar);
                                        this.f195141k = vq.j.a(map);
                                        this.f195142l = bVar;
                                        this.f195143m = cVar;
                                        this.f195144n = i17;
                                        this.f195145p = i19;
                                        this.f195146q = i16;
                                        this.f195147r = i15;
                                        this.f195148s = i18;
                                        this.f195149t = 0;
                                        this.f195150v = 0;
                                        this.f195151w = 3;
                                        objQ = cVar.q(this);
                                        if (objQ != objE) {
                                            str2 = str;
                                            cVar2 = cVar;
                                            listR = cVar2.r(bVar, (Map) objQ, str2);
                                        }
                                    }
                                }
                                return objE;
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
                                r15 = jVar;
                                px.f fVar2 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i25 == 2) {
                            cVar3 = (c) this.f195143m;
                            bVar = (ex.b) this.f195142l;
                            dx.j<dx.b> jVar2 = (dx.j) this.f195137f;
                            str3 = (String) this.f195136e;
                            u.b(obj);
                            jVarA = jVar2;
                            objQ2 = obj;
                            listR = cVar3.r(bVar, (Map) objQ2, str3);
                        } else {
                            if (i25 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            cVar2 = (c) this.f195143m;
                            bVar = (ex.b) this.f195142l;
                            dx.j<dx.b> jVar3 = (dx.j) this.f195137f;
                            str2 = (String) this.f195136e;
                            u.b(obj);
                            jVarA = jVar3;
                            objQ = obj;
                            listR = cVar2.r(bVar, (Map) objQ, str2);
                        }
                        return new dx.i.Right(listR);
                    } catch (Exception e26) {
                        e = e26;
                    }
                } catch (CancellationException e27) {
                    throw e27;
                }
            } catch (ex.c e28) {
                e = e28;
            } catch (CancellationException e29) {
                throw e29;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, ? extends List<DocumentSummaryData>>> eVar) {
            return ((i) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new i(this.f195153y, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "Lk34/n;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class j extends k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends DocumentSummaryData>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f195155f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f195156g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f195157h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f195158j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f195159k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f195160l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f195161m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f195162n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f195163p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f195164q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f195165r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f195166s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f195167t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f195168v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f195169w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ rq0.b f195171y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(rq0.b bVar, tq.e<? super j> eVar) {
            super(2, eVar);
            this.f195171y = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00f5 A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:39:0x010e A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:46:0x011e  */
        /* JADX WARN: Code duplicated, block: B:48:0x0122 A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0167  */
        /* JADX WARN: Code duplicated, block: B:52:0x0168  */
        /* JADX WARN: Code duplicated, block: B:55:0x0172 A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:57:0x0178 A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:59:0x0187 A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:60:0x018c A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:63:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:68:0x01d4 A[Catch: Exception -> 0x0112, c -> 0x0116, CancellationException -> 0x011a, TRY_ENTER, TryCatch #6 {c -> 0x0116, CancellationException -> 0x011a, Exception -> 0x0112, blocks: (B:64:0x01c7, B:53:0x016a, B:35:0x00ef, B:37:0x00f5, B:39:0x010e, B:48:0x0122, B:49:0x0126, B:55:0x0172, B:57:0x0178, B:59:0x0187, B:60:0x018c, B:68:0x01d4, B:69:0x01d9, B:31:0x00bb), top: B:92:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:76:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:79:0x0202  */
        /* JADX WARN: Code duplicated, block: B:80:0x0210  */
        /* JADX WARN: Code duplicated, block: B:82:0x0214  */
        /* JADX WARN: Code duplicated, block: B:85:0x0221  */
        /* JADX WARN: Instruction removed from duplicated block: B:37:0x00f5, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v32 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVarA;
            Object objF;
            c cVar;
            int i15;
            int i16;
            int i17;
            rq0.b bVar;
            ex.b bVar2;
            ex.b bVar3;
            int i18;
            int i19;
            dx.i iVar;
            ex.b bVar4;
            Map map;
            Object objQ;
            rq0.b bVar5;
            c cVar2;
            List listS;
            dx.b bVar6;
            dx.b.Generic generic;
            Object objQ2;
            rq0.b bVar7;
            c cVar3;
            Object objE = uq.b.e();
            int i25 = this.f195169w;
            ?? r15 = 3;
            try {
                try {
                    try {
                        if (i25 == 0) {
                            u.b(obj);
                            c cVar4 = c.this;
                            rq0.b bVar8 = this.f195171y;
                            jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                pl.gov.coi.mobywatel.technical.documents.data.storage.b bVar9 = cVar4.documentsSummaryLocalESPDataSource;
                                this.f195154e = cVar4;
                                this.f195155f = bVar8;
                                this.f195156g = jVarA;
                                this.f195157h = vq.j.a(aVar);
                                this.f195158j = aVar;
                                this.f195162n = 0;
                                this.f195163p = 0;
                                this.f195164q = 0;
                                this.f195165r = 0;
                                this.f195166s = 0;
                                this.f195169w = 1;
                                objF = bVar9.f(this);
                                if (objF != objE) {
                                    cVar = cVar4;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    bVar = bVar8;
                                    bVar2 = aVar;
                                    bVar3 = bVar2;
                                    i18 = 0;
                                    i19 = 0;
                                    iVar = (dx.i) objF;
                                    if (iVar instanceof dx.i.Left) {
                                        bVar6 = (dx.b) ((dx.i.Left) iVar).b();
                                        px.d dVar = cVar.remoteLogger;
                                        List<px.a.Class> listA = px.c.a(bVar2);
                                        ex.b bVar10 = bVar3;
                                        if (bVar6 instanceof dx.b.Generic) {
                                            generic = (dx.b.Generic) bVar6;
                                        } else {
                                            generic = null;
                                        }
                                        dVar.T6("DocumentsSummaryLocalRepository error | getDocumentSummaryData parsingError", generic != null ? generic.getE() : null, listA);
                                        this.f195154e = bVar;
                                        this.f195155f = jVarA;
                                        this.f195156g = vq.j.a(bVar10);
                                        this.f195157h = vq.j.a(bVar2);
                                        this.f195158j = vq.j.a(iVar);
                                        this.f195159k = vq.j.a(bVar6);
                                        this.f195160l = bVar2;
                                        this.f195161m = cVar;
                                        this.f195162n = i17;
                                        this.f195163p = i19;
                                        this.f195164q = i16;
                                        this.f195165r = i15;
                                        this.f195166s = i18;
                                        this.f195167t = 0;
                                        this.f195168v = 0;
                                        this.f195169w = 2;
                                        objQ2 = cVar.q(this);
                                        if (objQ2 == objE) {
                                            bVar7 = bVar;
                                            cVar3 = cVar;
                                            listS = cVar3.s(bVar2, (Map) objQ2, bVar7);
                                        }
                                    } else {
                                        bVar4 = bVar3;
                                        if (iVar instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        map = (Map) ((dx.i.Right) iVar).b();
                                        if (map.isEmpty()) {
                                            this.f195154e = bVar;
                                            this.f195155f = jVarA;
                                            this.f195156g = vq.j.a(bVar4);
                                            this.f195157h = vq.j.a(bVar2);
                                            this.f195158j = vq.j.a(iVar);
                                            this.f195159k = vq.j.a(map);
                                            this.f195160l = bVar2;
                                            this.f195161m = cVar;
                                            this.f195162n = i17;
                                            this.f195163p = i19;
                                            this.f195164q = i16;
                                            this.f195165r = i15;
                                            this.f195166s = i18;
                                            this.f195167t = 0;
                                            this.f195168v = 0;
                                            this.f195169w = 3;
                                            objQ = cVar.q(this);
                                            if (objQ != objE) {
                                                bVar5 = bVar;
                                                cVar2 = cVar;
                                                listS = cVar2.s(bVar2, (Map) objQ, bVar5);
                                            }
                                        } else {
                                            listS = cVar.s(bVar2, map, bVar);
                                        }
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVarA;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i25 == 1) {
                            int i26 = this.f195166s;
                            int i27 = this.f195165r;
                            int i28 = this.f195164q;
                            int i29 = this.f195163p;
                            int i35 = this.f195162n;
                            ex.b bVar11 = (ex.b) this.f195158j;
                            ex.b bVar12 = (ex.b) this.f195157h;
                            dx.j<dx.b> jVar = (dx.j) this.f195156g;
                            bVar = (rq0.b) this.f195155f;
                            cVar = (c) this.f195154e;
                            try {
                                u.b(obj);
                                i18 = i26;
                                bVar2 = bVar11;
                                i16 = i28;
                                bVar3 = bVar12;
                                i19 = i29;
                                jVarA = jVar;
                                i17 = i35;
                                i15 = i27;
                                objF = obj;
                                iVar = (dx.i) objF;
                                if (iVar instanceof dx.i.Left) {
                                    bVar6 = (dx.b) ((dx.i.Left) iVar).b();
                                    px.d dVar2 = cVar.remoteLogger;
                                    List<px.a.Class> listA2 = px.c.a(bVar2);
                                    ex.b bVar13 = bVar3;
                                    if (bVar6 instanceof dx.b.Generic) {
                                        generic = (dx.b.Generic) bVar6;
                                    } else {
                                        generic = null;
                                    }
                                    dVar2.T6("DocumentsSummaryLocalRepository error | getDocumentSummaryData parsingError", generic != null ? generic.getE() : null, listA2);
                                    this.f195154e = bVar;
                                    this.f195155f = jVarA;
                                    this.f195156g = vq.j.a(bVar13);
                                    this.f195157h = vq.j.a(bVar2);
                                    this.f195158j = vq.j.a(iVar);
                                    this.f195159k = vq.j.a(bVar6);
                                    this.f195160l = bVar2;
                                    this.f195161m = cVar;
                                    this.f195162n = i17;
                                    this.f195163p = i19;
                                    this.f195164q = i16;
                                    this.f195165r = i15;
                                    this.f195166s = i18;
                                    this.f195167t = 0;
                                    this.f195168v = 0;
                                    this.f195169w = 2;
                                    objQ2 = cVar.q(this);
                                    if (objQ2 == objE) {
                                        bVar7 = bVar;
                                        cVar3 = cVar;
                                        listS = cVar3.s(bVar2, (Map) objQ2, bVar7);
                                    }
                                } else {
                                    bVar4 = bVar3;
                                    if (iVar instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    map = (Map) ((dx.i.Right) iVar).b();
                                    if (map.isEmpty()) {
                                        listS = cVar.s(bVar2, map, bVar);
                                    } else {
                                        this.f195154e = bVar;
                                        this.f195155f = jVarA;
                                        this.f195156g = vq.j.a(bVar4);
                                        this.f195157h = vq.j.a(bVar2);
                                        this.f195158j = vq.j.a(iVar);
                                        this.f195159k = vq.j.a(map);
                                        this.f195160l = bVar2;
                                        this.f195161m = cVar;
                                        this.f195162n = i17;
                                        this.f195163p = i19;
                                        this.f195164q = i16;
                                        this.f195165r = i15;
                                        this.f195166s = i18;
                                        this.f195167t = 0;
                                        this.f195168v = 0;
                                        this.f195169w = 3;
                                        objQ = cVar.q(this);
                                        if (objQ != objE) {
                                            bVar5 = bVar;
                                            cVar2 = cVar;
                                            listS = cVar2.s(bVar2, (Map) objQ, bVar5);
                                        }
                                    }
                                }
                                return objE;
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
                                r15 = jVar;
                                px.f fVar2 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i25 == 2) {
                            cVar3 = (c) this.f195161m;
                            bVar2 = (ex.b) this.f195160l;
                            dx.j<dx.b> jVar2 = (dx.j) this.f195155f;
                            bVar7 = (rq0.b) this.f195154e;
                            u.b(obj);
                            jVarA = jVar2;
                            objQ2 = obj;
                            listS = cVar3.s(bVar2, (Map) objQ2, bVar7);
                        } else {
                            if (i25 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            cVar2 = (c) this.f195161m;
                            bVar2 = (ex.b) this.f195160l;
                            dx.j<dx.b> jVar3 = (dx.j) this.f195155f;
                            bVar5 = (rq0.b) this.f195154e;
                            u.b(obj);
                            jVarA = jVar3;
                            objQ = obj;
                            listS = cVar2.s(bVar2, (Map) objQ, bVar5);
                        }
                        return new dx.i.Right(listS);
                    } catch (Exception e26) {
                        e = e26;
                    }
                } catch (CancellationException e27) {
                    throw e27;
                }
            } catch (ex.c e28) {
                e = e28;
            } catch (CancellationException e29) {
                throw e29;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, ? extends List<DocumentSummaryData>>> eVar) {
            return ((j) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new j(this.f195171y, eVar);
        }
    }

    public c(pl.gov.coi.mobywatel.technical.documents.data.storage.b bVar, p34.a aVar, px.d dVar, ez.a aVar2, s34.a aVar3) {
        this.documentsSummaryLocalESPDataSource = bVar;
        this.documentsRepository = aVar;
        this.remoteLogger = dVar;
        this.currentTimeProvider = aVar2;
        this.documentsContainersInteractor = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x010f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0150  */
    /* JADX WARN: Code duplicated, block: B:56:0x018a  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[LOOP:0: B:42:0x0109->B:65:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01d3 -> B:60:0x01da). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object q(tq.e<? super java.util.Map<rq0.b, ? extends java.util.List<k34.DocumentSummaryData>>> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u34.c.q(tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DocumentSummaryData> r(ex.b<? super dx.b> bVar, Map<rq0.b, ? extends List<DocumentSummaryData>> map, String str) {
        Object obj;
        List<DocumentSummaryData> list;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            for (Object obj2 : (List) ((Map.Entry) next).getValue()) {
                if (t.c(((DocumentSummaryData) obj2).getDocumentIID(), str)) {
                    obj = obj2;
                    break;
                }
            }
            if (obj != null) {
                obj = next;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && (list = (List) entry.getValue()) != null) {
            return list;
        }
        bVar.b(new dx.b.Generic(new Exception("DocumentSummaryData for documentIID [" + str + "] not exist")));
        throw new oq.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DocumentSummaryData> s(ex.b<? super dx.b> bVar, Map<rq0.b, ? extends List<DocumentSummaryData>> map, rq0.b bVar2) {
        List<DocumentSummaryData> list = map.get(bVar2);
        if (list != null) {
            return list;
        }
        bVar.b(new dx.b.Generic(new Exception("DocumentSummaryData for documentType [" + bVar2.getReferenceName() + "] not exist")));
        throw new oq.g();
    }

    @Override // u34.b
    public Object a(tq.e<? super i0> eVar) {
        Object objG = ju.i.g(g1.b().n0(z2.b(null, 1, null)), new C5080c(null), eVar);
        return objG == uq.b.e() ? objG : i0.f148189a;
    }

    @Override // u34.b
    public Object b(rq0.b bVar, String str, fz.b.LocalDate localDate, boolean z15, tq.e<? super i0> eVar) {
        Object objG = ju.i.g(g1.b().n0(z2.b(null, 1, null)), new a(z15, this, bVar, str, localDate, null), eVar);
        return objG == uq.b.e() ? objG : i0.f148189a;
    }

    @Override // u34.b
    public Object c(rq0.b bVar, tq.e<? super i0> eVar) {
        Object objG = ju.i.g(g1.b().n0(z2.b(null, 1, null)), new d(bVar, null), eVar);
        return objG == uq.b.e() ? objG : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0120  */
    /* JADX WARN: Code duplicated, block: B:34:0x0128  */
    /* JADX WARN: Code duplicated, block: B:39:0x013d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0195  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x023e -> B:63:0x0247). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // u34.b
    public java.lang.Object d(rq0.b r27, tq.e<? super java.util.List<k34.DocumentSummaryData>> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u34.c.d(rq0.b, tq.e):java.lang.Object");
    }

    @Override // u34.b
    public Object e(rq0.b bVar, List<BEDocumentStatus> list, tq.e<? super i0> eVar) {
        Object objG = ju.i.g(g1.b().n0(z2.b(null, 1, null)), new b(list, this, bVar, null), eVar);
        return objG == uq.b.e() ? objG : i0.f148189a;
    }

    @Override // u34.b
    public Object f(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, ? extends List<DocumentSummaryData>>> eVar) {
        return ju.i.g(g1.b().n0(z2.b(null, 1, null)), new j(bVar, null), eVar);
    }

    @Override // u34.b
    public mu.g<o> g() {
        return this.documentsSummaryLocalESPDataSource.b();
    }

    @Override // u34.b
    public Object h(String str, tq.e<? super dx.i<? extends dx.b, ? extends List<DocumentSummaryData>>> eVar) {
        return ju.i.g(g1.b().n0(z2.b(null, 1, null)), new i(str, null), eVar);
    }

    @Override // u34.b
    public Object i(tq.e<? super Map<rq0.b, ? extends List<DocumentSummaryData>>> eVar) {
        return ju.i.g(g1.b().n0(z2.b(null, 1, null)), new h(null), eVar);
    }

    @Override // u34.b
    public Object j(rq0.b bVar, String str, tq.e<? super i0> eVar) {
        Object objG = ju.i.g(g1.b(), new e(bVar, str, null), eVar);
        return objG == uq.b.e() ? objG : i0.f148189a;
    }
}
