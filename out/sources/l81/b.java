package l81;

import er.l;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;
import wx.i;
import zz.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwx/i;", "La00/b;", "pickedFileToAndroidMapper", "Lmx/c;", "labelProvider", "Lkotlin/Function1;", "Lwx/i$a;", "Loq/i0;", "onPreviewClicked", "Lkotlin/Function0;", "onDeleteFile", "Ldx/i;", "Ldx/b;", "Ln40/i;", "b", "(Lwx/i;La00/b;Lmx/c;Ler/l;Ler/a;Ltq/e;)Ljava/lang/Object;", "", "Lmx/a;", "d", "(FLmx/c;)Lmx/a;", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f116949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116951f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f116952g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f116953h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f116954j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f116955k;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f116954j = obj;
            this.f116955k |= PKIFailureInfo.systemUnavail;
            return b.b(null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(i iVar, a00.b bVar, c cVar, final l<? super i.Image, i0> lVar, er.a<i0> aVar, e<? super dx.i<? extends dx.b, ? extends n40.i>> eVar) throws Throwable {
        a aVar2;
        Object regular;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i15 = aVar2.f116955k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f116955k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        Object objA = aVar2.f116954j;
        Object objE = uq.b.e();
        int i16 = aVar2.f116955k;
        if (i16 == 0) {
            u.b(objA);
            a00.b.Params params = new a00.b.Params(iVar);
            aVar2.f116949d = iVar;
            aVar2.f116950e = j.a(bVar);
            aVar2.f116951f = cVar;
            aVar2.f116952g = lVar;
            aVar2.f116953h = aVar;
            aVar2.f116955k = 1;
            objA = bVar.a(params, aVar2);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (er.a) aVar2.f116953h;
            lVar = (l) aVar2.f116952g;
            cVar = (c) aVar2.f116951f;
            iVar = (i) aVar2.f116949d;
            u.b(objA);
        }
        er.a<i0> aVar3 = aVar;
        dx.i iVar2 = (dx.i) objA;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (!(iVar2 instanceof dx.i.Right)) {
            throw new p();
        }
        final h hVar = (h) ((dx.i.Right) iVar2).b();
        if (hVar instanceof h.Image) {
            regular = new n40.i.Image(mx.b.b(wx.j.a(iVar), "fileTitle"), d(iVar.d(), cVar), aVar3, new er.a() { // from class: l81.a
                @Override // er.a
                public final Object a() {
                    return b.c(lVar, hVar);
                }
            }, new n40.i.Image.AbstractC3255a.Image(((h.Image) hVar).getThumbnail()));
        } else {
            if (!(hVar instanceof h.Regular)) {
                throw new p();
            }
            regular = new n40.i.Regular(mx.b.b(wx.j.a(iVar), "fileTitle"), d(iVar.d(), cVar), null, aVar3, 4, null);
        }
        return new dx.i.Right(regular);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(l lVar, h hVar) {
        lVar.b(((h.Image) hVar).a());
        return i0.f148189a;
    }

    private static final Label d(float f15, c cVar) {
        return cVar.e(w51.a.f210309c4, t04.a.c(f15));
    }
}
