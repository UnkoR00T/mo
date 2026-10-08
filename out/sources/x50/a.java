package x50;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import i30.ButtonIconData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import y40.MenuData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lx50/a;", "", "a", "b", "c", "Lx50/a$a;", "Lx50/a$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: x50.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lx50/a$a;", "Lx50/a;", "Lx50/a$c;", "menuButtonData", "<init>", "(Lx50/a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lx50/a$c;", "()Lx50/a$c;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Icon implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final MenuButtonData menuButtonData;

        public Icon(MenuButtonData menuButtonData) {
            this.menuButtonData = menuButtonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final MenuButtonData getMenuButtonData() {
            return this.menuButtonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Icon) && t.c(this.menuButtonData, ((Icon) other).menuButtonData);
        }

        public int hashCode() {
            return this.menuButtonData.hashCode();
        }

        public String toString() {
            return "Icon(menuButtonData=" + this.menuButtonData + ')';
        }
    }

    /* JADX INFO: renamed from: x50.a$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lx50/a$b;", "Lx50/a;", "", "Lx50/a$c;", "menuIconList", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconList implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<MenuButtonData> menuIconList;

        public IconList(List<MenuButtonData> list) {
            this.menuIconList = list;
        }

        public final List<MenuButtonData> a() {
            return this.menuIconList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IconList) && t.c(this.menuIconList, ((IconList) other).menuIconList);
        }

        public int hashCode() {
            return this.menuIconList.hashCode();
        }

        public String toString() {
            return "IconList(menuIconList=" + this.menuIconList + ')';
        }
    }

    /* JADX INFO: renamed from: x50.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\u001dB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lx50/a$c;", "", "Lx50/a$c$c;", "icon", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColorProvider", "Ly40/a;", "menuData", "Loq/i0;", "onClick", "<init>", "(Lx50/a$c$c;Ler/p;Ly40/a;Ler/a;)V", "Li30/a;", "a", "()Li30/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lx50/a$c$c;", "getIcon", "()Lx50/a$c$c;", "b", "Ler/p;", "getIconColorProvider", "()Ler/p;", "c", "Ly40/a;", "getMenuData", "()Ly40/a;", "d", "Ler/a;", "getOnClick", "()Ler/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MenuButtonData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5779c icon;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<r, Integer, Color> iconColorProvider;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final MenuData menuData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClick;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: x50.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5778a implements p<r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5778a f216846a = new C5778a();

            C5778a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(r rVar, int i15) {
                rVar.X(-161191399);
                if (p076m2.t.k()) {
                    p076m2.t.o(-161191399, i15, -1, "pl.gov.coi.common.ui.ds.topappbar.MenuType.MenuButtonData.<init>.<anonymous> (TopAppBarData.kt:80)");
                }
                long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return jB;
            }
        }

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX INFO: renamed from: x50.a$c$b */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lx50/a$c$b;", "Lx50/a$c$c;", "", "", "iconResId", "Lmx/a;", "contentDescription", "<init>", "(Ljava/lang/String;IILmx/a;)V", "a", "I", "b", "()I", "Lmx/a;", "getContentDescription", "()Lmx/a;", "c", "d", "e", "f", "g", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements InterfaceC5779c {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f216847c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final b f216848d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final b f216849e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f216850f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final b f216851g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ b[] f216852h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ wq.a f216853j;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int iconResId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Label contentDescription;

            static {
                int i15 = jz.a.Y;
                c70.a aVar = c70.a.f23835a;
                f216847c = new b("CLOSE", 0, i15, aVar.a().f());
                f216848d = new b("QUESTION_MARK", 1, jz.a.f106752d0, aVar.a().M());
                f216849e = new b("EDIT", 2, jz.a.f106768f0, aVar.a().I0());
                f216850f = new b("DELETE", 3, jz.a.f106727a, aVar.a().i0());
                f216851g = new b("SETTINGS", 4, jz.a.T, aVar.a().C0());
                b[] bVarArrE = e();
                f216852h = bVarArrE;
                f216853j = wq.b.a(bVarArrE);
            }

            private b(String str, int i15, int i16, Label label) {
                super(str, i15);
                this.iconResId = i16;
                this.contentDescription = label;
            }

            private static final /* synthetic */ b[] e() {
                return new b[]{f216847c, f216848d, f216849e, f216850f, f216851g};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f216852h.clone();
            }

            @Override // x50.a.MenuButtonData.InterfaceC5779c
            /* JADX INFO: renamed from: b, reason: from getter */
            public int getIconResId() {
                return this.iconResId;
            }

            @Override // x50.a.MenuButtonData.InterfaceC5779c
            public Label getContentDescription() {
                return this.contentDescription;
            }
        }

        /* JADX INFO: renamed from: x50.a$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lx50/a$c$c;", "", "", "b", "()I", "iconResId", "Lmx/a;", "getContentDescription", "()Lmx/a;", "contentDescription", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC5779c {
            /* JADX INFO: renamed from: b */
            int getIconResId();

            Label getContentDescription();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MenuButtonData(InterfaceC5779c interfaceC5779c, p<? super r, ? super Integer, Color> pVar, MenuData menuData, er.a<i0> aVar) {
            this.icon = interfaceC5779c;
            this.iconColorProvider = pVar;
            this.menuData = menuData;
            this.onClick = aVar;
        }

        public final ButtonIconData a() {
            return new ButtonIconData(null, this.icon.getIconResId(), this.iconColorProvider, this.menuData, this.icon.getContentDescription(), this.onClick, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MenuButtonData)) {
                return false;
            }
            MenuButtonData menuButtonData = (MenuButtonData) other;
            return t.c(this.icon, menuButtonData.icon) && t.c(this.iconColorProvider, menuButtonData.iconColorProvider) && t.c(this.menuData, menuButtonData.menuData) && t.c(this.onClick, menuButtonData.onClick);
        }

        public int hashCode() {
            int iHashCode = ((this.icon.hashCode() * 31) + this.iconColorProvider.hashCode()) * 31;
            MenuData menuData = this.menuData;
            return ((iHashCode + (menuData == null ? 0 : menuData.hashCode())) * 31) + this.onClick.hashCode();
        }

        public String toString() {
            return "MenuButtonData(icon=" + this.icon + ", iconColorProvider=" + this.iconColorProvider + ", menuData=" + this.menuData + ", onClick=" + this.onClick + ')';
        }

        public /* synthetic */ MenuButtonData(InterfaceC5779c interfaceC5779c, p pVar, MenuData menuData, er.a aVar, int i15, fr.k kVar) {
            this(interfaceC5779c, (i15 & 2) != 0 ? C5778a.f216846a : pVar, (i15 & 4) != 0 ? null : menuData, aVar);
        }
    }
}
