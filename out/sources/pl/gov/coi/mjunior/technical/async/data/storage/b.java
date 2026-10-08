package pl.gov.coi.mjunior.technical.async.data.storage;

import cf0.AsyncDocumentToGenerate;
import cf0.AsyncErrorResponse;
import cf0.DownloadTaskData;
import gf0.DocumentToGenerateEntity;
import gf0.DownloadTaskDataEntity;
import hf0.DownloadTaskWithDocuments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import ju.g1;
import ju.l0;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\"\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0019\u0010\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u0006H\u0096@¢\u0006\u0004\b\u001a\u0010\u000eJ\u001f\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001c2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001c2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u001eJ\u001b\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u000b0\u001cH\u0016¢\u0006\u0004\b\"\u0010#J$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b$\u0010\u0016J4\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b)\u0010*J4\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010,\u001a\u00020+H\u0096@¢\u0006\u0004\b-\u0010.J$\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u001b\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b/\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100¨\u00061"}, d2 = {"Lpl/gov/coi/mjunior/technical/async/data/storage/b;", "Lmf0/a;", "Lp10/f;", "dbProvider", "<init>", "(Lp10/f;)V", "Ldx/i;", "Ldx/b;", "Lpl/gov/coi/mjunior/technical/async/data/storage/DownloadTaskDatabase;", "o", "()Ldx/i;", "", "Lcf0/f;", "a", "(Ltq/e;)Ljava/lang/Object;", "taskData", "Loq/i0;", "i", "(Lcf0/f;Ltq/e;)Ljava/lang/Object;", "", "id", "g", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "b", "", "c", "f", "taskId", "Lmu/g;", "j", "(Ljava/lang/String;)Lmu/g;", "documentId", "Lcf0/b;", "h", "d", "()Lmu/g;", "e", "Lcf0/c;", "type", "Lcf0/a;", "status", "m", "(Ljava/lang/String;Lcf0/c;Lcf0/a;Ltq/e;)Ljava/lang/Object;", "Lcf0/d;", "error", "k", "(Ljava/lang/String;Lcf0/c;Lcf0/d;Ltq/e;)Ljava/lang/Object;", "l", "Lp10/f;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements mf0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p10.f dbProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f158257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f158259f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f158260g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158261h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158262j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f158263k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f158264l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f158265m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f158267p;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158265m = obj;
            this.f158267p |= PKIFailureInfo.systemUnavail;
            return b.this.f(this);
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mjunior.technical.async.data.storage.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class C3927b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f158269f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f158270g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f158271h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C3927b(ex.b<? super dx.b> bVar, b bVar2, tq.e<? super C3927b> eVar) {
            super(2, eVar);
            this.f158270g = bVar;
            this.f158271h = bVar2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f158269f;
            if (i15 == 0) {
                u.b(obj);
                ff0.a aVarC0 = ((DownloadTaskDatabase) this.f158270g.a(this.f158271h.o())).c0();
                this.f158268e = vq.j.a(aVarC0);
                this.f158269f = 1;
                if (aVarC0.a(this) == objE) {
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
            return ((C3927b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new C3927b(this.f158270g, this.f158271h, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158274f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158275g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158276h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f158277j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f158278k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158279l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158280m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f158281n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f158283q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158281n = obj;
            this.f158283q |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f158285f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f158286g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f158287h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f158288j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ex.b<? super dx.b> bVar, b bVar2, String str, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f158286g = bVar;
            this.f158287h = bVar2;
            this.f158288j = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f158285f;
            if (i15 == 0) {
                u.b(obj);
                ff0.a aVarC0 = ((DownloadTaskDatabase) this.f158286g.a(this.f158287h.o())).c0();
                String str = this.f158288j;
                this.f158284e = vq.j.a(aVarC0);
                this.f158285f = 1;
                if (aVarC0.b(str, this) == objE) {
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
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f158286g, this.f158287h, this.f158288j, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158291f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158292g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158293h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f158294j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f158295k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158296l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158297m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f158298n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f158300q;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158298n = obj;
            this.f158300q |= PKIFailureInfo.systemUnavail;
            return b.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f158302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f158303g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f158304h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f158305j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ex.b<? super dx.b> bVar, b bVar2, String str, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f158303g = bVar;
            this.f158304h = bVar2;
            this.f158305j = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f158302f;
            if (i15 == 0) {
                u.b(obj);
                ff0.a aVarC0 = ((DownloadTaskDatabase) this.f158303g.a(this.f158304h.o())).c0();
                String str = this.f158305j;
                this.f158301e = vq.j.a(aVarC0);
                this.f158302f = 1;
                if (aVarC0.n(str, this) == objE) {
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
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new f(this.f158303g, this.f158304h, this.f158305j, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f158306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f158308f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f158309g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158310h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158311j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f158312k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f158313l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f158314m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f158316p;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158314m = obj;
            this.f158316p |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Lcf0/f;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<p0, tq.e<? super List<? extends DownloadTaskData>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158318f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158319g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158320h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158321j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f158322k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f158323l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f158324m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f158325n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f158326p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f158327q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f158328r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f158329s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f158330t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ b f158331v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(ex.b<? super dx.b> bVar, b bVar2, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f158330t = bVar;
            this.f158331v = bVar2;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0093  */
        /* JADX WARN: Code duplicated, block: B:19:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:23:0x00f3 A[LOOP:0: B:21:0x00ed->B:23:0x00f3, LOOP_END] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00cf -> B:20:0x00d0). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mjunior.technical.async.data.storage.b.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super List<DownloadTaskData>> eVar) {
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new h(this.f158330t, this.f158331v, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158332d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158334f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158335g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158336h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f158337j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f158338k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158339l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158340m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f158341n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f158343q;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158341n = obj;
            this.f158343q |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lcf0/f;", "<anonymous>", "(Lju/p0;)Lcf0/f;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<p0, tq.e<? super DownloadTaskData>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f158345f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f158346g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f158347h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f158348j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(ex.b<? super dx.b> bVar, b bVar2, String str, tq.e<? super j> eVar) {
            super(2, eVar);
            this.f158346g = bVar;
            this.f158347h = bVar2;
            this.f158348j = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            DownloadTaskDataEntity task;
            Object objE = uq.b.e();
            int i15 = this.f158345f;
            if (i15 == 0) {
                u.b(obj);
                ff0.a aVarC0 = ((DownloadTaskDatabase) this.f158346g.a(this.f158347h.o())).c0();
                String str = this.f158348j;
                this.f158344e = vq.j.a(aVarC0);
                this.f158345f = 1;
                obj = aVarC0.u(str, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            DownloadTaskWithDocuments downloadTaskWithDocuments = (DownloadTaskWithDocuments) obj;
            if (downloadTaskWithDocuments != null && (task = downloadTaskWithDocuments.getTask()) != null) {
                List<DocumentToGenerateEntity> listA = downloadTaskWithDocuments.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(v.y(listA, 10)), 16));
                Iterator<T> it = listA.iterator();
                while (it.hasNext()) {
                    oq.r<cf0.c, AsyncDocumentToGenerate> rVarE = ff0.s.e((DocumentToGenerateEntity) it.next());
                    linkedHashMap.put(rVarE.c(), rVarE.d());
                }
                DownloadTaskData downloadTaskDataD = ff0.s.d(task, linkedHashMap);
                if (downloadTaskDataD != null) {
                    return downloadTaskDataD;
                }
            }
            throw new NoSuchElementException("Task with id=" + this.f158348j + " not found");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super DownloadTaskData> eVar) {
            return ((j) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new j(this.f158346g, this.f158347h, this.f158348j, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158351f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158352g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158353h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f158354j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f158355k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158356l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158357m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f158358n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f158359p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f158361r;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158359p = obj;
            this.f158361r |= PKIFailureInfo.systemUnavail;
            return b.this.l(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgf0/d;", "entity", "Lcf0/b;", "<anonymous>", "(Lgf0/d;)Lcf0/b;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<DocumentToGenerateEntity, tq.e<? super AsyncDocumentToGenerate>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f158363f;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oq.r<cf0.c, AsyncDocumentToGenerate> rVarE;
            DocumentToGenerateEntity documentToGenerateEntity = (DocumentToGenerateEntity) this.f158363f;
            uq.b.e();
            if (this.f158362e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (documentToGenerateEntity == null || (rVarE = ff0.s.e(documentToGenerateEntity)) == null) {
                return null;
            }
            return rVarE.d();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(DocumentToGenerateEntity documentToGenerateEntity, tq.e<? super AsyncDocumentToGenerate> eVar) {
            return ((l) v(documentToGenerateEntity, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            l lVar = new l(eVar);
            lVar.f158363f = obj;
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class m implements mu.g<List<? extends AsyncDocumentToGenerate>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f158364a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f158365a;

            /* JADX INFO: renamed from: pl.gov.coi.mjunior.technical.async.data.storage.b$m$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3928a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f158366d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f158367e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f158368f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f158370h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f158371j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f158372k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f158373l;

                public C3928a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f158366d = obj;
                    this.f158367e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f158365a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3928a c3928a;
                if (eVar instanceof C3928a) {
                    c3928a = (C3928a) eVar;
                    int i15 = c3928a.f158367e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3928a.f158367e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3928a = new C3928a(eVar);
                    }
                } else {
                    c3928a = new C3928a(eVar);
                }
                Object obj2 = c3928a.f158366d;
                Object objE = uq.b.e();
                int i16 = c3928a.f158367e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f158365a;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(v.y(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ff0.s.e((DocumentToGenerateEntity) it.next()).d());
                    }
                    c3928a.f158368f = vq.j.a(obj);
                    c3928a.f158370h = vq.j.a(c3928a);
                    c3928a.f158371j = vq.j.a(obj);
                    c3928a.f158372k = vq.j.a(hVar);
                    c3928a.f158373l = 0;
                    c3928a.f158367e = 1;
                    if (hVar.F(arrayList, c3928a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public m(mu.g gVar) {
            this.f158364a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super List<? extends AsyncDocumentToGenerate>> hVar, tq.e eVar) {
            Object objA = this.f158364a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhf0/a;", "wrapper", "Lcf0/f;", "<anonymous>", "(Lhf0/a;)Lcf0/f;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<DownloadTaskWithDocuments, tq.e<? super DownloadTaskData>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f158375f;

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            DownloadTaskDataEntity task;
            DownloadTaskWithDocuments downloadTaskWithDocuments = (DownloadTaskWithDocuments) this.f158375f;
            uq.b.e();
            if (this.f158374e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (downloadTaskWithDocuments == null || (task = downloadTaskWithDocuments.getTask()) == null) {
                return null;
            }
            List<DocumentToGenerateEntity> listA = downloadTaskWithDocuments.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(v.y(listA, 10)), 16));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                oq.r<cf0.c, AsyncDocumentToGenerate> rVarE = ff0.s.e((DocumentToGenerateEntity) it.next());
                linkedHashMap.put(rVarE.c(), rVarE.d());
            }
            return ff0.s.d(task, linkedHashMap);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(DownloadTaskWithDocuments downloadTaskWithDocuments, tq.e<? super DownloadTaskData> eVar) {
            return ((n) v(downloadTaskWithDocuments, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            n nVar = new n(eVar);
            nVar.f158375f = obj;
            return nVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class o extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158379g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158380h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f158381j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f158382k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158383l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158384m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f158385n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f158387q;

        o(tq.e<? super o> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158385n = obj;
            this.f158387q |= PKIFailureInfo.systemUnavail;
            return b.this.i(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158388e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158389f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158390g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158391h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f158392j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ b f158393k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ DownloadTaskData f158394l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(ex.b<? super dx.b> bVar, b bVar2, DownloadTaskData downloadTaskData, tq.e<? super p> eVar) {
            super(2, eVar);
            this.f158392j = bVar;
            this.f158393k = bVar2;
            this.f158394l = downloadTaskData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f158391h;
            if (i15 == 0) {
                u.b(obj);
                ff0.a aVarC0 = ((DownloadTaskDatabase) this.f158392j.a(this.f158393k.o())).c0();
                DownloadTaskDataEntity downloadTaskDataEntityJ = ff0.s.j(this.f158394l);
                Map<cf0.c, AsyncDocumentToGenerate> mapB = this.f158394l.b();
                DownloadTaskData downloadTaskData = this.f158394l;
                ArrayList arrayList = new ArrayList(mapB.size());
                for (Map.Entry<cf0.c, AsyncDocumentToGenerate> entry : mapB.entrySet()) {
                    arrayList.add(ff0.s.h(entry.getValue(), downloadTaskData.getTaskId(), entry.getKey(), downloadTaskDataEntityJ.getDocumentDownloadMethod()));
                }
                this.f158388e = vq.j.a(aVarC0);
                this.f158389f = vq.j.a(downloadTaskDataEntityJ);
                this.f158390g = vq.j.a(arrayList);
                this.f158391h = 1;
                if (aVarC0.o(downloadTaskDataEntityJ, arrayList, this) == objE) {
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
            return ((p) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new p(this.f158392j, this.f158393k, this.f158394l, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class q extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158398g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158399h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f158400j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f158401k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158402l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158403m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f158404n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f158406q;

        q(tq.e<? super q> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158404n = obj;
            this.f158406q |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f158408f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f158409g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f158410h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f158411j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(ex.b<? super dx.b> bVar, b bVar2, String str, tq.e<? super r> eVar) {
            super(2, eVar);
            this.f158409g = bVar;
            this.f158410h = bVar2;
            this.f158411j = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f158408f;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ff0.a aVarC0 = ((DownloadTaskDatabase) this.f158409g.a(this.f158410h.o())).c0();
            String str = this.f158411j;
            this.f158407e = vq.j.a(aVarC0);
            this.f158408f = 1;
            Object objP = aVarC0.p(str, this);
            return objP == objE ? objE : objP;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((r) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new r(this.f158409g, this.f158410h, this.f158411j, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class s extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158414f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158415g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158416h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158417j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f158418k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158419l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158420m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f158421n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f158422p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f158423q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f158424r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f158426t;

        s(tq.e<? super s> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158424r = obj;
            this.f158426t |= PKIFailureInfo.systemUnavail;
            return b.this.k(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class t extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158429f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158430g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158431h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158432j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f158433k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158434l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158435m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f158436n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f158437p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f158438q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f158439r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f158441t;

        t(tq.e<? super t> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158439r = obj;
            this.f158441t |= PKIFailureInfo.systemUnavail;
            return b.this.m(null, null, null, this);
        }
    }

    public b(p10.f fVar) {
        this.dbProvider = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.i<dx.b, DownloadTaskDatabase> o() {
        p10.f fVar = this.dbProvider;
        List<? extends Object> listN = v.n();
        DownloadTaskDatabase.Companion cVar = DownloadTaskDatabase.INSTANCE;
        return fVar.b(DownloadTaskDatabase.class, listN, v.q(cVar.b(), cVar.c()), cVar.a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [pl.gov.coi.mjunior.technical.async.data.storage.b$g, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // mf0.a
    public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<DownloadTaskData>>> eVar) throws Throwable {
        ?? gVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof g) {
            g gVar2 = (g) eVar;
            int i15 = gVar2.f158316p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar2.f158316p = i15 - PKIFailureInfo.systemUnavail;
                gVar = gVar2;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f158314m;
        Object objE = uq.b.e();
        int i16 = gVar.f158316p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        h hVar = new h(aVar, this, null);
                        gVar.f158311j = jVarA;
                        gVar.f158312k = vq.j.a(aVar);
                        gVar.f158313l = vq.j.a(aVar);
                        gVar.f158306d = 0;
                        gVar.f158307e = 0;
                        gVar.f158308f = 0;
                        gVar.f158309g = 0;
                        gVar.f158310h = 0;
                        gVar.f158316p = 1;
                        Object objG = ju.i.g(l0VarB, hVar, gVar);
                        if (objG == objE) {
                            return objE;
                        }
                        obj = objG;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        gVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(gVar));
                        dx.i iVarA = gVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right((List) obj);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // mf0.a
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        c cVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f158283q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f158283q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f158281n;
        Object objE = uq.b.e();
        int i16 = cVar.f158283q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        d dVar = new d(aVar, this, str, null);
                        cVar.f158272d = vq.j.a(str);
                        cVar.f158273e = jVarA;
                        cVar.f158274f = vq.j.a(aVar);
                        cVar.f158275g = vq.j.a(aVar);
                        cVar.f158276h = 0;
                        cVar.f158277j = 0;
                        cVar.f158278k = 0;
                        cVar.f158279l = 0;
                        cVar.f158280m = 0;
                        cVar.f158283q = 1;
                        if (ju.i.g(l0VarB, dVar, cVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // mf0.a
    public Object c(String str, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        q qVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof q) {
            qVar = (q) eVar;
            int i15 = qVar.f158406q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                qVar.f158406q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                qVar = new q(eVar);
            }
        } else {
            qVar = new q(eVar);
        }
        Object obj = qVar.f158404n;
        Object objE = uq.b.e();
        int i16 = qVar.f158406q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        r rVar = new r(aVar, this, str, null);
                        qVar.f158395d = vq.j.a(str);
                        qVar.f158396e = jVarA;
                        qVar.f158397f = vq.j.a(aVar);
                        qVar.f158398g = vq.j.a(aVar);
                        qVar.f158399h = 0;
                        qVar.f158400j = 0;
                        qVar.f158401k = 0;
                        qVar.f158402l = 0;
                        qVar.f158403m = 0;
                        qVar.f158406q = 1;
                        Object objG = ju.i.g(l0VarB, rVar, qVar);
                        if (objG == objE) {
                            return objE;
                        }
                        obj = objG;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(vq.b.a(((Boolean) obj).booleanValue()));
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    @Override // mf0.a
    public mu.g<List<AsyncDocumentToGenerate>> d() {
        dx.i<dx.b, DownloadTaskDatabase> iVarO = o();
        if (iVarO instanceof dx.i.Left) {
            return mu.i.v();
        }
        if (iVarO instanceof dx.i.Right) {
            return mu.i.M(new m(mu.i.p(((DownloadTaskDatabase) ((dx.i.Right) iVarO).b()).c0().d())), g1.b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // mf0.a
    public Object e(String str, tq.e<? super dx.i<? extends dx.b, DownloadTaskData>> eVar) throws Throwable {
        i iVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f158343q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f158343q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object obj = iVar.f158341n;
        Object objE = uq.b.e();
        int i16 = iVar.f158343q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        j jVar = new j(aVar, this, str, null);
                        iVar.f158332d = vq.j.a(str);
                        iVar.f158333e = jVarA;
                        iVar.f158334f = vq.j.a(aVar);
                        iVar.f158335g = vq.j.a(aVar);
                        iVar.f158336h = 0;
                        iVar.f158337j = 0;
                        iVar.f158338k = 0;
                        iVar.f158339l = 0;
                        iVar.f158340m = 0;
                        iVar.f158343q = 1;
                        Object objG = ju.i.g(l0VarB, jVar, iVar);
                        if (objG == objE) {
                            return objE;
                        }
                        obj = objG;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right((DownloadTaskData) obj);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [pl.gov.coi.mjunior.technical.async.data.storage.b$a, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // mf0.a
    public Object f(tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        ?? aVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof a) {
            a aVar2 = (a) eVar;
            int i15 = aVar2.f158267p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f158267p = i15 - PKIFailureInfo.systemUnavail;
                aVar = aVar2;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f158265m;
        Object objE = uq.b.e();
        int i16 = aVar.f158267p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar3 = new ex.a();
                        l0 l0VarB = g1.b();
                        C3927b c3927b = new C3927b(aVar3, this, null);
                        aVar.f158262j = jVarA;
                        aVar.f158263k = vq.j.a(aVar3);
                        aVar.f158264l = vq.j.a(aVar3);
                        aVar.f158257d = 0;
                        aVar.f158258e = 0;
                        aVar.f158259f = 0;
                        aVar.f158260g = 0;
                        aVar.f158261h = 0;
                        aVar.f158267p = 1;
                        if (ju.i.g(l0VarB, c3927b, aVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        aVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(aVar));
                        dx.i iVarA = aVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // mf0.a
    public Object g(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        e eVar2;
        Object objB;
        ex.c e15;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f158300q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f158300q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f158298n;
        Object objE = uq.b.e();
        int i16 = eVar2.f158300q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        f fVar = new f(aVar, this, str, null);
                        eVar2.f158289d = vq.j.a(str);
                        eVar2.f158290e = jVarA;
                        eVar2.f158291f = vq.j.a(aVar);
                        eVar2.f158292g = vq.j.a(aVar);
                        eVar2.f158293h = 0;
                        eVar2.f158294j = 0;
                        eVar2.f158295k = 0;
                        eVar2.f158296l = 0;
                        eVar2.f158297m = 0;
                        eVar2.f158300q = 1;
                        if (ju.i.g(l0VarB, fVar, eVar2) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar2 = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    @Override // mf0.a
    public mu.g<AsyncDocumentToGenerate> h(String documentId) {
        dx.i<dx.b, DownloadTaskDatabase> iVarO = o();
        if (iVarO instanceof dx.i.Left) {
            return mu.i.v();
        }
        if (iVarO instanceof dx.i.Right) {
            return mu.i.M(mu.i.O(((DownloadTaskDatabase) ((dx.i.Right) iVarO).b()).c0().h(documentId), new l(null)), g1.b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [cf0.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // mf0.a
    public Object i(DownloadTaskData downloadTaskData, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        o oVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof o) {
            oVar = (o) eVar;
            int i15 = oVar.f158387q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f158387q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(eVar);
            }
        } else {
            oVar = new o(eVar);
        }
        Object obj = oVar.f158385n;
        Object objE = uq.b.e();
        int i16 = oVar.f158387q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        p pVar = new p(aVar, this, downloadTaskData, null);
                        oVar.f158376d = vq.j.a(downloadTaskData);
                        oVar.f158377e = jVarA;
                        oVar.f158378f = vq.j.a(aVar);
                        oVar.f158379g = vq.j.a(aVar);
                        oVar.f158380h = 0;
                        oVar.f158381j = 0;
                        oVar.f158382k = 0;
                        oVar.f158383l = 0;
                        oVar.f158384m = 0;
                        oVar.f158387q = 1;
                        if (ju.i.g(l0VarB, pVar, oVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        downloadTaskData = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(downloadTaskData));
                        dx.i iVarA = downloadTaskData.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    @Override // mf0.a
    public mu.g<DownloadTaskData> j(String taskId) {
        dx.i<dx.b, DownloadTaskDatabase> iVarO = o();
        if (iVarO instanceof dx.i.Left) {
            return mu.i.v();
        }
        if (iVarO instanceof dx.i.Right) {
            return mu.i.M(mu.i.O(((DownloadTaskDatabase) ((dx.i.Right) iVarO).b()).c0().s(taskId), new n(null)), g1.b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // mf0.a
    public Object k(String str, cf0.c cVar, AsyncErrorResponse asyncErrorResponse, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        s sVar;
        Object objB;
        if (eVar instanceof s) {
            sVar = (s) eVar;
            int i15 = sVar.f158426t;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                sVar.f158426t = i15 - PKIFailureInfo.systemUnavail;
            } else {
                sVar = new s(eVar);
            }
        } else {
            sVar = new s(eVar);
        }
        s sVar2 = sVar;
        Object obj = sVar2.f158424r;
        Object objE = uq.b.e();
        int i16 = sVar2.f158426t;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ff0.a aVarC0 = ((DownloadTaskDatabase) aVar.a(o())).c0();
                        gf0.e eVarI = ff0.s.i(cVar);
                        String businessCode = asyncErrorResponse.getBusinessCode();
                        String message = asyncErrorResponse.getMessage();
                        String technicalCode = asyncErrorResponse.getTechnicalCode();
                        String title = asyncErrorResponse.getTitle();
                        String traceId = asyncErrorResponse.getTraceId();
                        sVar2.f158412d = vq.j.a(str);
                        sVar2.f158413e = vq.j.a(cVar);
                        sVar2.f158414f = vq.j.a(asyncErrorResponse);
                        sVar2.f158415g = jVarA;
                        sVar2.f158416h = vq.j.a(aVar);
                        sVar2.f158417j = vq.j.a(aVar);
                        sVar2.f158418k = vq.j.a(aVarC0);
                        sVar2.f158419l = 0;
                        sVar2.f158420m = 0;
                        sVar2.f158421n = 0;
                        sVar2.f158422p = 0;
                        sVar2.f158423q = 0;
                        sVar2.f158426t = 1;
                        if (aVarC0.k(str, eVarI, businessCode, message, technicalCode, title, traceId, sVar2) == objE) {
                            return objE;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message2 = e.getMessage();
                        if (message2 == null) {
                            message2 = "";
                        }
                        fVar.d(message2, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // mf0.a
    public Object l(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        k kVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f158361r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f158361r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object obj = kVar.f158359p;
        Object objE = uq.b.e();
        int i16 = kVar.f158361r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ff0.a aVarC0 = ((DownloadTaskDatabase) aVar.a(o())).c0();
                        kVar.f158349d = vq.j.a(str);
                        kVar.f158350e = jVarA;
                        kVar.f158351f = vq.j.a(aVar);
                        kVar.f158352g = vq.j.a(aVar);
                        kVar.f158353h = vq.j.a(aVarC0);
                        kVar.f158354j = 0;
                        kVar.f158355k = 0;
                        kVar.f158356l = 0;
                        kVar.f158357m = 0;
                        kVar.f158358n = 0;
                        kVar.f158361r = 1;
                        if (aVarC0.i(str, true, kVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // mf0.a
    public Object m(String str, cf0.c cVar, cf0.a aVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        t tVar;
        Object objB;
        if (eVar instanceof t) {
            tVar = (t) eVar;
            int i15 = tVar.f158441t;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                tVar.f158441t = i15 - PKIFailureInfo.systemUnavail;
            } else {
                tVar = new t(eVar);
            }
        } else {
            tVar = new t(eVar);
        }
        Object obj = tVar.f158439r;
        Object objE = uq.b.e();
        int i16 = tVar.f158441t;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        ff0.a aVarC0 = ((DownloadTaskDatabase) aVar2.a(o())).c0();
                        gf0.e eVarI = ff0.s.i(cVar);
                        gf0.b bVarG = ff0.s.g(aVar);
                        tVar.f158427d = vq.j.a(str);
                        tVar.f158428e = vq.j.a(cVar);
                        tVar.f158429f = vq.j.a(aVar);
                        tVar.f158430g = jVarA;
                        tVar.f158431h = vq.j.a(aVar2);
                        tVar.f158432j = vq.j.a(aVar2);
                        tVar.f158433k = vq.j.a(aVarC0);
                        tVar.f158434l = 0;
                        tVar.f158435m = 0;
                        tVar.f158436n = 0;
                        tVar.f158437p = 0;
                        tVar.f158438q = 0;
                        tVar.f158441t = 1;
                        if (aVarC0.t(str, eVarI, bVarG, tVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }
}
