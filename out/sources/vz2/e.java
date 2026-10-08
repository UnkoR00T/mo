package vz2;

import android.graphics.Bitmap;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import jk0.ExternalQualifiedSignatureProviderTemporaryInterruption;
import jk0.QualifiedSignatureProviderMobile;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import tz2.j;
import tz2.k;
import uz2.QualifiedSignatureProviderData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lvz2/e;", "Lxw/f;", "Lvz2/e$a;", "Ltz2/k$a;", "Lmx/c;", "labelProvider", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "<init>", "(Lmx/c;Lrz/a;Liy/a;)V", "params", "e", "(Lvz2/e$a;)Ltz2/k$a;", "a", "Lmx/c;", "b", "Lrz/a;", "c", "Liy/a;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: vz2.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lvz2/e$a;", "", "Ltz2/j;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Ljk0/o;", "onProviderSelected", "Lvz2/c;", "showDialog", "<init>", "(Ltz2/j;Ler/a;Ler/l;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltz2/j;", "d", "()Ltz2/j;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final j state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<QualifiedSignatureProviderMobile, i0> onProviderSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<c, i0> showDialog;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(j jVar, er.a<i0> aVar, l<? super QualifiedSignatureProviderMobile, i0> lVar, l<? super c, i0> lVar2) {
            this.state = jVar;
            this.onBackAction = aVar;
            this.onProviderSelected = lVar;
            this.showDialog = lVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<QualifiedSignatureProviderMobile, i0> b() {
            return this.onProviderSelected;
        }

        public final l<c, i0> c() {
            return this.showDialog;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final j getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onProviderSelected, params.onProviderSelected) && t.c(this.showDialog, params.showDialog);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onProviderSelected.hashCode()) * 31) + this.showDialog.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onProviderSelected=" + this.onProviderSelected + ", showDialog=" + this.showDialog + ')';
        }
    }

    public e(mx.c cVar, rz.a aVar, iy.a aVar2) {
        this.labelProvider = cVar;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(QualifiedSignatureProviderMobile qualifiedSignatureProviderMobile, Params params) {
        ExternalQualifiedSignatureProviderTemporaryInterruption temporaryInterruption = qualifiedSignatureProviderMobile.getTemporaryInterruption();
        if (temporaryInterruption != null) {
            params.c().b(new c.TemporaryInterruption(temporaryInterruption));
        } else {
            params.b().b(qualifiedSignatureProviderMobile);
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k.a b(final Params params) {
        Object objB;
        mx.c cVar = this.labelProvider;
        j state = params.getState();
        if (!(state instanceof j.Initialized) && !(state instanceof j.GenerateProviderEntry) && !(state instanceof j.RedirectionToProvider)) {
            if (state instanceof j.Error) {
                return new k.a.Error(((j.Error) state).getErrorVMS());
            }
            throw new p();
        }
        ry.b bVar = null;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), cVar.c(uy2.b.f202293g0), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = cVar.c(uy2.b.f202291f0);
        Label labelC2 = state.getQualifiedSignatureInfo().getFreeSignaturesCounter() < 1 ? cVar.c(uy2.b.f202289e0) : null;
        List<QualifiedSignatureProviderMobile> listB = state.getQualifiedSignatureInfo().b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        int i15 = 0;
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final QualifiedSignatureProviderMobile qualifiedSignatureProviderMobile = (QualifiedSignatureProviderMobile) obj;
            rz.a aVar = this.bitmapDecoder;
            dx.i iVarC = iy.a.c(this.base64Coder, qualifiedSignatureProviderMobile.getIcon(), bVar, 2, bVar);
            if (iVarC instanceof dx.i.Left) {
                objB = new byte[0];
            } else {
                if (!(iVarC instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) iVarC).b();
            }
            Bitmap bitmapA = aVar.a((byte[]) objB);
            arrayList.add(new QualifiedSignatureProviderData(mx.b.b(qualifiedSignatureProviderMobile.getTitle(), "ProviderTitle"), mx.b.b(qualifiedSignatureProviderMobile.getSubtitle(), "ProviderSubtitle"), bitmapA, c70.a.f23835a.a().V(qualifiedSignatureProviderMobile.getTitle() + Label.INSTANCE.d().getText() + qualifiedSignatureProviderMobile.getSubtitle(), i16, state.getQualifiedSignatureInfo().b().size()), "ProviderItem" + i15 + "Tag", new er.a() { // from class: vz2.d
                @Override // er.a
                public final Object a() {
                    return e.f(qualifiedSignatureProviderMobile, params);
                }
            }));
            i15 = i16;
            bVar = null;
        }
        return new k.a.Initialized(baseScaffoldData, labelC, labelC2, arrayList, params.a());
    }
}
