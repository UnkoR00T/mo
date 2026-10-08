package p079n1;

import android.view.KeyEvent;
import er.l;
import fr.k;
import fr.l0;
import fr.t;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import pq.v;
import q4.z3;
import v4.CommitTextCommand;
import v4.DeleteSurroundingTextCommand;
import v4.TextFieldValue;
import v4.i0;
import v4.j;
import v4.m;
import v4.p;
import y3.c;
import y3.d;
import z1.c2;
import z1.d3;
import z1.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\b\u0001\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0016*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u00020\u00162\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010Q¨\u0006R"}, d2 = {"Ln1/g5;", "", "Ln1/s3;", "state", "Lz1/c2;", "selectionManager", "Lv4/t0;", "value", "", "editable", "singleLine", "Lz1/d3;", "preparedSelectionState", "Lv4/i0;", "offsetMapping", "Ln1/i7;", "undoManager", "Ln1/n2;", "keyCombiner", "Ln1/e3;", "keyMapping", "Lkotlin/Function1;", "Loq/i0;", "onValueChange", "Lv4/t;", "imeAction", "<init>", "(Ln1/s3;Lz1/c2;Lv4/t0;ZZLz1/d3;Lv4/i0;Ln1/i7;Ln1/n2;Ln1/e3;Ler/l;ILfr/k;)V", "", "Lv4/j;", "l", "(Ljava/util/List;)V", "m", "(Lv4/j;)V", "Ly3/b;", "event", "Lv4/b;", "y", "(Landroid/view/KeyEvent;)Lv4/b;", "Lz1/z1;", "block", "n", "(Ler/l;)V", "o", "(Landroid/view/KeyEvent;)Z", "a", "Ln1/s3;", "getState", "()Ln1/s3;", "b", "Lz1/c2;", "getSelectionManager", "()Lz1/c2;", "c", "Lv4/t0;", "getValue", "()Lv4/t0;", "d", "Z", "getEditable", "()Z", "e", "getSingleLine", "f", "Lz1/d3;", "getPreparedSelectionState", "()Lz1/d3;", "g", "Lv4/i0;", "getOffsetMapping", "()Lv4/i0;", "h", "Ln1/i7;", "getUndoManager", "()Ln1/i7;", "i", "Ln1/n2;", "j", "Ln1/e3;", "k", "Ler/l;", "I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s3 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c2 selectionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextFieldValue value;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean editable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d3 preparedSelectionState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i0 offsetMapping;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i7 undoManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final n2 keyCombiner;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final e3 keyMapping;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l<TextFieldValue, oq.i0> onValueChange;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int imeAction;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130053a;

        static {
            int[] iArr = new int[c3.values().length];
            try {
                iArr[c3.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c3.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c3.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c3.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c3.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c3.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c3.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c3.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c3.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[c3.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[c3.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[c3.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[c3.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[c3.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[c3.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[c3.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[c3.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[c3.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[c3.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[c3.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[c3.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[c3.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[c3.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[c3.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[c3.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[c3.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[c3.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[c3.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[c3.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[c3.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[c3.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[c3.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[c3.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[c3.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[c3.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[c3.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[c3.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[c3.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[c3.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[c3.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[c3.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[c3.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[c3.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[c3.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[c3.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[c3.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[c3.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[c3.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[c3.CENTER.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            f130053a = iArr;
        }
    }

    public /* synthetic */ g5(s3 s3Var, c2 c2Var, TextFieldValue textFieldValue, boolean z15, boolean z16, d3 d3Var, i0 i0Var, i7 i7Var, n2 n2Var, e3 e3Var, l lVar, int i15, k kVar) {
        this(s3Var, c2Var, textFieldValue, z15, z16, d3Var, i0Var, i7Var, n2Var, e3Var, lVar, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(TextFieldValue textFieldValue) {
        return oq.i0.f148189a;
    }

    private final void l(List<? extends j> list) {
        m processor = this.state.getProcessor();
        List<? extends j> listI1 = v.i1(list);
        listI1.add(0, new p());
        this.onValueChange.b(processor.b(listI1));
    }

    private final void m(j jVar) {
        l(v.e(jVar));
    }

    private final void n(l<? super z1, oq.i0> block) {
        z1 z1Var = new z1(this.value, this.offsetMapping, this.state.n(), this.preparedSelectionState);
        block.b(z1Var);
        if (z3.g(z1Var.getSelection(), this.value.getSelection()) && t.c(z1Var.getAnnotatedString(), this.value.getText())) {
            return;
        }
        this.onValueChange.b(z1Var.a0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(c3 c3Var, g5 g5Var, l0 l0Var, z1 z1Var) {
        TextFieldValue textFieldValueG;
        TextFieldValue textFieldValueC;
        switch (a.f130053a[c3Var.ordinal()]) {
            case 1:
                g5Var.selectionManager.C(false);
                return oq.i0.f148189a;
            case 2:
                g5Var.selectionManager.w0();
                return oq.i0.f148189a;
            case 3:
                g5Var.selectionManager.I();
                return oq.i0.f148189a;
            case 4:
                z1Var.b(new l() { // from class: n1.y4
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g5.q((z1) obj);
                    }
                });
                return oq.i0.f148189a;
            case 5:
                z1Var.c(new l() { // from class: n1.z4
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g5.r((z1) obj);
                    }
                });
                return oq.i0.f148189a;
            case 6:
                z1Var.C();
                return oq.i0.f148189a;
            case 7:
                z1Var.K();
                return oq.i0.f148189a;
            case 8:
                z1Var.H();
                return oq.i0.f148189a;
            case 9:
                z1Var.E();
                return oq.i0.f148189a;
            case 10:
                z1Var.R();
                return oq.i0.f148189a;
            case 11:
                z1Var.A();
                return oq.i0.f148189a;
            case 12:
                z1Var.d0();
                return oq.i0.f148189a;
            case 13:
                z1Var.c0();
                return oq.i0.f148189a;
            case 14:
                z1Var.Q();
                return oq.i0.f148189a;
            case 15:
                z1Var.N();
                return oq.i0.f148189a;
            case 16:
                z1Var.O();
                return oq.i0.f148189a;
            case 17:
                z1Var.P();
                return oq.i0.f148189a;
            case 18:
                z1Var.M();
                return oq.i0.f148189a;
            case 19:
                z1Var.L();
                return oq.i0.f148189a;
            case 20:
                List<j> listZ = z1Var.Z(new l() { // from class: n1.a5
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g5.s((z1) obj);
                    }
                });
                if (listZ != null) {
                    g5Var.l(listZ);
                    oq.i0 i0Var = oq.i0.f148189a;
                }
                return oq.i0.f148189a;
            case 21:
                List<j> listZ2 = z1Var.Z(new l() { // from class: n1.b5
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g5.t((z1) obj);
                    }
                });
                if (listZ2 != null) {
                    g5Var.l(listZ2);
                    oq.i0 i0Var2 = oq.i0.f148189a;
                }
                return oq.i0.f148189a;
            case 22:
                List<j> listZ3 = z1Var.Z(new l() { // from class: n1.c5
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g5.u((z1) obj);
                    }
                });
                if (listZ3 != null) {
                    g5Var.l(listZ3);
                    oq.i0 i0Var3 = oq.i0.f148189a;
                }
                return oq.i0.f148189a;
            case 23:
                List<j> listZ4 = z1Var.Z(new l() { // from class: n1.d5
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g5.v((z1) obj);
                    }
                });
                if (listZ4 != null) {
                    g5Var.l(listZ4);
                    oq.i0 i0Var4 = oq.i0.f148189a;
                }
                return oq.i0.f148189a;
            case 24:
                List<j> listZ5 = z1Var.Z(new l() { // from class: n1.e5
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g5.w((z1) obj);
                    }
                });
                if (listZ5 != null) {
                    g5Var.l(listZ5);
                    oq.i0 i0Var5 = oq.i0.f148189a;
                }
                return oq.i0.f148189a;
            case 25:
                List<j> listZ6 = z1Var.Z(new l() { // from class: n1.f5
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g5.x((z1) obj);
                    }
                });
                if (listZ6 != null) {
                    g5Var.l(listZ6);
                    oq.i0 i0Var6 = oq.i0.f148189a;
                }
                return oq.i0.f148189a;
            case 26:
                if (g5Var.singleLine) {
                    l0Var.f66404a = g5Var.state.q().b(v4.t.j(g5Var.imeAction)).booleanValue();
                } else {
                    g5Var.m(new CommitTextCommand("\n", 1));
                }
                oq.i0 i0Var7 = oq.i0.f148189a;
                return oq.i0.f148189a;
            case 27:
                if (g5Var.singleLine) {
                    l0Var.f66404a = false;
                } else {
                    g5Var.m(new CommitTextCommand("\t", 1));
                }
                oq.i0 i0Var8 = oq.i0.f148189a;
                return oq.i0.f148189a;
            case 28:
                z1Var.S();
                return oq.i0.f148189a;
            case 29:
                z1Var.B().T();
                return oq.i0.f148189a;
            case 30:
                z1Var.J().T();
                return oq.i0.f148189a;
            case BERTags.DATE /* 31 */:
                z1Var.C().T();
                return oq.i0.f148189a;
            case 32:
                z1Var.K().T();
                return oq.i0.f148189a;
            case 33:
                z1Var.H().T();
                return oq.i0.f148189a;
            case 34:
                z1Var.E().T();
                return oq.i0.f148189a;
            case 35:
                z1Var.Q().T();
                return oq.i0.f148189a;
            case 36:
                z1Var.N().T();
                return oq.i0.f148189a;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                z1Var.O().T();
                return oq.i0.f148189a;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                z1Var.P().T();
                return oq.i0.f148189a;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                z1Var.R().T();
                return oq.i0.f148189a;
            case 40:
                z1Var.A().T();
                return oq.i0.f148189a;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                z1Var.d0().T();
                return oq.i0.f148189a;
            case EACTags.CURRENCY_CODE /* 42 */:
                z1Var.c0().T();
                return oq.i0.f148189a;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                z1Var.M().T();
                return oq.i0.f148189a;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                z1Var.L().T();
                return oq.i0.f148189a;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                z1Var.d();
                return oq.i0.f148189a;
            case 46:
                i7 i7Var = g5Var.undoManager;
                if (i7Var != null) {
                    i7Var.b(z1Var.a0());
                }
                i7 i7Var2 = g5Var.undoManager;
                if (i7Var2 != null && (textFieldValueG = i7Var2.g()) != null) {
                    g5Var.onValueChange.b(textFieldValueG);
                    oq.i0 i0Var9 = oq.i0.f148189a;
                }
                return oq.i0.f148189a;
            case 47:
                i7 i7Var3 = g5Var.undoManager;
                if (i7Var3 != null && (textFieldValueC = i7Var3.c()) != null) {
                    g5Var.onValueChange.b(textFieldValueC);
                    oq.i0 i0Var10 = oq.i0.f148189a;
                }
                return oq.i0.f148189a;
            case 48:
                d3.b();
            case 49:
                oq.i0 i0Var11 = oq.i0.f148189a;
                return oq.i0.f148189a;
            default:
                throw new oq.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(z1 z1Var) {
        z1Var.B();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(z1 z1Var) {
        z1Var.J();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j s(z1 z1Var) {
        int iR = z1Var.r();
        if (iR == -1) {
            return null;
        }
        return new DeleteSurroundingTextCommand(z3.i(z1Var.getSelection()) - iR, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j t(z1 z1Var) {
        int iL = z1Var.l();
        if (iL != -1) {
            return new DeleteSurroundingTextCommand(0, iL - z3.i(z1Var.getSelection()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j u(z1 z1Var) {
        Integer numU = z1Var.u();
        if (numU == null) {
            return null;
        }
        return new DeleteSurroundingTextCommand(z3.i(z1Var.getSelection()) - numU.intValue(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j v(z1 z1Var) {
        Integer numM = z1Var.m();
        if (numM != null) {
            return new DeleteSurroundingTextCommand(0, numM.intValue() - z3.i(z1Var.getSelection()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j w(z1 z1Var) {
        Integer numI = z1Var.i();
        if (numI == null) {
            return null;
        }
        return new DeleteSurroundingTextCommand(z3.i(z1Var.getSelection()) - numI.intValue(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j x(z1 z1Var) {
        Integer numF = z1Var.f();
        if (numF != null) {
            return new DeleteSurroundingTextCommand(0, numF.intValue() - z3.i(z1Var.getSelection()));
        }
        return null;
    }

    private final CommitTextCommand y(KeyEvent event) {
        Integer numA;
        if (j5.a(event) && (numA = this.keyCombiner.a(event)) != null) {
            return new CommitTextCommand(e4.a(new StringBuilder(), numA.intValue()).toString(), 1);
        }
        return null;
    }

    public final boolean o(KeyEvent event) {
        final c3 c3VarA;
        CommitTextCommand commitTextCommandY = y(event);
        if (commitTextCommandY != null) {
            if (!this.editable) {
                return false;
            }
            m(commitTextCommandY);
            this.preparedSelectionState.b();
            return true;
        }
        if (!c.e(d.b(event), c.INSTANCE.a()) || (c3VarA = this.keyMapping.a(event)) == null || (c3VarA.getEditsText() && !this.editable)) {
            return false;
        }
        final l0 l0Var = new l0();
        l0Var.f66404a = true;
        n(new l() { // from class: n1.w4
            @Override // er.l
            public final Object b(Object obj) {
                return g5.p(c3VarA, this, l0Var, (z1) obj);
            }
        });
        i7 i7Var = this.undoManager;
        if (i7Var != null) {
            i7Var.a();
        }
        return l0Var.f66404a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g5(s3 s3Var, c2 c2Var, TextFieldValue textFieldValue, boolean z15, boolean z16, d3 d3Var, i0 i0Var, i7 i7Var, n2 n2Var, e3 e3Var, l<? super TextFieldValue, oq.i0> lVar, int i15) {
        this.state = s3Var;
        this.selectionManager = c2Var;
        this.value = textFieldValue;
        this.editable = z15;
        this.singleLine = z16;
        this.preparedSelectionState = d3Var;
        this.offsetMapping = i0Var;
        this.undoManager = i7Var;
        this.keyCombiner = n2Var;
        this.keyMapping = e3Var;
        this.onValueChange = lVar;
        this.imeAction = i15;
    }

    public /* synthetic */ g5(s3 s3Var, c2 c2Var, TextFieldValue textFieldValue, boolean z15, boolean z16, d3 d3Var, i0 i0Var, i7 i7Var, n2 n2Var, e3 e3Var, l lVar, int i15, int i16, k kVar) {
        this(s3Var, c2Var, (i16 & 4) != 0 ? new TextFieldValue((String) null, 0L, (z3) null, 7, (k) null) : textFieldValue, (i16 & 8) != 0 ? true : z15, (i16 & 16) != 0 ? false : z16, d3Var, (i16 & 64) != 0 ? i0.INSTANCE.a() : i0Var, (i16 & 128) != 0 ? null : i7Var, n2Var, (i16 & 512) != 0 ? g3.a() : e3Var, (i16 & 1024) != 0 ? new l() { // from class: n1.x4
            @Override // er.l
            public final Object b(Object obj) {
                return g5.k((TextFieldValue) obj);
            }
        } : lVar, i15, null);
    }
}
