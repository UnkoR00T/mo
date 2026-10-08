package p046f2;

import android.view.KeyEvent;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.t1;
import androidx.compose.ui.platform.v1;
import b5.LineHeightStyle;
import b5.j;
import c5.h;
import d1.c2;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import d1.x;
import er.l;
import er.p;
import er.q;
import f3.m;
import f3.v;
import fr.t;
import fr.w;
import g4.h1;
import h2.b2;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import l2.g1;
import l3.d0;
import l3.g0;
import n3.y2;
import oq.i0;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.f0;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c4;
import p076m2.c6;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p079n1.KeyboardOptions;
import p079n1.k3;
import p079n1.l3;
import q4.TextStyle;
import q4.z3;
import r0.o;
import v4.TextFieldValue;
import v4.a0;
import v4.e1;
import vq.k;
import w0.BorderStroke;
import w0.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a?\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001aI\u0010\"\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00060\u001fH\u0003¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b$\u0010%\u001a?\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\fH\u0003¢\u0006\u0004\b*\u0010+\u001aa\u00104\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010&\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0.2\u0006\u00100\u001a\u00020\f2\u0006\u00102\u001a\u0002012\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00060\u001fH\u0002¢\u0006\u0004\b4\u00105\u001a/\u00106\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\fH\u0003¢\u0006\u0004\b6\u00107\u001a_\u0010=\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020,2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00060\u001f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010<\u001a\u00020;2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b=\u0010>\u001a'\u0010A\u001a\u00020@2\u0006\u0010(\u001a\u00020'2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010?\u001a\u00020\tH\u0001¢\u0006\u0004\bA\u0010B\u001a\u001b\u0010D\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\fH\u0003¢\u0006\u0004\bD\u0010E\"\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H\"\u0014\u0010K\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010H\"\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010H\"\u0014\u0010P\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010H\"\u0014\u0010R\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010H\"\u0014\u0010T\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010H\"\u0014\u0010V\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010H\"\u0014\u0010X\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010H\"\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[\"\u0014\u0010^\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010[\"\u0014\u0010`\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010[\"\u0014\u0010b\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010H\"\u0014\u0010d\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010H\"\u0014\u0010f\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010H\"\u0014\u0010h\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010H\"\u001a\u0010l\u001a\u00020L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010H\u001a\u0004\bj\u0010k\"\u0015\u0010o\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bm\u0010n\"\u0015\u0010q\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bp\u0010n\"\u0015\u0010s\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\br\u0010n\"\u0018\u0010v\u001a\u00020\t*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006\u0080\u0001²\u0006\f\u00100\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010w\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010x\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\f\u00100\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010z\u001a\u00020y8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010|\u001a\u00020{8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010~\u001a\u00020}8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u007f\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lf2/jq;", "state", "Lf3/m;", "modifier", "Lf2/vo;", "colors", "Loq/i0;", "W", "(Lf2/jq;Lf3/m;Lf2/vo;Lm2/r;II)V", "", "initialHour", "initialMinute", "", "is24Hour", "R0", "(IIZLm2/r;II)Lf2/jq;", "Y", "(Lf3/m;Lf2/vo;Lf2/jq;Lm2/r;I)V", "F0", "(Lf3/m;Lf2/jq;Lf2/vo;Lm2/r;I)V", "Le4/w0;", "measurePolicy", "Ln3/y2;", "startShape", "endShape", "M", "(Lf3/m;Lf2/jq;Lf2/vo;Le4/w0;Ln3/y2;Ln3/y2;Lm2/r;I)V", "checked", "shape", "Lkotlin/Function0;", "onClick", "Lkotlin/Function1;", "Ld1/p3;", "content", "C0", "(ZLn3/y2;Ler/a;Lf2/vo;Ler/q;Lm2/r;I)V", "J", "(Lf3/m;Lm2/r;I)V", "value", "Lf2/iq;", "selection", "isValid", "w0", "(Lf3/m;ILf2/jq;ILf2/vo;ZLm2/r;I)V", "Lv4/t0;", "prevValue", "Lg4/h1;", "userOverride", "a11yServicesEnabled", "Lf2/to;", "errorHandler", "onNewValue", "T0", "(ILf2/jq;Lv4/t0;Lv4/t0;Lg4/h1;ZLf2/to;Ler/l;)V", "T", "(Lf3/m;ILf2/jq;ZLm2/r;I)V", "onValueChange", "Ln1/m3;", "keyboardOptions", "Ln1/l3;", "keyboardActions", "q0", "(Lf3/m;Lv4/t0;Ler/l;Lf2/jq;ILn1/m3;Ln1/l3;Lf2/vo;Lm2/r;II)V", "number", "", "Q0", "(IZILm2/r;I)Ljava/lang/String;", "visible", "U0", "(Lf3/m;Z)Lf3/m;", "", "a", "F", "OuterCircleToSizeRatio", "b", "InnerCircleToSizeRatio", "Lc5/h;", "c", "ClockDisplayBottomMargin", "d", "ClockFaceBottomMargin", "e", "DisplaySeparatorWidth", "f", "SupportLabelTop", "g", "MaxDistance", "h", "MinimumInteractiveSize", "Lr0/o;", "i", "Lr0/o;", "Minutes", "j", "Hours", "k", "ExtraHours", "l", "PeriodToggleMargin", "m", "TimePickerMaxHeight", "n", "TimePickerMidHeight", "o", "ClockDialMidContainerSize", "p", "getClockDialMinContainerSize", "()F", "ClockDialMinContainerSize", "P0", "(Lf2/jq;)Z", "isPm", "N0", "isHourInputValid", "O0", "isMinuteInputValid", "M0", "(Lf2/jq;)I", "hourForDisplay", "hourValue", "minuteValue", "Lm3/e;", "center", "Lc5/n;", "parentCenter", "Lm3/g;", "boundsInParent", "selected", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class gq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f55974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f55975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f55976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f55977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f55978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f55979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f55980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f55981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final o f55982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final o f55983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final o f55984k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f55985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f55986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f55987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f55988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f55989p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f55990e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ h1<Boolean> f55991f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ jq f55992g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a3<TextFieldValue> f55993h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h1<Boolean> h1Var, jq jqVar, a3<TextFieldValue> a3Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f55991f = h1Var;
            this.f55992g = jqVar;
            this.f55993h = a3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f55990e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (t.c(this.f55991f.a(), vq.b.a(true))) {
                gq.d0(this.f55993h, gq.Z(this.f55992g));
            }
            this.f55991f.b(vq.b.a(true));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f55991f, this.f55992g, this.f55993h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f55994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ h1<Boolean> f55995f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ jq f55996g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a3<TextFieldValue> f55997h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h1<Boolean> h1Var, jq jqVar, a3<TextFieldValue> a3Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f55995f = h1Var;
            this.f55996g = jqVar;
            this.f55997h = a3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f55994e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (t.c(this.f55995f.a(), vq.b.a(true))) {
                gq.g0(this.f55997h, gq.p0(this.f55996g));
            }
            this.f55995f.b(vq.b.a(true));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f55995f, this.f55996g, this.f55997h, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ jq f55998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3<TextFieldValue> f55999b;

        c(jq jqVar, a3<TextFieldValue> a3Var) {
            this.f55998a = jqVar;
            this.f55999b = a3Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            int iC = y3.d.c(keyEvent);
            if (48 <= iC && iC < 58 && z3.n(gq.b0(this.f55999b).getSelection()) == 2 && gq.b0(this.f55999b).m().length() == 2) {
                this.f55998a.b(iq.INSTANCE.b());
            }
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56000e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ jq f56001f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f56002g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d0 f56003h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(jq jqVar, int i15, d0 d0Var, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f56001f = jqVar;
            this.f56002g = i15;
            this.f56003h = d0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f56000e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (iq.f(this.f56001f.d(), this.f56002g)) {
                d0.f(this.f56003h, 0, 1, null);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f56001f, this.f56002g, this.f56003h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f56005f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z15, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f56005f = z15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f56004e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new e(this.f56005f, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f56006a = new f();

        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(List list, a2 a2Var, a2.a aVar) {
            a2.a.E(aVar, (a2) list.get(0), 0, 0, 0.0f, 4, null);
            a2.a.E(aVar, (a2) list.get(1), 0, ((a2) list.get(0)).getHeight(), 0.0f, 4, null);
            a2.a.E(aVar, a2Var, 0, ((a2) list.get(0)).getHeight() - (a2Var.getHeight() / 2), 0.0f, 4, null);
            return i0.f148189a;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                v0 v0Var = list.get(i15);
                if (t.c(f0.a(v0Var), "Spacer")) {
                    final a2 a2VarO0 = v0Var.o0(c5.b.d(j15, 0, 0, 0, y0Var.X0(l2.h1.f114662a.j()), 3, null));
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        v0 v0Var2 = list.get(i16);
                        if (!t.c(f0.a(v0Var2), "Spacer")) {
                            arrayList.add(v0Var2);
                        }
                    }
                    final ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    for (int i17 = 0; i17 < size3; i17++) {
                        arrayList2.add(((v0) arrayList.get(i17)).o0(c5.b.d(j15, 0, 0, 0, c5.b.k(j15) / 2, 3, null)));
                    }
                    return y0.j2(y0Var, c5.b.l(j15), c5.b.k(j15), null, new l() { // from class: f2.hq
                        @Override // er.l
                        public final Object b(Object obj) {
                            return gq.f.b(arrayList2, a2VarO0, (a2.a) obj);
                        }
                    }, 4, null);
                }
            }
            e5.b.f("Collection contains no element matching the predicate.");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class g extends w implements l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f56007b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z15) {
            super(1);
            this.f56007b = z15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("visible");
            v1Var.getProperties().b("visible", Boolean.valueOf(this.f56007b));
        }
    }

    static {
        float fN = h.n(101);
        l2.h1 h1Var = l2.h1.f114662a;
        f55974a = fN / h1Var.b();
        f55975b = h.n(69) / h1Var.b();
        f55976c = h.n(36);
        float f15 = 24;
        f55977d = h.n(f15);
        f55978e = h.n(f15);
        f55979f = h.n(7);
        f55980g = h.n(74);
        f55981h = h.n(48);
        f55982i = r0.p.d(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        o oVarD = r0.p.d(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f55983j = oVarD;
        r0.i0 i0Var = new r0.i0(oVarD._size);
        int[] iArr = oVarD.content;
        int i15 = oVarD._size;
        for (int i16 = 0; i16 < i15; i16++) {
            i0Var.k((iArr[i16] % 12) + 12);
        }
        f55984k = i0Var;
        f55985l = h.n(12);
        f55986m = h.n(MLKEMEngine.KyberPolyBytes);
        f55987n = h.n(330);
        f55988o = h.n(238);
        f55989p = h.n(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A0(String str, n4.i0 i0Var) {
        n4.f0.c0(i0Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B0(m mVar, int i15, jq jqVar, int i16, vo voVar, boolean z15, int i17, r rVar, int i18) {
        w0(mVar, i15, jqVar, i16, voVar, z15, rVar, g4.a(i17 | 1));
        return i0.f148189a;
    }

    private static final void C0(final boolean z15, final y2 y2Var, final er.a<i0> aVar, final vo voVar, final q<? super p3, ? super r, ? super Integer, i0> qVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1523811083);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(y2Var) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(voVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(qVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (rVarH.r((i16 & 9363) != 9362, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1523811083, i16, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1458)");
            }
            long jD = voVar.d(z15);
            long jC = voVar.c(z15);
            m mVarF = androidx.compose.foundation.layout.d.f(v.a(m.INSTANCE, z15 ? 0.0f : 1.0f), 0.0f, 1, null);
            boolean z16 = (i16 & 14) == 4;
            Object objE = rVarH.E();
            if (z16 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.rp
                    @Override // er.l
                    public final Object b(Object obj) {
                        return gq.D0(z15, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            C6460u1.k(aVar, n4.v.d(mVarF, false, (l) objE, 1, null), false, y2Var, n1.f56965a.o(jC, jD, 0L, 0L, rVarH, 24576, 12), null, null, d1.a3.e(h.n(0)), null, qVar, rVarH, ((i16 >> 6) & 14) | 12582912 | ((i16 << 6) & 7168) | ((i16 << 15) & 1879048192), 356);
            rVar2 = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.sp
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return gq.E0(z15, y2Var, aVar, voVar, qVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D0(boolean z15, n4.i0 i0Var) {
        n4.f0.s0(i0Var, z15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E0(boolean z15, y2 y2Var, er.a aVar, vo voVar, q qVar, int i15, r rVar, int i16) {
        C0(z15, y2Var, aVar, voVar, qVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void F0(m mVar, jq jqVar, vo voVar, r rVar, final int i15) {
        int i16;
        final m mVar2;
        final jq jqVar2;
        final vo voVar2;
        r rVarH = rVar.h(-1898918107);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(jqVar) : rVarH.G(jqVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(voVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1898918107, i16, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1351)");
            }
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = f.f56006a;
                rVarH.v(objE);
            }
            w0 w0Var = (w0) objE;
            l1.a aVar = (l1.a) ui.h(l2.h1.f114662a.g(), rVarH, 6);
            mVar2 = mVar;
            jqVar2 = jqVar;
            voVar2 = voVar;
            M(mVar2, jqVar2, voVar2, w0Var, ui.l(aVar, null, 1, null), ui.d(aVar, null, 1, null), rVarH, (i16 & 14) | 3072 | (i16 & 112) | (i16 & 896));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            mVar2 = mVar;
            jqVar2 = jqVar;
            voVar2 = voVar;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.yo
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return gq.G0(mVar2, jqVar2, voVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G0(m mVar, jq jqVar, vo voVar, int i15, r rVar, int i16) {
        F0(mVar, jqVar, voVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void J(final m mVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(2100674302);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2100674302, i16, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1478)");
            }
            TextStyle textStyleE = TextStyle.e((TextStyle) rVarH.N(oo.q()), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, j.INSTANCE.a(), 0, 0L, null, null, new LineHeightStyle(LineHeightStyle.a.INSTANCE.a(), LineHeightStyle.d.INSTANCE.a(), (fr.k) null), 0, 0, null, 15695871, null);
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.dp
                    @Override // er.l
                    public final Object b(Object obj) {
                        return gq.K((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarA = n4.v.a(mVar, (l) objE);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarA);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            rVar2 = rVarH;
            oo.j(":", null, g2.i(g1.f114616a.g(), rVarH, 6), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleE, rVar2, 6, 0, 131066);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.ep
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return gq.L(mVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(n4.i0 i0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(m mVar, int i15, r rVar, int i16) {
        J(mVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void M(final m mVar, final jq jqVar, final vo voVar, final w0 w0Var, final y2 y2Var, final y2 y2Var2, r rVar, final int i15) {
        int i16;
        y2 y2Var3;
        r rVarH = rVar.h(1374241901);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(jqVar) : rVarH.G(jqVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(voVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(w0Var) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.W(y2Var) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            y2Var3 = y2Var2;
            i16 |= rVarH.W(y2Var3) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            y2Var3 = y2Var2;
        }
        if (rVarH.r((74899 & i16) != 74898, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1374241901, i16, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1400)");
            }
            l2.h1 h1Var = l2.h1.f114662a;
            BorderStroke borderStrokeA = w0.x.a(h1Var.j(), voVar.getPeriodSelectorBorderColor());
            l1.a aVar = (l1.a) ui.h(h1Var.g(), rVarH, 6);
            final TextStyle textStyleE = ds.e(h1Var.h(), rVarH, 6);
            h2.a2.Companion companion = h2.a2.INSTANCE;
            final String strB = b2.b(h2.a2.a(ih.Y), rVarH, 0);
            boolean zW = rVarH.W(strB);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.fp
                    @Override // er.l
                    public final Object b(Object obj) {
                        return gq.N(strB, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarG = w0.o.g(k1.c.b(n4.v.d(mVar, false, (l) objE, 1, null)), borderStrokeA, aVar);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarG);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0Var, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            boolean z15 = !P0(jqVar);
            int i17 = i16 & 112;
            boolean z16 = i17 == 32 || ((i16 & 64) != 0 && rVarH.G(jqVar));
            Object objE2 = rVarH.E();
            if (z16 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: f2.gp
                    @Override // er.a
                    public final Object a() {
                        return gq.O(jqVar);
                    }
                };
                rVarH.v(objE2);
            }
            int i18 = (i16 << 3) & 7168;
            C0(z15, y2Var, (er.a) objE2, voVar, y2.m.d(1425358052, true, new q() { // from class: f2.hp
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return gq.P(textStyleE, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, ((i16 >> 9) & 112) | 24576 | i18);
            r3.a(i.d(androidx.compose.foundation.layout.d.f(v.a(f0.b(m.INSTANCE, "Spacer"), 2.0f), 0.0f, 1, null), voVar.getPeriodSelectorBorderColor(), null, 2, null), rVarH, 0);
            boolean zP0 = P0(jqVar);
            boolean z17 = i17 == 32 || ((i16 & 64) != 0 && rVarH.G(jqVar));
            Object objE3 = rVarH.E();
            if (z17 || objE3 == r.INSTANCE.a()) {
                objE3 = new er.a() { // from class: f2.jp
                    @Override // er.a
                    public final Object a() {
                        return gq.Q(jqVar);
                    }
                };
                rVarH.v(objE3);
            }
            C0(zP0, y2Var3, (er.a) objE3, voVar, y2.m.d(-1179219109, true, new q() { // from class: f2.kp
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return gq.R(textStyleE, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, ((i16 >> 12) & 112) | 24576 | i18);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.lp
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return gq.S(mVar, jqVar, voVar, w0Var, y2Var, y2Var2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final int M0(jq jqVar) {
        if (jqVar.getIs24hour()) {
            return jqVar.j() % 24;
        }
        if (jqVar.j() % 12 == 0) {
            return 12;
        }
        return P0(jqVar) ? jqVar.j() - 12 : jqVar.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(String str, n4.i0 i0Var) {
        n4.f0.H0(i0Var, true);
        n4.f0.c0(i0Var, str);
        return i0.f148189a;
    }

    public static final boolean N0(jq jqVar) {
        int iK = jqVar.k();
        return iK >= 0 && iK < 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(jq jqVar) {
        if (P0(jqVar) && N0(jqVar)) {
            jqVar.f(jqVar.j() - 12);
        }
        return i0.f148189a;
    }

    public static final boolean O0(jq jqVar) {
        int iA = jqVar.a();
        return iA >= 0 && iA < 60;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(TextStyle textStyle, p3 p3Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1425358052, i15, -1, "androidx.compose.material3.PeriodToggleImpl.<anonymous>.<anonymous> (TimePicker.kt:1427)");
            }
            h2.a2.Companion companion = h2.a2.INSTANCE;
            oo.j(b2.b(h2.a2.a(ih.L), rVar, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, rVar, 0, 0, 131070);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public static final boolean P0(jq jqVar) {
        return jqVar.j() >= 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(jq jqVar) {
        if (!P0(jqVar) && N0(jqVar)) {
            jqVar.f(jqVar.j() + 12);
        }
        return i0.f148189a;
    }

    public static final String Q0(int i15, boolean z15, int i16, r rVar, int i17) {
        int iA;
        if (p076m2.t.k()) {
            p076m2.t.o(194237364, i17, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:2219)");
        }
        if (iq.f(i15, iq.INSTANCE.b())) {
            h2.a2.Companion companion = h2.a2.INSTANCE;
            iA = h2.a2.a(ih.W);
        } else if (z15) {
            h2.a2.Companion companion2 = h2.a2.INSTANCE;
            iA = h2.a2.a(ih.N);
        } else {
            h2.a2.Companion companion3 = h2.a2.INSTANCE;
            iA = h2.a2.a(ih.R);
        }
        String strC = b2.c(iA, new Object[]{Integer.valueOf(i16)}, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return strC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(TextStyle textStyle, p3 p3Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1179219109, i15, -1, "androidx.compose.material3.PeriodToggleImpl.<anonymous>.<anonymous> (TimePicker.kt:1445)");
            }
            h2.a2.Companion companion = h2.a2.INSTANCE;
            oo.j(b2.b(h2.a2.a(ih.Z), rVar, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, rVar, 0, 0, 131070);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public static final jq R0(final int i15, final int i16, final boolean z15, r rVar, int i17, int i18) {
        if ((i18 & 1) != 0) {
            i15 = 0;
        }
        if ((i18 & 2) != 0) {
            i16 = 0;
        }
        if ((i18 & 4) != 0) {
            z15 = so.a(rVar, 0);
        }
        if (p076m2.t.k()) {
            p076m2.t.o(1237715277, i17, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:606)");
        }
        Object[] objArr = new Object[0];
        b3.x<mq, ?> xVarC = mq.INSTANCE.c();
        boolean z16 = true;
        boolean z17 = ((((i17 & 14) ^ 6) > 4 && rVar.c(i15)) || (i17 & 6) == 4) | ((((i17 & 112) ^ 48) > 32 && rVar.c(i16)) || (i17 & 48) == 32);
        if ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !rVar.a(z15)) && (i17 & MLKEMEngine.KyberPolyBytes) != 256) {
            z16 = false;
        }
        boolean z18 = z17 | z16;
        Object objE = rVar.E();
        if (z18 || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: f2.xo
                @Override // er.a
                public final Object a() {
                    return gq.S0(i15, i16, z15);
                }
            };
            rVar.v(objE);
        }
        mq mqVar = (mq) b3.f.i(objArr, xVarC, (er.a) objE, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(m mVar, jq jqVar, vo voVar, w0 w0Var, y2 y2Var, y2 y2Var2, int i15, r rVar, int i16) {
        M(mVar, jqVar, voVar, w0Var, y2Var, y2Var2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mq S0(int i15, int i16, boolean z15) {
        return new mq(i15, i16, z15);
    }

    private static final void T(final m mVar, final int i15, final jq jqVar, final boolean z15, r rVar, final int i16) {
        int i17;
        r rVar2;
        int iA;
        long jI;
        r rVarH = rVar.h(474051149);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.c(i15) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= (i16 & 512) == 0 ? rVarH.W(jqVar) : rVarH.G(jqVar) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= rVarH.a(z15) ? 2048 : 1024;
        }
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(474051149, i17, -1, "androidx.compose.material3.SupportingText (TimePicker.kt:2013)");
            }
            if (z15 && iq.f(i15, iq.INSTANCE.a())) {
                h2.a2.Companion companion = h2.a2.INSTANCE;
                iA = h2.a2.a(ih.M);
            } else if (z15) {
                h2.a2.Companion companion2 = h2.a2.INSTANCE;
                iA = h2.a2.a(ih.T);
            } else {
                iq.Companion companion3 = iq.INSTANCE;
                if (iq.f(i15, companion3.a()) && jqVar.getIs24hour()) {
                    h2.a2.Companion companion4 = h2.a2.INSTANCE;
                    iA = h2.a2.a(ih.P);
                } else if (iq.f(i15, companion3.a())) {
                    h2.a2.Companion companion5 = h2.a2.INSTANCE;
                    iA = h2.a2.a(ih.O);
                } else {
                    h2.a2.Companion companion6 = h2.a2.INSTANCE;
                    iA = h2.a2.a(ih.U);
                }
            }
            String strB = b2.b(iA, rVarH, 0);
            if (z15) {
                rVarH.X(296644402);
                jI = g2.i(g1.f114616a.h(), rVarH, 6);
                rVarH.R();
            } else {
                rVarH.X(296642354);
                jI = androidx.compose.material3.d.f9816a.a(rVarH, 6).getError();
                rVarH.R();
            }
            long j15 = jI;
            m mVarR = d1.a3.r(mVar, 0.0f, f55979f, 0.0f, 0.0f, 13, null);
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.op
                    @Override // er.l
                    public final Object b(Object obj) {
                        return gq.U((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            rVar2 = rVarH;
            oo.j(strB, n4.v.a(mVarR, (l) objE), j15, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 2, null, ds.e(g1.f114616a.i(), rVarH, 6), rVar2, 0, 196608, 98296);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.pp
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return gq.V(mVar, i15, jqVar, z15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void T0(int i15, jq jqVar, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, h1<Boolean> h1Var, boolean z15, to toVar, l<? super TextFieldValue, i0> lVar) {
        h1Var.b(Boolean.FALSE);
        if (t.c(textFieldValue.m(), textFieldValue2.m())) {
            lVar.b(textFieldValue);
            return;
        }
        int i16 = 12;
        if (textFieldValue.m().length() == 0) {
            if (iq.f(i15, iq.INSTANCE.a())) {
                jqVar.c((!P0(jqVar) || jqVar.getIs24hour()) ? 0 : 12);
            } else {
                jqVar.e(0);
            }
            lVar.b(TextFieldValue.h(textFieldValue, "", 0L, null, 6, null));
            return;
        }
        try {
            int iF = (textFieldValue.m().length() == 3 && z3.n(textFieldValue.getSelection()) == 1) ? fu.a.f(textFieldValue.m().charAt(0)) : Integer.parseInt(textFieldValue.m());
            if (iF > 99) {
                toVar.a();
                return;
            }
            iq.Companion companion = iq.INSTANCE;
            if (iq.f(i15, companion.a())) {
                if (iF != 12 || !P0(jqVar)) {
                    if (iF != 12 || P0(jqVar) || jqVar.getIs24hour()) {
                        if (!P0(jqVar) || jqVar.getIs24hour()) {
                            i16 = 0;
                        }
                        i16 += iF;
                    } else {
                        i16 = 0;
                    }
                }
                jqVar.c(i16);
                if (iF > 1 && !jqVar.getIs24hour() && !z15) {
                    jqVar.b(companion.b());
                }
            } else {
                jqVar.e(iF);
            }
            lVar.b(textFieldValue.m().length() <= 2 ? textFieldValue : TextFieldValue.h(textFieldValue, String.valueOf(textFieldValue.m().charAt(0)), 0L, null, 6, null));
        } catch (NumberFormatException unused) {
        } catch (IllegalArgumentException unused2) {
            toVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(n4.i0 i0Var) {
        return i0.f148189a;
    }

    private static final m U0(m mVar, boolean z15) {
        return mVar.u(new gs(z15, t1.b() ? new g(z15) : t1.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(m mVar, int i15, jq jqVar, boolean z15, int i16, r rVar, int i17) {
        T(mVar, i15, jqVar, z15, rVar, g4.a(i16 | 1));
        return i0.f148189a;
    }

    public static final void W(final jq jqVar, m mVar, vo voVar, r rVar, final int i15, final int i16) {
        int i17;
        r rVarH = rVar.h(-760850373);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(jqVar) : rVarH.G(jqVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.W(mVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= ((i16 & 4) == 0 && rVarH.W(voVar)) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) == 0 || rVarH.Q()) {
                if (i18 != 0) {
                    mVar = m.INSTANCE;
                }
                if ((i16 & 4) != 0) {
                    voVar = wo.f58239a.a(rVarH, 6);
                    i17 &= -897;
                }
            } else {
                rVarH.O();
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-760850373, i17, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:293)");
            }
            Y(mVar, voVar, jqVar, rVarH, ((i17 >> 3) & 126) | ((i17 << 6) & 896));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        final m mVar2 = mVar;
        final vo voVar2 = voVar;
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.ip
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return gq.X(jqVar, mVar2, voVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(jq jqVar, m mVar, vo voVar, int i15, int i16, r rVar, int i17) {
        W(jqVar, mVar, voVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void Y(final m mVar, final vo voVar, final jq jqVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-475657989);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(voVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(jqVar) : rVarH.G(jqVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-475657989, i16, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:1086)");
            }
            Object[] objArr = new Object[0];
            TextFieldValue.Companion companion = TextFieldValue.INSTANCE;
            b3.x<TextFieldValue, Object> xVarA = companion.a();
            int i17 = i16 & 896;
            boolean z15 = i17 == 256 || ((i16 & 512) != 0 && rVarH.G(jqVar));
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: f2.tp
                    @Override // er.a
                    public final Object a() {
                        return gq.a0(jqVar);
                    }
                };
                rVarH.v(objE);
            }
            final a3 a3VarL = b3.f.l(objArr, xVarA, (er.a) objE, rVarH, 0);
            Object[] objArr2 = new Object[0];
            b3.x<TextFieldValue, Object> xVarA2 = companion.a();
            boolean z16 = i17 == 256 || ((i16 & 512) != 0 && rVarH.G(jqVar));
            Object objE2 = rVarH.E();
            if (z16 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: f2.zp
                    @Override // er.a
                    public final Object a() {
                        return gq.e0(jqVar);
                    }
                };
                rVarH.v(objE2);
            }
            final a3 a3VarL2 = b3.f.l(objArr2, xVarA2, (er.a) objE2, rVarH, 0);
            Object objE3 = rVarH.E();
            r.Companion companion2 = r.INSTANCE;
            if (objE3 == companion2.a()) {
                objE3 = new h1();
                rVarH.v(objE3);
            }
            final h1 h1Var = (h1) objE3;
            Integer numValueOf = Integer.valueOf(jqVar.j());
            boolean zG = (i17 == 256 || ((i16 & 512) != 0 && rVarH.G(jqVar))) | rVarH.G(h1Var) | rVarH.W(a3VarL);
            Object objE4 = rVarH.E();
            if (zG || objE4 == companion2.a()) {
                objE4 = new a(h1Var, jqVar, a3VarL, null);
                rVarH.v(objE4);
            }
            Function0.d(numValueOf, (p) objE4, rVarH, 0);
            Integer numValueOf2 = Integer.valueOf(jqVar.h());
            boolean zG2 = (i17 == 256 || ((i16 & 512) != 0 && rVarH.G(jqVar))) | rVarH.G(h1Var) | rVarH.W(a3VarL2);
            Object objE5 = rVarH.E();
            if (zG2 || objE5 == companion2.a()) {
                objE5 = new b(h1Var, jqVar, a3VarL2, null);
                rVarH.v(objE5);
            }
            Function0.d(numValueOf2, (p) objE5, rVarH, 0);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarB = m3.b(d1.i.f39152a.j(), companion3.l(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVar);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            q3 q3Var = q3.f39261a;
            g1 g1Var = g1.f114616a;
            TextStyle textStyleE = TextStyle.e(ds.e(g1Var.f(), rVarH, 6), voVar.f(true), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
            final f6<Boolean> f6VarN = h2.h.n(false, false, false, rVarH, 0, 7);
            final to toVarA = nq.a(h0(f6VarN), rVarH, 0);
            int i18 = i16;
            p076m2.d0.d(new c4[]{oo.q().d(textStyleE), androidx.compose.ui.platform.g1.l().d(c5.t.Ltr)}, y2.m.d(1306700887, true, new p() { // from class: f2.aq
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return gq.i0(a3VarL, jqVar, f6VarN, h1Var, toVarA, voVar, a3VarL2, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (jqVar.getIs24hour()) {
                rVarH.X(-1381792405);
                rVarH.R();
            } else {
                rVarH.X(-1382126833);
                m.Companion companion5 = m.INSTANCE;
                m mVarR = d1.a3.r(companion5, f55985l, 0.0f, 0.0f, 0.0f, 14, null);
                w0 w0VarI = d1.r.i(companion3.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT2 = rVarH.t();
                m mVarE2 = f3.j.e(rVarH, mVarR);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarI, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                x xVar = x.f39368a;
                F0(androidx.compose.foundation.layout.d.v(companion5, g1Var.b(), g1Var.a()), jqVar, voVar, rVarH, ((i18 >> 3) & 112) | 6 | ((i18 << 3) & 896));
                rVarH.x();
                rVarH.R();
            }
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.bq
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return gq.c0(mVar, voVar, jqVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue Z(jq jqVar) {
        return N0(jqVar) ? new TextFieldValue(w1.c(M0(jqVar), 2, 0, false, null, 14, null), 0L, (z3) null, 6, (fr.k) null) : new TextFieldValue(w1.c(jqVar.k(), 2, 0, false, null, 14, null), 0L, (z3) null, 6, (fr.k) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a3 a0(jq jqVar) {
        return c6.e(Z(jqVar), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue b0(a3<TextFieldValue> a3Var) {
        return a3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c0(m mVar, vo voVar, jq jqVar, int i15, r rVar, int i16) {
        Y(mVar, voVar, jqVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(a3<TextFieldValue> a3Var, TextFieldValue textFieldValue) {
        a3Var.setValue(textFieldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a3 e0(jq jqVar) {
        return c6.e(p0(jqVar), null, 2, null);
    }

    private static final TextFieldValue f0(a3<TextFieldValue> a3Var) {
        return a3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(a3<TextFieldValue> a3Var, TextFieldValue textFieldValue) {
        a3Var.setValue(textFieldValue);
    }

    private static final boolean h0(f6<Boolean> f6Var) {
        return f6Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i0(final a3 a3Var, final jq jqVar, final f6 f6Var, final h1 h1Var, final to toVar, vo voVar, final a3 a3Var2, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1306700887, i15, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:1139)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            boolean zW = rVar.W(a3Var) | rVar.G(jqVar);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new c(jqVar, a3Var);
                rVar.v(objE);
            }
            m mVarA = y3.f.a(companion, (l) objE);
            TextFieldValue textFieldValueB0 = b0(a3Var);
            boolean zW2 = rVar.W(a3Var) | rVar.W(f6Var) | rVar.G(jqVar) | rVar.G(h1Var) | rVar.G(toVar);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                l lVar = new l() { // from class: f2.cq
                    @Override // er.l
                    public final Object b(Object obj) {
                        return gq.j0(jqVar, h1Var, toVar, a3Var, f6Var, (TextFieldValue) obj);
                    }
                };
                rVar.v(lVar);
                objE2 = lVar;
            }
            l lVar2 = (l) objE2;
            iq.Companion companion3 = iq.INSTANCE;
            int iA = companion3.a();
            v4.t.Companion companion4 = v4.t.INSTANCE;
            int iD = companion4.d();
            a0.Companion companion5 = a0.INSTANCE;
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, companion5.d(), iD, null, null, null, 115, null);
            boolean zG = rVar.G(jqVar);
            Object objE3 = rVar.E();
            if (zG || objE3 == r.INSTANCE.a()) {
                objE3 = new l() { // from class: f2.dq
                    @Override // er.l
                    public final Object b(Object obj) {
                        return gq.l0(jqVar, (k3) obj);
                    }
                };
                rVar.v(objE3);
            }
            q0(mVarA, textFieldValueB0, lVar2, jqVar, iA, keyboardOptions, new l3(null, null, (l) objE3, null, null, null, 59, null), voVar, rVar, 24576, 0);
            J(androidx.compose.foundation.layout.d.v(companion, f55978e, g1.f114616a.a()), rVar, 6);
            TextFieldValue textFieldValueF0 = f0(a3Var2);
            boolean zG2 = rVar.G(jqVar) | rVar.W(a3Var2) | rVar.G(r2) | rVar.W(r5) | rVar.G(r3);
            Object objE4 = rVar.E();
            if (zG2 || objE4 == r.INSTANCE.a()) {
                l lVar3 = new l() { // from class: f2.eq
                    @Override // er.l
                    public final Object b(Object obj) {
                        return gq.m0(jqVar, h1Var, toVar, a3Var2, f6Var, (TextFieldValue) obj);
                    }
                };
                rVar.v(lVar3);
                objE4 = lVar3;
            }
            l lVar4 = (l) objE4;
            int iB = companion3.b();
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, null, companion5.d(), companion4.b(), null, null, null, 115, null);
            boolean zG3 = rVar.G(jqVar);
            Object objE5 = rVar.E();
            if (zG3 || objE5 == r.INSTANCE.a()) {
                objE5 = new l() { // from class: f2.fq
                    @Override // er.l
                    public final Object b(Object obj) {
                        return gq.o0(jqVar, (k3) obj);
                    }
                };
                rVar.v(objE5);
            }
            q0(companion, textFieldValueF0, lVar4, jqVar, iB, keyboardOptions2, new l3(null, null, (l) objE5, null, null, null, 59, null), voVar, rVar, 24582, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(jq jqVar, h1 h1Var, to toVar, final a3 a3Var, f6 f6Var, TextFieldValue textFieldValue) {
        T0(iq.INSTANCE.a(), jqVar, textFieldValue, b0(a3Var), h1Var, h0(f6Var), toVar, new l() { // from class: f2.np
            @Override // er.l
            public final Object b(Object obj) {
                return gq.k0(a3Var, (TextFieldValue) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(a3 a3Var, TextFieldValue textFieldValue) {
        d0(a3Var, textFieldValue);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l0(jq jqVar, k3 k3Var) {
        jqVar.b(iq.INSTANCE.b());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(jq jqVar, h1 h1Var, to toVar, final a3 a3Var, f6 f6Var, TextFieldValue textFieldValue) {
        T0(iq.INSTANCE.b(), jqVar, textFieldValue, f0(a3Var), h1Var, h0(f6Var), toVar, new l() { // from class: f2.mp
            @Override // er.l
            public final Object b(Object obj) {
                return gq.n0(a3Var, (TextFieldValue) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n0(a3 a3Var, TextFieldValue textFieldValue) {
        g0(a3Var, textFieldValue);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o0(jq jqVar, k3 k3Var) {
        jqVar.b(iq.INSTANCE.b());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue p0(jq jqVar) {
        return O0(jqVar) ? new TextFieldValue(w1.c(jqVar.h(), 2, 0, false, null, 14, null), 0L, (z3) null, 6, (fr.k) null) : new TextFieldValue(w1.c(jqVar.a(), 2, 0, false, null, 14, null), 0L, (z3) null, 6, (fr.k) null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:101:0x02db  */
    /* JADX WARN: Code duplicated, block: B:104:0x0312  */
    /* JADX WARN: Code duplicated, block: B:106:0x0332  */
    /* JADX WARN: Code duplicated, block: B:108:0x0338  */
    /* JADX WARN: Code duplicated, block: B:110:0x033e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0343  */
    /* JADX WARN: Code duplicated, block: B:113:0x036c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0389  */
    /* JADX WARN: Code duplicated, block: B:118:0x0393  */
    /* JADX WARN: Code duplicated, block: B:121:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:124:0x03de  */
    /* JADX WARN: Code duplicated, block: B:127:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:128:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:133:0x0442  */
    /* JADX WARN: Code duplicated, block: B:136:0x0566  */
    /* JADX WARN: Code duplicated, block: B:145:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:149:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:154:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:159:0x05db  */
    /* JADX WARN: Code duplicated, block: B:162:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104  */
    /* JADX WARN: Code duplicated, block: B:87:0x0119  */
    /* JADX WARN: Code duplicated, block: B:90:0x0260  */
    /* JADX WARN: Code duplicated, block: B:91:0x0265  */
    /* JADX WARN: Code duplicated, block: B:93:0x026b  */
    /* JADX WARN: Code duplicated, block: B:94:0x027e  */
    /* JADX WARN: Code duplicated, block: B:97:0x02cb  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static final void q0(final m mVar, final TextFieldValue textFieldValue, final l<? super TextFieldValue, i0> lVar, jq jqVar, int i15, KeyboardOptions keyboardOptions, l3 l3Var, final vo voVar, r rVar, final int i16, final int i17) {
        int i18;
        KeyboardOptions keyboardOptions2;
        int i19;
        l3 l3Var2;
        int i25;
        boolean z15;
        final l3 l3Var3;
        KeyboardOptions keyboardOptions3;
        d5 d5VarM;
        KeyboardOptions keyboardOptionsA;
        l3 l3VarA;
        Object objE;
        r.Companion companion;
        d0 d0Var;
        androidx.compose.material3.d dVar;
        boolean zF;
        iq.Companion companion2;
        boolean zO0;
        long jF;
        int i26;
        er.a<androidx.compose.ui.node.c> aVarB;
        boolean z16;
        int i27;
        r rVar2;
        final boolean z17;
        int iA;
        final String strB;
        Object objE2;
        er.a<androidx.compose.ui.node.c> aVarB2;
        int i28;
        boolean zW;
        Object objE3;
        Object objE4;
        boolean z18;
        boolean z19;
        Object objE5;
        int iA2;
        int i29;
        final jq jqVar2 = jqVar;
        final int i35 = i15;
        Float fValueOf = Float.valueOf(0.9f);
        Float fValueOf2 = Float.valueOf(0.1f);
        r rVarH = rVar.h(1299172990);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.W(mVar) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= rVarH.W(textFieldValue) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.G(lVar) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i18 |= (i16 & PKIFailureInfo.certConfirmed) == 0 ? rVarH.W(jqVar2) : rVarH.G(jqVar2) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i18 |= rVarH.c(i35) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i36 = i17 & 32;
        if (i36 == 0) {
            if ((196608 & i16) == 0) {
                keyboardOptions2 = keyboardOptions;
                i18 |= rVarH.W(keyboardOptions2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
            }
            i19 = i17 & 64;
            if (i19 != 0) {
                i18 |= 1572864;
                l3Var2 = l3Var;
            } else {
                l3Var2 = l3Var;
                if ((i16 & 1572864) == 0) {
                    if (rVarH.W(l3Var2)) {
                        i25 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i25 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i25;
                }
            }
            if ((i16 & 12582912) == 0) {
                if (rVarH.W(voVar)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i18 |= i29;
            }
            if ((i18 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                if (i36 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                } else {
                    keyboardOptionsA = keyboardOptions2;
                }
                if (i19 != 0) {
                    l3VarA = l3.INSTANCE.a();
                } else {
                    l3VarA = l3Var2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1299172990, i18, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:2051)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new d0();
                    rVarH.v(objE);
                }
                d0Var = (d0) objE;
                dVar = androidx.compose.material3.d.f9816a;
                final hn hnVarR = wf.f58214a.r(voVar.f(true), 0L, 0L, 0L, voVar.e(true), voVar.e(true), 0L, dVar.a(rVarH, 6).getErrorContainer(), 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, dVar.a(rVarH, 6).getOnErrorContainer(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, rVarH, 0, 0, 0, 0, 3072, 2080374606, 4095);
                zF = iq.f(i35, jqVar2.d());
                companion2 = iq.INSTANCE;
                if (iq.f(i35, companion2.a())) {
                    zO0 = N0(jqVar2);
                } else {
                    zO0 = O0(jqVar2);
                }
                if (zO0) {
                    rVarH.X(1713428167);
                    rVarH.R();
                    jF = voVar.f(true);
                    i26 = 6;
                } else {
                    rVarH.X(1713494445);
                    long error = dVar.a(rVarH, 6).getError();
                    rVarH.R();
                    jF = error;
                    i26 = 6;
                }
                m mVarB = d1.a2.b(mVar, c2.Min);
                d1.i.n nVarK = d1.i.f39152a.k();
                f3.c.Companion companion3 = f3.c.INSTANCE;
                w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                m mVarE = f3.j.e(rVarH, mVarB);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion4.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC = n6.c(rVarH);
                z16 = zO0;
                n6.i(rVarC, w0VarA, companion4.d());
                n6.i(rVarC, e0VarT, companion4.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
                n6.g(rVarC, companion4.a());
                n6.i(rVarC, mVarE, companion4.e());
                d1.i0 i0Var = d1.i0.f39176a;
                if (zF) {
                    i27 = i35;
                    rVar2 = rVarH;
                    z17 = z16;
                    rVar2.X(2023968270);
                    rVar2.R();
                } else {
                    rVarH.X(2023427227);
                    m.Companion companion5 = m.INSTANCE;
                    g1 g1Var = g1.f114616a;
                    m mVarV = androidx.compose.foundation.layout.d.v(companion5, g1Var.e(), g1Var.c());
                    if (iq.f(i35, companion2.a())) {
                        iA2 = jqVar.a();
                    } else if (N0(jqVar)) {
                        iA2 = M0(jqVar);
                    } else {
                        iA2 = jqVar.k();
                    }
                    int i37 = iA2;
                    int i38 = i18 >> 3;
                    w0(mVarV, i37, jqVar, i35, voVar, z16, rVarH, (i38 & 7168) | (i38 & 896) | 6 | ((i18 >> 9) & 57344));
                    i27 = i35;
                    z17 = z16;
                    rVar2 = rVarH;
                    rVar2.R();
                }
                if (iq.f(i27, companion2.b())) {
                    h2.a2.Companion companion6 = h2.a2.INSTANCE;
                    iA = h2.a2.a(ih.X);
                } else {
                    h2.a2.Companion companion7 = h2.a2.INSTANCE;
                    iA = h2.a2.a(ih.S);
                }
                strB = b2.b(iA, rVar2, 0);
                objE2 = rVar2.E();
                if (objE2 == companion.a()) {
                    objE2 = b1.k.a();
                    rVar2.v(objE2);
                }
                final b1.l lVar2 = (b1.l) objE2;
                m.Companion companion8 = m.INSTANCE;
                m mVarU0 = U0(companion8, zF);
                w0 w0VarI = d1.r.i(companion3.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
                e0 e0VarT2 = rVar2.t();
                m mVarE2 = f3.j.e(rVar2, mVarU0);
                aVarB2 = companion4.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB2);
                } else {
                    rVar2.u();
                }
                r rVarC2 = n6.c(rVar2);
                i28 = i18;
                n6.i(rVarC2, w0VarI, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                x xVar = x.f39368a;
                m mVarA = g0.a(companion8, r117);
                g1 g1Var2 = g1.f114616a;
                m mVarV2 = androidx.compose.foundation.layout.d.v(mVarA, g1Var2.e(), g1Var2.c());
                zW = rVar2.W(strB);
                objE3 = rVar2.E();
                if (zW || objE3 == companion.a()) {
                    objE3 = new l() { // from class: f2.zo
                        @Override // er.l
                        public final Object b(Object obj) {
                            return gq.r0(strB, (n4.i0) obj);
                        }
                    };
                    rVar2.v(objE3);
                }
                m mVarD = n4.v.d(mVarV2, false, (l) objE3, 1, null);
                TextStyle textStyleE = TextStyle.e((TextStyle) rVar2.N(oo.q()), jF, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                androidx.compose.ui.graphics.c.Companion companion9 = androidx.compose.ui.graphics.c.INSTANCE;
                Float fValueOf3 = Float.valueOf(0.0f);
                Color.Companion companion10 = Color.INSTANCE;
                int i39 = i26;
                int i45 = i28 >> 3;
                int i46 = i28 << 3;
                r rVar3 = rVar2;
                boolean z25 = z17;
                l3 l3Var4 = l3VarA;
                keyboardOptions3 = keyboardOptionsA;
                p079n1.u.i(textFieldValue, lVar, mVarD, true, false, textStyleE, keyboardOptions3, l3Var4, true, 0, 0, null, null, lVar2, androidx.compose.ui.graphics.c.Companion.i(companion9, new oq.r[]{y.a(fValueOf3, Color.m0boximpl(companion10.g())), y.a(fValueOf2, Color.m0boximpl(companion10.g())), y.a(fValueOf2, Color.m0boximpl(dVar.a(rVar2, i39).getPrimary())), y.a(fValueOf, Color.m0boximpl(dVar.a(rVar2, i39).getPrimary())), y.a(fValueOf, Color.m0boximpl(companion10.g())), y.a(Float.valueOf(1.0f), Color.m0boximpl(companion10.g()))}, 0.0f, 0.0f, 0, 14, null), y2.m.d(1007938103, true, new q() { // from class: f2.ap
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return gq.s0(textFieldValue, z17, lVar2, hnVarR, (p) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVar2, 54), rVar3, (i45 & 14) | 100666368 | (i45 & 112) | (3670016 & i46) | (i46 & 29360128), 199680, 7696);
                rVarH = rVar3;
                rVarH.x();
                m mVarH = androidx.compose.foundation.layout.d.h(companion8, 0.0f, 1, null);
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = new l() { // from class: f2.bp
                        @Override // er.l
                        public final Object b(Object obj) {
                            return gq.u0((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                jqVar2 = jqVar;
                T(n4.v.d(mVarH, false, (l) objE4, 1, null), i15, jqVar2, z25, rVarH, ((i28 >> 9) & 112) | (i45 & 896));
                i35 = i15;
                rVarH.x();
                iq iqVarC = iq.c(jqVar2.d());
                if ((i28 & 7168) != 2048 || ((i28 & PKIFailureInfo.certConfirmed) != 0 && rVarH.G(jqVar2))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | ((i28 & 57344) == 16384);
                objE5 = rVarH.E();
                if (z19 || objE5 == companion.a()) {
                    objE5 = new d(jqVar2, i35, d0Var, null);
                    rVarH.v(objE5);
                }
                Function0.d(iqVarC, (p) objE5, rVarH, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                l3Var3 = l3Var4;
            } else {
                rVarH.O();
                l3Var3 = l3Var2;
                keyboardOptions3 = keyboardOptions2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final KeyboardOptions keyboardOptions4 = keyboardOptions3;
                d5VarM.a(new p() { // from class: f2.cp
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return gq.v0(mVar, textFieldValue, lVar, jqVar2, i35, keyboardOptions4, l3Var3, voVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 196608;
        keyboardOptions2 = keyboardOptions;
        i19 = i17 & 64;
        if (i19 != 0) {
            i18 |= 1572864;
            l3Var2 = l3Var;
        } else {
            l3Var2 = l3Var;
            if ((i16 & 1572864) == 0) {
                if (rVarH.W(l3Var2)) {
                    i25 = PKIFailureInfo.badCertTemplate;
                } else {
                    i25 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i25;
            }
        }
        if ((i16 & 12582912) == 0) {
            if (rVarH.W(voVar)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i18 |= i29;
        }
        if ((i18 & 4793491) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i18 & 1)) {
            if (i36 != 0) {
                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
            } else {
                keyboardOptionsA = keyboardOptions2;
            }
            if (i19 != 0) {
                l3VarA = l3.INSTANCE.a();
            } else {
                l3VarA = l3Var2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1299172990, i18, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:2051)");
            }
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new d0();
                rVarH.v(objE);
            }
            d0Var = (d0) objE;
            dVar = androidx.compose.material3.d.f9816a;
            final hn hnVarR2 = wf.f58214a.r(voVar.f(true), 0L, 0L, 0L, voVar.e(true), voVar.e(true), 0L, dVar.a(rVarH, 6).getErrorContainer(), 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, dVar.a(rVarH, 6).getOnErrorContainer(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, rVarH, 0, 0, 0, 0, 3072, 2080374606, 4095);
            zF = iq.f(i35, jqVar2.d());
            companion2 = iq.INSTANCE;
            if (iq.f(i35, companion2.a())) {
                zO0 = N0(jqVar2);
            } else {
                zO0 = O0(jqVar2);
            }
            if (zO0) {
                rVarH.X(1713428167);
                rVarH.R();
                jF = voVar.f(true);
                i26 = 6;
            } else {
                rVarH.X(1713494445);
                long error2 = dVar.a(rVarH, 6).getError();
                rVarH.R();
                jF = error2;
                i26 = 6;
            }
            m mVarB2 = d1.a2.b(mVar, c2.Min);
            d1.i.n nVarK2 = d1.i.f39152a.k();
            f3.c.Companion companion11 = f3.c.INSTANCE;
            w0 w0VarA2 = d1.e0.a(nVarK2, companion11.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
            m mVarE3 = f3.j.e(rVarH, mVarB2);
            androidx.compose.ui.node.c.Companion companion12 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion12.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            z16 = zO0;
            n6.i(rVarC3, w0VarA2, companion12.d());
            n6.i(rVarC3, e0VarT3, companion12.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion12.c());
            n6.g(rVarC3, companion12.a());
            n6.i(rVarC3, mVarE3, companion12.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            if (zF) {
                rVarH.X(2023427227);
                m.Companion companion13 = m.INSTANCE;
                g1 g1Var3 = g1.f114616a;
                m mVarV3 = androidx.compose.foundation.layout.d.v(companion13, g1Var3.e(), g1Var3.c());
                if (iq.f(i35, companion2.a())) {
                    iA2 = jqVar.a();
                } else if (N0(jqVar)) {
                    iA2 = M0(jqVar);
                } else {
                    iA2 = jqVar.k();
                }
                int i310 = iA2;
                int i311 = i18 >> 3;
                w0(mVarV3, i310, jqVar, i35, voVar, z16, rVarH, (i311 & 7168) | (i311 & 896) | 6 | ((i18 >> 9) & 57344));
                i27 = i35;
                z17 = z16;
                rVar2 = rVarH;
                rVar2.R();
            } else {
                i27 = i35;
                rVar2 = rVarH;
                z17 = z16;
                rVar2.X(2023968270);
                rVar2.R();
            }
            if (iq.f(i27, companion2.b())) {
                h2.a2.Companion companion14 = h2.a2.INSTANCE;
                iA = h2.a2.a(ih.X);
            } else {
                h2.a2.Companion companion15 = h2.a2.INSTANCE;
                iA = h2.a2.a(ih.S);
            }
            strB = b2.b(iA, rVar2, 0);
            objE2 = rVar2.E();
            if (objE2 == companion.a()) {
                objE2 = b1.k.a();
                rVar2.v(objE2);
            }
            final b1.l lVar3 = (b1.l) objE2;
            m.Companion companion16 = m.INSTANCE;
            m mVarU1 = U0(companion16, zF);
            w0 w0VarI2 = d1.r.i(companion11.o(), false);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVar2, 0));
            e0 e0VarT4 = rVar2.t();
            m mVarE4 = f3.j.e(rVar2, mVarU1);
            aVarB2 = companion12.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB2);
            } else {
                rVar2.u();
            }
            r rVarC4 = n6.c(rVar2);
            i28 = i18;
            n6.i(rVarC4, w0VarI2, companion12.d());
            n6.i(rVarC4, e0VarT4, companion12.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion12.c());
            n6.g(rVarC4, companion12.a());
            n6.i(rVarC4, mVarE4, companion12.e());
            x xVar2 = x.f39368a;
            m mVarA2 = g0.a(companion16, r117);
            g1 g1Var4 = g1.f114616a;
            m mVarV4 = androidx.compose.foundation.layout.d.v(mVarA2, g1Var4.e(), g1Var4.c());
            zW = rVar2.W(strB);
            objE3 = rVar2.E();
            if (zW) {
                objE3 = new l() { // from class: f2.zo
                    @Override // er.l
                    public final Object b(Object obj) {
                        return gq.r0(strB, (n4.i0) obj);
                    }
                };
                rVar2.v(objE3);
            } else {
                objE3 = new l() { // from class: f2.zo
                    @Override // er.l
                    public final Object b(Object obj) {
                        return gq.r0(strB, (n4.i0) obj);
                    }
                };
                rVar2.v(objE3);
            }
            m mVarD2 = n4.v.d(mVarV4, false, (l) objE3, 1, null);
            TextStyle textStyleE2 = TextStyle.e((TextStyle) rVar2.N(oo.q()), jF, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            androidx.compose.ui.graphics.c.Companion companion17 = androidx.compose.ui.graphics.c.INSTANCE;
            Float fValueOf4 = Float.valueOf(0.0f);
            Color.Companion companion18 = Color.INSTANCE;
            int i312 = i26;
            int i47 = i28 >> 3;
            int i48 = i28 << 3;
            r rVar4 = rVar2;
            boolean z26 = z17;
            l3 l3Var5 = l3VarA;
            keyboardOptions3 = keyboardOptionsA;
            p079n1.u.i(textFieldValue, lVar, mVarD2, true, false, textStyleE2, keyboardOptions3, l3Var5, true, 0, 0, null, null, lVar3, androidx.compose.ui.graphics.c.Companion.i(companion17, new oq.r[]{y.a(fValueOf4, Color.m0boximpl(companion18.g())), y.a(fValueOf2, Color.m0boximpl(companion18.g())), y.a(fValueOf2, Color.m0boximpl(dVar.a(rVar2, i312).getPrimary())), y.a(fValueOf, Color.m0boximpl(dVar.a(rVar2, i312).getPrimary())), y.a(fValueOf, Color.m0boximpl(companion18.g())), y.a(Float.valueOf(1.0f), Color.m0boximpl(companion18.g()))}, 0.0f, 0.0f, 0, 14, null), y2.m.d(1007938103, true, new q() { // from class: f2.ap
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return gq.s0(textFieldValue, z17, lVar3, hnVarR2, (p) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar2, 54), rVar4, (i47 & 14) | 100666368 | (i47 & 112) | (3670016 & i48) | (i48 & 29360128), 199680, 7696);
            rVarH = rVar4;
            rVarH.x();
            m mVarH2 = androidx.compose.foundation.layout.d.h(companion16, 0.0f, 1, null);
            objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = new l() { // from class: f2.bp
                    @Override // er.l
                    public final Object b(Object obj) {
                        return gq.u0((n4.i0) obj);
                    }
                };
                rVarH.v(objE4);
            }
            jqVar2 = jqVar;
            T(n4.v.d(mVarH2, false, (l) objE4, 1, null), i15, jqVar2, z26, rVarH, ((i28 >> 9) & 112) | (i47 & 896));
            i35 = i15;
            rVarH.x();
            iq iqVarC2 = iq.c(jqVar2.d());
            if ((i28 & 7168) != 2048) {
                z18 = true;
            } else {
                z18 = true;
            }
            z19 = z18 | ((i28 & 57344) == 16384);
            objE5 = rVarH.E();
            if (z19) {
                objE5 = new d(jqVar2, i35, d0Var, null);
                rVarH.v(objE5);
            } else {
                objE5 = new d(jqVar2, i35, d0Var, null);
                rVarH.v(objE5);
            }
            Function0.d(iqVarC2, (p) objE5, rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            l3Var3 = l3Var5;
        } else {
            rVarH.O();
            l3Var3 = l3Var2;
            keyboardOptions3 = keyboardOptions2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final KeyboardOptions keyboardOptions5 = keyboardOptions3;
            d5VarM.a(new p() { // from class: f2.cp
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return gq.v0(mVar, textFieldValue, lVar, jqVar2, i35, keyboardOptions5, l3Var3, voVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r0(String str, n4.i0 i0Var) {
        n4.f0.c0(i0Var, str);
        n4.f0.m0(i0Var, 2);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final i0 s0(TextFieldValue textFieldValue, final boolean z15, final b1.l lVar, final hn hnVar, p pVar, r rVar, int i15) {
        p pVar2;
        int i16;
        if ((i15 & 6) == 0) {
            pVar2 = pVar;
            i16 = i15 | (rVar.G(pVar2) ? 4 : 2);
        } else {
            pVar2 = pVar;
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1007938103, i16, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:2131)");
            }
            wf.f58214a.m(textFieldValue.m(), pVar2, true, true, e1.INSTANCE.c(), lVar, !z15, null, null, null, null, null, null, null, hnVar, d1.a3.e(h.n(0)), y2.m.d(769667466, true, new p() { // from class: f2.qp
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return gq.t0(z15, lVar, hnVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, ((i16 << 3) & 112) | 224640, 14352384, 16256);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t0(boolean z15, b1.l lVar, hn hnVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(769667466, i15, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:2142)");
            }
            wf.f58214a.h(true, !z15, lVar, null, hnVar, ui.h(g1.f114616a.d(), rVar, 6), 0.0f, 0.0f, rVar, 100663686, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u0(n4.i0 i0Var) {
        n4.f0.l0(i0Var, n4.i.INSTANCE.b());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v0(m mVar, TextFieldValue textFieldValue, l lVar, jq jqVar, int i15, KeyboardOptions keyboardOptions, l3 l3Var, vo voVar, int i16, int i17, r rVar, int i18) {
        q0(mVar, textFieldValue, lVar, jqVar, i15, keyboardOptions, l3Var, voVar, rVar, g4.a(i16 | 1), i17);
        return i0.f148189a;
    }

    private static final void w0(final m mVar, final int i15, final jq jqVar, final int i16, final vo voVar, final boolean z15, r rVar, final int i17) {
        int i18;
        int i19;
        r rVar2;
        int iA;
        long errorContainer;
        long onErrorContainer;
        r rVarH = rVar.h(-883324461);
        if ((i17 & 6) == 0) {
            i18 = (rVarH.W(mVar) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 48) == 0) {
            i19 = i15;
            i18 |= rVarH.c(i19) ? 32 : 16;
        } else {
            i19 = i15;
        }
        if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= (i17 & 512) == 0 ? rVarH.W(jqVar) : rVarH.G(jqVar) ? 256 : 128;
        }
        if ((i17 & 3072) == 0) {
            i18 |= rVarH.c(i16) ? 2048 : 1024;
        }
        if ((i17 & 24576) == 0) {
            i18 |= rVarH.W(voVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i17) == 0) {
            i18 |= rVarH.a(z15) ? 131072 : PKIFailureInfo.notAuthorized;
        }
        if (rVarH.r((74899 & i18) != 74898, i18 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-883324461, i18, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1503)");
            }
            Boolean boolValueOf = Boolean.valueOf(z15);
            boolean z16 = (458752 & i18) == 131072;
            Object objE = rVarH.E();
            if (z16 || objE == r.INSTANCE.a()) {
                objE = new e(z15, null);
                rVarH.v(objE);
            }
            Function0.d(boolValueOf, (p) objE, rVarH, (i18 >> 15) & 14);
            boolean zF = iq.f(jqVar.d(), i16);
            if (iq.f(i16, iq.INSTANCE.a())) {
                h2.a2.Companion companion = h2.a2.INSTANCE;
                iA = h2.a2.a(ih.Q);
            } else {
                h2.a2.Companion companion2 = h2.a2.INSTANCE;
                iA = h2.a2.a(ih.V);
            }
            final String strB = b2.b(iA, rVarH, 0);
            if (z15) {
                rVarH.X(1528736631);
                rVarH.R();
                errorContainer = voVar.e(zF);
            } else {
                rVarH.X(1528739041);
                errorContainer = androidx.compose.material3.d.f9816a.a(rVarH, 6).getErrorContainer();
                rVarH.R();
            }
            if (z15) {
                rVarH.X(1528741173);
                rVarH.R();
                onErrorContainer = voVar.f(zF);
            } else {
                rVarH.X(1528743523);
                onErrorContainer = androidx.compose.material3.d.f9816a.a(rVarH, 6).getOnErrorContainer();
                rVarH.R();
            }
            boolean zW = rVarH.W(strB);
            Object objE2 = rVarH.E();
            if (zW || objE2 == r.INSTANCE.a()) {
                objE2 = new l() { // from class: f2.up
                    @Override // er.l
                    public final Object b(Object obj) {
                        return gq.x0(strB, (n4.i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            m mVarC = n4.v.c(mVar, true, (l) objE2);
            y2 y2VarH = ui.h(l2.h1.f114662a.n(), rVarH, 6);
            boolean z17 = ((i18 & 7168) == 2048) | ((i18 & 896) == 256 || ((i18 & 512) != 0 && rVarH.G(jqVar)));
            Object objE3 = rVarH.E();
            if (z17 || objE3 == r.INSTANCE.a()) {
                objE3 = new er.a() { // from class: f2.vp
                    @Override // er.a
                    public final Object a() {
                        return gq.y0(i16, jqVar);
                    }
                };
                rVarH.v(objE3);
            }
            er.a aVar = (er.a) objE3;
            final int i25 = i19;
            final long j15 = onErrorContainer;
            rVar2 = rVarH;
            androidx.compose.material3.l.h(zF, aVar, mVarC, false, y2VarH, errorContainer, 0L, 0.0f, 0.0f, null, null, y2.m.d(291874429, true, new p() { // from class: f2.wp
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return gq.z0(i16, jqVar, i25, j15, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, 0, 48, 1992);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.xp
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return gq.B0(mVar, i15, jqVar, i16, voVar, z15, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x0(String str, n4.i0 i0Var) {
        n4.f0.r0(i0Var, n4.l.INSTANCE.f());
        n4.f0.c0(i0Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y0(int i15, jq jqVar) {
        if (!iq.f(i15, jqVar.d())) {
            jqVar.b(i15);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z0(int i15, jq jqVar, int i16, long j15, r rVar, int i17) {
        if (rVar.r((i17 & 3) != 2, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(291874429, i17, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1538)");
            }
            final String strQ0 = Q0(i15, jqVar.getIs24hour(), i16, rVar, 0);
            f3.c cVarE = f3.c.INSTANCE.e();
            m.Companion companion = m.INSTANCE;
            w0 w0VarI = d1.r.i(cVarE, false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            boolean zW = rVar.W(strQ0);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.yp
                    @Override // er.l
                    public final Object b(Object obj) {
                        return gq.A0(strQ0, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            oo.j(w1.c(i16, 2, 0, false, null, 14, null), n4.v.d(companion, false, (l) objE, 1, null), j15, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262136);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }
}
