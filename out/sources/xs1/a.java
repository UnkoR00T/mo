package xs1;

import dx.i;
import ir0.RefugeeChildPersonalInfo;
import java.util.List;
import lr0.e;
import mx.c;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lxs1/a;", "", "Lgz/b$a$a;", "", "Lir0/a;", "Llr0/e;", "bEGetRefugeeKidsPersonalInfoUC", "Lmx/c;", "labelProvider", "<init>", "(Llr0/e;Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Llr0/e;", "b", "Lmx/c;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e bEGetRefugeeKidsPersonalInfoUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: xs1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5910a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f220847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f220848e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f220850g;

        C5910a(tq.e<? super C5910a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f220848e = obj;
            this.f220850g |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    public a(e eVar, c cVar) {
        this.bEGetRefugeeKidsPersonalInfoUC = eVar;
        this.labelProvider = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super i<? extends dx.b, ? extends List<RefugeeChildPersonalInfo>>> eVar) throws Throwable {
        C5910a c5910a;
        if (eVar instanceof C5910a) {
            c5910a = (C5910a) eVar;
            int i15 = c5910a.f220850g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c5910a.f220850g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c5910a = new C5910a(eVar);
            }
        } else {
            c5910a = new C5910a(eVar);
        }
        Object objC = c5910a.f220848e;
        Object objE = uq.b.e();
        int i16 = c5910a.f220850g;
        if (i16 == 0) {
            u.b(objC);
            e eVar2 = this.bEGetRefugeeKidsPersonalInfoUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            c5910a.f220847d = j.a(c1792a);
            c5910a.f220850g = 1;
            objC = eVar2.c(c1792a2, c5910a);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        List list = (List) ((i.Right) iVar).b();
        return list.isEmpty() ? new i.Left(new dx.b.Business(null, null, this.labelProvider.c(ss1.a.f183956f), this.labelProvider.c(ss1.a.f183955e), null, this.labelProvider.c(ss1.a.f183952b), null, 83, null)) : new i.Right(list);
    }
}
