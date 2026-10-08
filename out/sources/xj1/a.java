package xj1;

import d60.ScrollControllerData;
import er.l;
import fr.t;
import h30.ButtonData;
import hz.b;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import wj1.State;
import wj1.WriteChildFields;
import wj1.d;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lxj1/a;", "Lxw/f;", "Lxj1/a$a;", "Lwj1/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "stringId", "Lmx/a;", "e", "(I)Lmx/a;", "params", "c", "(Lxj1/a$a;)Lwj1/d$a;", "a", "Lmx/c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: xj1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b \u0010\"R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lxj1/a$a;", "", "Lwj1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onAddClick", "Lkotlin/Function1;", "", "onFirstNameChange", "onLastNameChange", "onPeselChange", "<init>", "(Lwj1/c;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwj1/c;", "f", "()Lwj1/c;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "e", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f219114g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onFirstNameChange;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLastNameChange;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onPeselChange;

        static {
            int i15 = b0.f97726c;
            int i16 = b.f86845b;
            f219114g = i15 | i15 | i16 | i15 | i16 | i16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, l<? super String, i0> lVar, l<? super String, i0> lVar2, l<? super String, i0> lVar3) {
            this.state = state;
            this.onBack = aVar;
            this.onAddClick = aVar2;
            this.onFirstNameChange = lVar;
            this.onLastNameChange = lVar2;
            this.onPeselChange = lVar3;
        }

        public final er.a<i0> a() {
            return this.onAddClick;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final l<String, i0> c() {
            return this.onFirstNameChange;
        }

        public final l<String, i0> d() {
            return this.onLastNameChange;
        }

        public final l<String, i0> e() {
            return this.onPeselChange;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onAddClick, params.onAddClick) && t.c(this.onFirstNameChange, params.onFirstNameChange) && t.c(this.onLastNameChange, params.onLastNameChange) && t.c(this.onPeselChange, params.onPeselChange);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onAddClick.hashCode()) * 31) + this.onFirstNameChange.hashCode()) * 31) + this.onLastNameChange.hashCode()) * 31) + this.onPeselChange.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onAddClick=" + this.onAddClick + ", onFirstNameChange=" + this.onFirstNameChange + ", onLastNameChange=" + this.onLastNameChange + ", onPeselChange=" + this.onPeselChange + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final Label e(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), e(ri1.b.f174366f), null, null, null, 28, null), null, null, null, new ScrollControllerData(params.getState().c(), false, false, 6, null), 29, null);
        Label labelE = e(ri1.b.f174383k);
        ButtonData buttonData = new ButtonData("AddButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(e(ri1.b.f174346a), null, 2, null), k30.d.a.f107773a, null, params.a(), 34, null);
        WriteChildFields.a.FirstName firstName = params.getState().getFields().getFirstName();
        v50.c.Text text = new v50.c.Text("FirstName", e(ri1.b.f174389m), null, mx.b.b(c0.e(firstName.getFirstName()), ""), firstName.getValidationState(), null, null, params.c(), null, false, 0, null, false, null, false, null, null, null, null, firstName.getField(), 524132, null);
        WriteChildFields.a.LastName lastName = params.getState().getFields().getLastName();
        v50.c.Text text2 = new v50.c.Text("LastName", e(ri1.b.f174398p), null, mx.b.b(c0.e(lastName.getLastName()), ""), lastName.getValidationState(), null, null, params.d(), null, false, 0, null, false, null, false, null, null, null, null, lastName.getField(), 524132, null);
        WriteChildFields.a.PeselData pesel = params.getState().getFields().getPesel();
        return new d.Data(params.b(), baseScaffoldData, labelE, text, text2, new v50.c.Number("Pesel", e(ri1.b.f174419w), null, mx.b.b(c0.e(pesel.getPesel()), ""), pesel.getValidationState(), null, null, params.e(), null, false, 0, null, false, null, false, null, null, j70.a.LETTER_BY_LETTER, pesel.getField(), false, 655204, null), buttonData);
    }
}
