package wg3;

import android.graphics.Bitmap;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.List;
import md3.b;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import sv0.DrivingLicence;
import ug3.State;
import ug3.d;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u0019"}, d2 = {"Lwg3/a;", "Lxw/f;", "Lwg3/a$a;", "Lug3/d$a;", "Lmx/c;", "labelProvider", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "<init>", "(Lmx/c;Lrz/a;Liy/a;)V", "params", "c", "(Lwg3/a$a;)Lug3/d$a;", "", "Lsv0/p;", "Lmx/a;", "e", "(Ljava/util/List;)Lmx/a;", "a", "Lmx/c;", "b", "Lrz/a;", "Liy/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: wg3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lwg3/a$a;", "", "Lug3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onConfirm", "onReject", "onExitAction", "<init>", "(Lug3/c;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lug3/c;", "d", "()Lug3/c;", "b", "Ler/a;", "()Ler/a;", "c", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfirm;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onReject;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onConfirm = aVar;
            this.onReject = aVar2;
            this.onExitAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onConfirm;
        }

        public final er.a<i0> b() {
            return this.onExitAction;
        }

        public final er.a<i0> c() {
            return this.onReject;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.onConfirm, params.onConfirm) && t.c(this.onReject, params.onReject) && t.c(this.onExitAction, params.onExitAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onConfirm.hashCode()) * 31) + this.onReject.hashCode()) * 31) + this.onExitAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onConfirm=" + this.onConfirm + ", onReject=" + this.onReject + ", onExitAction=" + this.onExitAction + ')';
        }
    }

    public a(c cVar, rz.a aVar, iy.a aVar2) {
        this.labelProvider = cVar;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        Object objB;
        c cVar = this.labelProvider;
        State state = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(b.f125847v3), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = cVar.c(b.O3);
        rz.a aVar = this.bitmapDecoder;
        dx.i iVarC = iy.a.c(this.base64Coder, c0.e(state.getConfirmationModel().getOtherSidePersonalData().getPicture()), null, 2, null);
        if (iVarC instanceof dx.i.Left) {
            objB = new byte[0];
        } else {
            if (!(iVarC instanceof dx.i.Right)) {
                throw new p();
            }
            objB = ((dx.i.Right) iVarC).b();
        }
        Bitmap bitmapA = aVar.a((byte[]) objB);
        SingleCardLabel singleCardLabel = new SingleCardLabel(cVar.c(b.f125788o0), null, null, 0, 0, null, 62, null);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(c0.e(state.getConfirmationModel().getOtherSidePersonalData().getFirstName()));
        b0 secondName = state.getConfirmationModel().getOtherSidePersonalData().getSecondName();
        if (secondName != null) {
            sb5.append(' ' + c0.e(secondName));
        }
        i0 i0Var = i0.f148189a;
        return new d.Data(baseScaffoldData, labelC, bitmapA, new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.b(sb5.toString(), "names"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(b.f125804q0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getConfirmationModel().getOtherSidePersonalData().getSurname()), "surname"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(b.f125796p0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getConfirmationModel().getOtherSidePersonalData().getPesel()), "pesel"), null, null, 0, 0, j70.a.LETTER_BY_LETTER, 30, null)), null, 4, null), null, null, null, 3839, null), state.getConfirmationModel().getOtherSidePersonalData().a().isEmpty() ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(b.f125862x2), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(new r50.a.WithIcon("lack_of_driving_authorization", cVar.c(b.G), null, 0, false, g.NEGATIVE, 12, null)), null, 4, null), null, null, null, 3839, null) : new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(b.f125862x2), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(e(state.getConfirmationModel().getOtherSidePersonalData().a()), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(b.f125739i), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(b.S), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.c(), 35, null), params.a());
    }

    public final Label e(List<DrivingLicence> list) {
        StringBuilder sb5 = new StringBuilder();
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            sb5.append(((DrivingLicence) obj).getCategory());
            if (i15 != list.size() - 1) {
                sb5.append(", ");
            }
            i15 = i16;
        }
        return mx.b.d(sb5.toString(), "drivingLicenses");
    }
}
