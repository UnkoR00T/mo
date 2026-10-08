package le3;

import d60.ScrollControllerData;
import er.l;
import fr.k;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import k30.d;
import ke3.State;
import ke3.g;
import me3.AddVehicleManualFields;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000b\rB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lle3/c;", "Lxw/f;", "Lle3/c$b;", "Lke3/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lle3/c$b;)Lke3/g$a;", "a", "Lmx/c;", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, g.Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f118163b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f118164c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lle3/c$a;", "", "<init>", "()V", "", "REGISTRATION_NUMBER_VALUE_TAG", "Ljava/lang/String;", "VIN_VALUE_TAG", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: le3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0018\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006#"}, d2 = {"Lle3/c$b;", "", "Lke3/f;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onRegistrationNumberChanged", "onVinChanged", "Lkotlin/Function0;", "onAddVehicle", "onBack", "<init>", "(Lke3/f;Ler/l;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lke3/f;", "e", "()Lke3/f;", "b", "Ler/l;", "c", "()Ler/l;", "d", "Ler/a;", "()Ler/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f118166f;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onRegistrationNumberChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onVinChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddVehicle;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        static {
            int i15 = b0.f97726c;
            int i16 = hz.b.f86845b;
            f118166f = i15 | i15 | i16 | i16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super b0, i0> lVar, l<? super b0, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onRegistrationNumberChanged = lVar;
            this.onVinChanged = lVar2;
            this.onAddVehicle = aVar;
            this.onBack = aVar2;
        }

        public final er.a<i0> a() {
            return this.onAddVehicle;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final l<b0, i0> c() {
            return this.onRegistrationNumberChanged;
        }

        public final l<b0, i0> d() {
            return this.onVinChanged;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onRegistrationNumberChanged, params.onRegistrationNumberChanged) && t.c(this.onVinChanged, params.onVinChanged) && t.c(this.onAddVehicle, params.onAddVehicle) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onRegistrationNumberChanged.hashCode()) * 31) + this.onVinChanged.hashCode()) * 31) + this.onAddVehicle.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onRegistrationNumberChanged=" + this.onRegistrationNumberChanged + ", onVinChanged=" + this.onVinChanged + ", onAddVehicle=" + this.onAddVehicle + ", onBack=" + this.onBack + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, String str) {
        params.c().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, String str) {
        params.d().b(c0.g(str));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g.Data b(final Params params) {
        mx.c cVar = this.labelProvider;
        State state = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), cVar.c(md3.b.f125845v1), null, null, null, 28, null), null, null, null, new ScrollControllerData(params.getState().d(), false, false, 6, null), 29, null);
        Label labelC = cVar.c(md3.b.f125765l1);
        AddVehicleManualFields.Data registrationNumberField = state.getAddVehicleManualFields().getRegistrationNumberField();
        Label labelC2 = cVar.c(md3.b.f125789o1);
        hz.b validationState = registrationNumberField.getValidationState();
        v50.c.Text text = new v50.c.Text(null, labelC2, null, mx.b.b(c0.e(registrationNumberField.getValue()), "registrationNumberValue"), validationState, null, null, new l() { // from class: le3.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.h(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, registrationNumberField.getField(), 524133, null);
        AddVehicleManualFields.Data vinNumberField = state.getAddVehicleManualFields().getVinNumberField();
        Label labelC3 = cVar.c(md3.b.f125837u1);
        hz.b validationState2 = vinNumberField.getValidationState();
        return new g.Data(baseScaffoldData, labelC, text, new v50.c.Text(null, labelC3, null, mx.b.b(c0.e(vinNumberField.getValue()), "vinValue"), validationState2, cVar.c(md3.b.f125829t1), null, new l() { // from class: le3.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.i(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, vinNumberField.getField(), 524101, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(md3.b.f125675a), null, 2, null), d.a.f107773a, null, params.a(), 35, null), params.b());
    }
}
