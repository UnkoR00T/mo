package p075lq1;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.g1;
import b1.l;
import c5.h;
import c5.n;
import d1.d3;
import d1.e0;
import d1.m3;
import d1.o2;
import d1.q3;
import d1.r3;
import d1.x;
import er.p;
import er.q;
import f3.c;
import f3.j;
import f3.m;
import i50.BaseScaffoldData;
import java.io.IOException;
import ju.p0;
import k3.f;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.m5;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p076m2.y2;
import t70.i;
import t70.s;
import tq.e;
import u50.v0;
import vq.k;
import w0.u2;
import x50.NavigationButtonData;

/* JADX INFO: renamed from: lq1.q, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001as\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a\"\u0014\u0010!\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001a\"\u0014\u0010#\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001a\"\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001a\"\u0014\u0010'\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001a\"\u0014\u0010)\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001a\"\u0014\u0010+\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001a¨\u00067²\u0006\u000e\u0010\b\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010.\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00102\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00103\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00104\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00105\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00106\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "v", "(Ler/a;Lm2/r;I)V", "Lf3/m;", "modifier", "", "selected", "", "animationKey", "", "topDelayMillis", "middleDelayMillis", "bottomDelayMillis", "", "topStiffness", "middleStiffness", "bottomStiffness", "topDampingRatio", "middleDampingRatio", "bottomDampingRatio", "q", "(Lf3/m;ZIJJJFFFFFFLm2/r;III)V", "Lc5/h;", "a", "F", "TOP_BASE_Y", "b", "MIDDLE_BASE_Y", "c", "BOTTOM_BASE_Y", "d", "TOP_ICON_WIDTH", "e", "TOP_ICON_HEIGHT", "f", "MIDDLE_ICON_WIDTH", "g", "MIDDLE_ICON_HEIGHT", "h", "BOTTOM_ICON_WIDTH", "i", "BOTTOM_ICON_HEIGHT", "", "topDelayInput", "middleDelayInput", "bottomDelayInput", "topStiffnessInput", "middleStiffnessInput", "bottomStiffnessInput", "topDampingInput", "middleDampingInput", "bottomDampingInput", "clickKey", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f119461e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f119463g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f119457a = h.n(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f119458b = h.n((float) 5.5d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f119459c = h.n(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f119460d = h.n(12);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f119462f = h.n(16);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f119464h = h.n(20);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f119465i = h.n(14);

    /* JADX INFO: renamed from: lq1.q$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f119466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f119467f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f119468g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f119469h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ u0.c<Float, u0.p> f119470j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ u0.c<Float, u0.p> f119471k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ u0.c<Float, u0.p> f119472l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ u0.c<Float, u0.p> f119473m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f119474n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ float f119475p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ float f119476q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f119477r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ float f119478s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f119479t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ long f119480v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ float f119481w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ float f119482x;

        /* JADX INFO: renamed from: lq1.q$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class C2906a extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f119483e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f119484f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ u0.c<Float, u0.p> f119485g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f119486h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ float f119487j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2906a(long j15, u0.c<Float, u0.p> cVar, float f15, float f16, e<? super C2906a> eVar) {
                super(2, eVar);
                this.f119484f = j15;
                this.f119485g = cVar;
                this.f119486h = f15;
                this.f119487j = f16;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            
                if (u0.c.f(r3, r4, r5, null, null, r11, 12, null) == r0) goto L15;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r11.f119483e
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    oq.u.b(r12)
                    goto L54
                L12:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1a:
                    oq.u.b(r12)
                    goto L34
                L1e:
                    oq.u.b(r12)
                    gu.b$a r12 = gu.b.INSTANCE
                    long r4 = r11.f119484f
                    gu.e r12 = gu.e.MILLISECONDS
                    long r4 = gu.d.r(r4, r12)
                    r11.f119483e = r3
                    java.lang.Object r12 = ju.z0.c(r4, r11)
                    if (r12 != r0) goto L34
                    goto L53
                L34:
                    u0.c<java.lang.Float, u0.p> r3 = r11.f119485g
                    r12 = 1065353216(0x3f800000, float:1.0)
                    java.lang.Float r4 = vq.b.d(r12)
                    float r12 = r11.f119486h
                    float r1 = r11.f119487j
                    r5 = 4
                    r6 = 0
                    u0.q1 r5 = u0.m.j(r12, r1, r6, r5, r6)
                    r11.f119483e = r2
                    r7 = 0
                    r9 = 12
                    r10 = 0
                    r8 = r11
                    java.lang.Object r12 = u0.c.f(r3, r4, r5, r6, r7, r8, r9, r10)
                    if (r12 != r0) goto L54
                L53:
                    return r0
                L54:
                    oq.i0 r12 = oq.i0.f148189a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: p075lq1.Function0.a.C2906a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((C2906a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new C2906a(this.f119484f, this.f119485g, this.f119486h, this.f119487j, eVar);
            }
        }

        /* JADX INFO: renamed from: lq1.q$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class b extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f119488e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f119489f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ u0.c<Float, u0.p> f119490g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f119491h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ float f119492j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j15, u0.c<Float, u0.p> cVar, float f15, float f16, e<? super b> eVar) {
                super(2, eVar);
                this.f119489f = j15;
                this.f119490g = cVar;
                this.f119491h = f15;
                this.f119492j = f16;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            
                if (u0.c.f(r3, r4, r5, null, null, r11, 12, null) == r0) goto L15;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r11.f119488e
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    oq.u.b(r12)
                    goto L54
                L12:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1a:
                    oq.u.b(r12)
                    goto L34
                L1e:
                    oq.u.b(r12)
                    gu.b$a r12 = gu.b.INSTANCE
                    long r4 = r11.f119489f
                    gu.e r12 = gu.e.MILLISECONDS
                    long r4 = gu.d.r(r4, r12)
                    r11.f119488e = r3
                    java.lang.Object r12 = ju.z0.c(r4, r11)
                    if (r12 != r0) goto L34
                    goto L53
                L34:
                    u0.c<java.lang.Float, u0.p> r3 = r11.f119490g
                    r12 = 1065353216(0x3f800000, float:1.0)
                    java.lang.Float r4 = vq.b.d(r12)
                    float r12 = r11.f119491h
                    float r1 = r11.f119492j
                    r5 = 4
                    r6 = 0
                    u0.q1 r5 = u0.m.j(r12, r1, r6, r5, r6)
                    r11.f119488e = r2
                    r7 = 0
                    r9 = 12
                    r10 = 0
                    r8 = r11
                    java.lang.Object r12 = u0.c.f(r3, r4, r5, r6, r7, r8, r9, r10)
                    if (r12 != r0) goto L54
                L53:
                    return r0
                L54:
                    oq.i0 r12 = oq.i0.f148189a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: p075lq1.Function0.a.b.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((b) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new b(this.f119489f, this.f119490g, this.f119491h, this.f119492j, eVar);
            }
        }

        /* JADX INFO: renamed from: lq1.q$a$c */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class c extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f119493e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f119494f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ u0.c<Float, u0.p> f119495g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f119496h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ float f119497j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(long j15, u0.c<Float, u0.p> cVar, float f15, float f16, e<? super c> eVar) {
                super(2, eVar);
                this.f119494f = j15;
                this.f119495g = cVar;
                this.f119496h = f15;
                this.f119497j = f16;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            
                if (u0.c.f(r3, r4, r5, null, null, r11, 12, null) == r0) goto L15;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r11.f119493e
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    oq.u.b(r12)
                    goto L54
                L12:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1a:
                    oq.u.b(r12)
                    goto L34
                L1e:
                    oq.u.b(r12)
                    gu.b$a r12 = gu.b.INSTANCE
                    long r4 = r11.f119494f
                    gu.e r12 = gu.e.MILLISECONDS
                    long r4 = gu.d.r(r4, r12)
                    r11.f119493e = r3
                    java.lang.Object r12 = ju.z0.c(r4, r11)
                    if (r12 != r0) goto L34
                    goto L53
                L34:
                    u0.c<java.lang.Float, u0.p> r3 = r11.f119495g
                    r12 = 1065353216(0x3f800000, float:1.0)
                    java.lang.Float r4 = vq.b.d(r12)
                    float r12 = r11.f119496h
                    float r1 = r11.f119497j
                    r5 = 4
                    r6 = 0
                    u0.q1 r5 = u0.m.j(r12, r1, r6, r5, r6)
                    r11.f119493e = r2
                    r7 = 0
                    r9 = 12
                    r10 = 0
                    r8 = r11
                    java.lang.Object r12 = u0.c.f(r3, r4, r5, r6, r7, r8, r9, r10)
                    if (r12 != r0) goto L54
                L53:
                    return r0
                L54:
                    oq.i0 r12 = oq.i0.f148189a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: p075lq1.Function0.a.c.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((c) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new c(this.f119494f, this.f119495g, this.f119496h, this.f119497j, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z15, int i15, u0.c<Float, u0.p> cVar, u0.c<Float, u0.p> cVar2, u0.c<Float, u0.p> cVar3, u0.c<Float, u0.p> cVar4, long j15, float f15, float f16, long j16, float f17, float f18, long j17, float f19, float f25, e<? super a> eVar) {
            super(2, eVar);
            this.f119468g = z15;
            this.f119469h = i15;
            this.f119470j = cVar;
            this.f119471k = cVar2;
            this.f119472l = cVar3;
            this.f119473m = cVar4;
            this.f119474n = j15;
            this.f119475p = f15;
            this.f119476q = f16;
            this.f119477r = j16;
            this.f119478s = f17;
            this.f119479t = f18;
            this.f119480v = j17;
            this.f119481w = f19;
            this.f119482x = f25;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x008b  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:56:0x017a  */
        /* JADX WARN: Code duplicated, block: B:59:0x0191  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
        
            if (r10.t(r2, r9) == r0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0107, code lost:
        
            if (r10.t(r2, r9) == r0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01a5, code lost:
        
            if (r10.t(r2, r9) == r0) goto L61;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 458
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p075lq1.Function0.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            a aVar = new a(this.f119468g, this.f119469h, this.f119470j, this.f119471k, this.f119472l, this.f119473m, this.f119474n, this.f119475p, this.f119476q, this.f119477r, this.f119478s, this.f119479t, this.f119480v, this.f119481w, this.f119482x, eVar);
            aVar.f119467f = obj;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: lq1.q$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f119498a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(345612051);
            if (t.k()) {
                t.o(345612051, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.naviconanimated.CascadingMenuIcon.<anonymous>.<anonymous> (DeveloperNavIconAnimatedScreen.kt:351)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jG;
        }
    }

    static {
        float f15 = 2;
        f119461e = h.n(f15);
        f119463g = h.n(f15);
    }

    private static final void A(a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    private static final String B(a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void C(a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    private static final String D(a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void E(y2 y2Var, int i15) {
        y2Var.g(i15);
    }

    private static final void F(a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    private static final String G(a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void H(a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    private static final String I(a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void J(a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    private static final String K(a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void L(a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    private static final int M(y2 y2Var) {
        return y2Var.d();
    }

    private static final void N(y2 y2Var, int i15) {
        y2Var.g(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 O(l lVar, final y2 y2Var, final y2 y2Var2, final a3 a3Var, final a3 a3Var2, final a3 a3Var3, final a3 a3Var4, final a3 a3Var5, final a3 a3Var6, final a3 a3Var7, final a3 a3Var8, final a3 a3Var9, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        int i17 = 1;
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1646563868, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.naviconanimated.DeveloperNavIconAnimatedScreen.<anonymous> (DeveloperNavIconAnimatedScreen.kt:93)");
            }
            m.Companion companion = m.INSTANCE;
            float f15 = 0.0f;
            m mVarN = s.n(i.S(d1.a3.l(d.f(companion, 0.0f, 1, null), d3Var), u2.b(0, rVar, 0, 1), rVar, 0, 0), rVar, 0);
            c.Companion companion2 = c.INSTANCE;
            c.b bVarG = companion2.g();
            d1.i iVar = d1.i.f39152a;
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            w0 w0VarA = e0.a(iVar.r(aVar.b(rVar, i18).getSpacing100()), bVarG, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            m mVarF = d.f(companion, 0.0f, 1, null);
            int i19 = 0;
            w0 w0VarB = m3.b(iVar.s(aVar.b(rVar, i18).getSpacing200(), companion2.g()), companion2.l(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            m mVarE2 = j.e(rVar, mVarF);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var = q3.f39261a;
            rVar.X(-1045407631);
            final int i25 = 0;
            while (i25 < 3) {
                int i26 = w(y2Var) == i25 ? i17 : i19;
                int iM = w(y2Var) == i25 ? M(y2Var2) : i19;
                Long lW = fu.r.w(a0(a3Var));
                long jLongValue = lW != null ? lW.longValue() : 0L;
                Long lW2 = fu.r.w(c0(a3Var2));
                long jLongValue2 = lW2 != null ? lW2.longValue() : 0L;
                Long lW3 = fu.r.w(x(a3Var3));
                long jLongValue3 = lW3 != null ? lW3.longValue() : 0L;
                Float fT = fu.r.t(z(a3Var4));
                float fFloatValue = fT != null ? fT.floatValue() : f15;
                Float fT2 = fu.r.t(B(a3Var5));
                float fFloatValue2 = fT2 != null ? fT2.floatValue() : f15;
                Float fT3 = fu.r.t(D(a3Var6));
                float fFloatValue3 = fT3 != null ? fT3.floatValue() : f15;
                Float fT4 = fu.r.t(G(a3Var7));
                float fFloatValue4 = fT4 != null ? fT4.floatValue() : f15;
                Float fT5 = fu.r.t(I(a3Var8));
                float fFloatValue5 = fT5 != null ? fT5.floatValue() : f15;
                Float fT6 = fu.r.t(K(a3Var9));
                float fFloatValue6 = fT6 != null ? fT6.floatValue() : f15;
                m mVarT = d.t(m.INSTANCE, d40.i.f.f39709e.getDimension());
                boolean zC = rVar.c(i25);
                Object objE = rVar.E();
                if (zC || objE == r.INSTANCE.a()) {
                    objE = new er.a() { // from class: lq1.a
                        @Override // er.a
                        public final Object a() {
                            return Function0.P(i25, y2Var, y2Var2);
                        }
                    };
                    rVar.v(objE);
                }
                q(androidx.compose.foundation.b.l(mVarT, lVar, null, false, null, null, (er.a) objE, 28, null), i26, iM, jLongValue, jLongValue2, jLongValue3, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6, rVar, 0, 0, 0);
                i25++;
                i17 = i17;
                f15 = 0.0f;
                i19 = 0;
            }
            rVar.R();
            rVar.x();
            m.Companion companion4 = m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i27 = k70.a.f108865b;
            r3.a(d.t(companion4, aVar2.b(rVar, i27).getSpacing200()), rVar, 0);
            Label labelB = mx.b.b("Top delay (ms)", "");
            Label labelB2 = mx.b.b(a0(a3Var), "");
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            Object objE2 = rVar.E();
            r.Companion companion5 = r.INSTANCE;
            if (objE2 == companion5.a()) {
                objE2 = new er.l() { // from class: lq1.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.Q(a3Var, (String) obj);
                    }
                };
                rVar.v(objE2);
            }
            v50.c.Number number = new v50.c.Number("developerNavIconAnimatedTopDelayMs", labelB, null, labelB2, c2039b, null, null, (er.l) objE2, null, false, 0, null, false, null, false, null, null, null, null, false, 1031940, null);
            int i28 = v50.c.Number.P;
            v0.g(number, null, rVar, i28, 2);
            Label labelB3 = mx.b.b("Middle delay (ms)", "");
            Label labelB4 = mx.b.b(c0(a3Var2), "");
            Object objE3 = rVar.E();
            if (objE3 == companion5.a()) {
                objE3 = new er.l() { // from class: lq1.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.R(a3Var2, (String) obj);
                    }
                };
                rVar.v(objE3);
            }
            v0.g(new v50.c.Number("developerNavIconAnimatedMiddleDelayMs", labelB3, null, labelB4, c2039b, null, null, (er.l) objE3, null, false, 0, null, false, null, false, null, null, null, null, false, 1031940, null), null, rVar, i28, 2);
            Label labelB5 = mx.b.b("Bottom delay (ms)", "");
            Label labelB6 = mx.b.b(x(a3Var3), "");
            Object objE4 = rVar.E();
            if (objE4 == companion5.a()) {
                objE4 = new er.l() { // from class: lq1.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.S(a3Var3, (String) obj);
                    }
                };
                rVar.v(objE4);
            }
            v0.g(new v50.c.Number("developerNavIconAnimatedBottomDelayMs", labelB5, null, labelB6, c2039b, null, null, (er.l) objE4, null, false, 0, null, false, null, false, null, null, null, null, false, 1031940, null), null, rVar, i28, 2);
            Label labelB7 = mx.b.b("Top stiffness", "");
            Label labelB8 = mx.b.b(z(a3Var4), "");
            Object objE5 = rVar.E();
            if (objE5 == companion5.a()) {
                objE5 = new er.l() { // from class: lq1.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.T(a3Var4, (String) obj);
                    }
                };
                rVar.v(objE5);
            }
            v0.g(new v50.c.Number("developerNavIconAnimatedTopStiffness", labelB7, null, labelB8, c2039b, null, null, (er.l) objE5, null, false, 0, null, false, null, false, null, null, null, null, false, 1031940, null), null, rVar, i28, 2);
            Label labelB9 = mx.b.b("Middle stiffness", "");
            Label labelB10 = mx.b.b(B(a3Var5), "");
            Object objE6 = rVar.E();
            if (objE6 == companion5.a()) {
                objE6 = new er.l() { // from class: lq1.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.U(a3Var5, (String) obj);
                    }
                };
                rVar.v(objE6);
            }
            v0.g(new v50.c.Number("developerNavIconAnimatedMiddleStiffness", labelB9, null, labelB10, c2039b, null, null, (er.l) objE6, null, false, 0, null, false, null, false, null, null, null, null, false, 1031940, null), null, rVar, i28, 2);
            Label labelB11 = mx.b.b("Bottom stiffness", "");
            Label labelB12 = mx.b.b(D(a3Var6), "");
            Object objE7 = rVar.E();
            if (objE7 == companion5.a()) {
                objE7 = new er.l() { // from class: lq1.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.V(a3Var6, (String) obj);
                    }
                };
                rVar.v(objE7);
            }
            v0.g(new v50.c.Number("developerNavIconAnimatedBottomStiffness", labelB11, null, labelB12, c2039b, null, null, (er.l) objE7, null, false, 0, null, false, null, false, null, null, null, null, false, 1031940, null), null, rVar, i28, 2);
            Label labelB13 = mx.b.b("Top dampingRatio", "");
            Label labelB14 = mx.b.b(G(a3Var7), "");
            Object objE8 = rVar.E();
            if (objE8 == companion5.a()) {
                objE8 = new er.l() { // from class: lq1.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.W(a3Var7, (String) obj);
                    }
                };
                rVar.v(objE8);
            }
            v0.g(new v50.c.Number("developerNavIconAnimatedTopDampingRatio", labelB13, null, labelB14, c2039b, null, null, (er.l) objE8, null, false, 0, null, false, null, false, null, null, null, null, false, 1031940, null), null, rVar, i28, 2);
            Label labelB15 = mx.b.b("Middle dampingRatio", "");
            Label labelB16 = mx.b.b(I(a3Var8), "");
            Object objE9 = rVar.E();
            if (objE9 == companion5.a()) {
                objE9 = new er.l() { // from class: lq1.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.X(a3Var8, (String) obj);
                    }
                };
                rVar.v(objE9);
            }
            v0.g(new v50.c.Number("developerNavIconAnimatedMiddleDampingRatio", labelB15, null, labelB16, c2039b, null, null, (er.l) objE9, null, false, 0, null, false, null, false, null, null, null, null, false, 1031940, null), null, rVar, i28, 2);
            Label labelB17 = mx.b.b("Bottom dampingRatio", "");
            Label labelB18 = mx.b.b(K(a3Var9), "");
            Object objE10 = rVar.E();
            if (objE10 == companion5.a()) {
                objE10 = new er.l() { // from class: lq1.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.Y(a3Var9, (String) obj);
                    }
                };
                rVar.v(objE10);
            }
            v0.g(new v50.c.Number("developerNavIconAnimatedBottomDampingRatio", labelB17, null, labelB18, c2039b, null, null, (er.l) objE10, null, false, 0, null, false, null, false, null, null, null, null, false, 1031940, null), null, rVar, i28, 2);
            r3.a(d.t(companion4, aVar2.b(rVar, i27).getSpacing200()), rVar, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(int i15, y2 y2Var, y2 y2Var2) {
        E(y2Var, i15);
        N(y2Var2, M(y2Var2) + 1);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(a3 a3Var, String str) throws IOException {
        StringBuilder sb5 = new StringBuilder();
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if (Character.isDigit(cCharAt)) {
                sb5.append(cCharAt);
            }
        }
        b0(a3Var, sb5.toString());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(a3 a3Var, String str) throws IOException {
        StringBuilder sb5 = new StringBuilder();
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if (Character.isDigit(cCharAt)) {
                sb5.append(cCharAt);
            }
        }
        d0(a3Var, sb5.toString());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(a3 a3Var, String str) throws IOException {
        StringBuilder sb5 = new StringBuilder();
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if (Character.isDigit(cCharAt)) {
                sb5.append(cCharAt);
            }
        }
        y(a3Var, sb5.toString());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(a3 a3Var, String str) {
        A(a3Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(a3 a3Var, String str) {
        C(a3Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(a3 a3Var, String str) {
        F(a3Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(a3 a3Var, String str) {
        H(a3Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(a3 a3Var, String str) {
        J(a3Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(a3 a3Var, String str) {
        L(a3Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(er.a aVar, int i15, r rVar, int i16) {
        v(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final String a0(a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void b0(a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    private static final String c0(a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void d0(a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x0137  */
    /* JADX WARN: Code duplicated, block: B:108:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0145  */
    /* JADX WARN: Code duplicated, block: B:115:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x015f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:120:0x016d  */
    /* JADX WARN: Code duplicated, block: B:123:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x017c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0183  */
    /* JADX WARN: Code duplicated, block: B:128:0x018d  */
    /* JADX WARN: Code duplicated, block: B:131:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x019f  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:154:0x0210  */
    /* JADX WARN: Code duplicated, block: B:155:0x0213  */
    /* JADX WARN: Code duplicated, block: B:158:0x021c  */
    /* JADX WARN: Code duplicated, block: B:159:0x021f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0228  */
    /* JADX WARN: Code duplicated, block: B:163:0x022b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0235  */
    /* JADX WARN: Code duplicated, block: B:167:0x0238  */
    /* JADX WARN: Code duplicated, block: B:170:0x023f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0242  */
    /* JADX WARN: Code duplicated, block: B:174:0x024b  */
    /* JADX WARN: Code duplicated, block: B:175:0x024e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0257  */
    /* JADX WARN: Code duplicated, block: B:179:0x025a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0262  */
    /* JADX WARN: Code duplicated, block: B:183:0x0265  */
    /* JADX WARN: Code duplicated, block: B:187:0x026f  */
    /* JADX WARN: Code duplicated, block: B:194:0x028f  */
    /* JADX WARN: Code duplicated, block: B:197:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:198:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:200:0x0302  */
    /* JADX WARN: Code duplicated, block: B:201:0x0305  */
    /* JADX WARN: Code duplicated, block: B:204:0x0312  */
    /* JADX WARN: Code duplicated, block: B:207:0x034b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0357  */
    /* JADX WARN: Code duplicated, block: B:211:0x035b  */
    /* JADX WARN: Code duplicated, block: B:216:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:221:0x0448  */
    /* JADX WARN: Code duplicated, block: B:226:0x049b  */
    /* JADX WARN: Code duplicated, block: B:229:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:231:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:234:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    private static final void q(m mVar, final boolean z15, int i15, final long j15, final long j16, final long j17, final float f15, final float f16, final float f17, final float f18, final float f19, final float f25, r rVar, final int i16, final int i17, final int i18) {
        m mVar2;
        int i19;
        int i25;
        int i26;
        boolean z16;
        r rVar2;
        final int i27;
        final m mVar3;
        d5 d5VarM;
        m mVar4;
        int i28;
        Object objE;
        r.Companion companion;
        u0.c cVar;
        Object objE2;
        final u0.c cVar2;
        Object objE3;
        u0.c cVar3;
        Object objE4;
        u0.c cVar4;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z35;
        boolean z36;
        boolean z37;
        Object objE5;
        u0.c cVar5;
        int i29;
        final u0.c cVar6;
        u0.c cVar7;
        final int iX0;
        final int iX1;
        final int iX2;
        final int iX3;
        float fFloatValue;
        float fFloatValue2;
        er.a<androidx.compose.ui.node.c> aVarB;
        final u0.c cVar8;
        boolean zC;
        Object objE6;
        boolean zC2;
        Object objE7;
        boolean zC3;
        Object objE8;
        float f26;
        float f27;
        float f28;
        float f29;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i45;
        int i46;
        int i47;
        int i48;
        r rVarH = rVar.h(2086683697);
        int i49 = i18 & 1;
        if (i49 != 0) {
            i19 = i16 | 6;
            mVar2 = mVar;
        } else if ((i16 & 6) == 0) {
            mVar2 = mVar;
            i19 = (rVarH.W(mVar2) ? 4 : 2) | i16;
        } else {
            mVar2 = mVar;
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= rVarH.a(z15) ? 32 : 16;
        }
        int i55 = i18 & 4;
        if (i55 == 0) {
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                i19 |= rVarH.c(i15) ? 256 : 128;
            }
            if ((i16 & 3072) == 0) {
                if (rVarH.d(j15)) {
                    i48 = 2048;
                } else {
                    i48 = 1024;
                }
                i19 |= i48;
            }
            if ((i16 & 24576) == 0) {
                if (rVarH.d(j16)) {
                    i47 = 16384;
                } else {
                    i47 = PKIFailureInfo.certRevoked;
                }
                i19 |= i47;
            }
            if ((i16 & 196608) == 0) {
                if (rVarH.d(j17)) {
                    i46 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i46 = PKIFailureInfo.notAuthorized;
                }
                i19 |= i46;
            }
            if ((i16 & 1572864) == 0) {
                if (rVarH.b(f15)) {
                    i45 = PKIFailureInfo.badCertTemplate;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i19 |= i45;
            }
            if ((i16 & 12582912) == 0) {
                if (rVarH.b(f16)) {
                    i39 = 8388608;
                } else {
                    i39 = 4194304;
                }
                i19 |= i39;
            }
            if ((i16 & 100663296) == 0) {
                if (rVarH.b(f17)) {
                    i38 = 67108864;
                } else {
                    i38 = 33554432;
                }
                i19 |= i38;
            }
            if ((i16 & 805306368) == 0) {
                if (rVarH.b(f18)) {
                    i37 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i37 = 268435456;
                }
                i19 |= i37;
            }
            if ((i17 & 6) == 0) {
                if (rVarH.b(f19)) {
                    i36 = 4;
                } else {
                    i36 = 2;
                }
                i25 = i17 | i36;
            } else {
                i25 = i17;
            }
            if ((i17 & 48) == 0) {
                if (rVarH.b(f25)) {
                    i35 = 32;
                } else {
                    i35 = 16;
                }
                i25 |= i35;
            }
            i26 = i25;
            if ((i19 & 306783379) == 306783378 || (i26 & 19) != 18) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i19 & 1)) {
                if (i49 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i55 != 0) {
                    i28 = 0;
                } else {
                    i28 = i15;
                }
                if (t.k()) {
                    t.o(2086683697, i19, i26, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.naviconanimated.CascadingMenuIcon (DeveloperNavIconAnimatedScreen.kt:273)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE != companion.a()) {
                    if (z15) {
                        f29 = 0.0f;
                    } else {
                        f29 = 1.0f;
                    }
                    objE = u0.d.b(f29, 0.0f, 2, null);
                    rVarH.v(objE);
                }
                cVar = (u0.c) objE;
                objE2 = rVarH.E();
                if (objE2 != companion.a()) {
                    if (z15) {
                        f28 = 1.0f;
                    } else {
                        f28 = 0.0f;
                    }
                    objE2 = u0.d.b(f28, 0.0f, 2, null);
                    rVarH.v(objE2);
                }
                cVar2 = (u0.c) objE2;
                objE3 = rVarH.E();
                if (objE3 != companion.a()) {
                    if (z15) {
                        f27 = 1.0f;
                    } else {
                        f27 = 0.0f;
                    }
                    objE3 = u0.d.b(f27, 0.0f, 2, null);
                    rVarH.v(objE3);
                }
                cVar3 = (u0.c) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    if (z15) {
                        f26 = 1.0f;
                    } else {
                        f26 = 0.0f;
                    }
                    objE4 = u0.d.b(f26, 0.0f, 2, null);
                    rVarH.v(objE4);
                }
                cVar4 = (u0.c) objE4;
                Boolean boolValueOf = Boolean.valueOf(z15);
                Integer numValueOf = Integer.valueOf(i28);
                if ((i19 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z38 = z17;
                if ((i19 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean zG = z38 | z18 | rVarH.G(cVar) | rVarH.G(cVar2) | rVarH.G(cVar3) | rVarH.G(cVar4);
                if ((i19 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z39 = z19 | zG;
                if ((1879048192 & i19) == 536870912) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z45 = z39 | z25;
                if ((3670016 & i19) == 1048576) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z46 = z45 | z26;
                if ((57344 & i19) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z47 = z46 | z27;
                if ((i26 & 14) == 4) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z48 = z47 | z28;
                if ((29360128 & i19) == 8388608) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                boolean z49 = z48 | z29;
                if ((458752 & i19) == 131072) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z55 = z49 | z35;
                if ((i26 & 112) == 32) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = z55 | z36 | ((234881024 & i19) == 67108864);
                objE5 = rVarH.E();
                if (!z37 || objE5 == companion.a()) {
                    cVar5 = cVar;
                    i29 = i28;
                    a aVar = new a(z15, i29, cVar5, cVar2, cVar3, cVar4, j15, f18, f15, j16, f19, f16, j17, f25, f17, null);
                    cVar6 = cVar3;
                    cVar7 = cVar4;
                    rVar2 = rVarH;
                    rVar2.v(aVar);
                    objE5 = aVar;
                } else {
                    cVar6 = cVar3;
                    cVar7 = cVar4;
                    rVar2 = rVarH;
                    i29 = i28;
                    cVar5 = cVar;
                }
                p076m2.Function0.e(boolValueOf, numValueOf, (p) objE5, rVar2, (i19 >> 3) & 126);
                d40.i.f fVar = d40.i.f.f39709e;
                float dimension = fVar.getDimension();
                c5.d dVar = (c5.d) rVar2.N(g1.f());
                iX0 = dVar.X0(f119457a);
                iX1 = dVar.X0(f119458b);
                iX2 = dVar.X0(f119459c);
                iX3 = dVar.X0(dimension) + iX2;
                if (z15) {
                    fFloatValue = 1.0f;
                } else {
                    fFloatValue = ((Number) cVar2.m()).floatValue();
                }
                if (z15) {
                    fFloatValue2 = 1.0f;
                } else {
                    fFloatValue2 = ((Number) cVar6.m()).floatValue();
                }
                float fFloatValue3 = z15 ? 1.0f : ((Number) cVar7.m()).floatValue();
                m mVarB = f.b(mVar4);
                w0 w0VarI = d1.r.i(c.INSTANCE.m(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
                int i56 = i29;
                p076m2.e0 e0VarT = rVar2.t();
                m mVarE = j.e(rVar2, mVarB);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                u0.c cVar9 = cVar5;
                aVarB = companion2.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB);
                } else {
                    rVar2.u();
                }
                r rVarC = n6.c(rVar2);
                float f35 = fFloatValue;
                n6.i(rVarC, w0VarI, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                x xVar = x.f39368a;
                float f36 = fFloatValue2;
                d40.b.C0864b c0864b = new d40.b.C0864b(null, io1.a.f96033d, fVar, b.f119498a, null, null, 33, null);
                m.Companion companion3 = m.INSTANCE;
                m mVarA = k3.a.a(companion3, ((Number) cVar9.m()).floatValue());
                int i57 = d40.b.C0864b.f39687h;
                cVar8 = cVar7;
                float f37 = fFloatValue3;
                d40.h.f(mVarA, c0864b, false, rVar2, i57 << 3, 4);
                d40.b.C0864b c0864b2 = new d40.b.C0864b(null, io1.a.f96032c, d40.i.b.f39705e, null, null, null, 41, null);
                m mVarA2 = k3.a.a(companion3, f35);
                zC = rVar2.c(iX3) | rVar2.c(iX0) | rVar2.G(cVar2);
                objE6 = rVar2.E();
                if (zC || objE6 == companion.a()) {
                    objE6 = new er.l() { // from class: lq1.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Function0.s(iX3, iX0, cVar2, (c5.d) obj);
                        }
                    };
                    rVar2.v(objE6);
                }
                d40.h.f(d.v(o2.c(mVarA2, (er.l) objE6), f119460d, f119461e), c0864b2, false, rVar2, i57 << 3, 4);
                d40.b.C0864b c0864b3 = new d40.b.C0864b(null, io1.a.f96031b, d40.i.d.f39707e, null, null, null, 41, null);
                m mVarA3 = k3.a.a(companion3, f36);
                zC2 = rVar2.c(iX3) | rVar2.c(iX1) | rVar2.G(cVar6);
                objE7 = rVar2.E();
                if (zC2 || objE7 == companion.a()) {
                    objE7 = new er.l() { // from class: lq1.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Function0.t(iX3, iX1, cVar6, (c5.d) obj);
                        }
                    };
                    rVar2.v(objE7);
                }
                d40.h.f(d.v(o2.c(mVarA3, (er.l) objE7), f119462f, f119463g), c0864b3, false, rVar2, i57 << 3, 4);
                d40.b.C0864b c0864b4 = new d40.b.C0864b(null, io1.a.f96030a, d40.i.e.f39708e, null, null, null, 41, null);
                m mVarA4 = k3.a.a(companion3, f37);
                zC3 = rVar2.c(iX3) | rVar2.c(iX2) | rVar2.G(cVar8);
                objE8 = rVar2.E();
                if (zC3 || objE8 == companion.a()) {
                    objE8 = new er.l() { // from class: lq1.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Function0.u(iX3, iX2, cVar8, (c5.d) obj);
                        }
                    };
                    rVar2.v(objE8);
                }
                d40.h.f(d.v(o2.c(mVarA4, (er.l) objE8), f119464h, f119465i), c0864b4, false, rVar2, i57 << 3, 4);
                rVar2.x();
                if (t.k()) {
                    t.n();
                }
                i27 = i56;
                mVar3 = mVar4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                i27 = i15;
                mVar3 = mVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: lq1.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return Function0.r(mVar3, z15, i27, j15, j16, j17, f15, f16, f17, f18, f19, f25, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= MLKEMEngine.KyberPolyBytes;
        if ((i16 & 3072) == 0) {
            if (rVarH.d(j15)) {
                i48 = 2048;
            } else {
                i48 = 1024;
            }
            i19 |= i48;
        }
        if ((i16 & 24576) == 0) {
            if (rVarH.d(j16)) {
                i47 = 16384;
            } else {
                i47 = PKIFailureInfo.certRevoked;
            }
            i19 |= i47;
        }
        if ((i16 & 196608) == 0) {
            if (rVarH.d(j17)) {
                i46 = PKIFailureInfo.unsupportedVersion;
            } else {
                i46 = PKIFailureInfo.notAuthorized;
            }
            i19 |= i46;
        }
        if ((i16 & 1572864) == 0) {
            if (rVarH.b(f15)) {
                i45 = PKIFailureInfo.badCertTemplate;
            } else {
                i45 = PKIFailureInfo.signerNotTrusted;
            }
            i19 |= i45;
        }
        if ((i16 & 12582912) == 0) {
            if (rVarH.b(f16)) {
                i39 = 8388608;
            } else {
                i39 = 4194304;
            }
            i19 |= i39;
        }
        if ((i16 & 100663296) == 0) {
            if (rVarH.b(f17)) {
                i38 = 67108864;
            } else {
                i38 = 33554432;
            }
            i19 |= i38;
        }
        if ((i16 & 805306368) == 0) {
            if (rVarH.b(f18)) {
                i37 = PKIFailureInfo.duplicateCertReq;
            } else {
                i37 = 268435456;
            }
            i19 |= i37;
        }
        if ((i17 & 6) == 0) {
            if (rVarH.b(f19)) {
                i36 = 4;
            } else {
                i36 = 2;
            }
            i25 = i17 | i36;
        } else {
            i25 = i17;
        }
        if ((i17 & 48) == 0) {
            if (rVarH.b(f25)) {
                i35 = 32;
            } else {
                i35 = 16;
            }
            i25 |= i35;
        }
        i26 = i25;
        if ((i19 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (rVarH.r(z16, i19 & 1)) {
            if (i49 != 0) {
                mVar4 = m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i55 != 0) {
                i28 = 0;
            } else {
                i28 = i15;
            }
            if (t.k()) {
                t.o(2086683697, i19, i26, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.naviconanimated.CascadingMenuIcon (DeveloperNavIconAnimatedScreen.kt:273)");
            }
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE != companion.a()) {
                if (z15) {
                    f29 = 0.0f;
                } else {
                    f29 = 1.0f;
                }
                objE = u0.d.b(f29, 0.0f, 2, null);
                rVarH.v(objE);
            }
            cVar = (u0.c) objE;
            objE2 = rVarH.E();
            if (objE2 != companion.a()) {
                if (z15) {
                    f28 = 1.0f;
                } else {
                    f28 = 0.0f;
                }
                objE2 = u0.d.b(f28, 0.0f, 2, null);
                rVarH.v(objE2);
            }
            cVar2 = (u0.c) objE2;
            objE3 = rVarH.E();
            if (objE3 != companion.a()) {
                if (z15) {
                    f27 = 1.0f;
                } else {
                    f27 = 0.0f;
                }
                objE3 = u0.d.b(f27, 0.0f, 2, null);
                rVarH.v(objE3);
            }
            cVar3 = (u0.c) objE3;
            objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                if (z15) {
                    f26 = 1.0f;
                } else {
                    f26 = 0.0f;
                }
                objE4 = u0.d.b(f26, 0.0f, 2, null);
                rVarH.v(objE4);
            }
            cVar4 = (u0.c) objE4;
            Boolean boolValueOf2 = Boolean.valueOf(z15);
            Integer numValueOf2 = Integer.valueOf(i28);
            if ((i19 & 112) == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z310 = z17;
            if ((i19 & 896) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean zG2 = z310 | z18 | rVarH.G(cVar) | rVarH.G(cVar2) | rVarH.G(cVar3) | rVarH.G(cVar4);
            if ((i19 & 7168) == 2048) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z311 = z19 | zG2;
            if ((1879048192 & i19) == 536870912) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z410 = z311 | z25;
            if ((3670016 & i19) == 1048576) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z411 = z410 | z26;
            if ((57344 & i19) == 16384) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean z412 = z411 | z27;
            if ((i26 & 14) == 4) {
                z28 = true;
            } else {
                z28 = false;
            }
            boolean z413 = z412 | z28;
            if ((29360128 & i19) == 8388608) {
                z29 = true;
            } else {
                z29 = false;
            }
            boolean z414 = z413 | z29;
            if ((458752 & i19) == 131072) {
                z35 = true;
            } else {
                z35 = false;
            }
            boolean z56 = z414 | z35;
            if ((i26 & 112) == 32) {
                z36 = true;
            } else {
                z36 = false;
            }
            z37 = z56 | z36 | ((234881024 & i19) == 67108864);
            objE5 = rVarH.E();
            if (z37) {
                cVar5 = cVar;
                i29 = i28;
                a aVar2 = new a(z15, i29, cVar5, cVar2, cVar3, cVar4, j15, f18, f15, j16, f19, f16, j17, f25, f17, null);
                cVar6 = cVar3;
                cVar7 = cVar4;
                rVar2 = rVarH;
                rVar2.v(aVar2);
                objE5 = aVar2;
            } else {
                cVar5 = cVar;
                i29 = i28;
                a aVar3 = new a(z15, i29, cVar5, cVar2, cVar3, cVar4, j15, f18, f15, j16, f19, f16, j17, f25, f17, null);
                cVar6 = cVar3;
                cVar7 = cVar4;
                rVar2 = rVarH;
                rVar2.v(aVar3);
                objE5 = aVar3;
            }
            p076m2.Function0.e(boolValueOf2, numValueOf2, (p) objE5, rVar2, (i19 >> 3) & 126);
            d40.i.f fVar2 = d40.i.f.f39709e;
            float dimension2 = fVar2.getDimension();
            c5.d dVar2 = (c5.d) rVar2.N(g1.f());
            iX0 = dVar2.X0(f119457a);
            iX1 = dVar2.X0(f119458b);
            iX2 = dVar2.X0(f119459c);
            iX3 = dVar2.X0(dimension2) + iX2;
            if (z15) {
                fFloatValue = 1.0f;
            } else {
                fFloatValue = ((Number) cVar2.m()).floatValue();
            }
            if (z15) {
                fFloatValue2 = 1.0f;
            } else {
                fFloatValue2 = ((Number) cVar6.m()).floatValue();
            }
            if (z15) {
            }
            m mVarB2 = f.b(mVar4);
            w0 w0VarI2 = d1.r.i(c.INSTANCE.m(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            int i58 = i29;
            p076m2.e0 e0VarT2 = rVar2.t();
            m mVarE2 = j.e(rVar2, mVarB2);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            u0.c cVar10 = cVar5;
            aVarB = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            r rVarC2 = n6.c(rVar2);
            float f38 = fFloatValue;
            n6.i(rVarC2, w0VarI2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            x xVar2 = x.f39368a;
            float f39 = fFloatValue2;
            d40.b.C0864b c0864b5 = new d40.b.C0864b(null, io1.a.f96033d, fVar2, b.f119498a, null, null, 33, null);
            m.Companion companion5 = m.INSTANCE;
            m mVarA5 = k3.a.a(companion5, ((Number) cVar10.m()).floatValue());
            int i59 = d40.b.C0864b.f39687h;
            cVar8 = cVar7;
            float f310 = fFloatValue3;
            d40.h.f(mVarA5, c0864b5, false, rVar2, i59 << 3, 4);
            d40.b.C0864b c0864b6 = new d40.b.C0864b(null, io1.a.f96032c, d40.i.b.f39705e, null, null, null, 41, null);
            m mVarA6 = k3.a.a(companion5, f38);
            zC = rVar2.c(iX3) | rVar2.c(iX0) | rVar2.G(cVar2);
            objE6 = rVar2.E();
            if (zC) {
                objE6 = new er.l() { // from class: lq1.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.s(iX3, iX0, cVar2, (c5.d) obj);
                    }
                };
                rVar2.v(objE6);
            } else {
                objE6 = new er.l() { // from class: lq1.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.s(iX3, iX0, cVar2, (c5.d) obj);
                    }
                };
                rVar2.v(objE6);
            }
            d40.h.f(d.v(o2.c(mVarA6, (er.l) objE6), f119460d, f119461e), c0864b6, false, rVar2, i59 << 3, 4);
            d40.b.C0864b c0864b7 = new d40.b.C0864b(null, io1.a.f96031b, d40.i.d.f39707e, null, null, null, 41, null);
            m mVarA7 = k3.a.a(companion5, f39);
            zC2 = rVar2.c(iX3) | rVar2.c(iX1) | rVar2.G(cVar6);
            objE7 = rVar2.E();
            if (zC2) {
                objE7 = new er.l() { // from class: lq1.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.t(iX3, iX1, cVar6, (c5.d) obj);
                    }
                };
                rVar2.v(objE7);
            } else {
                objE7 = new er.l() { // from class: lq1.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.t(iX3, iX1, cVar6, (c5.d) obj);
                    }
                };
                rVar2.v(objE7);
            }
            d40.h.f(d.v(o2.c(mVarA7, (er.l) objE7), f119462f, f119463g), c0864b7, false, rVar2, i59 << 3, 4);
            d40.b.C0864b c0864b8 = new d40.b.C0864b(null, io1.a.f96030a, d40.i.e.f39708e, null, null, null, 41, null);
            m mVarA8 = k3.a.a(companion5, f310);
            zC3 = rVar2.c(iX3) | rVar2.c(iX2) | rVar2.G(cVar8);
            objE8 = rVar2.E();
            if (zC3) {
                objE8 = new er.l() { // from class: lq1.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.u(iX3, iX2, cVar8, (c5.d) obj);
                    }
                };
                rVar2.v(objE8);
            } else {
                objE8 = new er.l() { // from class: lq1.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.u(iX3, iX2, cVar8, (c5.d) obj);
                    }
                };
                rVar2.v(objE8);
            }
            d40.h.f(d.v(o2.c(mVarA8, (er.l) objE8), f119464h, f119465i), c0864b8, false, rVar2, i59 << 3, 4);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
            i27 = i58;
            mVar3 = mVar4;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            i27 = i15;
            mVar3 = mVar2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: lq1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.r(mVar3, z15, i27, j15, j16, j17, f15, f16, f17, f18, f19, f25, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(m mVar, boolean z15, int i15, long j15, long j16, long j17, float f15, float f16, float f17, float f18, float f19, float f25, int i16, int i17, int i18, r rVar, int i19) {
        q(mVar, z15, i15, j15, j16, j17, f15, f16, f17, f18, f19, f25, rVar, g4.a(i16 | 1), g4.a(i17), i18);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n s(int i15, int i16, u0.c cVar, c5.d dVar) {
        return n.c(n.d((((long) 0) << 32) | (((long) hr.a.d(i15 + ((i16 - i15) * ((Number) cVar.m()).floatValue()))) & BodyPartID.bodyIdMax)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n t(int i15, int i16, u0.c cVar, c5.d dVar) {
        return n.c(n.d((((long) 0) << 32) | (((long) hr.a.d(i15 + ((i16 - i15) * ((Number) cVar.m()).floatValue()))) & BodyPartID.bodyIdMax)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n u(int i15, int i16, u0.c cVar, c5.d dVar) {
        return n.c(n.d((((long) 0) << 32) | (((long) hr.a.d(i15 + ((i16 - i15) * ((Number) cVar.m()).floatValue()))) & BodyPartID.bodyIdMax)));
    }

    public static final void v(final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-925122249);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-925122249, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.naviconanimated.DeveloperNavIconAnimatedScreen (DeveloperNavIconAnimatedScreen.kt:68)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = m5.a(0);
                rVarH.v(objE);
            }
            final y2 y2Var = (y2) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = c6.e(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1, null, 2, null);
                rVarH.v(objE2);
            }
            final a3 a3Var = (a3) objE2;
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = c6.e("100", null, 2, null);
                rVarH.v(objE3);
            }
            final a3 a3Var2 = (a3) objE3;
            Object objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = c6.e("200", null, 2, null);
                rVarH.v(objE4);
            }
            final a3 a3Var3 = (a3) objE4;
            Object objE5 = rVarH.E();
            if (objE5 == companion.a()) {
                objE5 = c6.e("400.0", null, 2, null);
                rVarH.v(objE5);
            }
            final a3 a3Var4 = (a3) objE5;
            Object objE6 = rVarH.E();
            if (objE6 == companion.a()) {
                objE6 = c6.e("400.0", null, 2, null);
                rVarH.v(objE6);
            }
            final a3 a3Var5 = (a3) objE6;
            Object objE7 = rVarH.E();
            if (objE7 == companion.a()) {
                objE7 = c6.e("400.0", null, 2, null);
                rVarH.v(objE7);
            }
            final a3 a3Var6 = (a3) objE7;
            Object objE8 = rVarH.E();
            if (objE8 == companion.a()) {
                objE8 = c6.e("0.75", null, 2, null);
                rVarH.v(objE8);
            }
            final a3 a3Var7 = (a3) objE8;
            Object objE9 = rVarH.E();
            if (objE9 == companion.a()) {
                objE9 = c6.e("0.75", null, 2, null);
                rVarH.v(objE9);
            }
            final a3 a3Var8 = (a3) objE9;
            Object objE10 = rVarH.E();
            if (objE10 == companion.a()) {
                objE10 = c6.e("0.75", null, 2, null);
                rVarH.v(objE10);
            }
            final a3 a3Var9 = (a3) objE10;
            Object objE11 = rVarH.E();
            if (objE11 == companion.a()) {
                objE11 = b1.k.a();
                rVarH.v(objE11);
            }
            final l lVar = (l) objE11;
            Object objE12 = rVarH.E();
            if (objE12 == companion.a()) {
                objE12 = m5.a(0);
                rVarH.v(objE12);
            }
            final y2 y2Var2 = (y2) objE12;
            rVar2 = rVarH;
            i50.s.r(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), aVar), mx.b.b("Animated Navigation Icon (PoC)", ""), null, null, null, 28, null), null, null, null, null, 61, null), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1646563868, true, new q() { // from class: lq1.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return Function0.O(lVar, y2Var, y2Var2, a3Var, a3Var2, a3Var3, a3Var4, a3Var5, a3Var6, a3Var7, a3Var8, a3Var9, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: lq1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.Z(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final int w(y2 y2Var) {
        return y2Var.d();
    }

    private static final String x(a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void y(a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    private static final String z(a3<String> a3Var) {
        return a3Var.getValue();
    }
}
