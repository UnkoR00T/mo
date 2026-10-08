package fe1;

import androidx.compose.ui.graphics.Color;
import ee1.State;
import ee1.h;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import mx.Label;
import mx.c;
import n40.FilePickerData;
import n40.e;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import wx.i;
import wx.j;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lfe1/a;", "Lxw/f;", "Lfe1/a$a;", "Lee1/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lfe1/a$a;)Lee1/h$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: fe1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e¨\u0006!"}, d2 = {"Lfe1/a$a;", "", "Lee1/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "onAdd", "onDelete", "nextAction", "backAction", "closeAction", "<init>", "(Lee1/g;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lee1/g;", "f", "()Lee1/g;", "b", "Ler/a;", "d", "()Ler/a;", "c", "e", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f61729g = i.Regular.f215742c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAdd;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDelete;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = state;
            this.onAdd = aVar;
            this.onDelete = aVar2;
            this.nextAction = aVar3;
            this.backAction = aVar4;
            this.closeAction = aVar5;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final er.a<i0> c() {
            return this.nextAction;
        }

        public final er.a<i0> d() {
            return this.onAdd;
        }

        public final er.a<i0> e() {
            return this.onDelete;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onAdd, params.onAdd) && t.c(this.onDelete, params.onDelete) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onAdd.hashCode()) * 31) + this.onDelete.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onAdd=" + this.onAdd + ", onDelete=" + this.onDelete + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f61736a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1004493899);
            if (p076m2.t.k()) {
                p076m2.t.o(1004493899, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.presentation.incometaxexceededaddfile.mapper.IncomeTaxExceededAddFileMapper.invoke.<anonymous> (IncomeTaxExceededAddFileMapper.kt:52)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(ha1.a.f82475p2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f61736a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(ha1.a.f82424i5);
        Label labelC2 = this.labelProvider.c(ha1.a.f82416h5);
        Label labelC3 = this.labelProvider.c(ha1.a.f82528x);
        Label labelC4 = (params.getState().getPickedFile() == null && params.getState().getValidated()) ? this.labelProvider.c(ha1.a.f82535y) : null;
        i.Regular pickedFile = params.getState().getPickedFile();
        return new h.Data(baseScaffoldData, labelC, labelC2, new FilePickerData(labelC3, labelC4, v.r(pickedFile != null ? new n40.i.Regular(mx.b.b(j.a(pickedFile), "fullFileName"), this.labelProvider.e(ha1.a.f82542z, t04.a.c(pickedFile.d())), null, params.e(), 4, null) : null), v.q(new e.AllowedFormats(ee1.i.a()), new e.b.Total(ee1.i.b(), null)), params.d(), 1), params.a(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.E), null, 2, null), d.a.f107773a, null, params.c(), 35, null));
    }
}
