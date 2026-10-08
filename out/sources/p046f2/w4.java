package p046f2;

import androidx.compose.ui.graphics.Color;
import er.a;
import fr.k;
import l2.k0;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;
import p114t0.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b)\b\u0007\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0089\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u001b*\u0004\u0018\u00010\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0!H\u0000¢\u0006\u0004\b#\u0010$J5\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0001¢\u0006\u0004\b+\u0010,J-\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010'\u001a\u00020%2\u0006\u0010)\u001a\u00020%2\u0006\u0010-\u001a\u00020%H\u0001¢\u0006\u0004\b.\u0010/J-\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u00100\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0001¢\u0006\u0004\b1\u0010/J%\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010'\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020%2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010;\u001a\u0004\bA\u0010=R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010;\u001a\u0004\bB\u0010=R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010;\u001a\u0004\bC\u0010=R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bE\u0010=R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\bI\u0010=R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bJ\u0010=R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\bK\u0010=R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\bL\u0010=R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\bM\u0010=R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010;\u001a\u0004\bO\u0010=R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bP\u0010=R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\bQ\u0010=R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010;\u001a\u0004\bR\u0010=R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010;\u001a\u0004\bS\u0010=R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010;\u001a\u0004\bU\u0010=R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010;\u001a\u0004\bW\u0010=R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010;\u001a\u0004\bN\u0010=R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010;\u001a\u0004\bF\u0010=R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010;\u001a\u0004\b[\u0010=R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010;\u001a\u0004\bH\u0010=R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\bD\u0010_¨\u0006`"}, d2 = {"Lf2/w4;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContainerColor", "dayInSelectionRangeContentColor", "dividerColor", "Lf2/hn;", "dateTextFieldColors", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJLf2/hn;Lfr/k;)V", "b", "(JJJJJJJJJJJJJJJJJJJJJJJJLf2/hn;)Lf2/w4;", "Lkotlin/Function0;", "block", "p", "(Lf2/hn;Ler/a;)Lf2/hn;", "", "isToday", "selected", "inRange", "enabled", "Lm2/f6;", "e", "(ZZZZLm2/r;I)Lm2/f6;", "animate", "d", "(ZZZLm2/r;I)Lm2/f6;", "currentYear", "r", "q", "(ZZLm2/r;I)Lm2/f6;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "f", "()J", "m", "c", "j", "o", "l", "k", "g", "getYearContentColor-0d7_KjU", "h", "getDisabledYearContentColor-0d7_KjU", "i", "getCurrentYearContentColor-0d7_KjU", "getSelectedYearContentColor-0d7_KjU", "getDisabledSelectedYearContentColor-0d7_KjU", "getSelectedYearContainerColor-0d7_KjU", "getDisabledSelectedYearContainerColor-0d7_KjU", "n", "getDayContentColor-0d7_KjU", "getDisabledDayContentColor-0d7_KjU", "getSelectedDayContentColor-0d7_KjU", "getDisabledSelectedDayContentColor-0d7_KjU", "getSelectedDayContainerColor-0d7_KjU", "s", "getDisabledSelectedDayContainerColor-0d7_KjU", "t", "getTodayContentColor-0d7_KjU", "u", "v", "w", "getDayInSelectionRangeContentColor-0d7_KjU", "x", "y", "Lf2/hn;", "()Lf2/hn;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long titleContentColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long headlineContentColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long weekdayContentColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long subheadContentColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long navigationContentColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long yearContentColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledYearContentColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long currentYearContentColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long selectedYearContentColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedYearContentColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long selectedYearContainerColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedYearContainerColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long dayContentColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long disabledDayContentColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long selectedDayContentColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedDayContentColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long selectedDayContainerColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedDayContainerColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long todayContentColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long todayDateBorderColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final long dayInSelectionRangeContainerColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final long dayInSelectionRangeContentColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long dividerColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final hn dateTextFieldColors;

    public /* synthetic */ w4(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, hn hnVar, k kVar) {
        this(j15, j16, j17, j18, j19, j25, j26, j27, j28, j29, j35, j36, j37, j38, j39, j45, j46, j47, j48, j49, j55, j56, j57, j58, hnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hn c(w4 w4Var) {
        return w4Var.dateTextFieldColors;
    }

    public final w4 b(long containerColor, long titleContentColor, long headlineContentColor, long weekdayContentColor, long subheadContentColor, long navigationContentColor, long yearContentColor, long disabledYearContentColor, long currentYearContentColor, long selectedYearContentColor, long disabledSelectedYearContentColor, long selectedYearContainerColor, long disabledSelectedYearContainerColor, long dayContentColor, long disabledDayContentColor, long selectedDayContentColor, long disabledSelectedDayContentColor, long selectedDayContainerColor, long disabledSelectedDayContainerColor, long todayContentColor, long todayDateBorderColor, long dayInSelectionRangeContainerColor, long dayInSelectionRangeContentColor, long dividerColor, hn dateTextFieldColors) {
        return new w4(containerColor != 16 ? containerColor : this.containerColor, titleContentColor != 16 ? titleContentColor : this.titleContentColor, headlineContentColor != 16 ? headlineContentColor : this.headlineContentColor, weekdayContentColor != 16 ? weekdayContentColor : this.weekdayContentColor, subheadContentColor != 16 ? subheadContentColor : this.subheadContentColor, navigationContentColor != 16 ? navigationContentColor : this.navigationContentColor, yearContentColor != 16 ? yearContentColor : this.yearContentColor, disabledYearContentColor != 16 ? disabledYearContentColor : this.disabledYearContentColor, currentYearContentColor != 16 ? currentYearContentColor : this.currentYearContentColor, selectedYearContentColor != 16 ? selectedYearContentColor : this.selectedYearContentColor, disabledSelectedYearContentColor != 16 ? disabledSelectedYearContentColor : this.disabledSelectedYearContentColor, selectedYearContainerColor != 16 ? selectedYearContainerColor : this.selectedYearContainerColor, disabledSelectedYearContainerColor != 16 ? disabledSelectedYearContainerColor : this.disabledSelectedYearContainerColor, dayContentColor != 16 ? dayContentColor : this.dayContentColor, disabledDayContentColor != 16 ? disabledDayContentColor : this.disabledDayContentColor, selectedDayContentColor != 16 ? selectedDayContentColor : this.selectedDayContentColor, disabledSelectedDayContentColor != 16 ? disabledSelectedDayContentColor : this.disabledSelectedDayContentColor, selectedDayContainerColor != 16 ? selectedDayContainerColor : this.selectedDayContainerColor, disabledSelectedDayContainerColor != 16 ? disabledSelectedDayContainerColor : this.disabledSelectedDayContainerColor, todayContentColor != 16 ? todayContentColor : this.todayContentColor, todayDateBorderColor != 16 ? todayDateBorderColor : this.todayDateBorderColor, dayInSelectionRangeContainerColor != 16 ? dayInSelectionRangeContainerColor : this.dayInSelectionRangeContainerColor, dayInSelectionRangeContentColor != 16 ? dayInSelectionRangeContentColor : this.dayInSelectionRangeContentColor, dividerColor != 16 ? dividerColor : this.dividerColor, p(dateTextFieldColors, new a() { // from class: f2.v4
            @Override // er.a
            public final Object a() {
                return w4.c(this.f58049a);
            }
        }), null);
    }

    public final f6<Color> d(boolean z15, boolean z16, boolean z17, r rVar, int i15) {
        long jG;
        f6<Color> f6VarP;
        if (t.k()) {
            t.o(-1240482658, i15, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:991)");
        }
        if (z15) {
            jG = z16 ? this.selectedDayContainerColor : this.disabledSelectedDayContainerColor;
        } else {
            jG = Color.INSTANCE.g();
        }
        long j15 = jG;
        if (z17) {
            rVar.X(-1319881536);
            f6VarP = v0.a(j15, of.b(k0.DefaultEffects, rVar, 6), null, null, rVar, 0, 12);
            rVar.R();
        } else {
            rVar.X(-1319654864);
            f6VarP = x5.p(Color.m0boximpl(j15), rVar, 0);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return f6VarP;
    }

    public final f6<Color> e(boolean z15, boolean z16, boolean z17, boolean z18, r rVar, int i15) {
        long j15;
        f6<Color> f6VarA;
        if (t.k()) {
            t.o(-1233694918, i15, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:955)");
        }
        if (z16 && z18) {
            j15 = this.selectedDayContentColor;
        } else if (z16 && !z18) {
            j15 = this.disabledSelectedDayContentColor;
        } else if (z17 && z18) {
            j15 = this.dayInSelectionRangeContentColor;
        } else if (z17 && !z18) {
            j15 = this.disabledDayContentColor;
        } else if (z15 && z18) {
            j15 = this.todayContentColor;
        } else {
            j15 = z18 ? this.dayContentColor : this.disabledDayContentColor;
        }
        long j16 = j15;
        if (z17) {
            rVar.X(-969507820);
            f6VarA = x5.p(Color.m0boximpl(j16), rVar, 0);
            rVar.R();
        } else {
            rVar.X(-969442410);
            f6VarA = v0.a(j16, of.b(k0.DefaultEffects, rVar, 6), null, null, rVar, 0, 12);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return f6VarA;
    }

    public boolean equals(Object other) {
        if (!(other instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) other;
        return Color.m11equalsimpl0(this.containerColor, w4Var.containerColor) && Color.m11equalsimpl0(this.titleContentColor, w4Var.titleContentColor) && Color.m11equalsimpl0(this.headlineContentColor, w4Var.headlineContentColor) && Color.m11equalsimpl0(this.weekdayContentColor, w4Var.weekdayContentColor) && Color.m11equalsimpl0(this.subheadContentColor, w4Var.subheadContentColor) && Color.m11equalsimpl0(this.yearContentColor, w4Var.yearContentColor) && Color.m11equalsimpl0(this.disabledYearContentColor, w4Var.disabledYearContentColor) && Color.m11equalsimpl0(this.currentYearContentColor, w4Var.currentYearContentColor) && Color.m11equalsimpl0(this.selectedYearContentColor, w4Var.selectedYearContentColor) && Color.m11equalsimpl0(this.disabledSelectedYearContentColor, w4Var.disabledSelectedYearContentColor) && Color.m11equalsimpl0(this.selectedYearContainerColor, w4Var.selectedYearContainerColor) && Color.m11equalsimpl0(this.disabledSelectedYearContainerColor, w4Var.disabledSelectedYearContainerColor) && Color.m11equalsimpl0(this.dayContentColor, w4Var.dayContentColor) && Color.m11equalsimpl0(this.disabledDayContentColor, w4Var.disabledDayContentColor) && Color.m11equalsimpl0(this.selectedDayContentColor, w4Var.selectedDayContentColor) && Color.m11equalsimpl0(this.disabledSelectedDayContentColor, w4Var.disabledSelectedDayContentColor) && Color.m11equalsimpl0(this.selectedDayContainerColor, w4Var.selectedDayContainerColor) && Color.m11equalsimpl0(this.disabledSelectedDayContainerColor, w4Var.disabledSelectedDayContainerColor) && Color.m11equalsimpl0(this.todayContentColor, w4Var.todayContentColor) && Color.m11equalsimpl0(this.todayDateBorderColor, w4Var.todayDateBorderColor) && Color.m11equalsimpl0(this.dayInSelectionRangeContainerColor, w4Var.dayInSelectionRangeContainerColor) && Color.m11equalsimpl0(this.dayInSelectionRangeContentColor, w4Var.dayInSelectionRangeContentColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final hn getDateTextFieldColors() {
        return this.dateTextFieldColors;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getDayInSelectionRangeContainerColor() {
        return this.dayInSelectionRangeContainerColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.m17hashCodeimpl(this.containerColor) * 31) + Color.m17hashCodeimpl(this.titleContentColor)) * 31) + Color.m17hashCodeimpl(this.headlineContentColor)) * 31) + Color.m17hashCodeimpl(this.weekdayContentColor)) * 31) + Color.m17hashCodeimpl(this.subheadContentColor)) * 31) + Color.m17hashCodeimpl(this.yearContentColor)) * 31) + Color.m17hashCodeimpl(this.disabledYearContentColor)) * 31) + Color.m17hashCodeimpl(this.currentYearContentColor)) * 31) + Color.m17hashCodeimpl(this.selectedYearContentColor)) * 31) + Color.m17hashCodeimpl(this.disabledSelectedYearContentColor)) * 31) + Color.m17hashCodeimpl(this.selectedYearContainerColor)) * 31) + Color.m17hashCodeimpl(this.disabledSelectedYearContainerColor)) * 31) + Color.m17hashCodeimpl(this.dayContentColor)) * 31) + Color.m17hashCodeimpl(this.disabledDayContentColor)) * 31) + Color.m17hashCodeimpl(this.selectedDayContentColor)) * 31) + Color.m17hashCodeimpl(this.disabledSelectedDayContentColor)) * 31) + Color.m17hashCodeimpl(this.selectedDayContainerColor)) * 31) + Color.m17hashCodeimpl(this.disabledSelectedDayContainerColor)) * 31) + Color.m17hashCodeimpl(this.todayContentColor)) * 31) + Color.m17hashCodeimpl(this.todayDateBorderColor)) * 31) + Color.m17hashCodeimpl(this.dayInSelectionRangeContainerColor)) * 31) + Color.m17hashCodeimpl(this.dayInSelectionRangeContentColor);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getDividerColor() {
        return this.dividerColor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getHeadlineContentColor() {
        return this.headlineContentColor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getNavigationContentColor() {
        return this.navigationContentColor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getSubheadContentColor() {
        return this.subheadContentColor;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getTodayDateBorderColor() {
        return this.todayDateBorderColor;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getWeekdayContentColor() {
        return this.weekdayContentColor;
    }

    public final hn p(hn hnVar, a<hn> aVar) {
        return hnVar == null ? aVar.a() : hnVar;
    }

    public final f6<Color> q(boolean z15, boolean z16, r rVar, int i15) {
        long jG;
        if (t.k()) {
            t.o(-1306331107, i15, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:1045)");
        }
        if (z15) {
            jG = z16 ? this.selectedYearContainerColor : this.disabledSelectedYearContainerColor;
        } else {
            jG = Color.INSTANCE.g();
        }
        f6<Color> f6VarA = v0.a(jG, of.b(k0.DefaultEffects, rVar, 6), null, null, rVar, 0, 12);
        if (t.k()) {
            t.n();
        }
        return f6VarA;
    }

    public final f6<Color> r(boolean z15, boolean z16, boolean z17, r rVar, int i15) {
        long j15;
        if (t.k()) {
            t.o(874111097, i15, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:1021)");
        }
        if (z16 && z17) {
            j15 = this.selectedYearContentColor;
        } else if (z16 && !z17) {
            j15 = this.disabledSelectedYearContentColor;
        } else if (z15 && z17) {
            j15 = this.currentYearContentColor;
        } else {
            j15 = z17 ? this.yearContentColor : this.disabledYearContentColor;
        }
        f6<Color> f6VarA = v0.a(j15, of.b(k0.DefaultEffects, rVar, 6), null, null, rVar, 0, 12);
        if (t.k()) {
            t.n();
        }
        return f6VarA;
    }

    private w4(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, hn hnVar) {
        this.containerColor = j15;
        this.titleContentColor = j16;
        this.headlineContentColor = j17;
        this.weekdayContentColor = j18;
        this.subheadContentColor = j19;
        this.navigationContentColor = j25;
        this.yearContentColor = j26;
        this.disabledYearContentColor = j27;
        this.currentYearContentColor = j28;
        this.selectedYearContentColor = j29;
        this.disabledSelectedYearContentColor = j35;
        this.selectedYearContainerColor = j36;
        this.disabledSelectedYearContainerColor = j37;
        this.dayContentColor = j38;
        this.disabledDayContentColor = j39;
        this.selectedDayContentColor = j45;
        this.disabledSelectedDayContentColor = j46;
        this.selectedDayContainerColor = j47;
        this.disabledSelectedDayContainerColor = j48;
        this.todayContentColor = j49;
        this.todayDateBorderColor = j55;
        this.dayInSelectionRangeContainerColor = j56;
        this.dayInSelectionRangeContentColor = j57;
        this.dividerColor = j58;
        this.dateTextFieldColors = hnVar;
    }
}
