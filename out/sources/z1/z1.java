package z1;

import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p079n1.k6;
import q4.z3;
import v4.CommitTextCommand;
import v4.SetSelectionCommand;
import v4.TextFieldValue;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u001c¨\u0006#"}, d2 = {"Lz1/z1;", "Lz1/m;", "Lv4/t0;", "currentValue", "Lv4/i0;", "offsetMapping", "Ln1/k6;", "layoutResultProxy", "Lz1/d3;", "state", "<init>", "(Lv4/t0;Lv4/i0;Ln1/k6;Lz1/d3;)V", "", "pagesAmount", "b0", "(Ln1/k6;I)I", "Lkotlin/Function1;", "Lv4/j;", "or", "", "Z", "(Ler/l;)Ljava/util/List;", "d0", "()Lz1/z1;", "c0", "j", "Lv4/t0;", "getCurrentValue", "()Lv4/t0;", "k", "Ln1/k6;", "getLayoutResultProxy", "()Ln1/k6;", "a0", "value", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z1 extends m<z1> {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final TextFieldValue currentValue;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k6 layoutResultProxy;

    public z1(TextFieldValue textFieldValue, v4.i0 i0Var, k6 k6Var, d3 d3Var) {
        super(textFieldValue.getText(), textFieldValue.getSelection(), k6Var != null ? k6Var.getValue() : null, i0Var, d3Var, null);
        this.currentValue = textFieldValue;
        this.layoutResultProxy = k6Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final int b0(k6 k6Var, int i15) {
        m3.g gVarA;
        p036e4.b0 innerTextFieldCoordinates = k6Var.getInnerTextFieldCoordinates();
        if (innerTextFieldCoordinates != null) {
            p036e4.b0 decorationBoxCoordinates = k6Var.getDecorationBoxCoordinates();
            gVarA = decorationBoxCoordinates != null ? p036e4.b0.z0(decorationBoxCoordinates, innerTextFieldCoordinates, false, 2, null) : null;
            if (gVarA == null) {
                gVarA = m3.g.INSTANCE.a();
            }
        } else {
            gVarA = m3.g.INSTANCE.a();
        }
        m3.g gVarE = k6Var.getValue().e(getOffsetMapping().e(z3.i(this.currentValue.getSelection())));
        return getOffsetMapping().b(k6Var.getValue().x(m3.e.e((((long) Float.floatToRawIntBits(gVarE.getLeft())) << 32) | (((long) Float.floatToRawIntBits(gVarE.getTop() + (Float.intBitsToFloat((int) (gVarA.l() & BodyPartID.bodyIdMax)) * i15))) & BodyPartID.bodyIdMax))));
    }

    public final List<v4.j> Z(er.l<? super z1, ? extends v4.j> or4) {
        if (!z3.h(getSelection())) {
            return pq.v.q(new CommitTextCommand("", 0), new SetSelectionCommand(z3.l(getSelection()), z3.l(getSelection())));
        }
        v4.j jVarB = or4.b(this);
        if (jVarB != null) {
            return pq.v.e(jVarB);
        }
        return null;
    }

    public final TextFieldValue a0() {
        return TextFieldValue.i(this.currentValue, getAnnotatedString(), getSelection(), null, 4, null);
    }

    public final z1 c0() {
        k6 k6Var;
        if (x().length() > 0 && (k6Var = this.layoutResultProxy) != null) {
            U(b0(k6Var, 1));
        }
        return this;
    }

    public final z1 d0() {
        k6 k6Var;
        if (x().length() > 0 && (k6Var = this.layoutResultProxy) != null) {
            U(b0(k6Var, -1));
        }
        return this;
    }
}
