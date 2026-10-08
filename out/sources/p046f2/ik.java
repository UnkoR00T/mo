package p046f2;

import a4.k0;
import a4.w;
import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.g1;
import c3.SnapshotStateList;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import d1.a3;
import d1.r3;
import d1.x;
import er.l;
import er.p;
import f3.j;
import fr.n0;
import fr.q;
import fr.t;
import h2.o;
import java.util.List;
import ju.p0;
import ju.q0;
import l2.z0;
import lr.m;
import m3.e;
import mu.h;
import n4.v;
import oq.g;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.f0;
import p036e4.q1;
import p036e4.v0;
import p036e4.w0;
import p036e4.w2;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.x5;
import p143z0.Function1;
import p143z0.b2;
import p143z0.b3;
import pq.n;
import vq.k;
import w0.d1;
import w0.n1;
import w0.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\u001a«\u0001\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001ak\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aW\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001au\u0010\"\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#\u001a?\u0010&\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u0007H\u0003¢\u0006\u0004\b&\u0010'\u001a/\u0010-\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0002¢\u0006\u0004\b-\u0010.\u001a\u0017\u0010/\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b/\u00100\u001a7\u00106\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000H\u0002¢\u0006\u0004\b6\u00107\u001a'\u0010;\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0000H\u0002¢\u0006\u0004\b;\u0010<\u001a#\u0010=\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b=\u0010>\u001a\u0013\u0010@\u001a\u00020?*\u00020\u0000H\u0002¢\u0006\u0004\b@\u0010A\u001a+\u0010B\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\bB\u0010C\"\u001a\u0010H\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010E\u001a\u0004\bF\u0010G\"\u001a\u0010J\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010E\u001a\u0004\bI\u0010G\"\u0014\u0010L\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010E\"\u0014\u0010N\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010@\"\u0014\u0010P\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010@\"\u0014\u0010R\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010E\"\u0014\u0010T\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010E\"\u001a\u0010Z\u001a\u00020U8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0014\u0010\\\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010E¨\u0006]"}, d2 = {"", "value", "Lkotlin/Function1;", "Loq/i0;", "onValueChange", "Lf3/m;", "modifier", "", "enabled", "Lkotlin/Function0;", "onValueChangeFinished", "Lf2/mj;", "colors", "Lb1/l;", "interactionSource", "", "steps", "Lf2/mk;", "thumb", "track", "Llr/e;", "valueRange", "m", "(FLer/l;Lf3/m;ZLer/a;Lf2/mj;Lb1/l;ILer/q;Ler/q;Llr/e;Lm2/r;III)V", "state", "n", "(Lf2/mk;Lf3/m;ZLf2/mj;Lb1/l;Ler/q;Ler/q;Lm2/r;II)V", "u", "(Lf3/m;Lf2/mk;ZLb1/l;Ler/q;Ler/q;Lm2/r;I)V", "reverseDirection", "onValueChangeState", "onValueChangeFinishedState", "isRtl", "isVertical", "N", "(Lf3/m;ZILlr/e;FZLer/l;Ler/a;ZZ)Lf3/m;", "Lc5/k;", "thumbSize", "y", "(Lb1/l;Lf3/m;Lf2/mj;ZJZLm2/r;I)V", "current", "", "tickFractions", "minPx", "maxPx", ip.a.f96137b, "(F[FFF)F", "T", "(I)[F", "a1", "b1", "x1", "a2", "b2", "M", "(FFFFF)F", "a", "b", "pos", "I", "(FFF)F", "O", "(Lf3/m;Lf2/mk;Z)Lf3/m;", "", "J", "(F)Ljava/lang/String;", "R", "(Lf3/m;Lf2/mk;Lb1/l;Z)Lf3/m;", "Lc5/h;", "F", i.f37094u, "()F", "TrackHeight", "getThumbWidth", "ThumbWidth", "c", "ThumbHeight", "d", "ThumbSize", "e", "VerticalThumbSize", "f", "ThumbTrackGapSize", "g", "TrackInsideCornerSize", "Le4/w2;", "h", "Le4/w2;", "K", "()Le4/w2;", "CornerSizeAlignmentLine", "i", "insetFocusRingPadding", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f56342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f56343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f56344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f56345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f56346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f56347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f56348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final w2 f56349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f56350i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f56351j = new a();

        a() {
            super(2, hr.a.class, "min", "min(II)I", 1);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Integer B(Integer num, Integer num2) {
            return E(num.intValue(), num2.intValue());
        }

        public final Integer E(int i15, int i16) {
            return Integer.valueOf(Math.min(i15, i16));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mk f56352a;

        b(mk mkVar) {
            this.f56352a = mkVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(a2 a2Var, int i15, int i16, a2 a2Var2, int i17, n0 n0Var, a2.a aVar) {
            a2.a.I(aVar, a2Var, i15, i16, 0.0f, 4, null);
            a2.a.I(aVar, a2Var2, i17, n0Var.f66407a, 0.0f, 4, null);
            return i0.f148189a;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            int width;
            int iMax;
            int width2;
            int height;
            int iD;
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                v0 v0Var = list.get(i15);
                if (f0.a(v0Var) == nj.THUMB) {
                    long j16 = j15;
                    final a2 a2VarO0 = v0Var.o0(j16);
                    int size2 = list.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        v0 v0Var2 = list.get(i16);
                        if (f0.a(v0Var2) == nj.TRACK) {
                            p143z0.a2 a2VarM = this.f56352a.m();
                            p143z0.a2 a2Var = p143z0.a2.Vertical;
                            final a2 a2VarO1 = a2VarM == a2Var ? v0Var2.o0(c5.b.d(c5.c.j(j16, 0, -a2VarO0.getHeight(), 1, null), 0, 0, 0, 0, 14, null)) : v0Var2.o0(c5.b.d(c5.c.j(j15, -a2VarO0.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                            final n0 n0Var = new n0();
                            float fI = this.f56352a.i();
                            boolean z15 = t.a(fI, n.o0(this.f56352a.t())) || t.a(fI, n.R0(this.f56352a.t()));
                            int I = a2VarO1.I(ik.K());
                            int i17 = I != Integer.MIN_VALUE ? I : 0;
                            if (this.f56352a.m() == a2Var) {
                                width = Math.max(a2VarO1.getWidth(), a2VarO0.getWidth());
                                iMax = a2VarO0.getHeight() + a2VarO1.getHeight();
                                width2 = (width - a2VarO1.getWidth()) / 2;
                                height = a2VarO0.getHeight() / 2;
                                iD = (width - a2VarO0.getWidth()) / 2;
                                n0Var.f66407a = (this.f56352a.q() <= 0 || z15) ? hr.a.d(a2VarO1.getHeight() * fI) : hr.a.d((a2VarO1.getHeight() - (i17 * 2)) * fI) + i17;
                                if (this.f56352a.p()) {
                                    n0Var.f66407a = a2VarO1.getHeight() - n0Var.f66407a;
                                }
                            } else {
                                width = a2VarO0.getWidth() + a2VarO1.getWidth();
                                iMax = Math.max(a2VarO1.getHeight(), a2VarO0.getHeight());
                                width2 = a2VarO0.getWidth() / 2;
                                height = (iMax - a2VarO1.getHeight()) / 2;
                                iD = (this.f56352a.q() <= 0 || z15) ? hr.a.d(a2VarO1.getWidth() * fI) : hr.a.d((a2VarO1.getWidth() - (i17 * 2)) * fI) + i17;
                                n0Var.f66407a = (iMax - a2VarO0.getHeight()) / 2;
                            }
                            int i18 = width;
                            final int i19 = iD;
                            final int i25 = height;
                            final int i26 = width2;
                            this.f56352a.Q(i18, iMax);
                            return y0.j2(y0Var, i18, iMax, null, new l() { // from class: f2.jk
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return ik.b.b(a2VarO1, i26, i25, a2VarO0, i19, n0Var, (a2.a) obj);
                                }
                            }, 4, null);
                        }
                        i16++;
                        j16 = j15;
                    }
                    e5.b.f("Collection contains no element matching the predicate.");
                    throw new g();
                }
            }
            e5.b.f("Collection contains no element matching the predicate.");
            throw new g();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "", "it", "Loq/i0;", "<anonymous>", "(Lju/p0;F)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements er.q<p0, Float, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ mk f56354f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(mk mkVar, tq.e<? super c> eVar) {
            super(3, eVar);
            this.f56354f = mkVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f56353e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            this.f56354f.j().a();
            return i0.f148189a;
        }

        public final Object M(p0 p0Var, float f15, tq.e<? super i0> eVar) {
            return new c(this.f56354f, eVar).J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(p0 p0Var, Float f15, tq.e<? super i0> eVar) {
            return M(p0Var, f15.floatValue(), eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b1.l f56356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<b1.i> f56357g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<b1.i> f56358a;

            a(SnapshotStateList<b1.i> snapshotStateList) {
                this.f56358a = snapshotStateList;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(b1.i iVar, tq.e<? super i0> eVar) {
                if (iVar instanceof b1.d) {
                    this.f56358a.add(iVar);
                } else if (iVar instanceof b1.e) {
                    this.f56358a.remove(((b1.e) iVar).getFocus());
                } else if (iVar instanceof b1.n.b) {
                    this.f56358a.add(iVar);
                } else if (iVar instanceof b1.n.c) {
                    this.f56358a.remove(((b1.n.c) iVar).getPress());
                } else if (iVar instanceof b1.n.a) {
                    this.f56358a.remove(((b1.n.a) iVar).getPress());
                } else if (iVar instanceof b1.b) {
                    this.f56358a.add(iVar);
                } else if (iVar instanceof b1.c) {
                    this.f56358a.remove(((b1.c) iVar).getStart());
                } else if (iVar instanceof b1.a) {
                    this.f56358a.remove(((b1.a) iVar).getStart());
                }
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b1.l lVar, SnapshotStateList<b1.i> snapshotStateList, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f56356f = lVar;
            this.f56357g = snapshotStateList;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56355e;
            if (i15 == 0) {
                u.b(obj);
                mu.g<b1.i> gVarC = this.f56356f.c();
                a aVar = new a(this.f56357g);
                this.f56355e = 1;
                if (gVarC.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
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
            return new d(this.f56356f, this.f56357g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f56359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lr.e<Float> f56360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f56361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f56362d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<Float, i0> f56363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f56364f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f56365g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f56366h;

        /* JADX WARN: Multi-variable type inference failed */
        e(boolean z15, lr.e<Float> eVar, int i15, boolean z16, l<? super Float, i0> lVar, boolean z17, float f15, er.a<i0> aVar) {
            this.f56359a = z15;
            this.f56360b = eVar;
            this.f56361c = i15;
            this.f56362d = z16;
            this.f56363e = lVar;
            this.f56364f = z17;
            this.f56365g = f15;
            this.f56366h = aVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Boolean c(KeyEvent keyEvent) {
            if (!this.f56359a) {
                return Boolean.FALSE;
            }
            int iB = y3.d.b(keyEvent);
            y3.c.Companion companion = y3.c.INSTANCE;
            if (!y3.c.e(iB, companion.a())) {
                if (!y3.c.e(iB, companion.b())) {
                    return Boolean.FALSE;
                }
                if (this.f56364f) {
                    long jA = y3.d.a(keyEvent);
                    y3.a.Companion companion2 = y3.a.INSTANCE;
                    if (!y3.a.R(jA, companion2.m()) && !y3.a.R(jA, companion2.j()) && !y3.a.R(jA, companion2.s()) && !y3.a.R(jA, companion2.r()) && !y3.a.R(jA, companion2.G()) && !y3.a.R(jA, companion2.F())) {
                        return Boolean.FALSE;
                    }
                    er.a<i0> aVar = this.f56366h;
                    if (aVar != null) {
                        aVar.a();
                    }
                    return Boolean.TRUE;
                }
                long jA2 = y3.d.a(keyEvent);
                y3.a.Companion companion3 = y3.a.INSTANCE;
                if (!y3.a.R(jA2, companion3.l()) && !y3.a.R(jA2, companion3.k()) && !y3.a.R(jA2, companion3.s()) && !y3.a.R(jA2, companion3.r()) && !y3.a.R(jA2, companion3.G()) && !y3.a.R(jA2, companion3.F())) {
                    return Boolean.FALSE;
                }
                er.a<i0> aVar2 = this.f56366h;
                if (aVar2 != null) {
                    aVar2.a();
                }
                return Boolean.TRUE;
            }
            float fAbs = Math.abs(this.f56360b.h().floatValue() - this.f56360b.e().floatValue());
            int i15 = this.f56361c;
            int i16 = i15 > 0 ? i15 + 1 : 100;
            float f15 = fAbs / i16;
            int i17 = this.f56362d ? -1 : 1;
            long jA3 = y3.d.a(keyEvent);
            y3.a.Companion companion4 = y3.a.INSTANCE;
            if (y3.a.R(jA3, companion4.s())) {
                this.f56363e.b(this.f56360b.e());
                return Boolean.TRUE;
            }
            if (y3.a.R(y3.d.a(keyEvent), companion4.r())) {
                this.f56363e.b(this.f56360b.h());
                return Boolean.TRUE;
            }
            if (this.f56364f) {
                long jA4 = y3.d.a(keyEvent);
                if (y3.a.R(jA4, companion4.m())) {
                    this.f56363e.b((Float) m.q(Float.valueOf(this.f56365g - (i17 * f15)), this.f56360b));
                    return Boolean.TRUE;
                }
                if (y3.a.R(jA4, companion4.j())) {
                    this.f56363e.b((Float) m.q(Float.valueOf(this.f56365g + (i17 * f15)), this.f56360b));
                    return Boolean.TRUE;
                }
                if (y3.a.R(jA4, companion4.G())) {
                    this.f56363e.b((Float) m.q(Float.valueOf(this.f56365g - ((m.n(i16 / 10, 1, 10) * i17) * f15)), this.f56360b));
                    return Boolean.TRUE;
                }
                if (!y3.a.R(jA4, companion4.F())) {
                    return Boolean.FALSE;
                }
                this.f56363e.b((Float) m.q(Float.valueOf(this.f56365g + (m.n(i16 / 10, 1, 10) * i17 * f15)), this.f56360b));
                return Boolean.TRUE;
            }
            long jA5 = y3.d.a(keyEvent);
            if (y3.a.R(jA5, companion4.l())) {
                this.f56363e.b((Float) m.q(Float.valueOf(this.f56365g + (i17 * f15)), this.f56360b));
                return Boolean.TRUE;
            }
            if (y3.a.R(jA5, companion4.k())) {
                this.f56363e.b((Float) m.q(Float.valueOf(this.f56365g - (i17 * f15)), this.f56360b));
                return Boolean.TRUE;
            }
            if (y3.a.R(jA5, companion4.G())) {
                this.f56363e.b((Float) m.q(Float.valueOf(this.f56365g + (m.n(i16 / 10, 1, 10) * f15)), this.f56360b));
                return Boolean.TRUE;
            }
            if (!y3.a.R(jA5, companion4.F())) {
                return Boolean.FALSE;
            }
            this.f56363e.b((Float) m.q(Float.valueOf(this.f56365g - (m.n(i16 / 10, 1, 10) * f15)), this.f56360b));
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b1.l f56367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ mk f56368b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends k implements p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f56369e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k0 f56370f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ b1.l f56371g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ mk f56372h;

            /* JADX INFO: renamed from: f2.ik$f$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz0/b2;", "Lm3/e;", "offset", "Loq/i0;", "<anonymous>", "(Lz0/b2;Lm3/e;)V"}, k = 3, mv = {2, 1, 0})
            static final class C1304a extends k implements er.q<b2, m3.e, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f56373e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private /* synthetic */ Object f56374f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                /* synthetic */ long f56375g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ b1.l f56376h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ mk f56377j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1304a(b1.l lVar, mk mkVar, tq.e<? super C1304a> eVar) {
                    super(3, eVar);
                    this.f56376h = lVar;
                    this.f56377j = mkVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v12 */
                /* JADX WARN: Type inference failed for: r1v9, types: [b1.n$b] */
                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Throwable th4;
                    Object objE = uq.b.e();
                    b1.n.b bVar = this.f56373e;
                    try {
                        if (bVar != 0) {
                            if (bVar == 1) {
                                b1.n.b bVar2 = (b1.n.b) this.f56374f;
                                u.b(obj);
                                bVar = bVar2;
                            } else {
                                if (bVar != 2) {
                                    if (bVar != 3) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    th4 = (Throwable) this.f56374f;
                                    u.b(obj);
                                    throw th4;
                                }
                                u.b(obj);
                            }
                            return i0.f148189a;
                        }
                        u.b(obj);
                        b2 b2Var = (b2) this.f56374f;
                        long j15 = this.f56375g;
                        b1.n.b bVar3 = new b1.n.b(j15, null);
                        try {
                            this.f56376h.b(bVar3);
                            this.f56377j.B(j15);
                            this.f56374f = bVar3;
                            this.f56373e = 1;
                            obj = b2Var.L1(this);
                            if (obj != objE) {
                                bVar = bVar3;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bVar = bVar3;
                            if (bVar == 0) {
                                throw th;
                            }
                            b1.l lVar = this.f56376h;
                            b1.n.a aVar = new b1.n.a(bVar);
                            this.f56374f = th;
                            this.f56373e = 3;
                            if (lVar.a(aVar, this) != objE) {
                                th4 = th;
                                throw th4;
                            }
                        }
                        return objE;
                        this.f56376h.b(((Boolean) obj).booleanValue() ? new b1.n.c(bVar) : new b1.n.a(bVar));
                        return i0.f148189a;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }

                public final Object M(b2 b2Var, long j15, tq.e<? super i0> eVar) {
                    C1304a c1304a = new C1304a(this.f56376h, this.f56377j, eVar);
                    c1304a.f56374f = b2Var;
                    c1304a.f56375g = j15;
                    return c1304a.J(i0.f148189a);
                }

                @Override // er.q
                public /* bridge */ /* synthetic */ Object w(b2 b2Var, m3.e eVar, tq.e<? super i0> eVar2) {
                    return M(b2Var, eVar.getPackedValue(), eVar2);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k0 k0Var, b1.l lVar, mk mkVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f56370f = k0Var;
                this.f56371g = lVar;
                this.f56372h = mkVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 O(mk mkVar, m3.e eVar) {
                mkVar.g(0.0f);
                mkVar.j().a();
                return i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f56369e;
                if (i15 == 0) {
                    u.b(obj);
                    k0 k0Var = this.f56370f;
                    C1304a c1304a = new C1304a(this.f56371g, this.f56372h, null);
                    final mk mkVar = this.f56372h;
                    l lVar = new l() { // from class: f2.kk
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return ik.f.a.O(mkVar, (e) obj2);
                        }
                    };
                    this.f56369e = 1;
                    if (b3.i(k0Var, null, null, c1304a, lVar, this, 3, null) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f56370f, this.f56371g, this.f56372h, eVar);
            }
        }

        f(b1.l lVar, mk mkVar) {
            this.f56367a = lVar;
            this.f56368b = mkVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            Object objE = q0.e(new a(k0Var, this.f56367a, this.f56368b, null), eVar);
            return objE == uq.b.e() ? objE : i0.f148189a;
        }
    }

    static {
        z0 z0Var = z0.f115398a;
        f56342a = z0Var.n();
        float fL = z0Var.l();
        f56343b = fL;
        float fJ = z0Var.j();
        f56344c = fJ;
        f56345d = c5.i.a(fL, fJ);
        f56346e = c5.i.a(fJ, fL);
        f56347f = z0Var.a();
        f56348g = c5.h.n(2);
        f56349h = new w2(a.f56351j);
        f56350i = c5.h.n(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float I(float f15, float f16, float f17) {
        float f18 = f16 - f15;
        return m.m(f18 == 0.0f ? 0.0f : (f17 - f15) / f18, 0.0f, 1.0f);
    }

    private static final String J(float f15) {
        return String.valueOf(hr.a.d(f15 * 100) / 100.0f);
    }

    public static final w2 K() {
        return f56349h;
    }

    public static final float L() {
        return f56342a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float M(float f15, float f16, float f17, float f18, float f19) {
        return e5.c.b(f18, f19, I(f15, f16, f17));
    }

    private static final f3.m N(f3.m mVar, boolean z15, int i15, lr.e<Float> eVar, float f15, boolean z16, l<? super Float, i0> lVar, er.a<i0> aVar, boolean z17, boolean z18) {
        if (i15 >= 0) {
            return y3.f.a(mVar, new e(z15, eVar, i15, z16, lVar, z18, f15, aVar));
        }
        throw new IllegalArgumentException("steps should be >= 0");
    }

    private static final f3.m O(f3.m mVar, final mk mkVar, final boolean z15) {
        return q2.d(v.d(mVar, false, new l() { // from class: f2.xj
            @Override // er.l
            public final Object b(Object obj) {
                return ik.P(z15, mkVar, (n4.i0) obj);
            }
        }, 1, null).u(mkVar.m() == p143z0.a2.Vertical ? o.n() : o.m()), mkVar.w(), m.b(mkVar.x().e().floatValue(), mkVar.x().h().floatValue()), mkVar.q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(boolean z15, final mk mkVar, n4.i0 i0Var) {
        if (!z15) {
            n4.f0.j(i0Var);
        }
        n4.f0.x0(i0Var, J(mkVar.w()));
        n4.f0.p0(i0Var, null, new l() { // from class: f2.yj
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(ik.Q(mkVar, ((Float) obj).floatValue()));
            }
        }, 1, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q(mk mkVar, float f15) {
        int iQ;
        float fM = m.m(f15, mkVar.x().e().floatValue(), mkVar.x().h().floatValue());
        if (mkVar.q() > 0 && (iQ = mkVar.q() + 1) >= 0) {
            float fAbs = fM;
            float f16 = fAbs;
            int i15 = 0;
            while (true) {
                float fB = e5.c.b(mkVar.x().e().floatValue(), mkVar.x().h().floatValue(), i15 / (mkVar.q() + 1));
                float f17 = fB - fM;
                if (Math.abs(f17) <= fAbs) {
                    fAbs = Math.abs(f17);
                    f16 = fB;
                }
                if (i15 == iQ) {
                    break;
                }
                i15++;
            }
            fM = f16;
        }
        if (fM == mkVar.w()) {
            return false;
        }
        if (fM != mkVar.w()) {
            if (mkVar.k() != null) {
                l<Float, i0> lVarK = mkVar.k();
                if (lVarK != null) {
                    lVarK.b(Float.valueOf(fM));
                }
            } else {
                mkVar.O(fM);
            }
        }
        er.a<i0> aVarL = mkVar.l();
        if (aVarL != null) {
            aVarL.a();
        }
        return true;
    }

    private static final f3.m R(f3.m mVar, mk mkVar, b1.l lVar, boolean z15) {
        return z15 ? a4.w0.d(mVar, mkVar, lVar, new f(lVar, mkVar)) : mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float S(float f15, float[] fArr, float f16, float f17) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f18 = fArr[0];
            int iS0 = n.s0(fArr);
            if (iS0 == 0) {
                fValueOf = Float.valueOf(f18);
            } else {
                float fAbs = Math.abs(e5.c.b(f16, f17, f18) - f15);
                int i15 = 1;
                if (1 <= iS0) {
                    while (true) {
                        float f19 = fArr[i15];
                        float fAbs2 = Math.abs(e5.c.b(f16, f17, f19) - f15);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f18 = f19;
                            fAbs = fAbs2;
                        }
                        if (i15 == iS0) {
                            break;
                        }
                        i15++;
                    }
                }
                fValueOf = Float.valueOf(f18);
            }
        }
        return fValueOf != null ? e5.c.b(f16, f17, fValueOf.floatValue()) : f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] T(int i15) {
        if (i15 == 0) {
            return new float[0];
        }
        int i16 = i15 + 2;
        float[] fArr = new float[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            fArr[i17] = i17 / (i15 + 1);
        }
        return fArr;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011a  */
    /* JADX WARN: Code duplicated, block: B:101:0x011d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0125  */
    /* JADX WARN: Code duplicated, block: B:107:0x0129  */
    /* JADX WARN: Code duplicated, block: B:110:0x0134 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x013b  */
    /* JADX WARN: Code duplicated, block: B:116:0x014e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0157  */
    /* JADX WARN: Code duplicated, block: B:123:0x0160  */
    /* JADX WARN: Code duplicated, block: B:125:0x016b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x0195  */
    /* JADX WARN: Code duplicated, block: B:138:0x019a  */
    /* JADX WARN: Code duplicated, block: B:140:0x019d  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:161:0x0200  */
    /* JADX WARN: Code duplicated, block: B:163:0x0210  */
    /* JADX WARN: Code duplicated, block: B:166:0x021e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0229  */
    /* JADX WARN: Code duplicated, block: B:170:0x0232  */
    /* JADX WARN: Code duplicated, block: B:171:0x0234  */
    /* JADX WARN: Code duplicated, block: B:174:0x023f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0245  */
    /* JADX WARN: Code duplicated, block: B:181:0x0253  */
    /* JADX WARN: Code duplicated, block: B:183:0x025b  */
    /* JADX WARN: Code duplicated, block: B:186:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:188:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:191:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x010c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110  */
    public static final void m(final float f15, final l<? super Float, i0> lVar, f3.m mVar, boolean z15, er.a<i0> aVar, mj mjVar, b1.l lVar2, int i15, er.q<? super mk, ? super r, ? super Integer, i0> qVar, er.q<? super mk, ? super r, ? super Integer, i0> qVar2, lr.e<Float> eVar, r rVar, final int i16, final int i17, final int i18) {
        int i19;
        f3.m mVar2;
        int i25;
        final boolean z16;
        int i26;
        int i27;
        er.a<i0> aVar2;
        int i28;
        final mj mjVarR;
        int i29;
        final b1.l lVar3;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i45;
        int i46;
        int i47;
        int i48;
        boolean z17;
        int i49;
        final er.q<? super mk, ? super r, ? super Integer, i0> qVar3;
        final lr.e<Float> eVar2;
        final boolean z18;
        final er.q<? super mk, ? super r, ? super Integer, i0> qVar4;
        final b1.l lVar4;
        final er.a<i0> aVar3;
        final mj mjVar2;
        d5 d5VarM;
        int i55;
        int i56;
        er.q<? super mk, ? super r, ? super Integer, i0> qVarD;
        er.q<? super mk, ? super r, ? super Integer, i0> qVarD2;
        lr.e<Float> eVarB;
        int i57;
        int i58;
        er.q<? super mk, ? super r, ? super Integer, i0> qVar5;
        Object objE;
        boolean z19;
        boolean z25;
        Object objE2;
        int i59;
        r rVarH = rVar.h(985901935);
        if ((i16 & 6) == 0) {
            i19 = (rVarH.b(f15) ? 4 : 2) | i16;
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= rVarH.G(lVar) ? 32 : 16;
        }
        int i65 = i18 & 4;
        if (i65 == 0) {
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i19 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i25 = i18 & 8;
            if (i25 != 0) {
                if ((i16 & 3072) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i19 |= i26;
                }
                i27 = i18 & 16;
                if (i27 != 0) {
                    if ((i16 & 24576) == 0) {
                        aVar2 = aVar;
                        if (rVarH.G(aVar2)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i19 |= i28;
                    }
                    if ((196608 & i16) == 0) {
                        if ((i18 & 32) == 0) {
                            mjVarR = mjVar;
                            if (rVarH.W(mjVarR)) {
                                i59 = PKIFailureInfo.unsupportedVersion;
                            }
                            i19 |= i59;
                        } else {
                            mjVarR = mjVar;
                        }
                        i59 = PKIFailureInfo.notAuthorized;
                        i19 |= i59;
                    } else {
                        mjVarR = mjVar;
                    }
                    i29 = i18 & 64;
                    if (i29 != 0) {
                        i19 |= 1572864;
                        lVar3 = lVar2;
                    } else {
                        lVar3 = lVar2;
                        if ((i16 & 1572864) == 0) {
                            if (rVarH.W(lVar3)) {
                                i35 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i35 = PKIFailureInfo.signerNotTrusted;
                            }
                            i19 |= i35;
                        }
                    }
                    i36 = i18 & 128;
                    if (i36 != 0) {
                        i19 |= 12582912;
                    } else if ((i16 & 12582912) == 0) {
                        if (rVarH.c(i15)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i19 |= i37;
                    }
                    i38 = i18 & 256;
                    if (i38 != 0) {
                        if ((i16 & 100663296) == 0) {
                            if (rVarH.G(qVar)) {
                                i39 = 67108864;
                            } else {
                                i39 = 33554432;
                            }
                            i19 |= i39;
                        }
                        i45 = i18 & 512;
                        if (i45 != 0) {
                            if ((i16 & 805306368) == 0) {
                                if (rVarH.G(qVar2)) {
                                    i46 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i46 = 268435456;
                                }
                                i19 |= i46;
                            }
                            if ((i17 & 6) == 0) {
                                i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                            } else {
                                i47 = i17;
                            }
                            i48 = i19;
                            if ((i19 & 306783379) == 306783378 || (i47 & 3) != 2) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (rVarH.r(z17, i48 & 1)) {
                                rVarH.I();
                                if ((i16 & 1) != 0 || rVarH.Q()) {
                                    if (i65 != 0) {
                                        mVar2 = f3.m.INSTANCE;
                                    }
                                    if (i25 != 0) {
                                        z16 = true;
                                    }
                                    if (i27 != 0) {
                                        aVar2 = null;
                                    }
                                    if ((i18 & 32) != 0) {
                                        i55 = i48 & (-458753);
                                        mjVarR = vj.f58107a.r(rVarH, 6);
                                    } else {
                                        i55 = i48;
                                    }
                                    if (i29 != 0) {
                                        objE = rVarH.E();
                                        if (objE == r.INSTANCE.a()) {
                                            objE = b1.k.a();
                                            rVarH.v(objE);
                                        }
                                        lVar3 = (b1.l) objE;
                                    }
                                    if (i36 != 0) {
                                        i56 = 0;
                                    } else {
                                        i56 = i15;
                                    }
                                    if (i38 != 0) {
                                        qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                            @Override // er.q
                                            public final Object w(Object obj, Object obj2, Object obj3) {
                                                return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                            }
                                        }, rVarH, 54);
                                    } else {
                                        qVarD = qVar;
                                    }
                                    if (i45 != 0) {
                                        qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                            @Override // er.q
                                            public final Object w(Object obj, Object obj2, Object obj3) {
                                                return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                            }
                                        }, rVarH, 54);
                                    } else {
                                        qVarD2 = qVar2;
                                    }
                                    if ((i18 & 1024) != 0) {
                                        eVarB = m.b(0.0f, 1.0f);
                                        i47 &= -15;
                                    } else {
                                        eVarB = eVar;
                                    }
                                    i57 = i55;
                                    i58 = i47;
                                    qVar5 = qVarD2;
                                    i49 = i56;
                                } else {
                                    rVarH.O();
                                    if ((i18 & 32) != 0) {
                                        i48 &= -458753;
                                    }
                                    if ((i18 & 1024) != 0) {
                                        i47 &= -15;
                                    }
                                    i49 = i15;
                                    qVar5 = qVar2;
                                    eVarB = eVar;
                                    i58 = i47;
                                    i57 = i48;
                                    qVarD = qVar;
                                }
                                rVarH.y();
                                er.q<? super mk, ? super r, ? super Integer, i0> qVar6 = qVarD;
                                if (p076m2.t.k()) {
                                    p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                                }
                                if ((29360128 & i57) == 8388608) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                                objE2 = rVarH.E();
                                if (z25 || objE2 == r.INSTANCE.a()) {
                                    objE2 = new mk(f15, i49, aVar2, eVarB);
                                    rVarH.v(objE2);
                                }
                                mk mkVar = (mk) objE2;
                                mkVar.G(aVar2);
                                mkVar.F(lVar);
                                mkVar.O(f15);
                                int i66 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                                int i67 = i57 >> 9;
                                er.q<? super mk, ? super r, ? super Integer, i0> qVar7 = qVar5;
                                n(mkVar, mVar2, z16, null, lVar3, qVar6, qVar7, rVarH, i66 | (458752 & i67) | (i67 & 3670016), 8);
                                b1.l lVar5 = lVar3;
                                if (p076m2.t.k()) {
                                    p076m2.t.n();
                                }
                                eVar2 = eVarB;
                                qVar3 = qVar6;
                                z18 = z16;
                                qVar4 = qVar7;
                                lVar4 = lVar5;
                                mjVar2 = mjVarR;
                                aVar3 = aVar2;
                            } else {
                                rVarH.O();
                                i49 = i15;
                                qVar3 = qVar;
                                eVar2 = eVar;
                                z18 = z16;
                                qVar4 = qVar2;
                                lVar4 = lVar3;
                                aVar3 = aVar2;
                                mjVar2 = mjVarR;
                            }
                            d5VarM = rVarH.m();
                            if (d5VarM != null) {
                                final f3.m mVar3 = mVar2;
                                final int i68 = i49;
                                d5VarM.a(new p() { // from class: f2.ak
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ik.t(f15, lVar, mVar3, z18, aVar3, mjVar2, lVar4, i68, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i19 |= 805306368;
                        if ((i17 & 6) == 0) {
                            i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                        } else {
                            i47 = i17;
                        }
                        i48 = i19;
                        if ((i19 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i48 & 1)) {
                            rVarH.I();
                            if ((i16 & 1) != 0) {
                                if (i65 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if (i25 != 0) {
                                    z16 = true;
                                }
                                if (i27 != 0) {
                                    aVar2 = null;
                                }
                                if ((i18 & 32) != 0) {
                                    i55 = i48 & (-458753);
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                } else {
                                    i55 = i48;
                                }
                                if (i29 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar3 = (b1.l) objE;
                                }
                                if (i36 != 0) {
                                    i56 = 0;
                                } else {
                                    i56 = i15;
                                }
                                if (i38 != 0) {
                                    qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD = qVar;
                                }
                                if (i45 != 0) {
                                    qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD2 = qVar2;
                                }
                                if ((i18 & 1024) != 0) {
                                    eVarB = m.b(0.0f, 1.0f);
                                    i47 &= -15;
                                } else {
                                    eVarB = eVar;
                                }
                                i57 = i55;
                                i58 = i47;
                                qVar5 = qVarD2;
                                i49 = i56;
                            } else {
                                if (i65 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if (i25 != 0) {
                                    z16 = true;
                                }
                                if (i27 != 0) {
                                    aVar2 = null;
                                }
                                if ((i18 & 32) != 0) {
                                    i55 = i48 & (-458753);
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                } else {
                                    i55 = i48;
                                }
                                if (i29 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar3 = (b1.l) objE;
                                }
                                if (i36 != 0) {
                                    i56 = 0;
                                } else {
                                    i56 = i15;
                                }
                                if (i38 != 0) {
                                    qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD = qVar;
                                }
                                if (i45 != 0) {
                                    qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD2 = qVar2;
                                }
                                if ((i18 & 1024) != 0) {
                                    eVarB = m.b(0.0f, 1.0f);
                                    i47 &= -15;
                                } else {
                                    eVarB = eVar;
                                }
                                i57 = i55;
                                i58 = i47;
                                qVar5 = qVarD2;
                                i49 = i56;
                            }
                            rVarH.y();
                            er.q<? super mk, ? super r, ? super Integer, i0> qVar8 = qVarD;
                            if (p076m2.t.k()) {
                                p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                            }
                            if ((29360128 & i57) == 8388608) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                            objE2 = rVarH.E();
                            if (z25) {
                                objE2 = new mk(f15, i49, aVar2, eVarB);
                                rVarH.v(objE2);
                            } else {
                                objE2 = new mk(f15, i49, aVar2, eVarB);
                                rVarH.v(objE2);
                            }
                            mk mkVar2 = (mk) objE2;
                            mkVar2.G(aVar2);
                            mkVar2.F(lVar);
                            mkVar2.O(f15);
                            int i69 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                            int i610 = i57 >> 9;
                            er.q<? super mk, ? super r, ? super Integer, i0> qVar9 = qVar5;
                            n(mkVar2, mVar2, z16, null, lVar3, qVar8, qVar9, rVarH, i69 | (458752 & i610) | (i610 & 3670016), 8);
                            b1.l lVar6 = lVar3;
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            eVar2 = eVarB;
                            qVar3 = qVar8;
                            z18 = z16;
                            qVar4 = qVar9;
                            lVar4 = lVar6;
                            mjVar2 = mjVarR;
                            aVar3 = aVar2;
                        } else {
                            rVarH.O();
                            i49 = i15;
                            qVar3 = qVar;
                            eVar2 = eVar;
                            z18 = z16;
                            qVar4 = qVar2;
                            lVar4 = lVar3;
                            aVar3 = aVar2;
                            mjVar2 = mjVarR;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            final f3.m mVar4 = mVar2;
                            final int i611 = i49;
                            d5VarM.a(new p() { // from class: f2.ak
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ik.t(f15, lVar, mVar4, z18, aVar3, mjVar2, lVar4, i611, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 100663296;
                    i45 = i18 & 512;
                    if (i45 != 0) {
                        if ((i16 & 805306368) == 0) {
                            if (rVarH.G(qVar2)) {
                                i46 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i46 = 268435456;
                            }
                            i19 |= i46;
                        }
                        if ((i17 & 6) == 0) {
                            i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                        } else {
                            i47 = i17;
                        }
                        i48 = i19;
                        if ((i19 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i48 & 1)) {
                            rVarH.I();
                            if ((i16 & 1) != 0) {
                                if (i65 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if (i25 != 0) {
                                    z16 = true;
                                }
                                if (i27 != 0) {
                                    aVar2 = null;
                                }
                                if ((i18 & 32) != 0) {
                                    i55 = i48 & (-458753);
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                } else {
                                    i55 = i48;
                                }
                                if (i29 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar3 = (b1.l) objE;
                                }
                                if (i36 != 0) {
                                    i56 = 0;
                                } else {
                                    i56 = i15;
                                }
                                if (i38 != 0) {
                                    qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD = qVar;
                                }
                                if (i45 != 0) {
                                    qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD2 = qVar2;
                                }
                                if ((i18 & 1024) != 0) {
                                    eVarB = m.b(0.0f, 1.0f);
                                    i47 &= -15;
                                } else {
                                    eVarB = eVar;
                                }
                                i57 = i55;
                                i58 = i47;
                                qVar5 = qVarD2;
                                i49 = i56;
                            } else {
                                if (i65 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if (i25 != 0) {
                                    z16 = true;
                                }
                                if (i27 != 0) {
                                    aVar2 = null;
                                }
                                if ((i18 & 32) != 0) {
                                    i55 = i48 & (-458753);
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                } else {
                                    i55 = i48;
                                }
                                if (i29 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar3 = (b1.l) objE;
                                }
                                if (i36 != 0) {
                                    i56 = 0;
                                } else {
                                    i56 = i15;
                                }
                                if (i38 != 0) {
                                    qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD = qVar;
                                }
                                if (i45 != 0) {
                                    qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD2 = qVar2;
                                }
                                if ((i18 & 1024) != 0) {
                                    eVarB = m.b(0.0f, 1.0f);
                                    i47 &= -15;
                                } else {
                                    eVarB = eVar;
                                }
                                i57 = i55;
                                i58 = i47;
                                qVar5 = qVarD2;
                                i49 = i56;
                            }
                            rVarH.y();
                            er.q<? super mk, ? super r, ? super Integer, i0> qVar10 = qVarD;
                            if (p076m2.t.k()) {
                                p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                            }
                            if ((29360128 & i57) == 8388608) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                            objE2 = rVarH.E();
                            if (z25) {
                                objE2 = new mk(f15, i49, aVar2, eVarB);
                                rVarH.v(objE2);
                            } else {
                                objE2 = new mk(f15, i49, aVar2, eVarB);
                                rVarH.v(objE2);
                            }
                            mk mkVar3 = (mk) objE2;
                            mkVar3.G(aVar2);
                            mkVar3.F(lVar);
                            mkVar3.O(f15);
                            int i612 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                            int i613 = i57 >> 9;
                            er.q<? super mk, ? super r, ? super Integer, i0> qVar11 = qVar5;
                            n(mkVar3, mVar2, z16, null, lVar3, qVar10, qVar11, rVarH, i612 | (458752 & i613) | (i613 & 3670016), 8);
                            b1.l lVar7 = lVar3;
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            eVar2 = eVarB;
                            qVar3 = qVar10;
                            z18 = z16;
                            qVar4 = qVar11;
                            lVar4 = lVar7;
                            mjVar2 = mjVarR;
                            aVar3 = aVar2;
                        } else {
                            rVarH.O();
                            i49 = i15;
                            qVar3 = qVar;
                            eVar2 = eVar;
                            z18 = z16;
                            qVar4 = qVar2;
                            lVar4 = lVar3;
                            aVar3 = aVar2;
                            mjVar2 = mjVarR;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            final f3.m mVar5 = mVar2;
                            final int i614 = i49;
                            d5VarM.a(new p() { // from class: f2.ak
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ik.t(f15, lVar, mVar5, z18, aVar3, mjVar2, lVar4, i614, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 805306368;
                    if ((i17 & 6) == 0) {
                        i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                    } else {
                        i47 = i17;
                    }
                    i48 = i19;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i48 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        }
                        rVarH.y();
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar12 = qVarD;
                        if (p076m2.t.k()) {
                            p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                        }
                        if ((29360128 & i57) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                        objE2 = rVarH.E();
                        if (z25) {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        }
                        mk mkVar4 = (mk) objE2;
                        mkVar4.G(aVar2);
                        mkVar4.F(lVar);
                        mkVar4.O(f15);
                        int i615 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                        int i616 = i57 >> 9;
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar13 = qVar5;
                        n(mkVar4, mVar2, z16, null, lVar3, qVar12, qVar13, rVarH, i615 | (458752 & i616) | (i616 & 3670016), 8);
                        b1.l lVar8 = lVar3;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        eVar2 = eVarB;
                        qVar3 = qVar12;
                        z18 = z16;
                        qVar4 = qVar13;
                        lVar4 = lVar8;
                        mjVar2 = mjVarR;
                        aVar3 = aVar2;
                    } else {
                        rVarH.O();
                        i49 = i15;
                        qVar3 = qVar;
                        eVar2 = eVar;
                        z18 = z16;
                        qVar4 = qVar2;
                        lVar4 = lVar3;
                        aVar3 = aVar2;
                        mjVar2 = mjVarR;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        final f3.m mVar6 = mVar2;
                        final int i617 = i49;
                        d5VarM.a(new p() { // from class: f2.ak
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.t(f15, lVar, mVar6, z18, aVar3, mjVar2, lVar4, i617, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 24576;
                aVar2 = aVar;
                if ((196608 & i16) == 0) {
                    if ((i18 & 32) == 0) {
                        mjVarR = mjVar;
                        if (rVarH.W(mjVarR)) {
                            i59 = PKIFailureInfo.unsupportedVersion;
                        }
                        i19 |= i59;
                    } else {
                        mjVarR = mjVar;
                    }
                    i59 = PKIFailureInfo.notAuthorized;
                    i19 |= i59;
                } else {
                    mjVarR = mjVar;
                }
                i29 = i18 & 64;
                if (i29 != 0) {
                    i19 |= 1572864;
                    lVar3 = lVar2;
                } else {
                    lVar3 = lVar2;
                    if ((i16 & 1572864) == 0) {
                        if (rVarH.W(lVar3)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i35;
                    }
                }
                i36 = i18 & 128;
                if (i36 != 0) {
                    i19 |= 12582912;
                } else if ((i16 & 12582912) == 0) {
                    if (rVarH.c(i15)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i19 |= i37;
                }
                i38 = i18 & 256;
                if (i38 != 0) {
                    if ((i16 & 100663296) == 0) {
                        if (rVarH.G(qVar)) {
                            i39 = 67108864;
                        } else {
                            i39 = 33554432;
                        }
                        i19 |= i39;
                    }
                    i45 = i18 & 512;
                    if (i45 != 0) {
                        if ((i16 & 805306368) == 0) {
                            if (rVarH.G(qVar2)) {
                                i46 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i46 = 268435456;
                            }
                            i19 |= i46;
                        }
                        if ((i17 & 6) == 0) {
                            i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                        } else {
                            i47 = i17;
                        }
                        i48 = i19;
                        if ((i19 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i48 & 1)) {
                            rVarH.I();
                            if ((i16 & 1) != 0) {
                                if (i65 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if (i25 != 0) {
                                    z16 = true;
                                }
                                if (i27 != 0) {
                                    aVar2 = null;
                                }
                                if ((i18 & 32) != 0) {
                                    i55 = i48 & (-458753);
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                } else {
                                    i55 = i48;
                                }
                                if (i29 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar3 = (b1.l) objE;
                                }
                                if (i36 != 0) {
                                    i56 = 0;
                                } else {
                                    i56 = i15;
                                }
                                if (i38 != 0) {
                                    qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD = qVar;
                                }
                                if (i45 != 0) {
                                    qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD2 = qVar2;
                                }
                                if ((i18 & 1024) != 0) {
                                    eVarB = m.b(0.0f, 1.0f);
                                    i47 &= -15;
                                } else {
                                    eVarB = eVar;
                                }
                                i57 = i55;
                                i58 = i47;
                                qVar5 = qVarD2;
                                i49 = i56;
                            } else {
                                if (i65 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if (i25 != 0) {
                                    z16 = true;
                                }
                                if (i27 != 0) {
                                    aVar2 = null;
                                }
                                if ((i18 & 32) != 0) {
                                    i55 = i48 & (-458753);
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                } else {
                                    i55 = i48;
                                }
                                if (i29 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar3 = (b1.l) objE;
                                }
                                if (i36 != 0) {
                                    i56 = 0;
                                } else {
                                    i56 = i15;
                                }
                                if (i38 != 0) {
                                    qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD = qVar;
                                }
                                if (i45 != 0) {
                                    qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD2 = qVar2;
                                }
                                if ((i18 & 1024) != 0) {
                                    eVarB = m.b(0.0f, 1.0f);
                                    i47 &= -15;
                                } else {
                                    eVarB = eVar;
                                }
                                i57 = i55;
                                i58 = i47;
                                qVar5 = qVarD2;
                                i49 = i56;
                            }
                            rVarH.y();
                            er.q<? super mk, ? super r, ? super Integer, i0> qVar14 = qVarD;
                            if (p076m2.t.k()) {
                                p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                            }
                            if ((29360128 & i57) == 8388608) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                            objE2 = rVarH.E();
                            if (z25) {
                                objE2 = new mk(f15, i49, aVar2, eVarB);
                                rVarH.v(objE2);
                            } else {
                                objE2 = new mk(f15, i49, aVar2, eVarB);
                                rVarH.v(objE2);
                            }
                            mk mkVar5 = (mk) objE2;
                            mkVar5.G(aVar2);
                            mkVar5.F(lVar);
                            mkVar5.O(f15);
                            int i618 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                            int i619 = i57 >> 9;
                            er.q<? super mk, ? super r, ? super Integer, i0> qVar15 = qVar5;
                            n(mkVar5, mVar2, z16, null, lVar3, qVar14, qVar15, rVarH, i618 | (458752 & i619) | (i619 & 3670016), 8);
                            b1.l lVar9 = lVar3;
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            eVar2 = eVarB;
                            qVar3 = qVar14;
                            z18 = z16;
                            qVar4 = qVar15;
                            lVar4 = lVar9;
                            mjVar2 = mjVarR;
                            aVar3 = aVar2;
                        } else {
                            rVarH.O();
                            i49 = i15;
                            qVar3 = qVar;
                            eVar2 = eVar;
                            z18 = z16;
                            qVar4 = qVar2;
                            lVar4 = lVar3;
                            aVar3 = aVar2;
                            mjVar2 = mjVarR;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            final f3.m mVar7 = mVar2;
                            final int i6110 = i49;
                            d5VarM.a(new p() { // from class: f2.ak
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ik.t(f15, lVar, mVar7, z18, aVar3, mjVar2, lVar4, i6110, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 805306368;
                    if ((i17 & 6) == 0) {
                        i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                    } else {
                        i47 = i17;
                    }
                    i48 = i19;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i48 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        }
                        rVarH.y();
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar16 = qVarD;
                        if (p076m2.t.k()) {
                            p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                        }
                        if ((29360128 & i57) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                        objE2 = rVarH.E();
                        if (z25) {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        }
                        mk mkVar6 = (mk) objE2;
                        mkVar6.G(aVar2);
                        mkVar6.F(lVar);
                        mkVar6.O(f15);
                        int i6111 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                        int i6112 = i57 >> 9;
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar17 = qVar5;
                        n(mkVar6, mVar2, z16, null, lVar3, qVar16, qVar17, rVarH, i6111 | (458752 & i6112) | (i6112 & 3670016), 8);
                        b1.l lVar10 = lVar3;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        eVar2 = eVarB;
                        qVar3 = qVar16;
                        z18 = z16;
                        qVar4 = qVar17;
                        lVar4 = lVar10;
                        mjVar2 = mjVarR;
                        aVar3 = aVar2;
                    } else {
                        rVarH.O();
                        i49 = i15;
                        qVar3 = qVar;
                        eVar2 = eVar;
                        z18 = z16;
                        qVar4 = qVar2;
                        lVar4 = lVar3;
                        aVar3 = aVar2;
                        mjVar2 = mjVarR;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        final f3.m mVar8 = mVar2;
                        final int i6113 = i49;
                        d5VarM.a(new p() { // from class: f2.ak
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.t(f15, lVar, mVar8, z18, aVar3, mjVar2, lVar4, i6113, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 100663296;
                i45 = i18 & 512;
                if (i45 != 0) {
                    if ((i16 & 805306368) == 0) {
                        if (rVarH.G(qVar2)) {
                            i46 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i46 = 268435456;
                        }
                        i19 |= i46;
                    }
                    if ((i17 & 6) == 0) {
                        i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                    } else {
                        i47 = i17;
                    }
                    i48 = i19;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i48 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        }
                        rVarH.y();
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar18 = qVarD;
                        if (p076m2.t.k()) {
                            p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                        }
                        if ((29360128 & i57) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                        objE2 = rVarH.E();
                        if (z25) {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        }
                        mk mkVar7 = (mk) objE2;
                        mkVar7.G(aVar2);
                        mkVar7.F(lVar);
                        mkVar7.O(f15);
                        int i6114 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                        int i6115 = i57 >> 9;
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar19 = qVar5;
                        n(mkVar7, mVar2, z16, null, lVar3, qVar18, qVar19, rVarH, i6114 | (458752 & i6115) | (i6115 & 3670016), 8);
                        b1.l lVar11 = lVar3;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        eVar2 = eVarB;
                        qVar3 = qVar18;
                        z18 = z16;
                        qVar4 = qVar19;
                        lVar4 = lVar11;
                        mjVar2 = mjVarR;
                        aVar3 = aVar2;
                    } else {
                        rVarH.O();
                        i49 = i15;
                        qVar3 = qVar;
                        eVar2 = eVar;
                        z18 = z16;
                        qVar4 = qVar2;
                        lVar4 = lVar3;
                        aVar3 = aVar2;
                        mjVar2 = mjVarR;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        final f3.m mVar9 = mVar2;
                        final int i6116 = i49;
                        d5VarM.a(new p() { // from class: f2.ak
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.t(f15, lVar, mVar9, z18, aVar3, mjVar2, lVar4, i6116, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 805306368;
                if ((i17 & 6) == 0) {
                    i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                } else {
                    i47 = i17;
                }
                i48 = i19;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i48 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    }
                    rVarH.y();
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar110 = qVarD;
                    if (p076m2.t.k()) {
                        p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                    }
                    if ((29360128 & i57) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                    objE2 = rVarH.E();
                    if (z25) {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    }
                    mk mkVar8 = (mk) objE2;
                    mkVar8.G(aVar2);
                    mkVar8.F(lVar);
                    mkVar8.O(f15);
                    int i6117 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                    int i6118 = i57 >> 9;
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar111 = qVar5;
                    n(mkVar8, mVar2, z16, null, lVar3, qVar110, qVar111, rVarH, i6117 | (458752 & i6118) | (i6118 & 3670016), 8);
                    b1.l lVar12 = lVar3;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    eVar2 = eVarB;
                    qVar3 = qVar110;
                    z18 = z16;
                    qVar4 = qVar111;
                    lVar4 = lVar12;
                    mjVar2 = mjVarR;
                    aVar3 = aVar2;
                } else {
                    rVarH.O();
                    i49 = i15;
                    qVar3 = qVar;
                    eVar2 = eVar;
                    z18 = z16;
                    qVar4 = qVar2;
                    lVar4 = lVar3;
                    aVar3 = aVar2;
                    mjVar2 = mjVarR;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar10 = mVar2;
                    final int i6119 = i49;
                    d5VarM.a(new p() { // from class: f2.ak
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.t(f15, lVar, mVar10, z18, aVar3, mjVar2, lVar4, i6119, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 3072;
            z16 = z15;
            i27 = i18 & 16;
            if (i27 != 0) {
                if ((i16 & 24576) == 0) {
                    aVar2 = aVar;
                    if (rVarH.G(aVar2)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i19 |= i28;
                }
                if ((196608 & i16) == 0) {
                    if ((i18 & 32) == 0) {
                        mjVarR = mjVar;
                        if (rVarH.W(mjVarR)) {
                            i59 = PKIFailureInfo.unsupportedVersion;
                        }
                        i19 |= i59;
                    } else {
                        mjVarR = mjVar;
                    }
                    i59 = PKIFailureInfo.notAuthorized;
                    i19 |= i59;
                } else {
                    mjVarR = mjVar;
                }
                i29 = i18 & 64;
                if (i29 != 0) {
                    i19 |= 1572864;
                    lVar3 = lVar2;
                } else {
                    lVar3 = lVar2;
                    if ((i16 & 1572864) == 0) {
                        if (rVarH.W(lVar3)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i35;
                    }
                }
                i36 = i18 & 128;
                if (i36 != 0) {
                    i19 |= 12582912;
                } else if ((i16 & 12582912) == 0) {
                    if (rVarH.c(i15)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i19 |= i37;
                }
                i38 = i18 & 256;
                if (i38 != 0) {
                    if ((i16 & 100663296) == 0) {
                        if (rVarH.G(qVar)) {
                            i39 = 67108864;
                        } else {
                            i39 = 33554432;
                        }
                        i19 |= i39;
                    }
                    i45 = i18 & 512;
                    if (i45 != 0) {
                        if ((i16 & 805306368) == 0) {
                            if (rVarH.G(qVar2)) {
                                i46 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i46 = 268435456;
                            }
                            i19 |= i46;
                        }
                        if ((i17 & 6) == 0) {
                            i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                        } else {
                            i47 = i17;
                        }
                        i48 = i19;
                        if ((i19 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i48 & 1)) {
                            rVarH.I();
                            if ((i16 & 1) != 0) {
                                if (i65 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if (i25 != 0) {
                                    z16 = true;
                                }
                                if (i27 != 0) {
                                    aVar2 = null;
                                }
                                if ((i18 & 32) != 0) {
                                    i55 = i48 & (-458753);
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                } else {
                                    i55 = i48;
                                }
                                if (i29 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar3 = (b1.l) objE;
                                }
                                if (i36 != 0) {
                                    i56 = 0;
                                } else {
                                    i56 = i15;
                                }
                                if (i38 != 0) {
                                    qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD = qVar;
                                }
                                if (i45 != 0) {
                                    qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD2 = qVar2;
                                }
                                if ((i18 & 1024) != 0) {
                                    eVarB = m.b(0.0f, 1.0f);
                                    i47 &= -15;
                                } else {
                                    eVarB = eVar;
                                }
                                i57 = i55;
                                i58 = i47;
                                qVar5 = qVarD2;
                                i49 = i56;
                            } else {
                                if (i65 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if (i25 != 0) {
                                    z16 = true;
                                }
                                if (i27 != 0) {
                                    aVar2 = null;
                                }
                                if ((i18 & 32) != 0) {
                                    i55 = i48 & (-458753);
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                } else {
                                    i55 = i48;
                                }
                                if (i29 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar3 = (b1.l) objE;
                                }
                                if (i36 != 0) {
                                    i56 = 0;
                                } else {
                                    i56 = i15;
                                }
                                if (i38 != 0) {
                                    qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD = qVar;
                                }
                                if (i45 != 0) {
                                    qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD2 = qVar2;
                                }
                                if ((i18 & 1024) != 0) {
                                    eVarB = m.b(0.0f, 1.0f);
                                    i47 &= -15;
                                } else {
                                    eVarB = eVar;
                                }
                                i57 = i55;
                                i58 = i47;
                                qVar5 = qVarD2;
                                i49 = i56;
                            }
                            rVarH.y();
                            er.q<? super mk, ? super r, ? super Integer, i0> qVar112 = qVarD;
                            if (p076m2.t.k()) {
                                p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                            }
                            if ((29360128 & i57) == 8388608) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                            objE2 = rVarH.E();
                            if (z25) {
                                objE2 = new mk(f15, i49, aVar2, eVarB);
                                rVarH.v(objE2);
                            } else {
                                objE2 = new mk(f15, i49, aVar2, eVarB);
                                rVarH.v(objE2);
                            }
                            mk mkVar9 = (mk) objE2;
                            mkVar9.G(aVar2);
                            mkVar9.F(lVar);
                            mkVar9.O(f15);
                            int i61110 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                            int i61111 = i57 >> 9;
                            er.q<? super mk, ? super r, ? super Integer, i0> qVar113 = qVar5;
                            n(mkVar9, mVar2, z16, null, lVar3, qVar112, qVar113, rVarH, i61110 | (458752 & i61111) | (i61111 & 3670016), 8);
                            b1.l lVar13 = lVar3;
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            eVar2 = eVarB;
                            qVar3 = qVar112;
                            z18 = z16;
                            qVar4 = qVar113;
                            lVar4 = lVar13;
                            mjVar2 = mjVarR;
                            aVar3 = aVar2;
                        } else {
                            rVarH.O();
                            i49 = i15;
                            qVar3 = qVar;
                            eVar2 = eVar;
                            z18 = z16;
                            qVar4 = qVar2;
                            lVar4 = lVar3;
                            aVar3 = aVar2;
                            mjVar2 = mjVarR;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            final f3.m mVar11 = mVar2;
                            final int i61112 = i49;
                            d5VarM.a(new p() { // from class: f2.ak
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ik.t(f15, lVar, mVar11, z18, aVar3, mjVar2, lVar4, i61112, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 805306368;
                    if ((i17 & 6) == 0) {
                        i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                    } else {
                        i47 = i17;
                    }
                    i48 = i19;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i48 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        }
                        rVarH.y();
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar114 = qVarD;
                        if (p076m2.t.k()) {
                            p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                        }
                        if ((29360128 & i57) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                        objE2 = rVarH.E();
                        if (z25) {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        }
                        mk mkVar10 = (mk) objE2;
                        mkVar10.G(aVar2);
                        mkVar10.F(lVar);
                        mkVar10.O(f15);
                        int i61113 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                        int i61114 = i57 >> 9;
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar115 = qVar5;
                        n(mkVar10, mVar2, z16, null, lVar3, qVar114, qVar115, rVarH, i61113 | (458752 & i61114) | (i61114 & 3670016), 8);
                        b1.l lVar14 = lVar3;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        eVar2 = eVarB;
                        qVar3 = qVar114;
                        z18 = z16;
                        qVar4 = qVar115;
                        lVar4 = lVar14;
                        mjVar2 = mjVarR;
                        aVar3 = aVar2;
                    } else {
                        rVarH.O();
                        i49 = i15;
                        qVar3 = qVar;
                        eVar2 = eVar;
                        z18 = z16;
                        qVar4 = qVar2;
                        lVar4 = lVar3;
                        aVar3 = aVar2;
                        mjVar2 = mjVarR;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        final f3.m mVar12 = mVar2;
                        final int i61115 = i49;
                        d5VarM.a(new p() { // from class: f2.ak
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.t(f15, lVar, mVar12, z18, aVar3, mjVar2, lVar4, i61115, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 100663296;
                i45 = i18 & 512;
                if (i45 != 0) {
                    if ((i16 & 805306368) == 0) {
                        if (rVarH.G(qVar2)) {
                            i46 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i46 = 268435456;
                        }
                        i19 |= i46;
                    }
                    if ((i17 & 6) == 0) {
                        i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                    } else {
                        i47 = i17;
                    }
                    i48 = i19;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i48 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        }
                        rVarH.y();
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar116 = qVarD;
                        if (p076m2.t.k()) {
                            p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                        }
                        if ((29360128 & i57) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                        objE2 = rVarH.E();
                        if (z25) {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        }
                        mk mkVar11 = (mk) objE2;
                        mkVar11.G(aVar2);
                        mkVar11.F(lVar);
                        mkVar11.O(f15);
                        int i61116 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                        int i61117 = i57 >> 9;
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar117 = qVar5;
                        n(mkVar11, mVar2, z16, null, lVar3, qVar116, qVar117, rVarH, i61116 | (458752 & i61117) | (i61117 & 3670016), 8);
                        b1.l lVar15 = lVar3;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        eVar2 = eVarB;
                        qVar3 = qVar116;
                        z18 = z16;
                        qVar4 = qVar117;
                        lVar4 = lVar15;
                        mjVar2 = mjVarR;
                        aVar3 = aVar2;
                    } else {
                        rVarH.O();
                        i49 = i15;
                        qVar3 = qVar;
                        eVar2 = eVar;
                        z18 = z16;
                        qVar4 = qVar2;
                        lVar4 = lVar3;
                        aVar3 = aVar2;
                        mjVar2 = mjVarR;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        final f3.m mVar13 = mVar2;
                        final int i61118 = i49;
                        d5VarM.a(new p() { // from class: f2.ak
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.t(f15, lVar, mVar13, z18, aVar3, mjVar2, lVar4, i61118, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 805306368;
                if ((i17 & 6) == 0) {
                    i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                } else {
                    i47 = i17;
                }
                i48 = i19;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i48 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    }
                    rVarH.y();
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar118 = qVarD;
                    if (p076m2.t.k()) {
                        p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                    }
                    if ((29360128 & i57) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                    objE2 = rVarH.E();
                    if (z25) {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    }
                    mk mkVar12 = (mk) objE2;
                    mkVar12.G(aVar2);
                    mkVar12.F(lVar);
                    mkVar12.O(f15);
                    int i61119 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                    int i611110 = i57 >> 9;
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar119 = qVar5;
                    n(mkVar12, mVar2, z16, null, lVar3, qVar118, qVar119, rVarH, i61119 | (458752 & i611110) | (i611110 & 3670016), 8);
                    b1.l lVar16 = lVar3;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    eVar2 = eVarB;
                    qVar3 = qVar118;
                    z18 = z16;
                    qVar4 = qVar119;
                    lVar4 = lVar16;
                    mjVar2 = mjVarR;
                    aVar3 = aVar2;
                } else {
                    rVarH.O();
                    i49 = i15;
                    qVar3 = qVar;
                    eVar2 = eVar;
                    z18 = z16;
                    qVar4 = qVar2;
                    lVar4 = lVar3;
                    aVar3 = aVar2;
                    mjVar2 = mjVarR;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar14 = mVar2;
                    final int i611111 = i49;
                    d5VarM.a(new p() { // from class: f2.ak
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.t(f15, lVar, mVar14, z18, aVar3, mjVar2, lVar4, i611111, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 24576;
            aVar2 = aVar;
            if ((196608 & i16) == 0) {
                if ((i18 & 32) == 0) {
                    mjVarR = mjVar;
                    if (rVarH.W(mjVarR)) {
                        i59 = PKIFailureInfo.unsupportedVersion;
                    }
                    i19 |= i59;
                } else {
                    mjVarR = mjVar;
                }
                i59 = PKIFailureInfo.notAuthorized;
                i19 |= i59;
            } else {
                mjVarR = mjVar;
            }
            i29 = i18 & 64;
            if (i29 != 0) {
                i19 |= 1572864;
                lVar3 = lVar2;
            } else {
                lVar3 = lVar2;
                if ((i16 & 1572864) == 0) {
                    if (rVarH.W(lVar3)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i35;
                }
            }
            i36 = i18 & 128;
            if (i36 != 0) {
                i19 |= 12582912;
            } else if ((i16 & 12582912) == 0) {
                if (rVarH.c(i15)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i19 |= i37;
            }
            i38 = i18 & 256;
            if (i38 != 0) {
                if ((i16 & 100663296) == 0) {
                    if (rVarH.G(qVar)) {
                        i39 = 67108864;
                    } else {
                        i39 = 33554432;
                    }
                    i19 |= i39;
                }
                i45 = i18 & 512;
                if (i45 != 0) {
                    if ((i16 & 805306368) == 0) {
                        if (rVarH.G(qVar2)) {
                            i46 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i46 = 268435456;
                        }
                        i19 |= i46;
                    }
                    if ((i17 & 6) == 0) {
                        i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                    } else {
                        i47 = i17;
                    }
                    i48 = i19;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i48 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        }
                        rVarH.y();
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar1110 = qVarD;
                        if (p076m2.t.k()) {
                            p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                        }
                        if ((29360128 & i57) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                        objE2 = rVarH.E();
                        if (z25) {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        }
                        mk mkVar13 = (mk) objE2;
                        mkVar13.G(aVar2);
                        mkVar13.F(lVar);
                        mkVar13.O(f15);
                        int i611112 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                        int i611113 = i57 >> 9;
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar1111 = qVar5;
                        n(mkVar13, mVar2, z16, null, lVar3, qVar1110, qVar1111, rVarH, i611112 | (458752 & i611113) | (i611113 & 3670016), 8);
                        b1.l lVar17 = lVar3;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        eVar2 = eVarB;
                        qVar3 = qVar1110;
                        z18 = z16;
                        qVar4 = qVar1111;
                        lVar4 = lVar17;
                        mjVar2 = mjVarR;
                        aVar3 = aVar2;
                    } else {
                        rVarH.O();
                        i49 = i15;
                        qVar3 = qVar;
                        eVar2 = eVar;
                        z18 = z16;
                        qVar4 = qVar2;
                        lVar4 = lVar3;
                        aVar3 = aVar2;
                        mjVar2 = mjVarR;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        final f3.m mVar15 = mVar2;
                        final int i611114 = i49;
                        d5VarM.a(new p() { // from class: f2.ak
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.t(f15, lVar, mVar15, z18, aVar3, mjVar2, lVar4, i611114, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 805306368;
                if ((i17 & 6) == 0) {
                    i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                } else {
                    i47 = i17;
                }
                i48 = i19;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i48 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    }
                    rVarH.y();
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar1112 = qVarD;
                    if (p076m2.t.k()) {
                        p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                    }
                    if ((29360128 & i57) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                    objE2 = rVarH.E();
                    if (z25) {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    }
                    mk mkVar14 = (mk) objE2;
                    mkVar14.G(aVar2);
                    mkVar14.F(lVar);
                    mkVar14.O(f15);
                    int i611115 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                    int i611116 = i57 >> 9;
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar1113 = qVar5;
                    n(mkVar14, mVar2, z16, null, lVar3, qVar1112, qVar1113, rVarH, i611115 | (458752 & i611116) | (i611116 & 3670016), 8);
                    b1.l lVar18 = lVar3;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    eVar2 = eVarB;
                    qVar3 = qVar1112;
                    z18 = z16;
                    qVar4 = qVar1113;
                    lVar4 = lVar18;
                    mjVar2 = mjVarR;
                    aVar3 = aVar2;
                } else {
                    rVarH.O();
                    i49 = i15;
                    qVar3 = qVar;
                    eVar2 = eVar;
                    z18 = z16;
                    qVar4 = qVar2;
                    lVar4 = lVar3;
                    aVar3 = aVar2;
                    mjVar2 = mjVarR;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar16 = mVar2;
                    final int i611117 = i49;
                    d5VarM.a(new p() { // from class: f2.ak
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.t(f15, lVar, mVar16, z18, aVar3, mjVar2, lVar4, i611117, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 100663296;
            i45 = i18 & 512;
            if (i45 != 0) {
                if ((i16 & 805306368) == 0) {
                    if (rVarH.G(qVar2)) {
                        i46 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i46 = 268435456;
                    }
                    i19 |= i46;
                }
                if ((i17 & 6) == 0) {
                    i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                } else {
                    i47 = i17;
                }
                i48 = i19;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i48 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    }
                    rVarH.y();
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar1114 = qVarD;
                    if (p076m2.t.k()) {
                        p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                    }
                    if ((29360128 & i57) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                    objE2 = rVarH.E();
                    if (z25) {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    }
                    mk mkVar15 = (mk) objE2;
                    mkVar15.G(aVar2);
                    mkVar15.F(lVar);
                    mkVar15.O(f15);
                    int i611118 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                    int i611119 = i57 >> 9;
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar1115 = qVar5;
                    n(mkVar15, mVar2, z16, null, lVar3, qVar1114, qVar1115, rVarH, i611118 | (458752 & i611119) | (i611119 & 3670016), 8);
                    b1.l lVar19 = lVar3;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    eVar2 = eVarB;
                    qVar3 = qVar1114;
                    z18 = z16;
                    qVar4 = qVar1115;
                    lVar4 = lVar19;
                    mjVar2 = mjVarR;
                    aVar3 = aVar2;
                } else {
                    rVarH.O();
                    i49 = i15;
                    qVar3 = qVar;
                    eVar2 = eVar;
                    z18 = z16;
                    qVar4 = qVar2;
                    lVar4 = lVar3;
                    aVar3 = aVar2;
                    mjVar2 = mjVarR;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar17 = mVar2;
                    final int i6111110 = i49;
                    d5VarM.a(new p() { // from class: f2.ak
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.t(f15, lVar, mVar17, z18, aVar3, mjVar2, lVar4, i6111110, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 805306368;
            if ((i17 & 6) == 0) {
                i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
            } else {
                i47 = i17;
            }
            i48 = i19;
            if ((i19 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i48 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i25 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        aVar2 = null;
                    }
                    if ((i18 & 32) != 0) {
                        i55 = i48 & (-458753);
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    } else {
                        i55 = i48;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar3 = (b1.l) objE;
                    }
                    if (i36 != 0) {
                        i56 = 0;
                    } else {
                        i56 = i15;
                    }
                    if (i38 != 0) {
                        qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar;
                    }
                    if (i45 != 0) {
                        qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD2 = qVar2;
                    }
                    if ((i18 & 1024) != 0) {
                        eVarB = m.b(0.0f, 1.0f);
                        i47 &= -15;
                    } else {
                        eVarB = eVar;
                    }
                    i57 = i55;
                    i58 = i47;
                    qVar5 = qVarD2;
                    i49 = i56;
                } else {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i25 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        aVar2 = null;
                    }
                    if ((i18 & 32) != 0) {
                        i55 = i48 & (-458753);
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    } else {
                        i55 = i48;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar3 = (b1.l) objE;
                    }
                    if (i36 != 0) {
                        i56 = 0;
                    } else {
                        i56 = i15;
                    }
                    if (i38 != 0) {
                        qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar;
                    }
                    if (i45 != 0) {
                        qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD2 = qVar2;
                    }
                    if ((i18 & 1024) != 0) {
                        eVarB = m.b(0.0f, 1.0f);
                        i47 &= -15;
                    } else {
                        eVarB = eVar;
                    }
                    i57 = i55;
                    i58 = i47;
                    qVar5 = qVarD2;
                    i49 = i56;
                }
                rVarH.y();
                er.q<? super mk, ? super r, ? super Integer, i0> qVar1116 = qVarD;
                if (p076m2.t.k()) {
                    p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                }
                if ((29360128 & i57) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                objE2 = rVarH.E();
                if (z25) {
                    objE2 = new mk(f15, i49, aVar2, eVarB);
                    rVarH.v(objE2);
                } else {
                    objE2 = new mk(f15, i49, aVar2, eVarB);
                    rVarH.v(objE2);
                }
                mk mkVar16 = (mk) objE2;
                mkVar16.G(aVar2);
                mkVar16.F(lVar);
                mkVar16.O(f15);
                int i6111111 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                int i6111112 = i57 >> 9;
                er.q<? super mk, ? super r, ? super Integer, i0> qVar1117 = qVar5;
                n(mkVar16, mVar2, z16, null, lVar3, qVar1116, qVar1117, rVarH, i6111111 | (458752 & i6111112) | (i6111112 & 3670016), 8);
                b1.l lVar110 = lVar3;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                eVar2 = eVarB;
                qVar3 = qVar1116;
                z18 = z16;
                qVar4 = qVar1117;
                lVar4 = lVar110;
                mjVar2 = mjVarR;
                aVar3 = aVar2;
            } else {
                rVarH.O();
                i49 = i15;
                qVar3 = qVar;
                eVar2 = eVar;
                z18 = z16;
                qVar4 = qVar2;
                lVar4 = lVar3;
                aVar3 = aVar2;
                mjVar2 = mjVarR;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final f3.m mVar18 = mVar2;
                final int i6111113 = i49;
                d5VarM.a(new p() { // from class: f2.ak
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ik.t(f15, lVar, mVar18, z18, aVar3, mjVar2, lVar4, i6111113, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i25 = i18 & 8;
        if (i25 != 0) {
            if ((i16 & 3072) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i19 |= i26;
            }
            i27 = i18 & 16;
            if (i27 != 0) {
                if ((i16 & 24576) == 0) {
                    aVar2 = aVar;
                    if (rVarH.G(aVar2)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i19 |= i28;
                }
                if ((196608 & i16) == 0) {
                    if ((i18 & 32) == 0) {
                        mjVarR = mjVar;
                        if (rVarH.W(mjVarR)) {
                            i59 = PKIFailureInfo.unsupportedVersion;
                        }
                        i19 |= i59;
                    } else {
                        mjVarR = mjVar;
                    }
                    i59 = PKIFailureInfo.notAuthorized;
                    i19 |= i59;
                } else {
                    mjVarR = mjVar;
                }
                i29 = i18 & 64;
                if (i29 != 0) {
                    i19 |= 1572864;
                    lVar3 = lVar2;
                } else {
                    lVar3 = lVar2;
                    if ((i16 & 1572864) == 0) {
                        if (rVarH.W(lVar3)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i35;
                    }
                }
                i36 = i18 & 128;
                if (i36 != 0) {
                    i19 |= 12582912;
                } else if ((i16 & 12582912) == 0) {
                    if (rVarH.c(i15)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i19 |= i37;
                }
                i38 = i18 & 256;
                if (i38 != 0) {
                    if ((i16 & 100663296) == 0) {
                        if (rVarH.G(qVar)) {
                            i39 = 67108864;
                        } else {
                            i39 = 33554432;
                        }
                        i19 |= i39;
                    }
                    i45 = i18 & 512;
                    if (i45 != 0) {
                        if ((i16 & 805306368) == 0) {
                            if (rVarH.G(qVar2)) {
                                i46 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i46 = 268435456;
                            }
                            i19 |= i46;
                        }
                        if ((i17 & 6) == 0) {
                            i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                        } else {
                            i47 = i17;
                        }
                        i48 = i19;
                        if ((i19 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i48 & 1)) {
                            rVarH.I();
                            if ((i16 & 1) != 0) {
                                if (i65 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if (i25 != 0) {
                                    z16 = true;
                                }
                                if (i27 != 0) {
                                    aVar2 = null;
                                }
                                if ((i18 & 32) != 0) {
                                    i55 = i48 & (-458753);
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                } else {
                                    i55 = i48;
                                }
                                if (i29 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar3 = (b1.l) objE;
                                }
                                if (i36 != 0) {
                                    i56 = 0;
                                } else {
                                    i56 = i15;
                                }
                                if (i38 != 0) {
                                    qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD = qVar;
                                }
                                if (i45 != 0) {
                                    qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD2 = qVar2;
                                }
                                if ((i18 & 1024) != 0) {
                                    eVarB = m.b(0.0f, 1.0f);
                                    i47 &= -15;
                                } else {
                                    eVarB = eVar;
                                }
                                i57 = i55;
                                i58 = i47;
                                qVar5 = qVarD2;
                                i49 = i56;
                            } else {
                                if (i65 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if (i25 != 0) {
                                    z16 = true;
                                }
                                if (i27 != 0) {
                                    aVar2 = null;
                                }
                                if ((i18 & 32) != 0) {
                                    i55 = i48 & (-458753);
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                } else {
                                    i55 = i48;
                                }
                                if (i29 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar3 = (b1.l) objE;
                                }
                                if (i36 != 0) {
                                    i56 = 0;
                                } else {
                                    i56 = i15;
                                }
                                if (i38 != 0) {
                                    qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD = qVar;
                                }
                                if (i45 != 0) {
                                    qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                } else {
                                    qVarD2 = qVar2;
                                }
                                if ((i18 & 1024) != 0) {
                                    eVarB = m.b(0.0f, 1.0f);
                                    i47 &= -15;
                                } else {
                                    eVarB = eVar;
                                }
                                i57 = i55;
                                i58 = i47;
                                qVar5 = qVarD2;
                                i49 = i56;
                            }
                            rVarH.y();
                            er.q<? super mk, ? super r, ? super Integer, i0> qVar1118 = qVarD;
                            if (p076m2.t.k()) {
                                p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                            }
                            if ((29360128 & i57) == 8388608) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                            objE2 = rVarH.E();
                            if (z25) {
                                objE2 = new mk(f15, i49, aVar2, eVarB);
                                rVarH.v(objE2);
                            } else {
                                objE2 = new mk(f15, i49, aVar2, eVarB);
                                rVarH.v(objE2);
                            }
                            mk mkVar17 = (mk) objE2;
                            mkVar17.G(aVar2);
                            mkVar17.F(lVar);
                            mkVar17.O(f15);
                            int i6111114 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                            int i6111115 = i57 >> 9;
                            er.q<? super mk, ? super r, ? super Integer, i0> qVar1119 = qVar5;
                            n(mkVar17, mVar2, z16, null, lVar3, qVar1118, qVar1119, rVarH, i6111114 | (458752 & i6111115) | (i6111115 & 3670016), 8);
                            b1.l lVar111 = lVar3;
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            eVar2 = eVarB;
                            qVar3 = qVar1118;
                            z18 = z16;
                            qVar4 = qVar1119;
                            lVar4 = lVar111;
                            mjVar2 = mjVarR;
                            aVar3 = aVar2;
                        } else {
                            rVarH.O();
                            i49 = i15;
                            qVar3 = qVar;
                            eVar2 = eVar;
                            z18 = z16;
                            qVar4 = qVar2;
                            lVar4 = lVar3;
                            aVar3 = aVar2;
                            mjVar2 = mjVarR;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            final f3.m mVar19 = mVar2;
                            final int i6111116 = i49;
                            d5VarM.a(new p() { // from class: f2.ak
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ik.t(f15, lVar, mVar19, z18, aVar3, mjVar2, lVar4, i6111116, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 805306368;
                    if ((i17 & 6) == 0) {
                        i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                    } else {
                        i47 = i17;
                    }
                    i48 = i19;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i48 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        }
                        rVarH.y();
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar11110 = qVarD;
                        if (p076m2.t.k()) {
                            p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                        }
                        if ((29360128 & i57) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                        objE2 = rVarH.E();
                        if (z25) {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        }
                        mk mkVar18 = (mk) objE2;
                        mkVar18.G(aVar2);
                        mkVar18.F(lVar);
                        mkVar18.O(f15);
                        int i6111117 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                        int i6111118 = i57 >> 9;
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar11111 = qVar5;
                        n(mkVar18, mVar2, z16, null, lVar3, qVar11110, qVar11111, rVarH, i6111117 | (458752 & i6111118) | (i6111118 & 3670016), 8);
                        b1.l lVar112 = lVar3;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        eVar2 = eVarB;
                        qVar3 = qVar11110;
                        z18 = z16;
                        qVar4 = qVar11111;
                        lVar4 = lVar112;
                        mjVar2 = mjVarR;
                        aVar3 = aVar2;
                    } else {
                        rVarH.O();
                        i49 = i15;
                        qVar3 = qVar;
                        eVar2 = eVar;
                        z18 = z16;
                        qVar4 = qVar2;
                        lVar4 = lVar3;
                        aVar3 = aVar2;
                        mjVar2 = mjVarR;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        final f3.m mVar110 = mVar2;
                        final int i6111119 = i49;
                        d5VarM.a(new p() { // from class: f2.ak
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.t(f15, lVar, mVar110, z18, aVar3, mjVar2, lVar4, i6111119, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 100663296;
                i45 = i18 & 512;
                if (i45 != 0) {
                    if ((i16 & 805306368) == 0) {
                        if (rVarH.G(qVar2)) {
                            i46 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i46 = 268435456;
                        }
                        i19 |= i46;
                    }
                    if ((i17 & 6) == 0) {
                        i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                    } else {
                        i47 = i17;
                    }
                    i48 = i19;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i48 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        }
                        rVarH.y();
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar11112 = qVarD;
                        if (p076m2.t.k()) {
                            p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                        }
                        if ((29360128 & i57) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                        objE2 = rVarH.E();
                        if (z25) {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        }
                        mk mkVar19 = (mk) objE2;
                        mkVar19.G(aVar2);
                        mkVar19.F(lVar);
                        mkVar19.O(f15);
                        int i61111110 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                        int i61111111 = i57 >> 9;
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar11113 = qVar5;
                        n(mkVar19, mVar2, z16, null, lVar3, qVar11112, qVar11113, rVarH, i61111110 | (458752 & i61111111) | (i61111111 & 3670016), 8);
                        b1.l lVar113 = lVar3;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        eVar2 = eVarB;
                        qVar3 = qVar11112;
                        z18 = z16;
                        qVar4 = qVar11113;
                        lVar4 = lVar113;
                        mjVar2 = mjVarR;
                        aVar3 = aVar2;
                    } else {
                        rVarH.O();
                        i49 = i15;
                        qVar3 = qVar;
                        eVar2 = eVar;
                        z18 = z16;
                        qVar4 = qVar2;
                        lVar4 = lVar3;
                        aVar3 = aVar2;
                        mjVar2 = mjVarR;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        final f3.m mVar111 = mVar2;
                        final int i61111112 = i49;
                        d5VarM.a(new p() { // from class: f2.ak
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.t(f15, lVar, mVar111, z18, aVar3, mjVar2, lVar4, i61111112, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 805306368;
                if ((i17 & 6) == 0) {
                    i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                } else {
                    i47 = i17;
                }
                i48 = i19;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i48 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    }
                    rVarH.y();
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar11114 = qVarD;
                    if (p076m2.t.k()) {
                        p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                    }
                    if ((29360128 & i57) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                    objE2 = rVarH.E();
                    if (z25) {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    }
                    mk mkVar110 = (mk) objE2;
                    mkVar110.G(aVar2);
                    mkVar110.F(lVar);
                    mkVar110.O(f15);
                    int i61111113 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                    int i61111114 = i57 >> 9;
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar11115 = qVar5;
                    n(mkVar110, mVar2, z16, null, lVar3, qVar11114, qVar11115, rVarH, i61111113 | (458752 & i61111114) | (i61111114 & 3670016), 8);
                    b1.l lVar114 = lVar3;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    eVar2 = eVarB;
                    qVar3 = qVar11114;
                    z18 = z16;
                    qVar4 = qVar11115;
                    lVar4 = lVar114;
                    mjVar2 = mjVarR;
                    aVar3 = aVar2;
                } else {
                    rVarH.O();
                    i49 = i15;
                    qVar3 = qVar;
                    eVar2 = eVar;
                    z18 = z16;
                    qVar4 = qVar2;
                    lVar4 = lVar3;
                    aVar3 = aVar2;
                    mjVar2 = mjVarR;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar112 = mVar2;
                    final int i61111115 = i49;
                    d5VarM.a(new p() { // from class: f2.ak
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.t(f15, lVar, mVar112, z18, aVar3, mjVar2, lVar4, i61111115, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 24576;
            aVar2 = aVar;
            if ((196608 & i16) == 0) {
                if ((i18 & 32) == 0) {
                    mjVarR = mjVar;
                    if (rVarH.W(mjVarR)) {
                        i59 = PKIFailureInfo.unsupportedVersion;
                    }
                    i19 |= i59;
                } else {
                    mjVarR = mjVar;
                }
                i59 = PKIFailureInfo.notAuthorized;
                i19 |= i59;
            } else {
                mjVarR = mjVar;
            }
            i29 = i18 & 64;
            if (i29 != 0) {
                i19 |= 1572864;
                lVar3 = lVar2;
            } else {
                lVar3 = lVar2;
                if ((i16 & 1572864) == 0) {
                    if (rVarH.W(lVar3)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i35;
                }
            }
            i36 = i18 & 128;
            if (i36 != 0) {
                i19 |= 12582912;
            } else if ((i16 & 12582912) == 0) {
                if (rVarH.c(i15)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i19 |= i37;
            }
            i38 = i18 & 256;
            if (i38 != 0) {
                if ((i16 & 100663296) == 0) {
                    if (rVarH.G(qVar)) {
                        i39 = 67108864;
                    } else {
                        i39 = 33554432;
                    }
                    i19 |= i39;
                }
                i45 = i18 & 512;
                if (i45 != 0) {
                    if ((i16 & 805306368) == 0) {
                        if (rVarH.G(qVar2)) {
                            i46 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i46 = 268435456;
                        }
                        i19 |= i46;
                    }
                    if ((i17 & 6) == 0) {
                        i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                    } else {
                        i47 = i17;
                    }
                    i48 = i19;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i48 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        }
                        rVarH.y();
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar11116 = qVarD;
                        if (p076m2.t.k()) {
                            p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                        }
                        if ((29360128 & i57) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                        objE2 = rVarH.E();
                        if (z25) {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        }
                        mk mkVar111 = (mk) objE2;
                        mkVar111.G(aVar2);
                        mkVar111.F(lVar);
                        mkVar111.O(f15);
                        int i61111116 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                        int i61111117 = i57 >> 9;
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar11117 = qVar5;
                        n(mkVar111, mVar2, z16, null, lVar3, qVar11116, qVar11117, rVarH, i61111116 | (458752 & i61111117) | (i61111117 & 3670016), 8);
                        b1.l lVar115 = lVar3;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        eVar2 = eVarB;
                        qVar3 = qVar11116;
                        z18 = z16;
                        qVar4 = qVar11117;
                        lVar4 = lVar115;
                        mjVar2 = mjVarR;
                        aVar3 = aVar2;
                    } else {
                        rVarH.O();
                        i49 = i15;
                        qVar3 = qVar;
                        eVar2 = eVar;
                        z18 = z16;
                        qVar4 = qVar2;
                        lVar4 = lVar3;
                        aVar3 = aVar2;
                        mjVar2 = mjVarR;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        final f3.m mVar113 = mVar2;
                        final int i61111118 = i49;
                        d5VarM.a(new p() { // from class: f2.ak
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.t(f15, lVar, mVar113, z18, aVar3, mjVar2, lVar4, i61111118, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 805306368;
                if ((i17 & 6) == 0) {
                    i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                } else {
                    i47 = i17;
                }
                i48 = i19;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i48 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    }
                    rVarH.y();
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar11118 = qVarD;
                    if (p076m2.t.k()) {
                        p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                    }
                    if ((29360128 & i57) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                    objE2 = rVarH.E();
                    if (z25) {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    }
                    mk mkVar112 = (mk) objE2;
                    mkVar112.G(aVar2);
                    mkVar112.F(lVar);
                    mkVar112.O(f15);
                    int i61111119 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                    int i611111110 = i57 >> 9;
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar11119 = qVar5;
                    n(mkVar112, mVar2, z16, null, lVar3, qVar11118, qVar11119, rVarH, i61111119 | (458752 & i611111110) | (i611111110 & 3670016), 8);
                    b1.l lVar116 = lVar3;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    eVar2 = eVarB;
                    qVar3 = qVar11118;
                    z18 = z16;
                    qVar4 = qVar11119;
                    lVar4 = lVar116;
                    mjVar2 = mjVarR;
                    aVar3 = aVar2;
                } else {
                    rVarH.O();
                    i49 = i15;
                    qVar3 = qVar;
                    eVar2 = eVar;
                    z18 = z16;
                    qVar4 = qVar2;
                    lVar4 = lVar3;
                    aVar3 = aVar2;
                    mjVar2 = mjVarR;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar114 = mVar2;
                    final int i611111111 = i49;
                    d5VarM.a(new p() { // from class: f2.ak
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.t(f15, lVar, mVar114, z18, aVar3, mjVar2, lVar4, i611111111, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 100663296;
            i45 = i18 & 512;
            if (i45 != 0) {
                if ((i16 & 805306368) == 0) {
                    if (rVarH.G(qVar2)) {
                        i46 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i46 = 268435456;
                    }
                    i19 |= i46;
                }
                if ((i17 & 6) == 0) {
                    i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                } else {
                    i47 = i17;
                }
                i48 = i19;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i48 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    }
                    rVarH.y();
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar111110 = qVarD;
                    if (p076m2.t.k()) {
                        p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                    }
                    if ((29360128 & i57) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                    objE2 = rVarH.E();
                    if (z25) {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    }
                    mk mkVar113 = (mk) objE2;
                    mkVar113.G(aVar2);
                    mkVar113.F(lVar);
                    mkVar113.O(f15);
                    int i611111112 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                    int i611111113 = i57 >> 9;
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar111111 = qVar5;
                    n(mkVar113, mVar2, z16, null, lVar3, qVar111110, qVar111111, rVarH, i611111112 | (458752 & i611111113) | (i611111113 & 3670016), 8);
                    b1.l lVar117 = lVar3;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    eVar2 = eVarB;
                    qVar3 = qVar111110;
                    z18 = z16;
                    qVar4 = qVar111111;
                    lVar4 = lVar117;
                    mjVar2 = mjVarR;
                    aVar3 = aVar2;
                } else {
                    rVarH.O();
                    i49 = i15;
                    qVar3 = qVar;
                    eVar2 = eVar;
                    z18 = z16;
                    qVar4 = qVar2;
                    lVar4 = lVar3;
                    aVar3 = aVar2;
                    mjVar2 = mjVarR;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar115 = mVar2;
                    final int i611111114 = i49;
                    d5VarM.a(new p() { // from class: f2.ak
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.t(f15, lVar, mVar115, z18, aVar3, mjVar2, lVar4, i611111114, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 805306368;
            if ((i17 & 6) == 0) {
                i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
            } else {
                i47 = i17;
            }
            i48 = i19;
            if ((i19 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i48 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i25 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        aVar2 = null;
                    }
                    if ((i18 & 32) != 0) {
                        i55 = i48 & (-458753);
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    } else {
                        i55 = i48;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar3 = (b1.l) objE;
                    }
                    if (i36 != 0) {
                        i56 = 0;
                    } else {
                        i56 = i15;
                    }
                    if (i38 != 0) {
                        qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar;
                    }
                    if (i45 != 0) {
                        qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD2 = qVar2;
                    }
                    if ((i18 & 1024) != 0) {
                        eVarB = m.b(0.0f, 1.0f);
                        i47 &= -15;
                    } else {
                        eVarB = eVar;
                    }
                    i57 = i55;
                    i58 = i47;
                    qVar5 = qVarD2;
                    i49 = i56;
                } else {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i25 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        aVar2 = null;
                    }
                    if ((i18 & 32) != 0) {
                        i55 = i48 & (-458753);
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    } else {
                        i55 = i48;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar3 = (b1.l) objE;
                    }
                    if (i36 != 0) {
                        i56 = 0;
                    } else {
                        i56 = i15;
                    }
                    if (i38 != 0) {
                        qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar;
                    }
                    if (i45 != 0) {
                        qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD2 = qVar2;
                    }
                    if ((i18 & 1024) != 0) {
                        eVarB = m.b(0.0f, 1.0f);
                        i47 &= -15;
                    } else {
                        eVarB = eVar;
                    }
                    i57 = i55;
                    i58 = i47;
                    qVar5 = qVarD2;
                    i49 = i56;
                }
                rVarH.y();
                er.q<? super mk, ? super r, ? super Integer, i0> qVar111112 = qVarD;
                if (p076m2.t.k()) {
                    p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                }
                if ((29360128 & i57) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                objE2 = rVarH.E();
                if (z25) {
                    objE2 = new mk(f15, i49, aVar2, eVarB);
                    rVarH.v(objE2);
                } else {
                    objE2 = new mk(f15, i49, aVar2, eVarB);
                    rVarH.v(objE2);
                }
                mk mkVar114 = (mk) objE2;
                mkVar114.G(aVar2);
                mkVar114.F(lVar);
                mkVar114.O(f15);
                int i611111115 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                int i611111116 = i57 >> 9;
                er.q<? super mk, ? super r, ? super Integer, i0> qVar111113 = qVar5;
                n(mkVar114, mVar2, z16, null, lVar3, qVar111112, qVar111113, rVarH, i611111115 | (458752 & i611111116) | (i611111116 & 3670016), 8);
                b1.l lVar118 = lVar3;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                eVar2 = eVarB;
                qVar3 = qVar111112;
                z18 = z16;
                qVar4 = qVar111113;
                lVar4 = lVar118;
                mjVar2 = mjVarR;
                aVar3 = aVar2;
            } else {
                rVarH.O();
                i49 = i15;
                qVar3 = qVar;
                eVar2 = eVar;
                z18 = z16;
                qVar4 = qVar2;
                lVar4 = lVar3;
                aVar3 = aVar2;
                mjVar2 = mjVarR;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final f3.m mVar116 = mVar2;
                final int i611111117 = i49;
                d5VarM.a(new p() { // from class: f2.ak
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ik.t(f15, lVar, mVar116, z18, aVar3, mjVar2, lVar4, i611111117, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 3072;
        z16 = z15;
        i27 = i18 & 16;
        if (i27 != 0) {
            if ((i16 & 24576) == 0) {
                aVar2 = aVar;
                if (rVarH.G(aVar2)) {
                    i28 = 16384;
                } else {
                    i28 = PKIFailureInfo.certRevoked;
                }
                i19 |= i28;
            }
            if ((196608 & i16) == 0) {
                if ((i18 & 32) == 0) {
                    mjVarR = mjVar;
                    if (rVarH.W(mjVarR)) {
                        i59 = PKIFailureInfo.unsupportedVersion;
                    }
                    i19 |= i59;
                } else {
                    mjVarR = mjVar;
                }
                i59 = PKIFailureInfo.notAuthorized;
                i19 |= i59;
            } else {
                mjVarR = mjVar;
            }
            i29 = i18 & 64;
            if (i29 != 0) {
                i19 |= 1572864;
                lVar3 = lVar2;
            } else {
                lVar3 = lVar2;
                if ((i16 & 1572864) == 0) {
                    if (rVarH.W(lVar3)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i35;
                }
            }
            i36 = i18 & 128;
            if (i36 != 0) {
                i19 |= 12582912;
            } else if ((i16 & 12582912) == 0) {
                if (rVarH.c(i15)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i19 |= i37;
            }
            i38 = i18 & 256;
            if (i38 != 0) {
                if ((i16 & 100663296) == 0) {
                    if (rVarH.G(qVar)) {
                        i39 = 67108864;
                    } else {
                        i39 = 33554432;
                    }
                    i19 |= i39;
                }
                i45 = i18 & 512;
                if (i45 != 0) {
                    if ((i16 & 805306368) == 0) {
                        if (rVarH.G(qVar2)) {
                            i46 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i46 = 268435456;
                        }
                        i19 |= i46;
                    }
                    if ((i17 & 6) == 0) {
                        i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                    } else {
                        i47 = i17;
                    }
                    i48 = i19;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i48 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i25 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                aVar2 = null;
                            }
                            if ((i18 & 32) != 0) {
                                i55 = i48 & (-458753);
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            } else {
                                i55 = i48;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar3 = (b1.l) objE;
                            }
                            if (i36 != 0) {
                                i56 = 0;
                            } else {
                                i56 = i15;
                            }
                            if (i38 != 0) {
                                qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar;
                            }
                            if (i45 != 0) {
                                qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD2 = qVar2;
                            }
                            if ((i18 & 1024) != 0) {
                                eVarB = m.b(0.0f, 1.0f);
                                i47 &= -15;
                            } else {
                                eVarB = eVar;
                            }
                            i57 = i55;
                            i58 = i47;
                            qVar5 = qVarD2;
                            i49 = i56;
                        }
                        rVarH.y();
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar111114 = qVarD;
                        if (p076m2.t.k()) {
                            p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                        }
                        if ((29360128 & i57) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                        objE2 = rVarH.E();
                        if (z25) {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new mk(f15, i49, aVar2, eVarB);
                            rVarH.v(objE2);
                        }
                        mk mkVar115 = (mk) objE2;
                        mkVar115.G(aVar2);
                        mkVar115.F(lVar);
                        mkVar115.O(f15);
                        int i611111118 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                        int i611111119 = i57 >> 9;
                        er.q<? super mk, ? super r, ? super Integer, i0> qVar111115 = qVar5;
                        n(mkVar115, mVar2, z16, null, lVar3, qVar111114, qVar111115, rVarH, i611111118 | (458752 & i611111119) | (i611111119 & 3670016), 8);
                        b1.l lVar119 = lVar3;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        eVar2 = eVarB;
                        qVar3 = qVar111114;
                        z18 = z16;
                        qVar4 = qVar111115;
                        lVar4 = lVar119;
                        mjVar2 = mjVarR;
                        aVar3 = aVar2;
                    } else {
                        rVarH.O();
                        i49 = i15;
                        qVar3 = qVar;
                        eVar2 = eVar;
                        z18 = z16;
                        qVar4 = qVar2;
                        lVar4 = lVar3;
                        aVar3 = aVar2;
                        mjVar2 = mjVarR;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        final f3.m mVar117 = mVar2;
                        final int i6111111110 = i49;
                        d5VarM.a(new p() { // from class: f2.ak
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.t(f15, lVar, mVar117, z18, aVar3, mjVar2, lVar4, i6111111110, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 805306368;
                if ((i17 & 6) == 0) {
                    i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                } else {
                    i47 = i17;
                }
                i48 = i19;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i48 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    }
                    rVarH.y();
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar111116 = qVarD;
                    if (p076m2.t.k()) {
                        p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                    }
                    if ((29360128 & i57) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                    objE2 = rVarH.E();
                    if (z25) {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    }
                    mk mkVar116 = (mk) objE2;
                    mkVar116.G(aVar2);
                    mkVar116.F(lVar);
                    mkVar116.O(f15);
                    int i6111111111 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                    int i6111111112 = i57 >> 9;
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar111117 = qVar5;
                    n(mkVar116, mVar2, z16, null, lVar3, qVar111116, qVar111117, rVarH, i6111111111 | (458752 & i6111111112) | (i6111111112 & 3670016), 8);
                    b1.l lVar1110 = lVar3;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    eVar2 = eVarB;
                    qVar3 = qVar111116;
                    z18 = z16;
                    qVar4 = qVar111117;
                    lVar4 = lVar1110;
                    mjVar2 = mjVarR;
                    aVar3 = aVar2;
                } else {
                    rVarH.O();
                    i49 = i15;
                    qVar3 = qVar;
                    eVar2 = eVar;
                    z18 = z16;
                    qVar4 = qVar2;
                    lVar4 = lVar3;
                    aVar3 = aVar2;
                    mjVar2 = mjVarR;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar118 = mVar2;
                    final int i6111111113 = i49;
                    d5VarM.a(new p() { // from class: f2.ak
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.t(f15, lVar, mVar118, z18, aVar3, mjVar2, lVar4, i6111111113, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 100663296;
            i45 = i18 & 512;
            if (i45 != 0) {
                if ((i16 & 805306368) == 0) {
                    if (rVarH.G(qVar2)) {
                        i46 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i46 = 268435456;
                    }
                    i19 |= i46;
                }
                if ((i17 & 6) == 0) {
                    i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                } else {
                    i47 = i17;
                }
                i48 = i19;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i48 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    }
                    rVarH.y();
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar111118 = qVarD;
                    if (p076m2.t.k()) {
                        p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                    }
                    if ((29360128 & i57) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                    objE2 = rVarH.E();
                    if (z25) {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    }
                    mk mkVar117 = (mk) objE2;
                    mkVar117.G(aVar2);
                    mkVar117.F(lVar);
                    mkVar117.O(f15);
                    int i6111111114 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                    int i6111111115 = i57 >> 9;
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar111119 = qVar5;
                    n(mkVar117, mVar2, z16, null, lVar3, qVar111118, qVar111119, rVarH, i6111111114 | (458752 & i6111111115) | (i6111111115 & 3670016), 8);
                    b1.l lVar1111 = lVar3;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    eVar2 = eVarB;
                    qVar3 = qVar111118;
                    z18 = z16;
                    qVar4 = qVar111119;
                    lVar4 = lVar1111;
                    mjVar2 = mjVarR;
                    aVar3 = aVar2;
                } else {
                    rVarH.O();
                    i49 = i15;
                    qVar3 = qVar;
                    eVar2 = eVar;
                    z18 = z16;
                    qVar4 = qVar2;
                    lVar4 = lVar3;
                    aVar3 = aVar2;
                    mjVar2 = mjVarR;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar119 = mVar2;
                    final int i6111111116 = i49;
                    d5VarM.a(new p() { // from class: f2.ak
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.t(f15, lVar, mVar119, z18, aVar3, mjVar2, lVar4, i6111111116, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 805306368;
            if ((i17 & 6) == 0) {
                i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
            } else {
                i47 = i17;
            }
            i48 = i19;
            if ((i19 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i48 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i25 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        aVar2 = null;
                    }
                    if ((i18 & 32) != 0) {
                        i55 = i48 & (-458753);
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    } else {
                        i55 = i48;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar3 = (b1.l) objE;
                    }
                    if (i36 != 0) {
                        i56 = 0;
                    } else {
                        i56 = i15;
                    }
                    if (i38 != 0) {
                        qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar;
                    }
                    if (i45 != 0) {
                        qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD2 = qVar2;
                    }
                    if ((i18 & 1024) != 0) {
                        eVarB = m.b(0.0f, 1.0f);
                        i47 &= -15;
                    } else {
                        eVarB = eVar;
                    }
                    i57 = i55;
                    i58 = i47;
                    qVar5 = qVarD2;
                    i49 = i56;
                } else {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i25 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        aVar2 = null;
                    }
                    if ((i18 & 32) != 0) {
                        i55 = i48 & (-458753);
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    } else {
                        i55 = i48;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar3 = (b1.l) objE;
                    }
                    if (i36 != 0) {
                        i56 = 0;
                    } else {
                        i56 = i15;
                    }
                    if (i38 != 0) {
                        qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar;
                    }
                    if (i45 != 0) {
                        qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD2 = qVar2;
                    }
                    if ((i18 & 1024) != 0) {
                        eVarB = m.b(0.0f, 1.0f);
                        i47 &= -15;
                    } else {
                        eVarB = eVar;
                    }
                    i57 = i55;
                    i58 = i47;
                    qVar5 = qVarD2;
                    i49 = i56;
                }
                rVarH.y();
                er.q<? super mk, ? super r, ? super Integer, i0> qVar1111110 = qVarD;
                if (p076m2.t.k()) {
                    p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                }
                if ((29360128 & i57) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                objE2 = rVarH.E();
                if (z25) {
                    objE2 = new mk(f15, i49, aVar2, eVarB);
                    rVarH.v(objE2);
                } else {
                    objE2 = new mk(f15, i49, aVar2, eVarB);
                    rVarH.v(objE2);
                }
                mk mkVar118 = (mk) objE2;
                mkVar118.G(aVar2);
                mkVar118.F(lVar);
                mkVar118.O(f15);
                int i6111111117 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                int i6111111118 = i57 >> 9;
                er.q<? super mk, ? super r, ? super Integer, i0> qVar1111111 = qVar5;
                n(mkVar118, mVar2, z16, null, lVar3, qVar1111110, qVar1111111, rVarH, i6111111117 | (458752 & i6111111118) | (i6111111118 & 3670016), 8);
                b1.l lVar1112 = lVar3;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                eVar2 = eVarB;
                qVar3 = qVar1111110;
                z18 = z16;
                qVar4 = qVar1111111;
                lVar4 = lVar1112;
                mjVar2 = mjVarR;
                aVar3 = aVar2;
            } else {
                rVarH.O();
                i49 = i15;
                qVar3 = qVar;
                eVar2 = eVar;
                z18 = z16;
                qVar4 = qVar2;
                lVar4 = lVar3;
                aVar3 = aVar2;
                mjVar2 = mjVarR;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final f3.m mVar1110 = mVar2;
                final int i6111111119 = i49;
                d5VarM.a(new p() { // from class: f2.ak
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ik.t(f15, lVar, mVar1110, z18, aVar3, mjVar2, lVar4, i6111111119, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 24576;
        aVar2 = aVar;
        if ((196608 & i16) == 0) {
            if ((i18 & 32) == 0) {
                mjVarR = mjVar;
                if (rVarH.W(mjVarR)) {
                    i59 = PKIFailureInfo.unsupportedVersion;
                }
                i19 |= i59;
            } else {
                mjVarR = mjVar;
            }
            i59 = PKIFailureInfo.notAuthorized;
            i19 |= i59;
        } else {
            mjVarR = mjVar;
        }
        i29 = i18 & 64;
        if (i29 != 0) {
            i19 |= 1572864;
            lVar3 = lVar2;
        } else {
            lVar3 = lVar2;
            if ((i16 & 1572864) == 0) {
                if (rVarH.W(lVar3)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i19 |= i35;
            }
        }
        i36 = i18 & 128;
        if (i36 != 0) {
            i19 |= 12582912;
        } else if ((i16 & 12582912) == 0) {
            if (rVarH.c(i15)) {
                i37 = 8388608;
            } else {
                i37 = 4194304;
            }
            i19 |= i37;
        }
        i38 = i18 & 256;
        if (i38 != 0) {
            if ((i16 & 100663296) == 0) {
                if (rVarH.G(qVar)) {
                    i39 = 67108864;
                } else {
                    i39 = 33554432;
                }
                i19 |= i39;
            }
            i45 = i18 & 512;
            if (i45 != 0) {
                if ((i16 & 805306368) == 0) {
                    if (rVarH.G(qVar2)) {
                        i46 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i46 = 268435456;
                    }
                    i19 |= i46;
                }
                if ((i17 & 6) == 0) {
                    i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
                } else {
                    i47 = i17;
                }
                i48 = i19;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i48 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i25 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            aVar2 = null;
                        }
                        if ((i18 & 32) != 0) {
                            i55 = i48 & (-458753);
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        } else {
                            i55 = i48;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar3 = (b1.l) objE;
                        }
                        if (i36 != 0) {
                            i56 = 0;
                        } else {
                            i56 = i15;
                        }
                        if (i38 != 0) {
                            qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar;
                        }
                        if (i45 != 0) {
                            qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD2 = qVar2;
                        }
                        if ((i18 & 1024) != 0) {
                            eVarB = m.b(0.0f, 1.0f);
                            i47 &= -15;
                        } else {
                            eVarB = eVar;
                        }
                        i57 = i55;
                        i58 = i47;
                        qVar5 = qVarD2;
                        i49 = i56;
                    }
                    rVarH.y();
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar1111112 = qVarD;
                    if (p076m2.t.k()) {
                        p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                    }
                    if ((29360128 & i57) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                    objE2 = rVarH.E();
                    if (z25) {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new mk(f15, i49, aVar2, eVarB);
                        rVarH.v(objE2);
                    }
                    mk mkVar119 = (mk) objE2;
                    mkVar119.G(aVar2);
                    mkVar119.F(lVar);
                    mkVar119.O(f15);
                    int i61111111110 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                    int i61111111111 = i57 >> 9;
                    er.q<? super mk, ? super r, ? super Integer, i0> qVar1111113 = qVar5;
                    n(mkVar119, mVar2, z16, null, lVar3, qVar1111112, qVar1111113, rVarH, i61111111110 | (458752 & i61111111111) | (i61111111111 & 3670016), 8);
                    b1.l lVar1113 = lVar3;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    eVar2 = eVarB;
                    qVar3 = qVar1111112;
                    z18 = z16;
                    qVar4 = qVar1111113;
                    lVar4 = lVar1113;
                    mjVar2 = mjVarR;
                    aVar3 = aVar2;
                } else {
                    rVarH.O();
                    i49 = i15;
                    qVar3 = qVar;
                    eVar2 = eVar;
                    z18 = z16;
                    qVar4 = qVar2;
                    lVar4 = lVar3;
                    aVar3 = aVar2;
                    mjVar2 = mjVarR;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar1111 = mVar2;
                    final int i61111111112 = i49;
                    d5VarM.a(new p() { // from class: f2.ak
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.t(f15, lVar, mVar1111, z18, aVar3, mjVar2, lVar4, i61111111112, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 805306368;
            if ((i17 & 6) == 0) {
                i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
            } else {
                i47 = i17;
            }
            i48 = i19;
            if ((i19 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i48 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i25 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        aVar2 = null;
                    }
                    if ((i18 & 32) != 0) {
                        i55 = i48 & (-458753);
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    } else {
                        i55 = i48;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar3 = (b1.l) objE;
                    }
                    if (i36 != 0) {
                        i56 = 0;
                    } else {
                        i56 = i15;
                    }
                    if (i38 != 0) {
                        qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar;
                    }
                    if (i45 != 0) {
                        qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD2 = qVar2;
                    }
                    if ((i18 & 1024) != 0) {
                        eVarB = m.b(0.0f, 1.0f);
                        i47 &= -15;
                    } else {
                        eVarB = eVar;
                    }
                    i57 = i55;
                    i58 = i47;
                    qVar5 = qVarD2;
                    i49 = i56;
                } else {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i25 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        aVar2 = null;
                    }
                    if ((i18 & 32) != 0) {
                        i55 = i48 & (-458753);
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    } else {
                        i55 = i48;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar3 = (b1.l) objE;
                    }
                    if (i36 != 0) {
                        i56 = 0;
                    } else {
                        i56 = i15;
                    }
                    if (i38 != 0) {
                        qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar;
                    }
                    if (i45 != 0) {
                        qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD2 = qVar2;
                    }
                    if ((i18 & 1024) != 0) {
                        eVarB = m.b(0.0f, 1.0f);
                        i47 &= -15;
                    } else {
                        eVarB = eVar;
                    }
                    i57 = i55;
                    i58 = i47;
                    qVar5 = qVarD2;
                    i49 = i56;
                }
                rVarH.y();
                er.q<? super mk, ? super r, ? super Integer, i0> qVar1111114 = qVarD;
                if (p076m2.t.k()) {
                    p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                }
                if ((29360128 & i57) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                objE2 = rVarH.E();
                if (z25) {
                    objE2 = new mk(f15, i49, aVar2, eVarB);
                    rVarH.v(objE2);
                } else {
                    objE2 = new mk(f15, i49, aVar2, eVarB);
                    rVarH.v(objE2);
                }
                mk mkVar1110 = (mk) objE2;
                mkVar1110.G(aVar2);
                mkVar1110.F(lVar);
                mkVar1110.O(f15);
                int i61111111113 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                int i61111111114 = i57 >> 9;
                er.q<? super mk, ? super r, ? super Integer, i0> qVar1111115 = qVar5;
                n(mkVar1110, mVar2, z16, null, lVar3, qVar1111114, qVar1111115, rVarH, i61111111113 | (458752 & i61111111114) | (i61111111114 & 3670016), 8);
                b1.l lVar1114 = lVar3;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                eVar2 = eVarB;
                qVar3 = qVar1111114;
                z18 = z16;
                qVar4 = qVar1111115;
                lVar4 = lVar1114;
                mjVar2 = mjVarR;
                aVar3 = aVar2;
            } else {
                rVarH.O();
                i49 = i15;
                qVar3 = qVar;
                eVar2 = eVar;
                z18 = z16;
                qVar4 = qVar2;
                lVar4 = lVar3;
                aVar3 = aVar2;
                mjVar2 = mjVarR;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final f3.m mVar1112 = mVar2;
                final int i61111111115 = i49;
                d5VarM.a(new p() { // from class: f2.ak
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ik.t(f15, lVar, mVar1112, z18, aVar3, mjVar2, lVar4, i61111111115, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 100663296;
        i45 = i18 & 512;
        if (i45 != 0) {
            if ((i16 & 805306368) == 0) {
                if (rVarH.G(qVar2)) {
                    i46 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i46 = 268435456;
                }
                i19 |= i46;
            }
            if ((i17 & 6) == 0) {
                i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
            } else {
                i47 = i17;
            }
            i48 = i19;
            if ((i19 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i48 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i25 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        aVar2 = null;
                    }
                    if ((i18 & 32) != 0) {
                        i55 = i48 & (-458753);
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    } else {
                        i55 = i48;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar3 = (b1.l) objE;
                    }
                    if (i36 != 0) {
                        i56 = 0;
                    } else {
                        i56 = i15;
                    }
                    if (i38 != 0) {
                        qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar;
                    }
                    if (i45 != 0) {
                        qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD2 = qVar2;
                    }
                    if ((i18 & 1024) != 0) {
                        eVarB = m.b(0.0f, 1.0f);
                        i47 &= -15;
                    } else {
                        eVarB = eVar;
                    }
                    i57 = i55;
                    i58 = i47;
                    qVar5 = qVarD2;
                    i49 = i56;
                } else {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i25 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        aVar2 = null;
                    }
                    if ((i18 & 32) != 0) {
                        i55 = i48 & (-458753);
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    } else {
                        i55 = i48;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar3 = (b1.l) objE;
                    }
                    if (i36 != 0) {
                        i56 = 0;
                    } else {
                        i56 = i15;
                    }
                    if (i38 != 0) {
                        qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar;
                    }
                    if (i45 != 0) {
                        qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD2 = qVar2;
                    }
                    if ((i18 & 1024) != 0) {
                        eVarB = m.b(0.0f, 1.0f);
                        i47 &= -15;
                    } else {
                        eVarB = eVar;
                    }
                    i57 = i55;
                    i58 = i47;
                    qVar5 = qVarD2;
                    i49 = i56;
                }
                rVarH.y();
                er.q<? super mk, ? super r, ? super Integer, i0> qVar1111116 = qVarD;
                if (p076m2.t.k()) {
                    p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
                }
                if ((29360128 & i57) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
                objE2 = rVarH.E();
                if (z25) {
                    objE2 = new mk(f15, i49, aVar2, eVarB);
                    rVarH.v(objE2);
                } else {
                    objE2 = new mk(f15, i49, aVar2, eVarB);
                    rVarH.v(objE2);
                }
                mk mkVar1111 = (mk) objE2;
                mkVar1111.G(aVar2);
                mkVar1111.F(lVar);
                mkVar1111.O(f15);
                int i61111111116 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
                int i61111111117 = i57 >> 9;
                er.q<? super mk, ? super r, ? super Integer, i0> qVar1111117 = qVar5;
                n(mkVar1111, mVar2, z16, null, lVar3, qVar1111116, qVar1111117, rVarH, i61111111116 | (458752 & i61111111117) | (i61111111117 & 3670016), 8);
                b1.l lVar1115 = lVar3;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                eVar2 = eVarB;
                qVar3 = qVar1111116;
                z18 = z16;
                qVar4 = qVar1111117;
                lVar4 = lVar1115;
                mjVar2 = mjVarR;
                aVar3 = aVar2;
            } else {
                rVarH.O();
                i49 = i15;
                qVar3 = qVar;
                eVar2 = eVar;
                z18 = z16;
                qVar4 = qVar2;
                lVar4 = lVar3;
                aVar3 = aVar2;
                mjVar2 = mjVarR;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final f3.m mVar1113 = mVar2;
                final int i61111111118 = i49;
                d5VarM.a(new p() { // from class: f2.ak
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ik.t(f15, lVar, mVar1113, z18, aVar3, mjVar2, lVar4, i61111111118, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 805306368;
        if ((i17 & 6) == 0) {
            i47 = i17 | (((i18 & 1024) == 0 || !rVarH.W(eVar)) ? 2 : 4);
        } else {
            i47 = i17;
        }
        i48 = i19;
        if ((i19 & 306783379) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (rVarH.r(z17, i48 & 1)) {
            rVarH.I();
            if ((i16 & 1) != 0) {
                if (i65 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i25 != 0) {
                    z16 = true;
                }
                if (i27 != 0) {
                    aVar2 = null;
                }
                if ((i18 & 32) != 0) {
                    i55 = i48 & (-458753);
                    mjVarR = vj.f58107a.r(rVarH, 6);
                } else {
                    i55 = i48;
                }
                if (i29 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = b1.k.a();
                        rVarH.v(objE);
                    }
                    lVar3 = (b1.l) objE;
                }
                if (i36 != 0) {
                    i56 = 0;
                } else {
                    i56 = i15;
                }
                if (i38 != 0) {
                    qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                } else {
                    qVarD = qVar;
                }
                if (i45 != 0) {
                    qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                } else {
                    qVarD2 = qVar2;
                }
                if ((i18 & 1024) != 0) {
                    eVarB = m.b(0.0f, 1.0f);
                    i47 &= -15;
                } else {
                    eVarB = eVar;
                }
                i57 = i55;
                i58 = i47;
                qVar5 = qVarD2;
                i49 = i56;
            } else {
                if (i65 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i25 != 0) {
                    z16 = true;
                }
                if (i27 != 0) {
                    aVar2 = null;
                }
                if ((i18 & 32) != 0) {
                    i55 = i48 & (-458753);
                    mjVarR = vj.f58107a.r(rVarH, 6);
                } else {
                    i55 = i48;
                }
                if (i29 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = b1.k.a();
                        rVarH.v(objE);
                    }
                    lVar3 = (b1.l) objE;
                }
                if (i36 != 0) {
                    i56 = 0;
                } else {
                    i56 = i15;
                }
                if (i38 != 0) {
                    qVarD = y2.m.d(-1689130945, true, new er.q() { // from class: f2.wj
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return ik.r(lVar3, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                } else {
                    qVarD = qVar;
                }
                if (i45 != 0) {
                    qVarD2 = y2.m.d(-294493388, true, new er.q() { // from class: f2.zj
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return ik.s(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                } else {
                    qVarD2 = qVar2;
                }
                if ((i18 & 1024) != 0) {
                    eVarB = m.b(0.0f, 1.0f);
                    i47 &= -15;
                } else {
                    eVarB = eVar;
                }
                i57 = i55;
                i58 = i47;
                qVar5 = qVarD2;
                i49 = i56;
            }
            rVarH.y();
            er.q<? super mk, ? super r, ? super Integer, i0> qVar1111118 = qVarD;
            if (p076m2.t.k()) {
                p076m2.t.o(985901935, i57, i58, "androidx.compose.material3.Slider (Slider.kt:302)");
            }
            if ((29360128 & i57) == 8388608) {
                z19 = true;
            } else {
                z19 = false;
            }
            z25 = z19 | ((((i58 & 14) ^ 6) <= 4 && rVarH.W(eVarB)) || (i58 & 6) == 4);
            objE2 = rVarH.E();
            if (z25) {
                objE2 = new mk(f15, i49, aVar2, eVarB);
                rVarH.v(objE2);
            } else {
                objE2 = new mk(f15, i49, aVar2, eVarB);
                rVarH.v(objE2);
            }
            mk mkVar1112 = (mk) objE2;
            mkVar1112.G(aVar2);
            mkVar1112.F(lVar);
            mkVar1112.O(f15);
            int i61111111119 = ((i57 >> 3) & 1008) | ((i57 >> 6) & 57344);
            int i611111111110 = i57 >> 9;
            er.q<? super mk, ? super r, ? super Integer, i0> qVar1111119 = qVar5;
            n(mkVar1112, mVar2, z16, null, lVar3, qVar1111118, qVar1111119, rVarH, i61111111119 | (458752 & i611111111110) | (i611111111110 & 3670016), 8);
            b1.l lVar1116 = lVar3;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            eVar2 = eVarB;
            qVar3 = qVar1111118;
            z18 = z16;
            qVar4 = qVar1111119;
            lVar4 = lVar1116;
            mjVar2 = mjVarR;
            aVar3 = aVar2;
        } else {
            rVarH.O();
            i49 = i15;
            qVar3 = qVar;
            eVar2 = eVar;
            z18 = z16;
            qVar4 = qVar2;
            lVar4 = lVar3;
            aVar3 = aVar2;
            mjVar2 = mjVarR;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final f3.m mVar1114 = mVar2;
            final int i611111111111 = i49;
            d5VarM.a(new p() { // from class: f2.ak
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ik.t(f15, lVar, mVar1114, z18, aVar3, mjVar2, lVar4, i611111111111, qVar3, qVar4, eVar2, i16, i17, i18, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010f  */
    /* JADX WARN: Code duplicated, block: B:102:0x011b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:112:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x0161  */
    /* JADX WARN: Code duplicated, block: B:117:0x0183  */
    /* JADX WARN: Code duplicated, block: B:120:0x018d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0195  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x0096  */
    /* JADX WARN: Code duplicated, block: B:62:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:98:0x0103  */
    public static final void n(final mk mkVar, f3.m mVar, boolean z15, mj mjVar, b1.l lVar, er.q<? super mk, ? super r, ? super Integer, i0> qVar, er.q<? super mk, ? super r, ? super Integer, i0> qVar2, r rVar, final int i15, final int i16) {
        int i17;
        int i18;
        final boolean z16;
        int i19;
        final mj mjVarR;
        int i25;
        final b1.l lVar2;
        int i26;
        int i27;
        er.q<? super mk, ? super r, ? super Integer, i0> qVarD;
        int i28;
        int i29;
        er.q<? super mk, ? super r, ? super Integer, i0> qVarD2;
        int i35;
        boolean z17;
        final f3.m mVar2;
        final boolean z18;
        final mj mjVar2;
        final b1.l lVar3;
        final er.q<? super mk, ? super r, ? super Integer, i0> qVar3;
        final er.q<? super mk, ? super r, ? super Integer, i0> qVar4;
        d5 d5VarM;
        f3.m mVar3;
        boolean z19;
        er.q<? super mk, ? super r, ? super Integer, i0> qVar5;
        b1.l lVar4;
        f3.m mVar4;
        Object objE;
        r rVarH = rVar.h(409861960);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(mkVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i36 = i16 & 2;
        if (i36 == 0) {
            if ((i15 & 48) == 0) {
                i17 |= rVarH.W(mVar) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i15 & 3072) == 0) {
                    if ((i16 & 8) == 0) {
                        mjVarR = mjVar;
                        int i37 = rVarH.W(mjVarR) ? 2048 : 1024;
                        i17 |= i37;
                    } else {
                        mjVarR = mjVar;
                    }
                    i17 |= i37;
                } else {
                    mjVarR = mjVar;
                }
                i25 = i16 & 16;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        lVar2 = lVar;
                        if (rVarH.W(lVar2)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 32;
                    if (i27 != 0) {
                        if ((196608 & i15) == 0) {
                            qVarD = qVar;
                            if (rVarH.G(qVarD)) {
                                i28 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i28 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i28;
                        }
                        i29 = i16 & 64;
                        if (i29 != 0) {
                            if ((1572864 & i15) == 0) {
                                qVarD2 = qVar2;
                                if (rVarH.G(qVarD2)) {
                                    i35 = PKIFailureInfo.badCertTemplate;
                                } else {
                                    i35 = PKIFailureInfo.signerNotTrusted;
                                }
                                i17 |= i35;
                            }
                            if ((i17 & 599187) != 599186) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (rVarH.r(z17, i17 & 1)) {
                                rVarH.I();
                                if ((i15 & 1) != 0 || rVarH.Q()) {
                                    if (i36 != 0) {
                                        mVar3 = f3.m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i18 != 0) {
                                        z16 = true;
                                    }
                                    if ((i16 & 8) != 0) {
                                        i17 &= -7169;
                                        mjVarR = vj.f58107a.r(rVarH, 6);
                                    }
                                    if (i25 != 0) {
                                        objE = rVarH.E();
                                        if (objE == r.INSTANCE.a()) {
                                            objE = b1.k.a();
                                            rVarH.v(objE);
                                        }
                                        lVar2 = (b1.l) objE;
                                    }
                                    if (i27 != 0) {
                                        qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                            @Override // er.q
                                            public final Object w(Object obj, Object obj2, Object obj3) {
                                                return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                            }
                                        }, rVarH, 54);
                                    }
                                    if (i29 != 0) {
                                        qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                            @Override // er.q
                                            public final Object w(Object obj, Object obj2, Object obj3) {
                                                return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                            }
                                        }, rVarH, 54);
                                    }
                                    z19 = z16;
                                    qVar5 = qVarD;
                                    lVar4 = lVar2;
                                    mVar4 = mVar3;
                                } else {
                                    rVarH.O();
                                    if ((i16 & 8) != 0) {
                                        i17 &= -7169;
                                    }
                                    z19 = z16;
                                    qVar5 = qVarD;
                                    lVar4 = lVar2;
                                    mVar4 = mVar;
                                }
                                rVarH.y();
                                if (p076m2.t.k()) {
                                    p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                                }
                                if (mkVar.q() >= 0) {
                                    throw new IllegalArgumentException("steps should be >= 0");
                                }
                                int i38 = i17 >> 3;
                                u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i38 & 14) | ((i17 << 3) & 112) | (i38 & 7168) | (57344 & i38) | (i38 & 458752));
                                if (p076m2.t.k()) {
                                    p076m2.t.n();
                                }
                                mjVar2 = mjVarR;
                                mVar2 = mVar4;
                                z18 = z19;
                                lVar3 = lVar4;
                                qVar3 = qVar5;
                            } else {
                                rVarH.O();
                                mVar2 = mVar;
                                z18 = z16;
                                mjVar2 = mjVarR;
                                lVar3 = lVar2;
                                qVar3 = qVarD;
                            }
                            qVar4 = qVarD2;
                            d5VarM = rVarH.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: f2.dk
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i17 |= 1572864;
                        qVarD2 = qVar2;
                        if ((i17 & 599187) != 599186) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i36 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                }
                                if (i25 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar2 = (b1.l) objE;
                                }
                                if (i27 != 0) {
                                    qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                if (i29 != 0) {
                                    qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                z19 = z16;
                                qVar5 = qVarD;
                                lVar4 = lVar2;
                                mVar4 = mVar3;
                            } else {
                                if (i36 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                }
                                if (i25 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar2 = (b1.l) objE;
                                }
                                if (i27 != 0) {
                                    qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                if (i29 != 0) {
                                    qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                z19 = z16;
                                qVar5 = qVarD;
                                lVar4 = lVar2;
                                mVar4 = mVar3;
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                            }
                            if (mkVar.q() >= 0) {
                                throw new IllegalArgumentException("steps should be >= 0");
                            }
                            int i39 = i17 >> 3;
                            u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i39 & 14) | ((i17 << 3) & 112) | (i39 & 7168) | (57344 & i39) | (i39 & 458752));
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            mjVar2 = mjVarR;
                            mVar2 = mVar4;
                            z18 = z19;
                            lVar3 = lVar4;
                            qVar3 = qVar5;
                        } else {
                            rVarH.O();
                            mVar2 = mVar;
                            z18 = z16;
                            mjVar2 = mjVarR;
                            lVar3 = lVar2;
                            qVar3 = qVarD;
                        }
                        qVar4 = qVarD2;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.dk
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 196608;
                    qVarD = qVar;
                    i29 = i16 & 64;
                    if (i29 != 0) {
                        if ((1572864 & i15) == 0) {
                            qVarD2 = qVar2;
                            if (rVarH.G(qVarD2)) {
                                i35 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i35 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i35;
                        }
                        if ((i17 & 599187) != 599186) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i36 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                }
                                if (i25 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar2 = (b1.l) objE;
                                }
                                if (i27 != 0) {
                                    qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                if (i29 != 0) {
                                    qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                z19 = z16;
                                qVar5 = qVarD;
                                lVar4 = lVar2;
                                mVar4 = mVar3;
                            } else {
                                if (i36 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                }
                                if (i25 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar2 = (b1.l) objE;
                                }
                                if (i27 != 0) {
                                    qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                if (i29 != 0) {
                                    qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                z19 = z16;
                                qVar5 = qVarD;
                                lVar4 = lVar2;
                                mVar4 = mVar3;
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                            }
                            if (mkVar.q() >= 0) {
                                throw new IllegalArgumentException("steps should be >= 0");
                            }
                            int i310 = i17 >> 3;
                            u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i310 & 14) | ((i17 << 3) & 112) | (i310 & 7168) | (57344 & i310) | (i310 & 458752));
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            mjVar2 = mjVarR;
                            mVar2 = mVar4;
                            z18 = z19;
                            lVar3 = lVar4;
                            qVar3 = qVar5;
                        } else {
                            rVarH.O();
                            mVar2 = mVar;
                            z18 = z16;
                            mjVar2 = mjVarR;
                            lVar3 = lVar2;
                            qVar3 = qVarD;
                        }
                        qVar4 = qVarD2;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.dk
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 1572864;
                    qVarD2 = qVar2;
                    if ((i17 & 599187) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        } else {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                        }
                        if (mkVar.q() >= 0) {
                            throw new IllegalArgumentException("steps should be >= 0");
                        }
                        int i311 = i17 >> 3;
                        u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i311 & 14) | ((i17 << 3) & 112) | (i311 & 7168) | (57344 & i311) | (i311 & 458752));
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mjVar2 = mjVarR;
                        mVar2 = mVar4;
                        z18 = z19;
                        lVar3 = lVar4;
                        qVar3 = qVar5;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        z18 = z16;
                        mjVar2 = mjVarR;
                        lVar3 = lVar2;
                        qVar3 = qVarD;
                    }
                    qVar4 = qVarD2;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.dk
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                lVar2 = lVar;
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        qVarD = qVar;
                        if (rVarH.G(qVarD)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 64;
                    if (i29 != 0) {
                        if ((1572864 & i15) == 0) {
                            qVarD2 = qVar2;
                            if (rVarH.G(qVarD2)) {
                                i35 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i35 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i35;
                        }
                        if ((i17 & 599187) != 599186) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i36 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                }
                                if (i25 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar2 = (b1.l) objE;
                                }
                                if (i27 != 0) {
                                    qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                if (i29 != 0) {
                                    qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                z19 = z16;
                                qVar5 = qVarD;
                                lVar4 = lVar2;
                                mVar4 = mVar3;
                            } else {
                                if (i36 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                }
                                if (i25 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar2 = (b1.l) objE;
                                }
                                if (i27 != 0) {
                                    qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                if (i29 != 0) {
                                    qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                z19 = z16;
                                qVar5 = qVarD;
                                lVar4 = lVar2;
                                mVar4 = mVar3;
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                            }
                            if (mkVar.q() >= 0) {
                                throw new IllegalArgumentException("steps should be >= 0");
                            }
                            int i312 = i17 >> 3;
                            u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i312 & 14) | ((i17 << 3) & 112) | (i312 & 7168) | (57344 & i312) | (i312 & 458752));
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            mjVar2 = mjVarR;
                            mVar2 = mVar4;
                            z18 = z19;
                            lVar3 = lVar4;
                            qVar3 = qVar5;
                        } else {
                            rVarH.O();
                            mVar2 = mVar;
                            z18 = z16;
                            mjVar2 = mjVarR;
                            lVar3 = lVar2;
                            qVar3 = qVarD;
                        }
                        qVar4 = qVarD2;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.dk
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 1572864;
                    qVarD2 = qVar2;
                    if ((i17 & 599187) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        } else {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                        }
                        if (mkVar.q() >= 0) {
                            throw new IllegalArgumentException("steps should be >= 0");
                        }
                        int i313 = i17 >> 3;
                        u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i313 & 14) | ((i17 << 3) & 112) | (i313 & 7168) | (57344 & i313) | (i313 & 458752));
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mjVar2 = mjVarR;
                        mVar2 = mVar4;
                        z18 = z19;
                        lVar3 = lVar4;
                        qVar3 = qVar5;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        z18 = z16;
                        mjVar2 = mjVarR;
                        lVar3 = lVar2;
                        qVar3 = qVarD;
                    }
                    qVar4 = qVarD2;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.dk
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                qVarD = qVar;
                i29 = i16 & 64;
                if (i29 != 0) {
                    if ((1572864 & i15) == 0) {
                        qVarD2 = qVar2;
                        if (rVarH.G(qVarD2)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 599187) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        } else {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                        }
                        if (mkVar.q() >= 0) {
                            throw new IllegalArgumentException("steps should be >= 0");
                        }
                        int i314 = i17 >> 3;
                        u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i314 & 14) | ((i17 << 3) & 112) | (i314 & 7168) | (57344 & i314) | (i314 & 458752));
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mjVar2 = mjVarR;
                        mVar2 = mVar4;
                        z18 = z19;
                        lVar3 = lVar4;
                        qVar3 = qVar5;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        z18 = z16;
                        mjVar2 = mjVarR;
                        lVar3 = lVar2;
                        qVar3 = qVarD;
                    }
                    qVar4 = qVarD2;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.dk
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                qVarD2 = qVar2;
                if ((i17 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    } else {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                    }
                    if (mkVar.q() >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    int i315 = i17 >> 3;
                    u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i315 & 14) | ((i17 << 3) & 112) | (i315 & 7168) | (57344 & i315) | (i315 & 458752));
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mjVar2 = mjVarR;
                    mVar2 = mVar4;
                    z18 = z19;
                    lVar3 = lVar4;
                    qVar3 = qVar5;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    z18 = z16;
                    mjVar2 = mjVarR;
                    lVar3 = lVar2;
                    qVar3 = qVarD;
                }
                qVar4 = qVarD2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.dk
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            z16 = z15;
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    mjVarR = mjVar;
                    if (rVarH.W(mjVarR)) {
                    }
                    i17 |= i37;
                } else {
                    mjVarR = mjVar;
                }
                i17 |= i37;
            } else {
                mjVarR = mjVar;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar2 = lVar;
                    if (rVarH.W(lVar2)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        qVarD = qVar;
                        if (rVarH.G(qVarD)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 64;
                    if (i29 != 0) {
                        if ((1572864 & i15) == 0) {
                            qVarD2 = qVar2;
                            if (rVarH.G(qVarD2)) {
                                i35 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i35 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i35;
                        }
                        if ((i17 & 599187) != 599186) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i36 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                }
                                if (i25 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar2 = (b1.l) objE;
                                }
                                if (i27 != 0) {
                                    qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                if (i29 != 0) {
                                    qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                z19 = z16;
                                qVar5 = qVarD;
                                lVar4 = lVar2;
                                mVar4 = mVar3;
                            } else {
                                if (i36 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                }
                                if (i25 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar2 = (b1.l) objE;
                                }
                                if (i27 != 0) {
                                    qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                if (i29 != 0) {
                                    qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                z19 = z16;
                                qVar5 = qVarD;
                                lVar4 = lVar2;
                                mVar4 = mVar3;
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                            }
                            if (mkVar.q() >= 0) {
                                throw new IllegalArgumentException("steps should be >= 0");
                            }
                            int i316 = i17 >> 3;
                            u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i316 & 14) | ((i17 << 3) & 112) | (i316 & 7168) | (57344 & i316) | (i316 & 458752));
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            mjVar2 = mjVarR;
                            mVar2 = mVar4;
                            z18 = z19;
                            lVar3 = lVar4;
                            qVar3 = qVar5;
                        } else {
                            rVarH.O();
                            mVar2 = mVar;
                            z18 = z16;
                            mjVar2 = mjVarR;
                            lVar3 = lVar2;
                            qVar3 = qVarD;
                        }
                        qVar4 = qVarD2;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.dk
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 1572864;
                    qVarD2 = qVar2;
                    if ((i17 & 599187) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        } else {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                        }
                        if (mkVar.q() >= 0) {
                            throw new IllegalArgumentException("steps should be >= 0");
                        }
                        int i317 = i17 >> 3;
                        u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i317 & 14) | ((i17 << 3) & 112) | (i317 & 7168) | (57344 & i317) | (i317 & 458752));
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mjVar2 = mjVarR;
                        mVar2 = mVar4;
                        z18 = z19;
                        lVar3 = lVar4;
                        qVar3 = qVar5;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        z18 = z16;
                        mjVar2 = mjVarR;
                        lVar3 = lVar2;
                        qVar3 = qVarD;
                    }
                    qVar4 = qVarD2;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.dk
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                qVarD = qVar;
                i29 = i16 & 64;
                if (i29 != 0) {
                    if ((1572864 & i15) == 0) {
                        qVarD2 = qVar2;
                        if (rVarH.G(qVarD2)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 599187) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        } else {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                        }
                        if (mkVar.q() >= 0) {
                            throw new IllegalArgumentException("steps should be >= 0");
                        }
                        int i318 = i17 >> 3;
                        u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i318 & 14) | ((i17 << 3) & 112) | (i318 & 7168) | (57344 & i318) | (i318 & 458752));
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mjVar2 = mjVarR;
                        mVar2 = mVar4;
                        z18 = z19;
                        lVar3 = lVar4;
                        qVar3 = qVar5;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        z18 = z16;
                        mjVar2 = mjVarR;
                        lVar3 = lVar2;
                        qVar3 = qVarD;
                    }
                    qVar4 = qVarD2;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.dk
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                qVarD2 = qVar2;
                if ((i17 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    } else {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                    }
                    if (mkVar.q() >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    int i319 = i17 >> 3;
                    u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i319 & 14) | ((i17 << 3) & 112) | (i319 & 7168) | (57344 & i319) | (i319 & 458752));
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mjVar2 = mjVarR;
                    mVar2 = mVar4;
                    z18 = z19;
                    lVar3 = lVar4;
                    qVar3 = qVar5;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    z18 = z16;
                    mjVar2 = mjVarR;
                    lVar3 = lVar2;
                    qVar3 = qVarD;
                }
                qVar4 = qVarD2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.dk
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            lVar2 = lVar;
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    qVarD = qVar;
                    if (rVarH.G(qVarD)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    if ((1572864 & i15) == 0) {
                        qVarD2 = qVar2;
                        if (rVarH.G(qVarD2)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 599187) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        } else {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                        }
                        if (mkVar.q() >= 0) {
                            throw new IllegalArgumentException("steps should be >= 0");
                        }
                        int i3110 = i17 >> 3;
                        u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i3110 & 14) | ((i17 << 3) & 112) | (i3110 & 7168) | (57344 & i3110) | (i3110 & 458752));
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mjVar2 = mjVarR;
                        mVar2 = mVar4;
                        z18 = z19;
                        lVar3 = lVar4;
                        qVar3 = qVar5;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        z18 = z16;
                        mjVar2 = mjVarR;
                        lVar3 = lVar2;
                        qVar3 = qVarD;
                    }
                    qVar4 = qVarD2;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.dk
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                qVarD2 = qVar2;
                if ((i17 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    } else {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                    }
                    if (mkVar.q() >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    int i3111 = i17 >> 3;
                    u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i3111 & 14) | ((i17 << 3) & 112) | (i3111 & 7168) | (57344 & i3111) | (i3111 & 458752));
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mjVar2 = mjVarR;
                    mVar2 = mVar4;
                    z18 = z19;
                    lVar3 = lVar4;
                    qVar3 = qVar5;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    z18 = z16;
                    mjVar2 = mjVarR;
                    lVar3 = lVar2;
                    qVar3 = qVarD;
                }
                qVar4 = qVarD2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.dk
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            qVarD = qVar;
            i29 = i16 & 64;
            if (i29 != 0) {
                if ((1572864 & i15) == 0) {
                    qVarD2 = qVar2;
                    if (rVarH.G(qVarD2)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                if ((i17 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    } else {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                    }
                    if (mkVar.q() >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    int i3112 = i17 >> 3;
                    u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i3112 & 14) | ((i17 << 3) & 112) | (i3112 & 7168) | (57344 & i3112) | (i3112 & 458752));
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mjVar2 = mjVarR;
                    mVar2 = mVar4;
                    z18 = z19;
                    lVar3 = lVar4;
                    qVar3 = qVar5;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    z18 = z16;
                    mjVar2 = mjVarR;
                    lVar3 = lVar2;
                    qVar3 = qVarD;
                }
                qVar4 = qVarD2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.dk
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            qVarD2 = qVar2;
            if ((i17 & 599187) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i36 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar2 = (b1.l) objE;
                    }
                    if (i27 != 0) {
                        qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i29 != 0) {
                        qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    z19 = z16;
                    qVar5 = qVarD;
                    lVar4 = lVar2;
                    mVar4 = mVar3;
                } else {
                    if (i36 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar2 = (b1.l) objE;
                    }
                    if (i27 != 0) {
                        qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i29 != 0) {
                        qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    z19 = z16;
                    qVar5 = qVarD;
                    lVar4 = lVar2;
                    mVar4 = mVar3;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                }
                if (mkVar.q() >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0");
                }
                int i3113 = i17 >> 3;
                u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i3113 & 14) | ((i17 << 3) & 112) | (i3113 & 7168) | (57344 & i3113) | (i3113 & 458752));
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mjVar2 = mjVarR;
                mVar2 = mVar4;
                z18 = z19;
                lVar3 = lVar4;
                qVar3 = qVar5;
            } else {
                rVarH.O();
                mVar2 = mVar;
                z18 = z16;
                mjVar2 = mjVarR;
                lVar3 = lVar2;
                qVar3 = qVarD;
            }
            qVar4 = qVarD2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.dk
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    mjVarR = mjVar;
                    if (rVarH.W(mjVarR)) {
                    }
                    i17 |= i37;
                } else {
                    mjVarR = mjVar;
                }
                i17 |= i37;
            } else {
                mjVarR = mjVar;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar2 = lVar;
                    if (rVarH.W(lVar2)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        qVarD = qVar;
                        if (rVarH.G(qVarD)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 64;
                    if (i29 != 0) {
                        if ((1572864 & i15) == 0) {
                            qVarD2 = qVar2;
                            if (rVarH.G(qVarD2)) {
                                i35 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i35 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i35;
                        }
                        if ((i17 & 599187) != 599186) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i36 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                }
                                if (i25 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar2 = (b1.l) objE;
                                }
                                if (i27 != 0) {
                                    qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                if (i29 != 0) {
                                    qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                z19 = z16;
                                qVar5 = qVarD;
                                lVar4 = lVar2;
                                mVar4 = mVar3;
                            } else {
                                if (i36 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                    mjVarR = vj.f58107a.r(rVarH, 6);
                                }
                                if (i25 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b1.k.a();
                                        rVarH.v(objE);
                                    }
                                    lVar2 = (b1.l) objE;
                                }
                                if (i27 != 0) {
                                    qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                if (i29 != 0) {
                                    qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                z19 = z16;
                                qVar5 = qVarD;
                                lVar4 = lVar2;
                                mVar4 = mVar3;
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                            }
                            if (mkVar.q() >= 0) {
                                throw new IllegalArgumentException("steps should be >= 0");
                            }
                            int i3114 = i17 >> 3;
                            u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i3114 & 14) | ((i17 << 3) & 112) | (i3114 & 7168) | (57344 & i3114) | (i3114 & 458752));
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            mjVar2 = mjVarR;
                            mVar2 = mVar4;
                            z18 = z19;
                            lVar3 = lVar4;
                            qVar3 = qVar5;
                        } else {
                            rVarH.O();
                            mVar2 = mVar;
                            z18 = z16;
                            mjVar2 = mjVarR;
                            lVar3 = lVar2;
                            qVar3 = qVarD;
                        }
                        qVar4 = qVarD2;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.dk
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 1572864;
                    qVarD2 = qVar2;
                    if ((i17 & 599187) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        } else {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                        }
                        if (mkVar.q() >= 0) {
                            throw new IllegalArgumentException("steps should be >= 0");
                        }
                        int i3115 = i17 >> 3;
                        u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i3115 & 14) | ((i17 << 3) & 112) | (i3115 & 7168) | (57344 & i3115) | (i3115 & 458752));
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mjVar2 = mjVarR;
                        mVar2 = mVar4;
                        z18 = z19;
                        lVar3 = lVar4;
                        qVar3 = qVar5;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        z18 = z16;
                        mjVar2 = mjVarR;
                        lVar3 = lVar2;
                        qVar3 = qVarD;
                    }
                    qVar4 = qVarD2;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.dk
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                qVarD = qVar;
                i29 = i16 & 64;
                if (i29 != 0) {
                    if ((1572864 & i15) == 0) {
                        qVarD2 = qVar2;
                        if (rVarH.G(qVarD2)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 599187) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        } else {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                        }
                        if (mkVar.q() >= 0) {
                            throw new IllegalArgumentException("steps should be >= 0");
                        }
                        int i3116 = i17 >> 3;
                        u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i3116 & 14) | ((i17 << 3) & 112) | (i3116 & 7168) | (57344 & i3116) | (i3116 & 458752));
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mjVar2 = mjVarR;
                        mVar2 = mVar4;
                        z18 = z19;
                        lVar3 = lVar4;
                        qVar3 = qVar5;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        z18 = z16;
                        mjVar2 = mjVarR;
                        lVar3 = lVar2;
                        qVar3 = qVarD;
                    }
                    qVar4 = qVarD2;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.dk
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                qVarD2 = qVar2;
                if ((i17 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    } else {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                    }
                    if (mkVar.q() >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    int i3117 = i17 >> 3;
                    u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i3117 & 14) | ((i17 << 3) & 112) | (i3117 & 7168) | (57344 & i3117) | (i3117 & 458752));
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mjVar2 = mjVarR;
                    mVar2 = mVar4;
                    z18 = z19;
                    lVar3 = lVar4;
                    qVar3 = qVar5;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    z18 = z16;
                    mjVar2 = mjVarR;
                    lVar3 = lVar2;
                    qVar3 = qVarD;
                }
                qVar4 = qVarD2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.dk
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            lVar2 = lVar;
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    qVarD = qVar;
                    if (rVarH.G(qVarD)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    if ((1572864 & i15) == 0) {
                        qVarD2 = qVar2;
                        if (rVarH.G(qVarD2)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 599187) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        } else {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                        }
                        if (mkVar.q() >= 0) {
                            throw new IllegalArgumentException("steps should be >= 0");
                        }
                        int i3118 = i17 >> 3;
                        u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i3118 & 14) | ((i17 << 3) & 112) | (i3118 & 7168) | (57344 & i3118) | (i3118 & 458752));
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mjVar2 = mjVarR;
                        mVar2 = mVar4;
                        z18 = z19;
                        lVar3 = lVar4;
                        qVar3 = qVar5;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        z18 = z16;
                        mjVar2 = mjVarR;
                        lVar3 = lVar2;
                        qVar3 = qVarD;
                    }
                    qVar4 = qVarD2;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.dk
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                qVarD2 = qVar2;
                if ((i17 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    } else {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                    }
                    if (mkVar.q() >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    int i3119 = i17 >> 3;
                    u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i3119 & 14) | ((i17 << 3) & 112) | (i3119 & 7168) | (57344 & i3119) | (i3119 & 458752));
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mjVar2 = mjVarR;
                    mVar2 = mVar4;
                    z18 = z19;
                    lVar3 = lVar4;
                    qVar3 = qVar5;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    z18 = z16;
                    mjVar2 = mjVarR;
                    lVar3 = lVar2;
                    qVar3 = qVarD;
                }
                qVar4 = qVarD2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.dk
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            qVarD = qVar;
            i29 = i16 & 64;
            if (i29 != 0) {
                if ((1572864 & i15) == 0) {
                    qVarD2 = qVar2;
                    if (rVarH.G(qVarD2)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                if ((i17 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    } else {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                    }
                    if (mkVar.q() >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    int i31110 = i17 >> 3;
                    u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i31110 & 14) | ((i17 << 3) & 112) | (i31110 & 7168) | (57344 & i31110) | (i31110 & 458752));
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mjVar2 = mjVarR;
                    mVar2 = mVar4;
                    z18 = z19;
                    lVar3 = lVar4;
                    qVar3 = qVar5;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    z18 = z16;
                    mjVar2 = mjVarR;
                    lVar3 = lVar2;
                    qVar3 = qVarD;
                }
                qVar4 = qVarD2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.dk
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            qVarD2 = qVar2;
            if ((i17 & 599187) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i36 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar2 = (b1.l) objE;
                    }
                    if (i27 != 0) {
                        qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i29 != 0) {
                        qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    z19 = z16;
                    qVar5 = qVarD;
                    lVar4 = lVar2;
                    mVar4 = mVar3;
                } else {
                    if (i36 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar2 = (b1.l) objE;
                    }
                    if (i27 != 0) {
                        qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i29 != 0) {
                        qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    z19 = z16;
                    qVar5 = qVarD;
                    lVar4 = lVar2;
                    mVar4 = mVar3;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                }
                if (mkVar.q() >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0");
                }
                int i31111 = i17 >> 3;
                u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i31111 & 14) | ((i17 << 3) & 112) | (i31111 & 7168) | (57344 & i31111) | (i31111 & 458752));
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mjVar2 = mjVarR;
                mVar2 = mVar4;
                z18 = z19;
                lVar3 = lVar4;
                qVar3 = qVar5;
            } else {
                rVarH.O();
                mVar2 = mVar;
                z18 = z16;
                mjVar2 = mjVarR;
                lVar3 = lVar2;
                qVar3 = qVarD;
            }
            qVar4 = qVarD2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.dk
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                mjVarR = mjVar;
                if (rVarH.W(mjVarR)) {
                }
                i17 |= i37;
            } else {
                mjVarR = mjVar;
            }
            i17 |= i37;
        } else {
            mjVarR = mjVar;
        }
        i25 = i16 & 16;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                lVar2 = lVar;
                if (rVarH.W(lVar2)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    qVarD = qVar;
                    if (rVarH.G(qVarD)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    if ((1572864 & i15) == 0) {
                        qVarD2 = qVar2;
                        if (rVarH.G(qVarD2)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 599187) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        } else {
                            if (i36 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                mjVarR = vj.f58107a.r(rVarH, 6);
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b1.k.a();
                                    rVarH.v(objE);
                                }
                                lVar2 = (b1.l) objE;
                            }
                            if (i27 != 0) {
                                qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i29 != 0) {
                                qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            z19 = z16;
                            qVar5 = qVarD;
                            lVar4 = lVar2;
                            mVar4 = mVar3;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                        }
                        if (mkVar.q() >= 0) {
                            throw new IllegalArgumentException("steps should be >= 0");
                        }
                        int i31112 = i17 >> 3;
                        u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i31112 & 14) | ((i17 << 3) & 112) | (i31112 & 7168) | (57344 & i31112) | (i31112 & 458752));
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mjVar2 = mjVarR;
                        mVar2 = mVar4;
                        z18 = z19;
                        lVar3 = lVar4;
                        qVar3 = qVar5;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        z18 = z16;
                        mjVar2 = mjVarR;
                        lVar3 = lVar2;
                        qVar3 = qVarD;
                    }
                    qVar4 = qVarD2;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.dk
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                qVarD2 = qVar2;
                if ((i17 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    } else {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                    }
                    if (mkVar.q() >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    int i31113 = i17 >> 3;
                    u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i31113 & 14) | ((i17 << 3) & 112) | (i31113 & 7168) | (57344 & i31113) | (i31113 & 458752));
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mjVar2 = mjVarR;
                    mVar2 = mVar4;
                    z18 = z19;
                    lVar3 = lVar4;
                    qVar3 = qVar5;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    z18 = z16;
                    mjVar2 = mjVarR;
                    lVar3 = lVar2;
                    qVar3 = qVarD;
                }
                qVar4 = qVarD2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.dk
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            qVarD = qVar;
            i29 = i16 & 64;
            if (i29 != 0) {
                if ((1572864 & i15) == 0) {
                    qVarD2 = qVar2;
                    if (rVarH.G(qVarD2)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                if ((i17 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    } else {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                    }
                    if (mkVar.q() >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    int i31114 = i17 >> 3;
                    u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i31114 & 14) | ((i17 << 3) & 112) | (i31114 & 7168) | (57344 & i31114) | (i31114 & 458752));
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mjVar2 = mjVarR;
                    mVar2 = mVar4;
                    z18 = z19;
                    lVar3 = lVar4;
                    qVar3 = qVar5;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    z18 = z16;
                    mjVar2 = mjVarR;
                    lVar3 = lVar2;
                    qVar3 = qVarD;
                }
                qVar4 = qVarD2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.dk
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            qVarD2 = qVar2;
            if ((i17 & 599187) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i36 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar2 = (b1.l) objE;
                    }
                    if (i27 != 0) {
                        qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i29 != 0) {
                        qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    z19 = z16;
                    qVar5 = qVarD;
                    lVar4 = lVar2;
                    mVar4 = mVar3;
                } else {
                    if (i36 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar2 = (b1.l) objE;
                    }
                    if (i27 != 0) {
                        qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i29 != 0) {
                        qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    z19 = z16;
                    qVar5 = qVarD;
                    lVar4 = lVar2;
                    mVar4 = mVar3;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                }
                if (mkVar.q() >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0");
                }
                int i31115 = i17 >> 3;
                u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i31115 & 14) | ((i17 << 3) & 112) | (i31115 & 7168) | (57344 & i31115) | (i31115 & 458752));
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mjVar2 = mjVarR;
                mVar2 = mVar4;
                z18 = z19;
                lVar3 = lVar4;
                qVar3 = qVar5;
            } else {
                rVarH.O();
                mVar2 = mVar;
                z18 = z16;
                mjVar2 = mjVarR;
                lVar3 = lVar2;
                qVar3 = qVarD;
            }
            qVar4 = qVarD2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.dk
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        lVar2 = lVar;
        i27 = i16 & 32;
        if (i27 != 0) {
            if ((196608 & i15) == 0) {
                qVarD = qVar;
                if (rVarH.G(qVarD)) {
                    i28 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i28 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i28;
            }
            i29 = i16 & 64;
            if (i29 != 0) {
                if ((1572864 & i15) == 0) {
                    qVarD2 = qVar2;
                    if (rVarH.G(qVarD2)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                if ((i17 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    } else {
                        if (i36 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            mjVarR = vj.f58107a.r(rVarH, 6);
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b1.k.a();
                                rVarH.v(objE);
                            }
                            lVar2 = (b1.l) objE;
                        }
                        if (i27 != 0) {
                            qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i29 != 0) {
                            qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        z19 = z16;
                        qVar5 = qVarD;
                        lVar4 = lVar2;
                        mVar4 = mVar3;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                    }
                    if (mkVar.q() >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    int i31116 = i17 >> 3;
                    u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i31116 & 14) | ((i17 << 3) & 112) | (i31116 & 7168) | (57344 & i31116) | (i31116 & 458752));
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mjVar2 = mjVarR;
                    mVar2 = mVar4;
                    z18 = z19;
                    lVar3 = lVar4;
                    qVar3 = qVar5;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    z18 = z16;
                    mjVar2 = mjVarR;
                    lVar3 = lVar2;
                    qVar3 = qVarD;
                }
                qVar4 = qVarD2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.dk
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            qVarD2 = qVar2;
            if ((i17 & 599187) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i36 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar2 = (b1.l) objE;
                    }
                    if (i27 != 0) {
                        qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i29 != 0) {
                        qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    z19 = z16;
                    qVar5 = qVarD;
                    lVar4 = lVar2;
                    mVar4 = mVar3;
                } else {
                    if (i36 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar2 = (b1.l) objE;
                    }
                    if (i27 != 0) {
                        qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i29 != 0) {
                        qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    z19 = z16;
                    qVar5 = qVarD;
                    lVar4 = lVar2;
                    mVar4 = mVar3;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                }
                if (mkVar.q() >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0");
                }
                int i31117 = i17 >> 3;
                u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i31117 & 14) | ((i17 << 3) & 112) | (i31117 & 7168) | (57344 & i31117) | (i31117 & 458752));
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mjVar2 = mjVarR;
                mVar2 = mVar4;
                z18 = z19;
                lVar3 = lVar4;
                qVar3 = qVar5;
            } else {
                rVarH.O();
                mVar2 = mVar;
                z18 = z16;
                mjVar2 = mjVarR;
                lVar3 = lVar2;
                qVar3 = qVarD;
            }
            qVar4 = qVarD2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.dk
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        qVarD = qVar;
        i29 = i16 & 64;
        if (i29 != 0) {
            if ((1572864 & i15) == 0) {
                qVarD2 = qVar2;
                if (rVarH.G(qVarD2)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i35;
            }
            if ((i17 & 599187) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i36 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar2 = (b1.l) objE;
                    }
                    if (i27 != 0) {
                        qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i29 != 0) {
                        qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    z19 = z16;
                    qVar5 = qVarD;
                    lVar4 = lVar2;
                    mVar4 = mVar3;
                } else {
                    if (i36 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        mjVarR = vj.f58107a.r(rVarH, 6);
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b1.k.a();
                            rVarH.v(objE);
                        }
                        lVar2 = (b1.l) objE;
                    }
                    if (i27 != 0) {
                        qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i29 != 0) {
                        qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    z19 = z16;
                    qVar5 = qVarD;
                    lVar4 = lVar2;
                    mVar4 = mVar3;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
                }
                if (mkVar.q() >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0");
                }
                int i31118 = i17 >> 3;
                u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i31118 & 14) | ((i17 << 3) & 112) | (i31118 & 7168) | (57344 & i31118) | (i31118 & 458752));
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mjVar2 = mjVarR;
                mVar2 = mVar4;
                z18 = z19;
                lVar3 = lVar4;
                qVar3 = qVar5;
            } else {
                rVarH.O();
                mVar2 = mVar;
                z18 = z16;
                mjVar2 = mjVarR;
                lVar3 = lVar2;
                qVar3 = qVarD;
            }
            qVar4 = qVarD2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.dk
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 1572864;
        qVarD2 = qVar2;
        if ((i17 & 599187) != 599186) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i36 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    mjVarR = vj.f58107a.r(rVarH, 6);
                }
                if (i25 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = b1.k.a();
                        rVarH.v(objE);
                    }
                    lVar2 = (b1.l) objE;
                }
                if (i27 != 0) {
                    qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                }
                if (i29 != 0) {
                    qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                }
                z19 = z16;
                qVar5 = qVarD;
                lVar4 = lVar2;
                mVar4 = mVar3;
            } else {
                if (i36 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    mjVarR = vj.f58107a.r(rVarH, 6);
                }
                if (i25 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = b1.k.a();
                        rVarH.v(objE);
                    }
                    lVar2 = (b1.l) objE;
                }
                if (i27 != 0) {
                    qVarD = y2.m.d(-2100927368, true, new er.q() { // from class: f2.bk
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return ik.o(lVar2, mjVarR, z16, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                }
                if (i29 != 0) {
                    qVarD2 = y2.m.d(-81224541, true, new er.q() { // from class: f2.ck
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return ik.p(z16, mjVarR, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                }
                z19 = z16;
                qVar5 = qVarD;
                lVar4 = lVar2;
                mVar4 = mVar3;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(409861960, i17, -1, "androidx.compose.material3.Slider (Slider.kt:388)");
            }
            if (mkVar.q() >= 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            int i31119 = i17 >> 3;
            u(mVar4, mkVar, z19, lVar4, qVar5, qVarD2, rVarH, (i17 & 896) | (i31119 & 14) | ((i17 << 3) & 112) | (i31119 & 7168) | (57344 & i31119) | (i31119 & 458752));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mjVar2 = mjVarR;
            mVar2 = mVar4;
            z18 = z19;
            lVar3 = lVar4;
            qVar3 = qVar5;
        } else {
            rVarH.O();
            mVar2 = mVar;
            z18 = z16;
            mjVar2 = mjVarR;
            lVar3 = lVar2;
            qVar3 = qVarD;
        }
        qVar4 = qVarD2;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.dk
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ik.q(mkVar, mVar2, z18, mjVar2, lVar3, qVar3, qVar4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(b1.l lVar, mj mjVar, boolean z15, mk mkVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2100927368, i15, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:379)");
        }
        vj.f58107a.h(lVar, null, mjVar, z15, 0L, rVar, 196608, 18);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(boolean z15, mj mjVar, mk mkVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-81224541, i15, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:386)");
        }
        vj.f58107a.j(mkVar, null, z15, mjVar, null, null, 0.0f, 0.0f, rVar, (i15 & 14) | 100663296, 242);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(mk mkVar, f3.m mVar, boolean z15, mj mjVar, b1.l lVar, er.q qVar, er.q qVar2, int i15, int i16, r rVar, int i17) {
        n(mkVar, mVar, z15, mjVar, lVar, qVar, qVar2, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(b1.l lVar, mj mjVar, boolean z15, mk mkVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1689130945, i15, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:292)");
        }
        vj.f58107a.h(lVar, null, mjVar, z15, 0L, rVar, 196608, 18);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(boolean z15, mj mjVar, mk mkVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-294493388, i15, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:299)");
        }
        vj.f58107a.j(mkVar, null, z15, mjVar, null, null, 0.0f, 0.0f, rVar, (i15 & 14) | 100663296, 242);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(float f15, l lVar, f3.m mVar, boolean z15, er.a aVar, mj mjVar, b1.l lVar2, int i15, er.q qVar, er.q qVar2, lr.e eVar, int i16, int i17, int i18, r rVar, int i19) {
        m(f15, lVar, mVar, z15, aVar, mjVar, lVar2, i15, qVar, qVar2, eVar, rVar, g4.a(i16 | 1), g4.a(i17), i18);
        return i0.f148189a;
    }

    private static final void u(final f3.m mVar, final mk mkVar, final boolean z15, final b1.l lVar, er.q<? super mk, ? super r, ? super Integer, i0> qVar, er.q<? super mk, ? super r, ? super Integer, i0> qVar2, r rVar, final int i15) {
        int i16;
        final er.q<? super mk, ? super r, ? super Integer, i0> qVar3;
        final mk mkVar2;
        f3.m mVarN;
        er.q<? super mk, ? super r, ? super Integer, i0> qVar4 = qVar;
        r rVarH = rVar.h(898172835);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(mkVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(lVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(qVar4) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.G(qVar2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if (rVarH.r((74899 & i16) != 74898, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(898172835, i16, -1, "androidx.compose.material3.SliderImpl (Slider.kt:770)");
            }
            mkVar.J(rVarH.N(g1.l()) == c5.t.Rtl);
            boolean z16 = (mkVar.m() == p143z0.a2.Horizontal && mkVar.A()) || (mkVar.m() == p143z0.a2.Vertical && mkVar.p());
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarR = R(companion, mkVar, lVar, z15);
            int i17 = i16;
            p143z0.a2 a2VarM = mkVar.m();
            boolean z17 = mkVar.z();
            boolean zG = rVarH.G(mkVar);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new c(mkVar, null);
                rVarH.v(objE);
            }
            f3.m mVarG = Function1.g(companion, mkVar, a2VarM, z15, lVar, z17, null, (er.q) objE, z16, 32, null);
            p143z0.a2 a2VarM2 = mkVar.m();
            p143z0.a2 a2Var = p143z0.a2.Vertical;
            f3.m mVarC = a2VarM2 == a2Var ? androidx.compose.foundation.layout.d.C(f0.b(companion, nj.THUMB), null, false, 3, null) : androidx.compose.foundation.layout.d.G(f0.b(companion, nj.THUMB), null, false, 3, null);
            if (t.c(rVarH.N(androidx.compose.material3.i.f()), androidx.compose.material3.h.f9838a.a())) {
                rVarH.X(-177990493);
                mVarN = a3.n(n1.e(companion, lVar, androidx.compose.material3.i.h(false, 0.0f, 0L, ui.h(z0.f115398a.k(), rVarH, 6), false, true, false, false, 7, null)), f56350i);
                rVarH.R();
            } else {
                rVarH.X(-177433857);
                rVarH.R();
                mVarN = companion;
            }
            f3.m mVarB = w0.q0.b(O(androidx.compose.foundation.layout.d.r(hd.i(mVar), mkVar.m() == a2Var ? f56342a : f56343b, mkVar.m() == a2Var ? f56343b : f56342a, 0.0f, 0.0f, 12, null), mkVar, z15), z15, lVar);
            int iQ = mkVar.q();
            lr.e<Float> eVarX = mkVar.x();
            f3.m mVar2 = mVarN;
            float fW = mkVar.w();
            boolean zG2 = rVarH.G(mkVar);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new l() { // from class: f2.fk
                    @Override // er.l
                    public final Object b(Object obj) {
                        return ik.w(mkVar, ((Float) obj).floatValue());
                    }
                };
                rVarH.v(objE2);
            }
            l lVar2 = (l) objE2;
            mkVar2 = mkVar;
            f3.m mVarU = N(mVarB, z15, iQ, eVarX, fW, z16, lVar2, mkVar.l(), mkVar.A(), mkVar.m() == a2Var).u(mVarR).u(mVarG);
            boolean zG3 = rVarH.G(mkVar2);
            Object objE3 = rVarH.E();
            if (zG3 || objE3 == r.INSTANCE.a()) {
                objE3 = new b(mkVar2);
                rVarH.v(objE3);
            }
            w0 w0Var = (w0) objE3;
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = j.e(rVarH, mVarU);
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
            boolean zG4 = rVarH.G(mkVar2);
            Object objE4 = rVarH.E();
            if (zG4 || objE4 == r.INSTANCE.a()) {
                objE4 = new l() { // from class: f2.gk
                    @Override // er.l
                    public final Object b(Object obj) {
                        return ik.v(mkVar2, (c5.r) obj);
                    }
                };
                rVarH.v(objE4);
            }
            f3.m mVarU2 = mVar2.u(q1.a(mVarC, (l) objE4));
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = j.e(rVarH, mVarU2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
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
            n6.i(rVarC2, w0VarI, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            x xVar = x.f39368a;
            int i18 = (i17 >> 3) & 14;
            qVar4 = qVar;
            qVar4.w(mkVar2, rVarH, Integer.valueOf(((i17 >> 9) & 112) | i18));
            rVarH.x();
            f3.m mVarB2 = f0.b(companion, nj.TRACK);
            w0 w0VarI2 = d1.r.i(companion3.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = j.e(rVarH, mVarB2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI2, companion2.d());
            n6.i(rVarC3, e0VarT3, companion2.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion2.c());
            n6.g(rVarC3, companion2.a());
            n6.i(rVarC3, mVarE3, companion2.e());
            Integer numValueOf = Integer.valueOf(i18 | ((i17 >> 12) & 112));
            qVar3 = qVar2;
            qVar3.w(mkVar2, rVarH, numValueOf);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            qVar3 = qVar2;
            mkVar2 = mkVar;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final er.q<? super mk, ? super r, ? super Integer, i0> qVar5 = qVar4;
            final mk mkVar3 = mkVar2;
            d5VarM.a(new p() { // from class: f2.hk
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ik.x(mVar, mkVar3, z15, lVar, qVar5, qVar3, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(mk mkVar, c5.r rVar) {
        mkVar.L((int) (rVar.getPackedValue() >> 32));
        mkVar.K((int) (rVar.getPackedValue() & BodyPartID.bodyIdMax));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(mk mkVar, float f15) {
        if (mkVar.k() != null) {
            mkVar.k().b(Float.valueOf(f15));
        } else {
            mkVar.O(f15);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(f3.m mVar, mk mkVar, boolean z15, b1.l lVar, er.q qVar, er.q qVar2, int i15, r rVar, int i16) {
        u(mVar, mkVar, z15, lVar, qVar, qVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(final b1.l lVar, final f3.m mVar, mj mjVar, boolean z15, final long j15, final boolean z16, r rVar, final int i15) {
        int i16;
        mj mjVar2;
        boolean z17;
        int i17;
        long j16;
        long jF;
        r rVarH = rVar.h(2115331054);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(mVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            mjVar2 = mjVar;
            i16 |= rVarH.W(mjVar2) ? 256 : 128;
        } else {
            mjVar2 = mjVar;
        }
        if ((i15 & 3072) == 0) {
            z17 = z15;
            i16 |= rVarH.a(z17) ? 2048 : 1024;
        } else {
            z17 = z15;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.d(j15) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.a(z16) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if (rVarH.r((74899 & i16) != 74898, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2115331054, i16, -1, "androidx.compose.material3.Thumb (Slider.kt:2410)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = x5.f();
                rVarH.v(objE);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objE;
            int i18 = i16 & 14;
            boolean z18 = i18 == 4;
            Object objE2 = rVarH.E();
            Object obj = null;
            if (z18 || objE2 == companion.a()) {
                objE2 = new d(lVar, snapshotStateList, null);
                rVarH.v(objE2);
            }
            Function0.d(lVar, (p) objE2, rVarH, i18);
            if (snapshotStateList.isEmpty()) {
                obj = null;
                i17 = 2;
                j16 = j15;
            } else {
                if (z16) {
                    i17 = 2;
                    jF = c5.k.f(j15, 0.0f, c5.h.n(c5.k.i(j15) / 2), 1, null);
                } else {
                    i17 = 2;
                    jF = c5.k.f(j15, c5.h.n(c5.k.j(j15) / 2), 0.0f, 2, null);
                }
                j16 = jF;
            }
            r3.a(w0.i.c(a4.x.b(d1.b(androidx.compose.foundation.layout.d.u(mVar, j16), lVar, false, i17, obj), w.INSTANCE.b(), false, i17, obj), mjVar.b(z15), ui.h(z0.f115398a.k(), rVarH, 6)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final mj mjVar3 = mjVar2;
            final boolean z19 = z17;
            d5VarM.a(new p() { // from class: f2.ek
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return ik.z(lVar, mVar, mjVar3, z19, j15, z16, i15, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(b1.l lVar, f3.m mVar, mj mjVar, boolean z15, long j15, boolean z16, int i15, r rVar, int i16) {
        y(lVar, mVar, mjVar, z15, j15, z16, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
