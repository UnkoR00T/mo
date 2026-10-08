package p50;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.k;
import fr.t;
import i30.ButtonIconData;
import mx.Label;
import oq.i0;
import p046f2.pk;
import p046f2.xl;
import p071kotlin.Metadata;
import p076m2.r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\rB'\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\r\u0010\u0014\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lp50/a;", "Lf2/xl;", "Lmx/a;", "messageLabel", "descriptionLabel", "Lf2/pk;", "duration", "<init>", "(Lmx/a;Lmx/a;Lf2/pk;)V", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "Lf2/pk;", "getDuration", "()Lf2/pk;", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "actionLabel", "Lp50/a$a;", "Lp50/a$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a implements xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label messageLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pk duration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String actionLabel;

    public /* synthetic */ a(Label label, Label label2, pk pkVar, k kVar) {
        this(label, label2, pkVar);
    }

    @Override // p046f2.xl
    /* JADX INFO: renamed from: b, reason: from getter */
    public String getActionLabel() {
        return this.actionLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public Label getMessageLabel() {
        return this.messageLabel;
    }

    @Override // p046f2.xl
    public pk getDuration() {
        return this.duration;
    }

    private a(Label label, Label label2, pk pkVar) {
        this.messageLabel = label;
        this.duration = pkVar;
        this.actionLabel = label2 != null ? label2.getText() : null;
    }

    /* JADX INFO: renamed from: p50.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lp50/a$a;", "Lp50/a;", "Lmx/a;", "messageLabel", "", "withDismissAction", "", "message", "<init>", "(Lmx/a;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lmx/a;", "()Lmx/a;", "e", "Z", "c", "()Z", "f", "Ljava/lang/String;", "a", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label messageLabel;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean withDismissAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        public Default(Label label, boolean z15, String str) {
            super(label, null, null, 6, null);
            this.messageLabel = label;
            this.withDismissAction = z15;
            this.message = str;
        }

        @Override // p046f2.xl
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getMessage() {
            return this.message;
        }

        @Override // p046f2.xl
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        @Override // p50.a
        /* JADX INFO: renamed from: d, reason: from getter */
        public Label getMessageLabel() {
            return this.messageLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            Default r15 = (Default) other;
            return t.c(this.messageLabel, r15.messageLabel) && this.withDismissAction == r15.withDismissAction && t.c(this.message, r15.message);
        }

        public int hashCode() {
            return (((this.messageLabel.hashCode() * 31) + Boolean.hashCode(this.withDismissAction)) * 31) + this.message.hashCode();
        }

        public String toString() {
            return "Default(messageLabel=" + this.messageLabel + ", withDismissAction=" + this.withDismissAction + ", message=" + this.message + ')';
        }

        public /* synthetic */ Default(Label label, boolean z15, String str, int i15, k kVar) {
            this(label, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? label.getText() : str);
        }
    }

    public /* synthetic */ a(Label label, Label label2, pk pkVar, int i15, k kVar) {
        this(label, (i15 & 2) != 0 ? null : label2, (i15 & 4) != 0 ? pk.Short : pkVar, null);
    }

    /* JADX INFO: renamed from: p50.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lp50/a$b;", "Lp50/a;", "Lmx/a;", "messageLabel", "", "withDismissAction", "", "message", "Lkotlin/Function0;", "Loq/i0;", "onAction", "<init>", "(Lmx/a;ZLjava/lang/String;Ler/a;)V", "g", "(Lmx/a;ZLjava/lang/String;Ler/a;)Lp50/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lmx/a;", "()Lmx/a;", "e", "Z", "c", "()Z", "f", "Ljava/lang/String;", "a", "Ler/a;", "j", "()Ler/a;", "Li30/a;", "h", "Li30/a;", "i", "()Li30/a;", "iconButtonData", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DefaultWithIcon extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label messageLabel;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean withDismissAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final ButtonIconData iconButtonData;

        /* JADX INFO: renamed from: p50.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3762a implements p<r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3762a f153032a = new C3762a();

            C3762a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(r rVar, int i15) {
                rVar.X(-1275406172);
                if (p076m2.t.k()) {
                    p076m2.t.o(-1275406172, i15, -1, "pl.gov.coi.common.ui.ds.snackbar.SnackBarData.DefaultWithIcon.iconButtonData.<anonymous> (SnackBarData.kt:31)");
                }
                long jI = Color.INSTANCE.i();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return jI;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DefaultWithIcon(Label label, boolean z15, String str, er.a<i0> aVar) {
            super(label, null, null, 6, null);
            this.messageLabel = label;
            this.withDismissAction = z15;
            this.message = str;
            this.onAction = aVar;
            Object[] objArr = 0 == true ? 1 : 0;
            this.iconButtonData = new ButtonIconData(0 == true ? 1 : 0, jz.a.Y, C3762a.f153032a, objArr, c70.a.f23835a.a().r0(), aVar, 9, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 f() {
            return i0.f148189a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DefaultWithIcon h(DefaultWithIcon defaultWithIcon, Label label, boolean z15, String str, er.a aVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                label = defaultWithIcon.messageLabel;
            }
            if ((i15 & 2) != 0) {
                z15 = defaultWithIcon.withDismissAction;
            }
            if ((i15 & 4) != 0) {
                str = defaultWithIcon.message;
            }
            if ((i15 & 8) != 0) {
                aVar = defaultWithIcon.onAction;
            }
            return defaultWithIcon.g(label, z15, str, aVar);
        }

        @Override // p046f2.xl
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getMessage() {
            return this.message;
        }

        @Override // p046f2.xl
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        @Override // p50.a
        /* JADX INFO: renamed from: d, reason: from getter */
        public Label getMessageLabel() {
            return this.messageLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DefaultWithIcon)) {
                return false;
            }
            DefaultWithIcon defaultWithIcon = (DefaultWithIcon) other;
            return t.c(this.messageLabel, defaultWithIcon.messageLabel) && this.withDismissAction == defaultWithIcon.withDismissAction && t.c(this.message, defaultWithIcon.message) && t.c(this.onAction, defaultWithIcon.onAction);
        }

        public final DefaultWithIcon g(Label messageLabel, boolean withDismissAction, String message, er.a<i0> onAction) {
            return new DefaultWithIcon(messageLabel, withDismissAction, message, onAction);
        }

        public int hashCode() {
            return (((((this.messageLabel.hashCode() * 31) + Boolean.hashCode(this.withDismissAction)) * 31) + this.message.hashCode()) * 31) + this.onAction.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ButtonIconData getIconButtonData() {
            return this.iconButtonData;
        }

        public final er.a<i0> j() {
            return this.onAction;
        }

        public String toString() {
            return "DefaultWithIcon(messageLabel=" + this.messageLabel + ", withDismissAction=" + this.withDismissAction + ", message=" + this.message + ", onAction=" + this.onAction + ')';
        }

        public /* synthetic */ DefaultWithIcon(Label label, boolean z15, String str, er.a aVar, int i15, k kVar) {
            this(label, (i15 & 2) != 0 ? true : z15, (i15 & 4) != 0 ? label.getText() : str, (i15 & 8) != 0 ? new er.a() { // from class: p50.b
                @Override // er.a
                public final Object a() {
                    return a.DefaultWithIcon.f();
                }
            } : aVar);
        }
    }
}
