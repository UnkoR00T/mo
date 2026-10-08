package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import d61.a;
import fr.t;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u0010<J\u0012\u0010N\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0018\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u0010<J\u0018\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u0010<J\u0012\u0010T\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0018\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u0010<J\u0018\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bY\u0010<J\u0012\u0010Z\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0018\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\\\u0010<J\u0012\u0010]\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0012\u0010_\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0012\u0010c\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0018\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\be\u0010<J\u0018\u0010f\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bf\u0010<J\u0018\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bg\u0010<J\u0012\u0010h\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0004\bh\u0010iJ\u0012\u0010j\u001a\u0004\u0018\u000102HÆ\u0003¢\u0006\u0004\bj\u0010kJ\u0012\u0010l\u001a\u0004\u0018\u000104HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u000106HÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0012\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bp\u0010DJÌ\u0003\u0010q\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\bq\u0010rJ\u0010\u0010s\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bs\u0010DJ\u0010\u0010u\u001a\u00020tHÖ\u0001¢\u0006\u0004\bu\u0010vJ\u001a\u0010y\u001a\u00020x2\b\u0010w\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\by\u0010zR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010{\u001a\u0004\b|\u0010<R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010}\u001a\u0004\b~\u0010>R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\b\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010@R\u001e\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\n\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010BR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010DR\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010FR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010HR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010JR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010LR#\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0015\u0010{\u001a\u0005\b\u008d\u0001\u0010<R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010OR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010QR#\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001a\u0010{\u001a\u0005\b\u0092\u0001\u0010<R#\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001b\u0010{\u001a\u0005\b\u0093\u0001\u0010<R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010UR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010WR#\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b \u0010{\u001a\u0005\b\u0098\u0001\u0010<R#\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b!\u0010{\u001a\u0005\b\u0099\u0001\u0010<R\u001e\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b#\u0010\u009a\u0001\u001a\u0005\b\u009b\u0001\u0010[R#\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b$\u0010{\u001a\u0005\b\u009c\u0001\u0010<R\u001e\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010^R\u001e\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010`R\u001e\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010bR\u001e\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010£\u0001\u001a\u0005\b¤\u0001\u0010dR#\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b-\u0010{\u001a\u0005\b¥\u0001\u0010<R#\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b.\u0010{\u001a\u0005\b¦\u0001\u0010<R#\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b/\u0010{\u001a\u0005\b§\u0001\u0010<R\u001e\u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b1\u0010¨\u0001\u001a\u0005\b©\u0001\u0010iR\u001e\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b3\u0010ª\u0001\u001a\u0005\b«\u0001\u0010kR\u001e\u00105\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b5\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010mR\u001e\u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b7\u0010®\u0001\u001a\u0005\b¯\u0001\u0010oR\u001e\u00108\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b8\u0010\u0083\u0001\u001a\u0005\b°\u0001\u0010D¨\u0006±\u0001"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDraftDto;", "", "", "", "destinationsBackstack", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportTypeDto;", "passportType", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportOfficePlaceDto;", "passportOfficePlace", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationWhoAgreesDto;", "whoAgrees", "pickedChildId", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationParentFormDataDto;", "parentFormData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationChildDataResultDto;", "childData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationEnterChildValidatedDataDto;", "enterChild", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/EnterChildCheckboxesDto;", "enterChildCheckboxes", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationFileDto;", "temporaryPassportReasonAttachments", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationReasonTypeDto;", "reasonType", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddPhotoDto;", "photo", "photoGlassesAttachment", "photoFaceCoverAttachment", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationOfficeDictionaryDto;", "institutionData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDataDto;", "dataSplitData", "signedConsentAttachmentsData", "otherParentUnableToConsentAttachmentsData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildDataApplicationAttachmentDataDto;", "oldMoneyTransferAttachmentsData", "newMoneyTransferAttachmentsData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationContactDetailsDataDto;", "contactDetails", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationCountryDictionaryDto;", "correspondenceCountry", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationCorrespondenceAddressDto;", "correspondenceAddress", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPickupMethodDto;", "pickupMethod", "abroadTreatmentAttachmentsData", "kdrAttachmentsData", "technicalIssueAttachmentsData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDiscountTypeDto;", "discountTypeData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/SummaryCheckBoxDto;", "summaryCheckbox", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationFaceDetectionDataDto;", "faceDetectionData", "Ld61/a;", "paymentType", "applicationId", "<init>", "(Ljava/util/List;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportTypeDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportOfficePlaceDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationWhoAgreesDto;Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationParentFormDataDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationChildDataResultDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationEnterChildValidatedDataDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/EnterChildCheckboxesDto;Ljava/util/List;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationReasonTypeDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddPhotoDto;Ljava/util/List;Ljava/util/List;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationOfficeDictionaryDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDataDto;Ljava/util/List;Ljava/util/List;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildDataApplicationAttachmentDataDto;Ljava/util/List;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationContactDetailsDataDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationCountryDictionaryDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationCorrespondenceAddressDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPickupMethodDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDiscountTypeDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/SummaryCheckBoxDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationFaceDetectionDataDto;Ld61/a;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportTypeDto;", "component3", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportOfficePlaceDto;", "component4", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationWhoAgreesDto;", "component5", "()Ljava/lang/String;", "component6", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationParentFormDataDto;", "component7", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationChildDataResultDto;", "component8", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationEnterChildValidatedDataDto;", "component9", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/EnterChildCheckboxesDto;", "component10", "component11", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationReasonTypeDto;", "component12", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddPhotoDto;", "component13", "component14", "component15", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationOfficeDictionaryDto;", "component16", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDataDto;", "component17", "component18", "component19", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildDataApplicationAttachmentDataDto;", "component20", "component21", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationContactDetailsDataDto;", "component22", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationCountryDictionaryDto;", "component23", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationCorrespondenceAddressDto;", "component24", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPickupMethodDto;", "component25", "component26", "component27", "component28", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDiscountTypeDto;", "component29", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/SummaryCheckBoxDto;", "component30", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationFaceDetectionDataDto;", "component31", "()Ld61/a;", "component32", "copy", "(Ljava/util/List;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportTypeDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportOfficePlaceDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationWhoAgreesDto;Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationParentFormDataDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationChildDataResultDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationEnterChildValidatedDataDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/EnterChildCheckboxesDto;Ljava/util/List;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationReasonTypeDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddPhotoDto;Ljava/util/List;Ljava/util/List;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationOfficeDictionaryDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDataDto;Ljava/util/List;Ljava/util/List;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildDataApplicationAttachmentDataDto;Ljava/util/List;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationContactDetailsDataDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationCountryDictionaryDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationCorrespondenceAddressDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPickupMethodDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDiscountTypeDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/SummaryCheckBoxDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationFaceDetectionDataDto;Ld61/a;Ljava/lang/String;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDraftDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDestinationsBackstack", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportTypeDto;", "getPassportType", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportOfficePlaceDto;", "getPassportOfficePlace", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationWhoAgreesDto;", "getWhoAgrees", "Ljava/lang/String;", "getPickedChildId", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationParentFormDataDto;", "getParentFormData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationChildDataResultDto;", "getChildData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationEnterChildValidatedDataDto;", "getEnterChild", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/EnterChildCheckboxesDto;", "getEnterChildCheckboxes", "getTemporaryPassportReasonAttachments", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationReasonTypeDto;", "getReasonType", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddPhotoDto;", "getPhoto", "getPhotoGlassesAttachment", "getPhotoFaceCoverAttachment", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationOfficeDictionaryDto;", "getInstitutionData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDataDto;", "getDataSplitData", "getSignedConsentAttachmentsData", "getOtherParentUnableToConsentAttachmentsData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildDataApplicationAttachmentDataDto;", "getOldMoneyTransferAttachmentsData", "getNewMoneyTransferAttachmentsData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationContactDetailsDataDto;", "getContactDetails", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationCountryDictionaryDto;", "getCorrespondenceCountry", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationCorrespondenceAddressDto;", "getCorrespondenceAddress", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPickupMethodDto;", "getPickupMethod", "getAbroadTreatmentAttachmentsData", "getKdrAttachmentsData", "getTechnicalIssueAttachmentsData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDiscountTypeDto;", "getDiscountTypeData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/SummaryCheckBoxDto;", "getSummaryCheckbox", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationFaceDetectionDataDto;", "getFaceDetectionData", "Ld61/a;", "getPaymentType", "getApplicationId", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationDraftDto {
    public static final int $stable = 8;

    @c("abroadTreatmentAttachmentsData")
    private final List<ChildPassportApplicationFileDto> abroadTreatmentAttachmentsData;

    @c("applicationId")
    private final String applicationId;

    @c("childData")
    private final ChildPassportApplicationChildDataResultDto childData;

    @c("contactDetails")
    private final ChildPassportApplicationContactDetailsDataDto contactDetails;

    @c("correspondenceAddress")
    private final ChildPassportApplicationCorrespondenceAddressDto correspondenceAddress;

    @c("correspondenceCountry")
    private final PassportChildApplicationCountryDictionaryDto correspondenceCountry;

    @c("dataSplitData")
    private final ChildPassportApplicationDataSplitDataDto dataSplitData;

    @c("destinationsBackstack")
    private final List<String> destinationsBackstack;

    @c("discountTypeData")
    private final ChildPassportApplicationDiscountTypeDto discountTypeData;

    @c("enterChild")
    private final ChildPassportApplicationEnterChildValidatedDataDto enterChild;

    @c("enterChildCheckboxes")
    private final EnterChildCheckboxesDto enterChildCheckboxes;

    @c("faceDetectionData")
    private final ChildPassportApplicationFaceDetectionDataDto faceDetectionData;

    @c("institutionData")
    private final ChildPassportApplicationOfficeDictionaryDto institutionData;

    @c("kdrAttachmentsData")
    private final List<ChildPassportApplicationFileDto> kdrAttachmentsData;

    @c("newMoneyTransferAttachmentsData")
    private final List<ChildPassportApplicationFileDto> newMoneyTransferAttachmentsData;

    @c("oldMoneyTransferAttachmentsData")
    private final ChildDataApplicationAttachmentDataDto oldMoneyTransferAttachmentsData;

    @c("otherParentUnableToConsentAttachmentsData")
    private final List<ChildPassportApplicationFileDto> otherParentUnableToConsentAttachmentsData;

    @c("parentFormData")
    private final ChildPassportApplicationParentFormDataDto parentFormData;

    @c("passportOfficePlace")
    private final ChildPassportApplicationPassportOfficePlaceDto passportOfficePlace;

    @c("passportType")
    private final ChildPassportApplicationPassportTypeDto passportType;

    @c("paymentType")
    private final a paymentType;

    @c("photo")
    private final ChildPassportApplicationAddPhotoDto photo;

    @c("photoFaceCoverAttachment")
    private final List<ChildPassportApplicationFileDto> photoFaceCoverAttachment;

    @c("photoGlassesAttachment")
    private final List<ChildPassportApplicationFileDto> photoGlassesAttachment;

    @c("pickedChildId")
    private final String pickedChildId;

    @c("pickupMethod")
    private final ChildPassportApplicationPickupMethodDto pickupMethod;

    @c("reasonType")
    private final ChildPassportApplicationReasonTypeDto reasonType;

    @c("signedConsentAttachmentsData")
    private final List<ChildPassportApplicationFileDto> signedConsentAttachmentsData;

    @c("summaryCheckbox")
    private final SummaryCheckBoxDto summaryCheckbox;

    @c("technicalIssueAttachmentsData")
    private final List<ChildPassportApplicationFileDto> technicalIssueAttachmentsData;

    @c("temporaryPassportReasonAttachments")
    private final List<ChildPassportApplicationFileDto> temporaryPassportReasonAttachments;

    @c("whoAgrees")
    private final ChildPassportApplicationWhoAgreesDto whoAgrees;

    public ChildPassportApplicationDraftDto(List<String> list, ChildPassportApplicationPassportTypeDto childPassportApplicationPassportTypeDto, ChildPassportApplicationPassportOfficePlaceDto childPassportApplicationPassportOfficePlaceDto, ChildPassportApplicationWhoAgreesDto childPassportApplicationWhoAgreesDto, String str, ChildPassportApplicationParentFormDataDto childPassportApplicationParentFormDataDto, ChildPassportApplicationChildDataResultDto childPassportApplicationChildDataResultDto, ChildPassportApplicationEnterChildValidatedDataDto childPassportApplicationEnterChildValidatedDataDto, EnterChildCheckboxesDto enterChildCheckboxesDto, List<ChildPassportApplicationFileDto> list2, ChildPassportApplicationReasonTypeDto childPassportApplicationReasonTypeDto, ChildPassportApplicationAddPhotoDto childPassportApplicationAddPhotoDto, List<ChildPassportApplicationFileDto> list3, List<ChildPassportApplicationFileDto> list4, ChildPassportApplicationOfficeDictionaryDto childPassportApplicationOfficeDictionaryDto, ChildPassportApplicationDataSplitDataDto childPassportApplicationDataSplitDataDto, List<ChildPassportApplicationFileDto> list5, List<ChildPassportApplicationFileDto> list6, ChildDataApplicationAttachmentDataDto childDataApplicationAttachmentDataDto, List<ChildPassportApplicationFileDto> list7, ChildPassportApplicationContactDetailsDataDto childPassportApplicationContactDetailsDataDto, PassportChildApplicationCountryDictionaryDto passportChildApplicationCountryDictionaryDto, ChildPassportApplicationCorrespondenceAddressDto childPassportApplicationCorrespondenceAddressDto, ChildPassportApplicationPickupMethodDto childPassportApplicationPickupMethodDto, List<ChildPassportApplicationFileDto> list8, List<ChildPassportApplicationFileDto> list9, List<ChildPassportApplicationFileDto> list10, ChildPassportApplicationDiscountTypeDto childPassportApplicationDiscountTypeDto, SummaryCheckBoxDto summaryCheckBoxDto, ChildPassportApplicationFaceDetectionDataDto childPassportApplicationFaceDetectionDataDto, a aVar, String str2) {
        this.destinationsBackstack = list;
        this.passportType = childPassportApplicationPassportTypeDto;
        this.passportOfficePlace = childPassportApplicationPassportOfficePlaceDto;
        this.whoAgrees = childPassportApplicationWhoAgreesDto;
        this.pickedChildId = str;
        this.parentFormData = childPassportApplicationParentFormDataDto;
        this.childData = childPassportApplicationChildDataResultDto;
        this.enterChild = childPassportApplicationEnterChildValidatedDataDto;
        this.enterChildCheckboxes = enterChildCheckboxesDto;
        this.temporaryPassportReasonAttachments = list2;
        this.reasonType = childPassportApplicationReasonTypeDto;
        this.photo = childPassportApplicationAddPhotoDto;
        this.photoGlassesAttachment = list3;
        this.photoFaceCoverAttachment = list4;
        this.institutionData = childPassportApplicationOfficeDictionaryDto;
        this.dataSplitData = childPassportApplicationDataSplitDataDto;
        this.signedConsentAttachmentsData = list5;
        this.otherParentUnableToConsentAttachmentsData = list6;
        this.oldMoneyTransferAttachmentsData = childDataApplicationAttachmentDataDto;
        this.newMoneyTransferAttachmentsData = list7;
        this.contactDetails = childPassportApplicationContactDetailsDataDto;
        this.correspondenceCountry = passportChildApplicationCountryDictionaryDto;
        this.correspondenceAddress = childPassportApplicationCorrespondenceAddressDto;
        this.pickupMethod = childPassportApplicationPickupMethodDto;
        this.abroadTreatmentAttachmentsData = list8;
        this.kdrAttachmentsData = list9;
        this.technicalIssueAttachmentsData = list10;
        this.discountTypeData = childPassportApplicationDiscountTypeDto;
        this.summaryCheckbox = summaryCheckBoxDto;
        this.faceDetectionData = childPassportApplicationFaceDetectionDataDto;
        this.paymentType = aVar;
        this.applicationId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChildPassportApplicationDraftDto copy$default(ChildPassportApplicationDraftDto childPassportApplicationDraftDto, List list, ChildPassportApplicationPassportTypeDto childPassportApplicationPassportTypeDto, ChildPassportApplicationPassportOfficePlaceDto childPassportApplicationPassportOfficePlaceDto, ChildPassportApplicationWhoAgreesDto childPassportApplicationWhoAgreesDto, String str, ChildPassportApplicationParentFormDataDto childPassportApplicationParentFormDataDto, ChildPassportApplicationChildDataResultDto childPassportApplicationChildDataResultDto, ChildPassportApplicationEnterChildValidatedDataDto childPassportApplicationEnterChildValidatedDataDto, EnterChildCheckboxesDto enterChildCheckboxesDto, List list2, ChildPassportApplicationReasonTypeDto childPassportApplicationReasonTypeDto, ChildPassportApplicationAddPhotoDto childPassportApplicationAddPhotoDto, List list3, List list4, ChildPassportApplicationOfficeDictionaryDto childPassportApplicationOfficeDictionaryDto, ChildPassportApplicationDataSplitDataDto childPassportApplicationDataSplitDataDto, List list5, List list6, ChildDataApplicationAttachmentDataDto childDataApplicationAttachmentDataDto, List list7, ChildPassportApplicationContactDetailsDataDto childPassportApplicationContactDetailsDataDto, PassportChildApplicationCountryDictionaryDto passportChildApplicationCountryDictionaryDto, ChildPassportApplicationCorrespondenceAddressDto childPassportApplicationCorrespondenceAddressDto, ChildPassportApplicationPickupMethodDto childPassportApplicationPickupMethodDto, List list8, List list9, List list10, ChildPassportApplicationDiscountTypeDto childPassportApplicationDiscountTypeDto, SummaryCheckBoxDto summaryCheckBoxDto, ChildPassportApplicationFaceDetectionDataDto childPassportApplicationFaceDetectionDataDto, a aVar, String str2, int i15, Object obj) {
        String str3;
        a aVar2;
        List list11 = (i15 & 1) != 0 ? childPassportApplicationDraftDto.destinationsBackstack : list;
        ChildPassportApplicationPassportTypeDto childPassportApplicationPassportTypeDto2 = (i15 & 2) != 0 ? childPassportApplicationDraftDto.passportType : childPassportApplicationPassportTypeDto;
        ChildPassportApplicationPassportOfficePlaceDto childPassportApplicationPassportOfficePlaceDto2 = (i15 & 4) != 0 ? childPassportApplicationDraftDto.passportOfficePlace : childPassportApplicationPassportOfficePlaceDto;
        ChildPassportApplicationWhoAgreesDto childPassportApplicationWhoAgreesDto2 = (i15 & 8) != 0 ? childPassportApplicationDraftDto.whoAgrees : childPassportApplicationWhoAgreesDto;
        String str4 = (i15 & 16) != 0 ? childPassportApplicationDraftDto.pickedChildId : str;
        ChildPassportApplicationParentFormDataDto childPassportApplicationParentFormDataDto2 = (i15 & 32) != 0 ? childPassportApplicationDraftDto.parentFormData : childPassportApplicationParentFormDataDto;
        ChildPassportApplicationChildDataResultDto childPassportApplicationChildDataResultDto2 = (i15 & 64) != 0 ? childPassportApplicationDraftDto.childData : childPassportApplicationChildDataResultDto;
        ChildPassportApplicationEnterChildValidatedDataDto childPassportApplicationEnterChildValidatedDataDto2 = (i15 & 128) != 0 ? childPassportApplicationDraftDto.enterChild : childPassportApplicationEnterChildValidatedDataDto;
        EnterChildCheckboxesDto enterChildCheckboxesDto2 = (i15 & 256) != 0 ? childPassportApplicationDraftDto.enterChildCheckboxes : enterChildCheckboxesDto;
        List list12 = (i15 & 512) != 0 ? childPassportApplicationDraftDto.temporaryPassportReasonAttachments : list2;
        ChildPassportApplicationReasonTypeDto childPassportApplicationReasonTypeDto2 = (i15 & 1024) != 0 ? childPassportApplicationDraftDto.reasonType : childPassportApplicationReasonTypeDto;
        ChildPassportApplicationAddPhotoDto childPassportApplicationAddPhotoDto2 = (i15 & 2048) != 0 ? childPassportApplicationDraftDto.photo : childPassportApplicationAddPhotoDto;
        List list13 = (i15 & PKIFailureInfo.certConfirmed) != 0 ? childPassportApplicationDraftDto.photoGlassesAttachment : list3;
        List list14 = (i15 & PKIFailureInfo.certRevoked) != 0 ? childPassportApplicationDraftDto.photoFaceCoverAttachment : list4;
        List list15 = list11;
        ChildPassportApplicationOfficeDictionaryDto childPassportApplicationOfficeDictionaryDto2 = (i15 & 16384) != 0 ? childPassportApplicationDraftDto.institutionData : childPassportApplicationOfficeDictionaryDto;
        ChildPassportApplicationDataSplitDataDto childPassportApplicationDataSplitDataDto2 = (i15 & 32768) != 0 ? childPassportApplicationDraftDto.dataSplitData : childPassportApplicationDataSplitDataDto;
        List list16 = (i15 & PKIFailureInfo.notAuthorized) != 0 ? childPassportApplicationDraftDto.signedConsentAttachmentsData : list5;
        List list17 = (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? childPassportApplicationDraftDto.otherParentUnableToConsentAttachmentsData : list6;
        ChildDataApplicationAttachmentDataDto childDataApplicationAttachmentDataDto2 = (i15 & PKIFailureInfo.transactionIdInUse) != 0 ? childPassportApplicationDraftDto.oldMoneyTransferAttachmentsData : childDataApplicationAttachmentDataDto;
        List list18 = (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? childPassportApplicationDraftDto.newMoneyTransferAttachmentsData : list7;
        ChildPassportApplicationContactDetailsDataDto childPassportApplicationContactDetailsDataDto2 = (i15 & PKIFailureInfo.badCertTemplate) != 0 ? childPassportApplicationDraftDto.contactDetails : childPassportApplicationContactDetailsDataDto;
        PassportChildApplicationCountryDictionaryDto passportChildApplicationCountryDictionaryDto2 = (i15 & PKIFailureInfo.badSenderNonce) != 0 ? childPassportApplicationDraftDto.correspondenceCountry : passportChildApplicationCountryDictionaryDto;
        ChildPassportApplicationCorrespondenceAddressDto childPassportApplicationCorrespondenceAddressDto2 = (i15 & 4194304) != 0 ? childPassportApplicationDraftDto.correspondenceAddress : childPassportApplicationCorrespondenceAddressDto;
        ChildPassportApplicationPickupMethodDto childPassportApplicationPickupMethodDto2 = (i15 & 8388608) != 0 ? childPassportApplicationDraftDto.pickupMethod : childPassportApplicationPickupMethodDto;
        List list19 = (i15 & 16777216) != 0 ? childPassportApplicationDraftDto.abroadTreatmentAttachmentsData : list8;
        List list20 = (i15 & 33554432) != 0 ? childPassportApplicationDraftDto.kdrAttachmentsData : list9;
        List list21 = (i15 & 67108864) != 0 ? childPassportApplicationDraftDto.technicalIssueAttachmentsData : list10;
        ChildPassportApplicationDiscountTypeDto childPassportApplicationDiscountTypeDto2 = (i15 & 134217728) != 0 ? childPassportApplicationDraftDto.discountTypeData : childPassportApplicationDiscountTypeDto;
        SummaryCheckBoxDto summaryCheckBoxDto2 = (i15 & 268435456) != 0 ? childPassportApplicationDraftDto.summaryCheckbox : summaryCheckBoxDto;
        ChildPassportApplicationFaceDetectionDataDto childPassportApplicationFaceDetectionDataDto2 = (i15 & PKIFailureInfo.duplicateCertReq) != 0 ? childPassportApplicationDraftDto.faceDetectionData : childPassportApplicationFaceDetectionDataDto;
        a aVar3 = (i15 & 1073741824) != 0 ? childPassportApplicationDraftDto.paymentType : aVar;
        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
            aVar2 = aVar3;
            str3 = childPassportApplicationDraftDto.applicationId;
        } else {
            str3 = str2;
            aVar2 = aVar3;
        }
        return childPassportApplicationDraftDto.copy(list15, childPassportApplicationPassportTypeDto2, childPassportApplicationPassportOfficePlaceDto2, childPassportApplicationWhoAgreesDto2, str4, childPassportApplicationParentFormDataDto2, childPassportApplicationChildDataResultDto2, childPassportApplicationEnterChildValidatedDataDto2, enterChildCheckboxesDto2, list12, childPassportApplicationReasonTypeDto2, childPassportApplicationAddPhotoDto2, list13, list14, childPassportApplicationOfficeDictionaryDto2, childPassportApplicationDataSplitDataDto2, list16, list17, childDataApplicationAttachmentDataDto2, list18, childPassportApplicationContactDetailsDataDto2, passportChildApplicationCountryDictionaryDto2, childPassportApplicationCorrespondenceAddressDto2, childPassportApplicationPickupMethodDto2, list19, list20, list21, childPassportApplicationDiscountTypeDto2, summaryCheckBoxDto2, childPassportApplicationFaceDetectionDataDto2, aVar2, str3);
    }

    public final List<String> component1() {
        return this.destinationsBackstack;
    }

    public final List<ChildPassportApplicationFileDto> component10() {
        return this.temporaryPassportReasonAttachments;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ChildPassportApplicationReasonTypeDto getReasonType() {
        return this.reasonType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ChildPassportApplicationAddPhotoDto getPhoto() {
        return this.photo;
    }

    public final List<ChildPassportApplicationFileDto> component13() {
        return this.photoGlassesAttachment;
    }

    public final List<ChildPassportApplicationFileDto> component14() {
        return this.photoFaceCoverAttachment;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final ChildPassportApplicationOfficeDictionaryDto getInstitutionData() {
        return this.institutionData;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final ChildPassportApplicationDataSplitDataDto getDataSplitData() {
        return this.dataSplitData;
    }

    public final List<ChildPassportApplicationFileDto> component17() {
        return this.signedConsentAttachmentsData;
    }

    public final List<ChildPassportApplicationFileDto> component18() {
        return this.otherParentUnableToConsentAttachmentsData;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final ChildDataApplicationAttachmentDataDto getOldMoneyTransferAttachmentsData() {
        return this.oldMoneyTransferAttachmentsData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChildPassportApplicationPassportTypeDto getPassportType() {
        return this.passportType;
    }

    public final List<ChildPassportApplicationFileDto> component20() {
        return this.newMoneyTransferAttachmentsData;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final ChildPassportApplicationContactDetailsDataDto getContactDetails() {
        return this.contactDetails;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final PassportChildApplicationCountryDictionaryDto getCorrespondenceCountry() {
        return this.correspondenceCountry;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final ChildPassportApplicationCorrespondenceAddressDto getCorrespondenceAddress() {
        return this.correspondenceAddress;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final ChildPassportApplicationPickupMethodDto getPickupMethod() {
        return this.pickupMethod;
    }

    public final List<ChildPassportApplicationFileDto> component25() {
        return this.abroadTreatmentAttachmentsData;
    }

    public final List<ChildPassportApplicationFileDto> component26() {
        return this.kdrAttachmentsData;
    }

    public final List<ChildPassportApplicationFileDto> component27() {
        return this.technicalIssueAttachmentsData;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final ChildPassportApplicationDiscountTypeDto getDiscountTypeData() {
        return this.discountTypeData;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final SummaryCheckBoxDto getSummaryCheckbox() {
        return this.summaryCheckbox;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChildPassportApplicationPassportOfficePlaceDto getPassportOfficePlace() {
        return this.passportOfficePlace;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final ChildPassportApplicationFaceDetectionDataDto getFaceDetectionData() {
        return this.faceDetectionData;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final a getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChildPassportApplicationWhoAgreesDto getWhoAgrees() {
        return this.whoAgrees;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPickedChildId() {
        return this.pickedChildId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ChildPassportApplicationParentFormDataDto getParentFormData() {
        return this.parentFormData;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ChildPassportApplicationChildDataResultDto getChildData() {
        return this.childData;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ChildPassportApplicationEnterChildValidatedDataDto getEnterChild() {
        return this.enterChild;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final EnterChildCheckboxesDto getEnterChildCheckboxes() {
        return this.enterChildCheckboxes;
    }

    public final ChildPassportApplicationDraftDto copy(List<String> destinationsBackstack, ChildPassportApplicationPassportTypeDto passportType, ChildPassportApplicationPassportOfficePlaceDto passportOfficePlace, ChildPassportApplicationWhoAgreesDto whoAgrees, String pickedChildId, ChildPassportApplicationParentFormDataDto parentFormData, ChildPassportApplicationChildDataResultDto childData, ChildPassportApplicationEnterChildValidatedDataDto enterChild, EnterChildCheckboxesDto enterChildCheckboxes, List<ChildPassportApplicationFileDto> temporaryPassportReasonAttachments, ChildPassportApplicationReasonTypeDto reasonType, ChildPassportApplicationAddPhotoDto photo, List<ChildPassportApplicationFileDto> photoGlassesAttachment, List<ChildPassportApplicationFileDto> photoFaceCoverAttachment, ChildPassportApplicationOfficeDictionaryDto institutionData, ChildPassportApplicationDataSplitDataDto dataSplitData, List<ChildPassportApplicationFileDto> signedConsentAttachmentsData, List<ChildPassportApplicationFileDto> otherParentUnableToConsentAttachmentsData, ChildDataApplicationAttachmentDataDto oldMoneyTransferAttachmentsData, List<ChildPassportApplicationFileDto> newMoneyTransferAttachmentsData, ChildPassportApplicationContactDetailsDataDto contactDetails, PassportChildApplicationCountryDictionaryDto correspondenceCountry, ChildPassportApplicationCorrespondenceAddressDto correspondenceAddress, ChildPassportApplicationPickupMethodDto pickupMethod, List<ChildPassportApplicationFileDto> abroadTreatmentAttachmentsData, List<ChildPassportApplicationFileDto> kdrAttachmentsData, List<ChildPassportApplicationFileDto> technicalIssueAttachmentsData, ChildPassportApplicationDiscountTypeDto discountTypeData, SummaryCheckBoxDto summaryCheckbox, ChildPassportApplicationFaceDetectionDataDto faceDetectionData, a paymentType, String applicationId) {
        return new ChildPassportApplicationDraftDto(destinationsBackstack, passportType, passportOfficePlace, whoAgrees, pickedChildId, parentFormData, childData, enterChild, enterChildCheckboxes, temporaryPassportReasonAttachments, reasonType, photo, photoGlassesAttachment, photoFaceCoverAttachment, institutionData, dataSplitData, signedConsentAttachmentsData, otherParentUnableToConsentAttachmentsData, oldMoneyTransferAttachmentsData, newMoneyTransferAttachmentsData, contactDetails, correspondenceCountry, correspondenceAddress, pickupMethod, abroadTreatmentAttachmentsData, kdrAttachmentsData, technicalIssueAttachmentsData, discountTypeData, summaryCheckbox, faceDetectionData, paymentType, applicationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationDraftDto)) {
            return false;
        }
        ChildPassportApplicationDraftDto childPassportApplicationDraftDto = (ChildPassportApplicationDraftDto) other;
        return t.c(this.destinationsBackstack, childPassportApplicationDraftDto.destinationsBackstack) && this.passportType == childPassportApplicationDraftDto.passportType && this.passportOfficePlace == childPassportApplicationDraftDto.passportOfficePlace && this.whoAgrees == childPassportApplicationDraftDto.whoAgrees && t.c(this.pickedChildId, childPassportApplicationDraftDto.pickedChildId) && t.c(this.parentFormData, childPassportApplicationDraftDto.parentFormData) && t.c(this.childData, childPassportApplicationDraftDto.childData) && t.c(this.enterChild, childPassportApplicationDraftDto.enterChild) && t.c(this.enterChildCheckboxes, childPassportApplicationDraftDto.enterChildCheckboxes) && t.c(this.temporaryPassportReasonAttachments, childPassportApplicationDraftDto.temporaryPassportReasonAttachments) && this.reasonType == childPassportApplicationDraftDto.reasonType && t.c(this.photo, childPassportApplicationDraftDto.photo) && t.c(this.photoGlassesAttachment, childPassportApplicationDraftDto.photoGlassesAttachment) && t.c(this.photoFaceCoverAttachment, childPassportApplicationDraftDto.photoFaceCoverAttachment) && t.c(this.institutionData, childPassportApplicationDraftDto.institutionData) && t.c(this.dataSplitData, childPassportApplicationDraftDto.dataSplitData) && t.c(this.signedConsentAttachmentsData, childPassportApplicationDraftDto.signedConsentAttachmentsData) && t.c(this.otherParentUnableToConsentAttachmentsData, childPassportApplicationDraftDto.otherParentUnableToConsentAttachmentsData) && t.c(this.oldMoneyTransferAttachmentsData, childPassportApplicationDraftDto.oldMoneyTransferAttachmentsData) && t.c(this.newMoneyTransferAttachmentsData, childPassportApplicationDraftDto.newMoneyTransferAttachmentsData) && t.c(this.contactDetails, childPassportApplicationDraftDto.contactDetails) && t.c(this.correspondenceCountry, childPassportApplicationDraftDto.correspondenceCountry) && t.c(this.correspondenceAddress, childPassportApplicationDraftDto.correspondenceAddress) && this.pickupMethod == childPassportApplicationDraftDto.pickupMethod && t.c(this.abroadTreatmentAttachmentsData, childPassportApplicationDraftDto.abroadTreatmentAttachmentsData) && t.c(this.kdrAttachmentsData, childPassportApplicationDraftDto.kdrAttachmentsData) && t.c(this.technicalIssueAttachmentsData, childPassportApplicationDraftDto.technicalIssueAttachmentsData) && this.discountTypeData == childPassportApplicationDraftDto.discountTypeData && t.c(this.summaryCheckbox, childPassportApplicationDraftDto.summaryCheckbox) && t.c(this.faceDetectionData, childPassportApplicationDraftDto.faceDetectionData) && this.paymentType == childPassportApplicationDraftDto.paymentType && t.c(this.applicationId, childPassportApplicationDraftDto.applicationId);
    }

    public final List<ChildPassportApplicationFileDto> getAbroadTreatmentAttachmentsData() {
        return this.abroadTreatmentAttachmentsData;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final ChildPassportApplicationChildDataResultDto getChildData() {
        return this.childData;
    }

    public final ChildPassportApplicationContactDetailsDataDto getContactDetails() {
        return this.contactDetails;
    }

    public final ChildPassportApplicationCorrespondenceAddressDto getCorrespondenceAddress() {
        return this.correspondenceAddress;
    }

    public final PassportChildApplicationCountryDictionaryDto getCorrespondenceCountry() {
        return this.correspondenceCountry;
    }

    public final ChildPassportApplicationDataSplitDataDto getDataSplitData() {
        return this.dataSplitData;
    }

    public final List<String> getDestinationsBackstack() {
        return this.destinationsBackstack;
    }

    public final ChildPassportApplicationDiscountTypeDto getDiscountTypeData() {
        return this.discountTypeData;
    }

    public final ChildPassportApplicationEnterChildValidatedDataDto getEnterChild() {
        return this.enterChild;
    }

    public final EnterChildCheckboxesDto getEnterChildCheckboxes() {
        return this.enterChildCheckboxes;
    }

    public final ChildPassportApplicationFaceDetectionDataDto getFaceDetectionData() {
        return this.faceDetectionData;
    }

    public final ChildPassportApplicationOfficeDictionaryDto getInstitutionData() {
        return this.institutionData;
    }

    public final List<ChildPassportApplicationFileDto> getKdrAttachmentsData() {
        return this.kdrAttachmentsData;
    }

    public final List<ChildPassportApplicationFileDto> getNewMoneyTransferAttachmentsData() {
        return this.newMoneyTransferAttachmentsData;
    }

    public final ChildDataApplicationAttachmentDataDto getOldMoneyTransferAttachmentsData() {
        return this.oldMoneyTransferAttachmentsData;
    }

    public final List<ChildPassportApplicationFileDto> getOtherParentUnableToConsentAttachmentsData() {
        return this.otherParentUnableToConsentAttachmentsData;
    }

    public final ChildPassportApplicationParentFormDataDto getParentFormData() {
        return this.parentFormData;
    }

    public final ChildPassportApplicationPassportOfficePlaceDto getPassportOfficePlace() {
        return this.passportOfficePlace;
    }

    public final ChildPassportApplicationPassportTypeDto getPassportType() {
        return this.passportType;
    }

    public final a getPaymentType() {
        return this.paymentType;
    }

    public final ChildPassportApplicationAddPhotoDto getPhoto() {
        return this.photo;
    }

    public final List<ChildPassportApplicationFileDto> getPhotoFaceCoverAttachment() {
        return this.photoFaceCoverAttachment;
    }

    public final List<ChildPassportApplicationFileDto> getPhotoGlassesAttachment() {
        return this.photoGlassesAttachment;
    }

    public final String getPickedChildId() {
        return this.pickedChildId;
    }

    public final ChildPassportApplicationPickupMethodDto getPickupMethod() {
        return this.pickupMethod;
    }

    public final ChildPassportApplicationReasonTypeDto getReasonType() {
        return this.reasonType;
    }

    public final List<ChildPassportApplicationFileDto> getSignedConsentAttachmentsData() {
        return this.signedConsentAttachmentsData;
    }

    public final SummaryCheckBoxDto getSummaryCheckbox() {
        return this.summaryCheckbox;
    }

    public final List<ChildPassportApplicationFileDto> getTechnicalIssueAttachmentsData() {
        return this.technicalIssueAttachmentsData;
    }

    public final List<ChildPassportApplicationFileDto> getTemporaryPassportReasonAttachments() {
        return this.temporaryPassportReasonAttachments;
    }

    public final ChildPassportApplicationWhoAgreesDto getWhoAgrees() {
        return this.whoAgrees;
    }

    public int hashCode() {
        List<String> list = this.destinationsBackstack;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ChildPassportApplicationPassportTypeDto childPassportApplicationPassportTypeDto = this.passportType;
        int iHashCode2 = (iHashCode + (childPassportApplicationPassportTypeDto == null ? 0 : childPassportApplicationPassportTypeDto.hashCode())) * 31;
        ChildPassportApplicationPassportOfficePlaceDto childPassportApplicationPassportOfficePlaceDto = this.passportOfficePlace;
        int iHashCode3 = (iHashCode2 + (childPassportApplicationPassportOfficePlaceDto == null ? 0 : childPassportApplicationPassportOfficePlaceDto.hashCode())) * 31;
        ChildPassportApplicationWhoAgreesDto childPassportApplicationWhoAgreesDto = this.whoAgrees;
        int iHashCode4 = (iHashCode3 + (childPassportApplicationWhoAgreesDto == null ? 0 : childPassportApplicationWhoAgreesDto.hashCode())) * 31;
        String str = this.pickedChildId;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        ChildPassportApplicationParentFormDataDto childPassportApplicationParentFormDataDto = this.parentFormData;
        int iHashCode6 = (iHashCode5 + (childPassportApplicationParentFormDataDto == null ? 0 : childPassportApplicationParentFormDataDto.hashCode())) * 31;
        ChildPassportApplicationChildDataResultDto childPassportApplicationChildDataResultDto = this.childData;
        int iHashCode7 = (iHashCode6 + (childPassportApplicationChildDataResultDto == null ? 0 : childPassportApplicationChildDataResultDto.hashCode())) * 31;
        ChildPassportApplicationEnterChildValidatedDataDto childPassportApplicationEnterChildValidatedDataDto = this.enterChild;
        int iHashCode8 = (iHashCode7 + (childPassportApplicationEnterChildValidatedDataDto == null ? 0 : childPassportApplicationEnterChildValidatedDataDto.hashCode())) * 31;
        EnterChildCheckboxesDto enterChildCheckboxesDto = this.enterChildCheckboxes;
        int iHashCode9 = (iHashCode8 + (enterChildCheckboxesDto == null ? 0 : enterChildCheckboxesDto.hashCode())) * 31;
        List<ChildPassportApplicationFileDto> list2 = this.temporaryPassportReasonAttachments;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ChildPassportApplicationReasonTypeDto childPassportApplicationReasonTypeDto = this.reasonType;
        int iHashCode11 = (iHashCode10 + (childPassportApplicationReasonTypeDto == null ? 0 : childPassportApplicationReasonTypeDto.hashCode())) * 31;
        ChildPassportApplicationAddPhotoDto childPassportApplicationAddPhotoDto = this.photo;
        int iHashCode12 = (iHashCode11 + (childPassportApplicationAddPhotoDto == null ? 0 : childPassportApplicationAddPhotoDto.hashCode())) * 31;
        List<ChildPassportApplicationFileDto> list3 = this.photoGlassesAttachment;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ChildPassportApplicationFileDto> list4 = this.photoFaceCoverAttachment;
        int iHashCode14 = (iHashCode13 + (list4 == null ? 0 : list4.hashCode())) * 31;
        ChildPassportApplicationOfficeDictionaryDto childPassportApplicationOfficeDictionaryDto = this.institutionData;
        int iHashCode15 = (iHashCode14 + (childPassportApplicationOfficeDictionaryDto == null ? 0 : childPassportApplicationOfficeDictionaryDto.hashCode())) * 31;
        ChildPassportApplicationDataSplitDataDto childPassportApplicationDataSplitDataDto = this.dataSplitData;
        int iHashCode16 = (iHashCode15 + (childPassportApplicationDataSplitDataDto == null ? 0 : childPassportApplicationDataSplitDataDto.hashCode())) * 31;
        List<ChildPassportApplicationFileDto> list5 = this.signedConsentAttachmentsData;
        int iHashCode17 = (iHashCode16 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<ChildPassportApplicationFileDto> list6 = this.otherParentUnableToConsentAttachmentsData;
        int iHashCode18 = (iHashCode17 + (list6 == null ? 0 : list6.hashCode())) * 31;
        ChildDataApplicationAttachmentDataDto childDataApplicationAttachmentDataDto = this.oldMoneyTransferAttachmentsData;
        int iHashCode19 = (iHashCode18 + (childDataApplicationAttachmentDataDto == null ? 0 : childDataApplicationAttachmentDataDto.hashCode())) * 31;
        List<ChildPassportApplicationFileDto> list7 = this.newMoneyTransferAttachmentsData;
        int iHashCode20 = (iHashCode19 + (list7 == null ? 0 : list7.hashCode())) * 31;
        ChildPassportApplicationContactDetailsDataDto childPassportApplicationContactDetailsDataDto = this.contactDetails;
        int iHashCode21 = (iHashCode20 + (childPassportApplicationContactDetailsDataDto == null ? 0 : childPassportApplicationContactDetailsDataDto.hashCode())) * 31;
        PassportChildApplicationCountryDictionaryDto passportChildApplicationCountryDictionaryDto = this.correspondenceCountry;
        int iHashCode22 = (iHashCode21 + (passportChildApplicationCountryDictionaryDto == null ? 0 : passportChildApplicationCountryDictionaryDto.hashCode())) * 31;
        ChildPassportApplicationCorrespondenceAddressDto childPassportApplicationCorrespondenceAddressDto = this.correspondenceAddress;
        int iHashCode23 = (iHashCode22 + (childPassportApplicationCorrespondenceAddressDto == null ? 0 : childPassportApplicationCorrespondenceAddressDto.hashCode())) * 31;
        ChildPassportApplicationPickupMethodDto childPassportApplicationPickupMethodDto = this.pickupMethod;
        int iHashCode24 = (iHashCode23 + (childPassportApplicationPickupMethodDto == null ? 0 : childPassportApplicationPickupMethodDto.hashCode())) * 31;
        List<ChildPassportApplicationFileDto> list8 = this.abroadTreatmentAttachmentsData;
        int iHashCode25 = (iHashCode24 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<ChildPassportApplicationFileDto> list9 = this.kdrAttachmentsData;
        int iHashCode26 = (iHashCode25 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<ChildPassportApplicationFileDto> list10 = this.technicalIssueAttachmentsData;
        int iHashCode27 = (iHashCode26 + (list10 == null ? 0 : list10.hashCode())) * 31;
        ChildPassportApplicationDiscountTypeDto childPassportApplicationDiscountTypeDto = this.discountTypeData;
        int iHashCode28 = (iHashCode27 + (childPassportApplicationDiscountTypeDto == null ? 0 : childPassportApplicationDiscountTypeDto.hashCode())) * 31;
        SummaryCheckBoxDto summaryCheckBoxDto = this.summaryCheckbox;
        int iHashCode29 = (iHashCode28 + (summaryCheckBoxDto == null ? 0 : summaryCheckBoxDto.hashCode())) * 31;
        ChildPassportApplicationFaceDetectionDataDto childPassportApplicationFaceDetectionDataDto = this.faceDetectionData;
        int iHashCode30 = (iHashCode29 + (childPassportApplicationFaceDetectionDataDto == null ? 0 : childPassportApplicationFaceDetectionDataDto.hashCode())) * 31;
        a aVar = this.paymentType;
        int iHashCode31 = (iHashCode30 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.applicationId;
        return iHashCode31 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ChildPassportApplicationDraftDto(destinationsBackstack=" + this.destinationsBackstack + ", passportType=" + this.passportType + ", passportOfficePlace=" + this.passportOfficePlace + ", whoAgrees=" + this.whoAgrees + ", pickedChildId=" + this.pickedChildId + ", parentFormData=" + this.parentFormData + ", childData=" + this.childData + ", enterChild=" + this.enterChild + ", enterChildCheckboxes=" + this.enterChildCheckboxes + ", temporaryPassportReasonAttachments=" + this.temporaryPassportReasonAttachments + ", reasonType=" + this.reasonType + ", photo=" + this.photo + ", photoGlassesAttachment=" + this.photoGlassesAttachment + ", photoFaceCoverAttachment=" + this.photoFaceCoverAttachment + ", institutionData=" + this.institutionData + ", dataSplitData=" + this.dataSplitData + ", signedConsentAttachmentsData=" + this.signedConsentAttachmentsData + ", otherParentUnableToConsentAttachmentsData=" + this.otherParentUnableToConsentAttachmentsData + ", oldMoneyTransferAttachmentsData=" + this.oldMoneyTransferAttachmentsData + ", newMoneyTransferAttachmentsData=" + this.newMoneyTransferAttachmentsData + ", contactDetails=" + this.contactDetails + ", correspondenceCountry=" + this.correspondenceCountry + ", correspondenceAddress=" + this.correspondenceAddress + ", pickupMethod=" + this.pickupMethod + ", abroadTreatmentAttachmentsData=" + this.abroadTreatmentAttachmentsData + ", kdrAttachmentsData=" + this.kdrAttachmentsData + ", technicalIssueAttachmentsData=" + this.technicalIssueAttachmentsData + ", discountTypeData=" + this.discountTypeData + ", summaryCheckbox=" + this.summaryCheckbox + ", faceDetectionData=" + this.faceDetectionData + ", paymentType=" + this.paymentType + ", applicationId=" + this.applicationId + ')';
    }
}
