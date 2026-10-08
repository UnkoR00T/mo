package sj1;

import com.google.android.gms.maps.model.LatLng;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mu.g;
import mx.Label;
import n30.CardListData;
import n50.CustomSingleCardData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import qj1.MapPosition;
import qj1.TrainingsByDistance;
import qj1.h;
import qj1.j;
import rj1.SelectableLocationCustomContent;
import tj1.SelectableLocationData;
import tj1.TrainingPointClusterItem;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y30.n;
import zp0.AvailableDefenceTrainings;
import zp0.DefenceTraining;
import zp0.DefenceTrainingDay;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u00020 *\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010(\u001a\u00020'2\b\b\u0001\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lsj1/e;", "Lxw/f;", "Lsj1/e$a;", "Lqj1/j$a;", "Lez/e;", "dateFormatter", "Lmx/c;", "labelProvider", "<init>", "(Lez/e;Lmx/c;)V", "params", "Li50/a;", "m", "(Lsj1/e$a;)Li50/a;", "Ly30/n$b$b;", "currentSelectedTab", "Ly30/n$b;", "q", "(Lsj1/e$a;Ly30/n$b$b;)Ly30/n$b;", "Lzp0/a;", "trainingLocation", "Lkotlin/Function0;", "Loq/i0;", "onSignUpButtonClick", "Ltj1/a;", "s", "(Lzp0/a;Ler/a;)Ltj1/a;", "Ltj1/b;", "F", "(Lzp0/a;)Ltj1/b;", "", "Lzp0/v;", "", "i", "(Ljava/util/List;)Ljava/lang/String;", "l", "(Lzp0/v;)Ljava/lang/String;", "", "stringId", "Lmx/a;", "E", "(I)Lmx/a;", "u", "(Lsj1/e$a;)Lqj1/j$a;", "a", "Lez/e;", "getDateFormatter", "()Lez/e;", "b", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: sj1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b%\u0010*R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b(\u0010*R)\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b+\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b0\u0010*R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b,\u0010*R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u00128\u0006¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\b1\u00103¨\u00064"}, d2 = {"Lsj1/e$a;", "", "Lqj1/h;", "state", "Lmu/g;", "Lqj1/j$b;", "mapSideEffects", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onCloseProcess", "Lkotlin/Function2;", "Ltj1/b;", "", "onPointClick", "onMoveToUserPosition", "onOpenMapTab", "onOpenListTab", "Lkotlin/Function1;", "Lzp0/a;", "onSignUpInLocation", "<init>", "(Lqj1/h;Lmu/g;Ler/a;Ler/a;Ler/p;Ler/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqj1/h;", "i", "()Lqj1/h;", "b", "Lmu/g;", "()Lmu/g;", "c", "Ler/a;", "()Ler/a;", "d", "e", "Ler/p;", "g", "()Ler/p;", "f", "h", "Ler/l;", "()Ler/l;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final g<j.b> mapSideEffects;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseProcess;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<TrainingPointClusterItem, Float, i0> onPointClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMoveToUserPosition;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenMapTab;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenListTab;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<AvailableDefenceTrainings, i0> onSignUpInLocation;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(h hVar, g<? extends j.b> gVar, er.a<i0> aVar, er.a<i0> aVar2, p<? super TrainingPointClusterItem, ? super Float, i0> pVar, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, l<? super AvailableDefenceTrainings, i0> lVar) {
            this.state = hVar;
            this.mapSideEffects = gVar;
            this.onBackClick = aVar;
            this.onCloseProcess = aVar2;
            this.onPointClick = pVar;
            this.onMoveToUserPosition = aVar3;
            this.onOpenMapTab = aVar4;
            this.onOpenListTab = aVar5;
            this.onSignUpInLocation = lVar;
        }

        public final g<j.b> a() {
            return this.mapSideEffects;
        }

        public final er.a<i0> b() {
            return this.onBackClick;
        }

        public final er.a<i0> c() {
            return this.onCloseProcess;
        }

        public final er.a<i0> d() {
            return this.onMoveToUserPosition;
        }

        public final er.a<i0> e() {
            return this.onOpenListTab;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.mapSideEffects, params.mapSideEffects) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onCloseProcess, params.onCloseProcess) && t.c(this.onPointClick, params.onPointClick) && t.c(this.onMoveToUserPosition, params.onMoveToUserPosition) && t.c(this.onOpenMapTab, params.onOpenMapTab) && t.c(this.onOpenListTab, params.onOpenListTab) && t.c(this.onSignUpInLocation, params.onSignUpInLocation);
        }

        public final er.a<i0> f() {
            return this.onOpenMapTab;
        }

        public final p<TrainingPointClusterItem, Float, i0> g() {
            return this.onPointClick;
        }

        public final l<AvailableDefenceTrainings, i0> h() {
            return this.onSignUpInLocation;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.mapSideEffects.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.onCloseProcess.hashCode()) * 31) + this.onPointClick.hashCode()) * 31) + this.onMoveToUserPosition.hashCode()) * 31) + this.onOpenMapTab.hashCode()) * 31) + this.onOpenListTab.hashCode()) * 31) + this.onSignUpInLocation.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final h getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", mapSideEffects=" + this.mapSideEffects + ", onBackClick=" + this.onBackClick + ", onCloseProcess=" + this.onCloseProcess + ", onPointClick=" + this.onPointClick + ", onMoveToUserPosition=" + this.onMoveToUserPosition + ", onOpenMapTab=" + this.onOpenMapTab + ", onOpenListTab=" + this.onOpenListTab + ", onSignUpInLocation=" + this.onSignUpInLocation + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f182019a;

        static {
            int[] iArr = new int[n.Switch.EnumC5973b.values().length];
            try {
                iArr[n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f182019a = iArr;
        }
    }

    public e(ez.e eVar, mx.c cVar) {
        this.dateFormatter = eVar;
        this.labelProvider = cVar;
    }

    private final Label E(int stringId) {
        return this.labelProvider.c(stringId);
    }

    private final TrainingPointClusterItem F(AvailableDefenceTrainings availableDefenceTrainings) {
        return new TrainingPointClusterItem(availableDefenceTrainings.getUnit().getAddress(), availableDefenceTrainings.getUnit(), new LatLng(availableDefenceTrainings.getUnit().getCoordinates().getLatitude(), availableDefenceTrainings.getUnit().getCoordinates().getLongitude()));
    }

    private final String i(List<DefenceTraining> list) {
        DefenceTraining defenceTraining = (DefenceTraining) v.n0(list);
        if (defenceTraining != null && list.size() > 1) {
            return E(ri1.b.f174423x0).getText() + ' ' + l(defenceTraining);
        }
        if (defenceTraining == null) {
            return "";
        }
        return E(ri1.b.f174420w0).getText() + ' ' + l(defenceTraining);
    }

    private final String l(DefenceTraining defenceTraining) {
        DefenceTrainingDay defenceTrainingDay = (DefenceTrainingDay) v.n0(defenceTraining.a());
        if (defenceTrainingDay == null) {
            return "";
        }
        int size = defenceTraining.a().size();
        return this.dateFormatter.d(defenceTrainingDay.getStartDate(), fz.c.DOTTED) + " (" + this.labelProvider.a(c20.d.f22741b, size, String.valueOf(size)).getText() + ')';
    }

    private final BaseScaffoldData m(Params params) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), E(ri1.b.B0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null);
    }

    private final n.Switch q(final Params params, n.Switch.EnumC5973b currentSelectedTab) {
        return new n.Switch(new n.Switch.TabItem(E(ri1.b.A0), n.Switch.EnumC5973b.LEFT), new n.Switch.TabItem(E(ri1.b.f174429z0), n.Switch.EnumC5973b.RIGHT), currentSelectedTab, true, new l() { // from class: sj1.a
            @Override // er.l
            public final Object b(Object obj) {
                return e.r(params, (n.Switch.EnumC5973b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, n.Switch.EnumC5973b enumC5973b) {
        int i15 = b.f182019a[enumC5973b.ordinal()];
        if (i15 == 1) {
            params.f().a();
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            params.e().a();
        }
        return i0.f148189a;
    }

    private final SelectableLocationData s(AvailableDefenceTrainings trainingLocation, er.a<i0> onSignUpButtonClick) {
        String text;
        ButtonData buttonData;
        boolean z15 = trainingLocation.a().size() > 1;
        Label labelB = mx.b.b(trainingLocation.getUnit().getName(), "UnitName");
        Label labelB2 = mx.b.b(trainingLocation.getUnit().getAddress(), "UnitAddress");
        Label labelB3 = mx.b.b(i(trainingLocation.a()), "AvailableDate");
        if (z15) {
            text = E(ri1.b.f174426y0).getText();
        } else {
            if (z15) {
                throw new oq.p();
            }
            text = null;
        }
        Label labelB4 = text != null ? mx.b.b(text, "MoreDatesAvailable") : null;
        if (onSignUpButtonClick != null) {
            buttonData = new ButtonData("SignUpButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(E(ri1.b.f174370g), null, 2, null), k30.d.a.f107773a, null, onSignUpButtonClick, 34, null);
        } else {
            buttonData = null;
        }
        return new SelectableLocationData(labelB, labelB2, labelB3, labelB4, buttonData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, AvailableDefenceTrainings availableDefenceTrainings) {
        params.h().b(availableDefenceTrainings);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params, AvailableDefenceTrainings availableDefenceTrainings) {
        params.h().b(availableDefenceTrainings);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, AvailableDefenceTrainings availableDefenceTrainings) {
        params.h().b(availableDefenceTrainings);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public j.a b(final Params params) {
        List<AvailableDefenceTrainings> listN;
        List<AvailableDefenceTrainings> listD;
        h state = params.getState();
        if (state instanceof h.Map) {
            BaseScaffoldData baseScaffoldDataM = m(params);
            n.Switch switchQ = q(params, n.Switch.EnumC5973b.LEFT);
            MapPosition lastSelectedLocationMapPosition = ((h.Map) state).getForm().getLastSelectedLocationMapPosition();
            List<AvailableDefenceTrainings> listD2 = ((h.Map) params.getState()).getForm().getListOfPoints().d();
            ArrayList arrayList = new ArrayList(v.y(listD2, 10));
            Iterator<T> it = listD2.iterator();
            while (it.hasNext()) {
                arrayList.add(F((AvailableDefenceTrainings) it.next()));
            }
            boolean z15 = ((h.Map) params.getState()).getForm().getIsGpsEnabled() && ((h.Map) params.getState()).getForm().getIsGpsPermissionGranted();
            final AvailableDefenceTrainings lastSelectedLocationMap = ((h.Map) params.getState()).getForm().getLastSelectedLocationMap();
            return new j.a.LocationMap(baseScaffoldDataM, switchQ, params.b(), lastSelectedLocationMapPosition, z15, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithIcon((((h.Map) params.getState()).getForm().getIsGpsEnabled() && ((h.Map) params.getState()).getForm().getIsGpsPermissionGranted() && ((h.Map) params.getState()).getForm().getUserCurrentPosition() != null) ? jz.a.f106737b1 : jz.a.f106745c1, c70.a.f23835a.a().o()), k30.d.a.f107773a, null, params.d(), 35, null), lastSelectedLocationMap != null ? s(lastSelectedLocationMap, new er.a() { // from class: sj1.b
                @Override // er.a
                public final Object a() {
                    return e.v(params, lastSelectedLocationMap);
                }
            }) : null, arrayList, params.a(), params.g());
        }
        if (!(state instanceof h.List)) {
            throw new oq.p();
        }
        h.List list = (h.List) state;
        TrainingsByDistance trainingsByDistance = list.getForm().getTrainingsByDistance();
        if (trainingsByDistance == null || (listN = trainingsByDistance.a()) == null) {
            listN = v.n();
        }
        TrainingsByDistance trainingsByDistance2 = list.getForm().getTrainingsByDistance();
        if (trainingsByDistance2 == null || (listD = trainingsByDistance2.b()) == null) {
            listD = list.getForm().getListOfPoints().d();
        }
        boolean z16 = (listN.isEmpty() || listD.isEmpty()) ? false : true;
        BaseScaffoldData baseScaffoldDataM2 = m(params);
        n.Switch switchQ2 = q(params, n.Switch.EnumC5973b.RIGHT);
        Label labelE = E(ri1.b.f174407s);
        Label labelE2 = E(ri1.b.f174416v);
        List<AvailableDefenceTrainings> list2 = listN;
        ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final AvailableDefenceTrainings availableDefenceTrainings = (AvailableDefenceTrainings) obj;
            arrayList2.add(new CustomSingleCardData("NearestTrainingLocation" + i15, new SelectableLocationCustomContent(s(availableDefenceTrainings, null)), new er.a() { // from class: sj1.c
                @Override // er.a
                public final Object a() {
                    return e.x(params, availableDefenceTrainings);
                }
            }, false, null, null, false, null, 248, null));
            i15 = i16;
        }
        CardListData cardListData = new CardListData(arrayList2, null, false, null, null, 30, null);
        List<AvailableDefenceTrainings> list3 = listD;
        ArrayList arrayList3 = new ArrayList(v.y(list3, 10));
        int i17 = 0;
        for (Object obj2 : list3) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                v.x();
            }
            final AvailableDefenceTrainings availableDefenceTrainings2 = (AvailableDefenceTrainings) obj2;
            arrayList3.add(new CustomSingleCardData("RemainingTrainingLocation" + i17, new SelectableLocationCustomContent(s(availableDefenceTrainings2, null)), new er.a() { // from class: sj1.d
                @Override // er.a
                public final Object a() {
                    return e.z(params, availableDefenceTrainings2);
                }
            }, false, null, null, false, null, 248, null));
            i17 = i18;
        }
        return new j.a.LocationList(baseScaffoldDataM2, switchQ2, params.b(), labelE, labelE2, z16, cardListData, new CardListData(arrayList3, null, false, null, null, 30, null));
    }
}
