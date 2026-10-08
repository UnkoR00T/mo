package c30;

import androidx.compose.ui.graphics.Color;
import d40.i;
import er.p;
import fr.k;
import i30.ButtonIconData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u001b\u001e\u001d\u0018\u0014Be\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b\u0014\u0010%R\u001c\u0010)\u001a\u0004\u0018\u00010&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b\u001d\u0010(\u0082\u0001\u0005*+,-.¨\u0006/"}, d2 = {"Lc30/b;", "", "", "testTag", "Lmx/a;", "alertContentDescription", "title", "bodyText", "", "iconResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColorProvider", "Loq/i0;", "onCloseButtonClick", "closeIconContentDescription", "Lc30/a;", "alertButtonData", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;ILer/p;Ler/a;Lmx/a;Lc30/a;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "Lmx/a;", "()Lmx/a;", "c", "h", "d", "e", "I", "f", "()I", "Ler/p;", "()Ler/p;", "Lc30/a;", "()Lc30/a;", "Li30/a;", "Li30/a;", "()Li30/a;", "closeButtonData", "Lc30/b$a;", "Lc30/b$b;", "Lc30/b$c;", "Lc30/b$d;", "Lc30/b$e;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f22944i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label alertContentDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Label title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Label bodyText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int iconResId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p<r, Integer, Color> iconColorProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c30.a alertButtonData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ButtonIconData closeButtonData;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f22963a = new f();

        f() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-253853944);
            if (t.k()) {
                t.o(-253853944, i15, -1, "pl.gov.coi.common.ui.ds.alert.AlertData.closeButtonData.<anonymous>.<anonymous> (AlertData.kt:27)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public /* synthetic */ b(String str, Label label, Label label2, Label label3, int i15, p pVar, er.a aVar, Label label4, c30.a aVar2, k kVar) {
        this(str, label, label2, label3, i15, pVar, aVar, label4, aVar2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c30.a getAlertButtonData() {
        return this.alertButtonData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getAlertContentDescription() {
        return this.alertContentDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ButtonIconData getCloseButtonData() {
        return this.closeButtonData;
    }

    public final p<r, Integer, Color> e() {
        return this.iconColorProvider;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(String str, Label label, Label label2, Label label3, int i15, p<? super r, ? super Integer, Color> pVar, er.a<i0> aVar, Label label4, c30.a aVar2) {
        ButtonIconData aVar3;
        this.testTag = str;
        this.alertContentDescription = label;
        this.title = label2;
        this.bodyText = label3;
        this.iconResId = i15;
        this.iconColorProvider = pVar;
        this.alertButtonData = aVar2;
        if (aVar != null) {
            aVar3 = new ButtonIconData(null, jz.a.Y, f.f22963a, null, label4, aVar, 9, null);
        } else {
            aVar3 = null;
        }
        this.closeButtonData = aVar3;
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Lc30/b$a;", "Lc30/b;", "", "iconResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColorProvider", "iconBackgroundColor", "Ld40/i;", "iconSize", "", "testTag", "Lmx/a;", "title", "bodyText", "Loq/i0;", "onCloseButtonClick", "closeIconContentDescription", "Lc30/a;", "alertButtonData", "<init>", "(ILer/p;Ler/p;Ld40/i;Ljava/lang/String;Lmx/a;Lmx/a;Ler/a;Lmx/a;Lc30/a;)V", "j", "Ler/p;", "i", "()Ler/p;", "k", "Ld40/i;", "()Ld40/i;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f22953l = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final p<r, Integer, Color> iconBackgroundColor;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final i iconSize;

        public /* synthetic */ a(int i15, p pVar, p pVar2, i iVar, String str, Label label, Label label2, er.a aVar, Label label3, c30.a aVar2, int i16, k kVar) {
            this(i15, pVar, pVar2, (i16 & 8) != 0 ? i.f.f39709e : iVar, (i16 & 16) != 0 ? null : str, (i16 & 32) != 0 ? null : label, label2, (i16 & 128) != 0 ? null : aVar, (i16 & 256) != 0 ? c70.a.f23835a.a().F() : label3, (i16 & 512) != 0 ? null : aVar2);
        }

        public final p<r, Integer, Color> i() {
            return this.iconBackgroundColor;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final i getIconSize() {
            return this.iconSize;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i15, p<? super r, ? super Integer, Color> pVar, p<? super r, ? super Integer, Color> pVar2, i iVar, String str, Label label, Label label2, er.a<i0> aVar, Label label3, c30.a aVar2) {
            super(str, Label.INSTANCE.c(), label, label2, i15, pVar, aVar, label3, aVar2, null);
            this.iconBackgroundColor = pVar2;
            this.iconSize = iVar;
        }
    }

    /* JADX INFO: renamed from: c30.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lc30/b$b;", "Lc30/b;", "", "testTag", "Lmx/a;", "alertContentDescription", "title", "bodyText", "Lkotlin/Function0;", "Loq/i0;", "onCloseButtonClick", "closeIconContentDescription", "Lc30/a;", "alertButtonData", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;Ler/a;Lmx/a;Lc30/a;)V", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0606b extends b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f22956j = 8;

        /* JADX INFO: renamed from: c30.b$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a implements p<r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f22957a = new a();

            a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(r rVar, int i15) {
                rVar.X(-1423026508);
                if (t.k()) {
                    t.o(-1423026508, i15, -1, "pl.gov.coi.common.ui.ds.alert.AlertData.Error.<init>.<anonymous> (AlertData.kt:108)");
                }
                long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                if (t.k()) {
                    t.n();
                }
                rVar.R();
                return jG;
            }
        }

        public /* synthetic */ C0606b(String str, Label label, Label label2, Label label3, er.a aVar, Label label4, c30.a aVar2, int i15, k kVar) {
            this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? c70.a.f23835a.a().G0() : label, (i15 & 4) != 0 ? null : label2, label3, (i15 & 16) != 0 ? null : aVar, (i15 & 32) != 0 ? c70.a.f23835a.a().s() : label4, (i15 & 64) != 0 ? null : aVar2);
        }

        public C0606b(String str, Label label, Label label2, Label label3, er.a<i0> aVar, Label label4, c30.a aVar2) {
            super(str, label, label2, label3, jz.a.J1, a.f22957a, aVar, label4, aVar2, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lc30/b$c;", "Lc30/b;", "", "testTag", "Lmx/a;", "alertContentDescription", "title", "bodyText", "Lkotlin/Function0;", "Loq/i0;", "onCloseButtonClick", "closeIconContentDescription", "Lc30/a;", "alertButtonData", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;Ler/a;Lmx/a;Lc30/a;)V", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends b {

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a implements p<r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f22958a = new a();

            a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(r rVar, int i15) {
                rVar.X(-990244230);
                if (t.k()) {
                    t.o(-990244230, i15, -1, "pl.gov.coi.common.ui.ds.alert.AlertData.Info.<init>.<anonymous> (AlertData.kt:48)");
                }
                long j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().j();
                if (t.k()) {
                    t.n();
                }
                rVar.R();
                return j15;
            }
        }

        public /* synthetic */ c(String str, Label label, Label label2, Label label3, er.a aVar, Label label4, c30.a aVar2, int i15, k kVar) {
            this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? c70.a.f23835a.a().t() : label, (i15 & 4) != 0 ? null : label2, label3, (i15 & 16) != 0 ? null : aVar, (i15 & 32) != 0 ? c70.a.f23835a.a().k0() : label4, (i15 & 64) != 0 ? null : aVar2);
        }

        public c(String str, Label label, Label label2, Label label3, er.a<i0> aVar, Label label4, c30.a aVar2) {
            super(str, label, label2, label3, jz.a.H1, a.f22958a, aVar, label4, aVar2, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lc30/b$d;", "Lc30/b;", "", "testTag", "Lmx/a;", "alertContentDescription", "title", "bodyText", "Lkotlin/Function0;", "Loq/i0;", "onCloseButtonClick", "closeIconContentDescription", "Lc30/a;", "alertButtonData", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;Ler/a;Lmx/a;Lc30/a;)V", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f22959j = 8;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a implements p<r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f22960a = new a();

            a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(r rVar, int i15) {
                rVar.X(1398995759);
                if (t.k()) {
                    t.o(1398995759, i15, -1, "pl.gov.coi.common.ui.ds.alert.AlertData.Success.<init>.<anonymous> (AlertData.kt:88)");
                }
                long jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
                if (t.k()) {
                    t.n();
                }
                rVar.R();
                return jD;
            }
        }

        public /* synthetic */ d(String str, Label label, Label label2, Label label3, er.a aVar, Label label4, c30.a aVar2, int i15, k kVar) {
            this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? c70.a.f23835a.a().w0() : label, (i15 & 4) != 0 ? null : label2, label3, (i15 & 16) != 0 ? null : aVar, (i15 & 32) != 0 ? c70.a.f23835a.a().s() : label4, (i15 & 64) != 0 ? null : aVar2);
        }

        public d(String str, Label label, Label label2, Label label3, er.a<i0> aVar, Label label4, c30.a aVar2) {
            super(str, label, label2, label3, jz.a.K1, a.f22960a, aVar, label4, aVar2, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lc30/b$e;", "Lc30/b;", "", "testTag", "Lmx/a;", "alertContentDescription", "title", "bodyText", "Lkotlin/Function0;", "Loq/i0;", "onCloseButtonClick", "closeIconContentDescription", "Lc30/a;", "alertButtonData", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lmx/a;Ler/a;Lmx/a;Lc30/a;)V", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f22961j = 8;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a implements p<r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f22962a = new a();

            a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(r rVar, int i15) {
                rVar.X(1957342792);
                if (t.k()) {
                    t.o(1957342792, i15, -1, "pl.gov.coi.common.ui.ds.alert.AlertData.Warning.<init>.<anonymous> (AlertData.kt:68)");
                }
                long jF = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().f();
                if (t.k()) {
                    t.n();
                }
                rVar.R();
                return jF;
            }
        }

        public /* synthetic */ e(String str, Label label, Label label2, Label label3, er.a aVar, Label label4, c30.a aVar2, int i15, k kVar) {
            this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? c70.a.f23835a.a().l0() : label, (i15 & 4) != 0 ? null : label2, label3, (i15 & 16) != 0 ? null : aVar, (i15 & 32) != 0 ? c70.a.f23835a.a().K() : label4, (i15 & 64) != 0 ? null : aVar2);
        }

        public e(String str, Label label, Label label2, Label label3, er.a<i0> aVar, Label label4, c30.a aVar2) {
            super(str, label, label2, label3, jz.a.I1, a.f22962a, aVar, label4, aVar2, null);
        }
    }
}
