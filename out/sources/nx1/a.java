package nx1;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import lw1.j0;
import mx.Label;
import mx1.g0;
import n30.CardListData;
import n40.FilePickerData;
import n40.e;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import wx.j;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnx1/a;", "Lxw/f;", "Lnx1/a$a;", "Lmx1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lnx1/a$a;)Lmx1/c$a;", "a", "Lmx/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, mx1.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: nx1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b!\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u0019\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\"\u0010 R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b#\u0010 ¨\u0006%"}, d2 = {"Lnx1/a$a;", "", "Lmx1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onClose", "confirmFile", "onAdd", "onPreview", "onDelete", "onNext", "<init>", "(Lmx1/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx1/b;", "h", "()Lmx1/b;", "b", "Ler/a;", "c", "()Ler/a;", "d", "e", "f", "g", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mx1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> confirmFile;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAdd;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPreview;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDelete;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        public Params(mx1.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, er.a<i0> aVar7) {
            this.state = bVar;
            this.onBack = aVar;
            this.onClose = aVar2;
            this.confirmFile = aVar3;
            this.onAdd = aVar4;
            this.onPreview = aVar5;
            this.onDelete = aVar6;
            this.onNext = aVar7;
        }

        public final er.a<i0> a() {
            return this.confirmFile;
        }

        public final er.a<i0> b() {
            return this.onAdd;
        }

        public final er.a<i0> c() {
            return this.onBack;
        }

        public final er.a<i0> d() {
            return this.onClose;
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.confirmFile, params.confirmFile) && t.c(this.onAdd, params.onAdd) && t.c(this.onPreview, params.onPreview) && t.c(this.onDelete, params.onDelete) && t.c(this.onNext, params.onNext);
        }

        public final er.a<i0> f() {
            return this.onNext;
        }

        public final er.a<i0> g() {
            return this.onPreview;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final mx1.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.confirmFile.hashCode()) * 31) + this.onAdd.hashCode()) * 31) + this.onPreview.hashCode()) * 31) + this.onDelete.hashCode()) * 31) + this.onNext.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", confirmFile=" + this.confirmFile + ", onAdd=" + this.onAdd + ", onPreview=" + this.onPreview + ", onDelete=" + this.onDelete + ", onNext=" + this.onNext + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f139455a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-11448601);
            if (p076m2.t.k()) {
                p076m2.t.o(-11448601, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.documentsigning.presentation.addfile.mapper.DocumentSigningAddFileMapper.invoke.<anonymous> (DocumentSigningAddFileMapper.kt:59)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f139456a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(644164599);
            if (p076m2.t.k()) {
                p076m2.t.o(644164599, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.documentsigning.presentation.addfile.mapper.DocumentSigningAddFileMapper.invoke.<anonymous> (DocumentSigningAddFileMapper.kt:116)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public mx1.c.a b(Params params) {
        mx1.b state = params.getState();
        if (state instanceof mx1.b.AddFile) {
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(j0.S0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f139455a, null, params.d(), 4, null)), null, 20, null), null, null, null, null, 61, null);
            er.a<i0> aVarC = params.c();
            er.a<i0> aVarB = params.b();
            Label labelC = this.labelProvider.c(j0.f120808y);
            ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j0.f120765o), null, 2, null), d.a.f107773a, null, params.a(), 35, null);
            Label labelC2 = this.labelProvider.c(j0.f120740j);
            mx1.b.AddFile addFile = (mx1.b.AddFile) state;
            Label labelC3 = (addFile.getPickedFile() == null && addFile.getValidated()) ? this.labelProvider.c(j0.f120745k) : null;
            wx.i.Regular pickedFile = addFile.getPickedFile();
            return new mx1.c.a.AddFile(baseScaffoldData, aVarC, aVarB, labelC, buttonData, new FilePickerData(labelC2, labelC3, v.r(pickedFile != null ? new n40.i.Regular(mx.b.b(j.a(pickedFile), "fullFileName"), this.labelProvider.e(j0.f120750l, t04.a.c(pickedFile.d())), null, params.e(), 4, null) : null), v.q(new e.AllowedFormats(g0.a()), new e.b.Total(g0.b(), null)), params.b(), 1));
        }
        if (!(state instanceof mx1.b.FilePreview)) {
            if (state instanceof mx1.b.Error) {
                return new mx1.c.a.Error(((mx1.b.Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(j0.S0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, c.f139456a, null, params.d(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        er.a<i0> aVarC2 = params.c();
        Label labelC4 = this.labelProvider.c(j0.K0);
        BodySection bodySection = new BodySection(new SingleCardLabel(this.labelProvider.c(j0.f120804x), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(j.a(((mx1.b.FilePreview) state).getPickedFile()), "pickedFileFullName"), null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.a.b bVar = k30.a.b.f107765a;
        d.a aVar = d.a.f107773a;
        return new mx1.c.a.FilePreview(baseScaffoldData2, aVarC2, labelC4, new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(this.labelProvider.c(j0.H0), this.labelProvider.c(j0.f120800w)), aVar, null, params.g(), 35, null)), null, 2815, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(j0.I0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(this.labelProvider.c(j0.J0), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null), this.labelProvider.c(j0.G0), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j0.f120765o), null, 2, null), aVar, null, params.f(), 35, null));
    }
}
