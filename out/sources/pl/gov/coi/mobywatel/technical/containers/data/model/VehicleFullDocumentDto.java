package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0080\u0001\b\u0087\b\u0018\u00002\u00020\u0001B»\u0005\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010>\u001a\u00020?\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D¢\u0006\u0004\bE\u0010FJ\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0012\u0010\u0090\u0001\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0012\u0010\u0091\u0001\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010¶\u0001\u001a\u0004\u0018\u00010:HÆ\u0003¢\u0006\u0002\u0010zJ\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\n\u0010º\u0001\u001a\u00020?HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010BHÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010DHÆ\u0003JÆ\u0005\u0010¾\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010>\u001a\u00020?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010DHÆ\u0001¢\u0006\u0003\u0010¿\u0001J\u0015\u0010À\u0001\u001a\u00020?2\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Â\u0001\u001a\u00020:HÖ\u0001J\n\u0010Ã\u0001\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010HR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010HR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010HR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010NR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010HR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010RR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010RR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010VR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010HR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010HR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010HR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010HR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010HR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010HR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010HR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010HR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010HR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010HR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010HR\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010HR\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010HR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010HR\u0018\u0010#\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010NR\u0018\u0010$\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010NR\u0018\u0010%\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010NR\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010HR\u0018\u0010'\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010NR\u0018\u0010(\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010NR\u0018\u0010)\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010NR\u0018\u0010*\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010NR\u0018\u0010+\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010NR\u0018\u0010,\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010NR\u0018\u0010-\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010NR\u0018\u0010.\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010NR\u0018\u0010/\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010NR\u0018\u00100\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010NR\u0018\u00101\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010NR\u0018\u00102\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010NR\u0018\u00103\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010NR\u0018\u00104\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010NR\u0018\u00105\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010NR\u0018\u00106\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010NR\u0018\u00107\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010HR\u0018\u00108\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010NR\u001a\u00109\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010{\u001a\u0004\by\u0010zR\u0018\u0010;\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010HR\u0018\u0010<\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010HR\u0018\u0010=\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010RR\u0016\u0010>\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u007fR\u0019\u0010@\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010HR\u001a\u0010A\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010C\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006Ä\u0001"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleFullDocumentDto;", "", "make", "", "model", "registrationNumber", "vin", "productionYear", "engineCapacity", "Ljava/math/BigDecimal;", "maxPower", "kind", "firstRegistrationDate", "Ljava/util/Date;", "technicalExaminationActivityDate", "technicalExaminationExpireDate", "insurances", "", "Lpl/gov/coi/mobywatel/technical/containers/data/model/InsuranceDto;", "otherDocuments", "Lpl/gov/coi/mobywatel/technical/containers/data/model/OtherDocumentDto;", "subKind", "vehicleCategory", "vehicleApprovalCategoryCertificate", "purpose", "type", "origin", "isIdNumberStamped", "nameplate", "vehicleProductionMethod", "kWperkg", "fuelType", "firstAlternativeFuelType", "secondAlternativeFuelType", "isCatalyst", "combinedFuelConsumption", "combinedFuelConsumptionWLTP", "co2Emission", "co2EmissionWLTP", "maxWeight", "maxAllowedWeight", "maxLoad", "standingPlaces", "seats", "allPlaces", "axisQuantity", "kerbWeight", "maxAllowedWeightOfCarSet", "maxWeigthOfTrailerWithBrake", "maxWeigthOfTrailerWithoutBrake", "wheelbase", "minTrackWidth", "maxTrackWidth", "avgTrackWidth", "maxAllowedAxisEmphasis", "isCarHook", "imageCode", "meterValue", "", "meterUnit", "dataImporter", "meterSavingDate", "isEuroNorm", "", "emissionLevelEuro", "distanceMeter", "Lpl/gov/coi/mobywatel/technical/containers/data/model/DistanceMeterDto;", "timeMeter", "Lpl/gov/coi/mobywatel/technical/containers/data/model/TimeMeterDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;ZLjava/lang/String;Lpl/gov/coi/mobywatel/technical/containers/data/model/DistanceMeterDto;Lpl/gov/coi/mobywatel/technical/containers/data/model/TimeMeterDto;)V", "getMake", "()Ljava/lang/String;", "getModel", "getRegistrationNumber", "getVin", "getProductionYear", "getEngineCapacity", "()Ljava/math/BigDecimal;", "getMaxPower", "getKind", "getFirstRegistrationDate", "()Ljava/util/Date;", "getTechnicalExaminationActivityDate", "getTechnicalExaminationExpireDate", "getInsurances", "()Ljava/util/List;", "getOtherDocuments", "getSubKind", "getVehicleCategory", "getVehicleApprovalCategoryCertificate", "getPurpose", "getType", "getOrigin", "getNameplate", "getVehicleProductionMethod", "getKWperkg", "getFuelType", "getFirstAlternativeFuelType", "getSecondAlternativeFuelType", "getCombinedFuelConsumption", "getCombinedFuelConsumptionWLTP", "getCo2Emission", "getCo2EmissionWLTP", "getMaxWeight", "getMaxAllowedWeight", "getMaxLoad", "getStandingPlaces", "getSeats", "getAllPlaces", "getAxisQuantity", "getKerbWeight", "getMaxAllowedWeightOfCarSet", "getMaxWeigthOfTrailerWithBrake", "getMaxWeigthOfTrailerWithoutBrake", "getWheelbase", "getMinTrackWidth", "getMaxTrackWidth", "getAvgTrackWidth", "getMaxAllowedAxisEmphasis", "getImageCode", "getMeterValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMeterUnit", "getDataImporter", "getMeterSavingDate", "()Z", "getEmissionLevelEuro", "getDistanceMeter", "()Lpl/gov/coi/mobywatel/technical/containers/data/model/DistanceMeterDto;", "getTimeMeter", "()Lpl/gov/coi/mobywatel/technical/containers/data/model/TimeMeterDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;ZLjava/lang/String;Lpl/gov/coi/mobywatel/technical/containers/data/model/DistanceMeterDto;Lpl/gov/coi/mobywatel/technical/containers/data/model/TimeMeterDto;)Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleFullDocumentDto;", "equals", "other", "hashCode", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleFullDocumentDto {

    @c("allPlaces")
    private final BigDecimal allPlaces;

    @c("avgTrackWidth")
    private final BigDecimal avgTrackWidth;

    @c("axisQuantity")
    private final BigDecimal axisQuantity;

    @c("co2Emission")
    private final BigDecimal co2Emission;

    @c("co2EmissionWLTP")
    private final String co2EmissionWLTP;

    @c("combinedFuelConsumption")
    private final BigDecimal combinedFuelConsumption;

    @c("combinedFuelConsumptionWLTP")
    private final BigDecimal combinedFuelConsumptionWLTP;

    @c("dataImporter")
    private final String dataImporter;

    @c("distanceMeter")
    private final DistanceMeterDto distanceMeter;

    @c("emissionLevelEuro")
    private final String emissionLevelEuro;

    @c("engineCapacity")
    private final BigDecimal engineCapacity;

    @c("firstAlternativeFuelType")
    private final String firstAlternativeFuelType;

    @c("firstRegistrationDate")
    private final Date firstRegistrationDate;

    @c("fuelType")
    private final String fuelType;

    @c("imageCode")
    private final BigDecimal imageCode;

    @c("insurances")
    private final List<InsuranceDto> insurances;

    @c("isCarHook")
    private final String isCarHook;

    @c("isCatalyst")
    private final String isCatalyst;

    @c("isEuroNorm")
    private final boolean isEuroNorm;

    @c("isIdNumberStamped")
    private final String isIdNumberStamped;

    @c("kWperkg")
    private final String kWperkg;

    @c("kerbWeight")
    private final BigDecimal kerbWeight;

    @c("kind")
    private final String kind;

    @c("make")
    private final String make;

    @c("maxAllowedAxisEmphasis")
    private final BigDecimal maxAllowedAxisEmphasis;

    @c("maxAllowedWeight")
    private final BigDecimal maxAllowedWeight;

    @c("maxAllowedWeightOfCarSet")
    private final BigDecimal maxAllowedWeightOfCarSet;

    @c("maxLoad")
    private final BigDecimal maxLoad;

    @c("maxPower")
    private final BigDecimal maxPower;

    @c("maxTrackWidth")
    private final BigDecimal maxTrackWidth;

    @c("maxWeight")
    private final BigDecimal maxWeight;

    @c("maxWeigthOfTrailerWithBrake")
    private final BigDecimal maxWeigthOfTrailerWithBrake;

    @c("maxWeigthOfTrailerWithoutBrake")
    private final BigDecimal maxWeigthOfTrailerWithoutBrake;

    @c("meterSavingDate")
    private final Date meterSavingDate;

    @c("meterUnit")
    private final String meterUnit;

    @c("meterValue")
    private final Integer meterValue;

    @c("minTrackWidth")
    private final BigDecimal minTrackWidth;

    @c("model")
    private final String model;

    @c("nameplate")
    private final String nameplate;

    @c("origin")
    private final String origin;

    @c("otherDocuments")
    private final List<OtherDocumentDto> otherDocuments;

    @c("productionYear")
    private final String productionYear;

    @c("purpose")
    private final String purpose;

    @c("registrationNumber")
    private final String registrationNumber;

    @c("seats")
    private final BigDecimal seats;

    @c("secondAlternativeFuelType")
    private final String secondAlternativeFuelType;

    @c("standingPlaces")
    private final BigDecimal standingPlaces;

    @c("subKind")
    private final String subKind;

    @c("technicalExaminationActivityDate")
    private final Date technicalExaminationActivityDate;

    @c("technicalExaminationExpireDate")
    private final Date technicalExaminationExpireDate;

    @c("timeMeter")
    private final TimeMeterDto timeMeter;

    @c("type")
    private final String type;

    @c("vehicleApprovalCategoryCertificate")
    private final String vehicleApprovalCategoryCertificate;

    @c("vehicleCategory")
    private final String vehicleCategory;

    @c("vehicleProductionMethod")
    private final String vehicleProductionMethod;

    @c("vin")
    private final String vin;

    @c("wheelbase")
    private final BigDecimal wheelbase;

    public VehicleFullDocumentDto(String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str6, Date date, Date date2, Date date3, List<InsuranceDto> list, List<OtherDocumentDto> list2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str21, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, BigDecimal bigDecimal18, BigDecimal bigDecimal19, BigDecimal bigDecimal20, BigDecimal bigDecimal21, String str22, BigDecimal bigDecimal22, Integer num, String str23, String str24, Date date4, boolean z15, String str25, DistanceMeterDto distanceMeterDto, TimeMeterDto timeMeterDto) {
        this.make = str;
        this.model = str2;
        this.registrationNumber = str3;
        this.vin = str4;
        this.productionYear = str5;
        this.engineCapacity = bigDecimal;
        this.maxPower = bigDecimal2;
        this.kind = str6;
        this.firstRegistrationDate = date;
        this.technicalExaminationActivityDate = date2;
        this.technicalExaminationExpireDate = date3;
        this.insurances = list;
        this.otherDocuments = list2;
        this.subKind = str7;
        this.vehicleCategory = str8;
        this.vehicleApprovalCategoryCertificate = str9;
        this.purpose = str10;
        this.type = str11;
        this.origin = str12;
        this.isIdNumberStamped = str13;
        this.nameplate = str14;
        this.vehicleProductionMethod = str15;
        this.kWperkg = str16;
        this.fuelType = str17;
        this.firstAlternativeFuelType = str18;
        this.secondAlternativeFuelType = str19;
        this.isCatalyst = str20;
        this.combinedFuelConsumption = bigDecimal3;
        this.combinedFuelConsumptionWLTP = bigDecimal4;
        this.co2Emission = bigDecimal5;
        this.co2EmissionWLTP = str21;
        this.maxWeight = bigDecimal6;
        this.maxAllowedWeight = bigDecimal7;
        this.maxLoad = bigDecimal8;
        this.standingPlaces = bigDecimal9;
        this.seats = bigDecimal10;
        this.allPlaces = bigDecimal11;
        this.axisQuantity = bigDecimal12;
        this.kerbWeight = bigDecimal13;
        this.maxAllowedWeightOfCarSet = bigDecimal14;
        this.maxWeigthOfTrailerWithBrake = bigDecimal15;
        this.maxWeigthOfTrailerWithoutBrake = bigDecimal16;
        this.wheelbase = bigDecimal17;
        this.minTrackWidth = bigDecimal18;
        this.maxTrackWidth = bigDecimal19;
        this.avgTrackWidth = bigDecimal20;
        this.maxAllowedAxisEmphasis = bigDecimal21;
        this.isCarHook = str22;
        this.imageCode = bigDecimal22;
        this.meterValue = num;
        this.meterUnit = str23;
        this.dataImporter = str24;
        this.meterSavingDate = date4;
        this.isEuroNorm = z15;
        this.emissionLevelEuro = str25;
        this.distanceMeter = distanceMeterDto;
        this.timeMeter = timeMeterDto;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMake() {
        return this.make;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getTechnicalExaminationActivityDate() {
        return this.technicalExaminationActivityDate;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Date getTechnicalExaminationExpireDate() {
        return this.technicalExaminationExpireDate;
    }

    public final List<InsuranceDto> component12() {
        return this.insurances;
    }

    public final List<OtherDocumentDto> component13() {
        return this.otherDocuments;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSubKind() {
        return this.subKind;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getVehicleCategory() {
        return this.vehicleCategory;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getVehicleApprovalCategoryCertificate() {
        return this.vehicleApprovalCategoryCertificate;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPurpose() {
        return this.purpose;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getIsIdNumberStamped() {
        return this.isIdNumberStamped;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getNameplate() {
        return this.nameplate;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getVehicleProductionMethod() {
        return this.vehicleProductionMethod;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getKWperkg() {
        return this.kWperkg;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getFuelType() {
        return this.fuelType;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getFirstAlternativeFuelType() {
        return this.firstAlternativeFuelType;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getSecondAlternativeFuelType() {
        return this.secondAlternativeFuelType;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getIsCatalyst() {
        return this.isCatalyst;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final BigDecimal getCombinedFuelConsumption() {
        return this.combinedFuelConsumption;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final BigDecimal getCombinedFuelConsumptionWLTP() {
        return this.combinedFuelConsumptionWLTP;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final BigDecimal getCo2Emission() {
        return this.co2Emission;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getCo2EmissionWLTP() {
        return this.co2EmissionWLTP;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final BigDecimal getMaxWeight() {
        return this.maxWeight;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final BigDecimal getMaxAllowedWeight() {
        return this.maxAllowedWeight;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final BigDecimal getMaxLoad() {
        return this.maxLoad;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final BigDecimal getStandingPlaces() {
        return this.standingPlaces;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final BigDecimal getSeats() {
        return this.seats;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final BigDecimal getAllPlaces() {
        return this.allPlaces;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final BigDecimal getAxisQuantity() {
        return this.axisQuantity;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final BigDecimal getKerbWeight() {
        return this.kerbWeight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final BigDecimal getMaxAllowedWeightOfCarSet() {
        return this.maxAllowedWeightOfCarSet;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final BigDecimal getMaxWeigthOfTrailerWithBrake() {
        return this.maxWeigthOfTrailerWithBrake;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final BigDecimal getMaxWeigthOfTrailerWithoutBrake() {
        return this.maxWeigthOfTrailerWithoutBrake;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final BigDecimal getWheelbase() {
        return this.wheelbase;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final BigDecimal getMinTrackWidth() {
        return this.minTrackWidth;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final BigDecimal getMaxTrackWidth() {
        return this.maxTrackWidth;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final BigDecimal getAvgTrackWidth() {
        return this.avgTrackWidth;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final BigDecimal getMaxAllowedAxisEmphasis() {
        return this.maxAllowedAxisEmphasis;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getIsCarHook() {
        return this.isCarHook;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final BigDecimal getImageCode() {
        return this.imageCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProductionYear() {
        return this.productionYear;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final Integer getMeterValue() {
        return this.meterValue;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getMeterUnit() {
        return this.meterUnit;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getDataImporter() {
        return this.dataImporter;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final Date getMeterSavingDate() {
        return this.meterSavingDate;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final boolean getIsEuroNorm() {
        return this.isEuroNorm;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final String getEmissionLevelEuro() {
        return this.emissionLevelEuro;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final DistanceMeterDto getDistanceMeter() {
        return this.distanceMeter;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final TimeMeterDto getTimeMeter() {
        return this.timeMeter;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getEngineCapacity() {
        return this.engineCapacity;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getMaxPower() {
        return this.maxPower;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getFirstRegistrationDate() {
        return this.firstRegistrationDate;
    }

    public final VehicleFullDocumentDto copy(String make, String model, String registrationNumber, String vin, String productionYear, BigDecimal engineCapacity, BigDecimal maxPower, String kind, Date firstRegistrationDate, Date technicalExaminationActivityDate, Date technicalExaminationExpireDate, List<InsuranceDto> insurances, List<OtherDocumentDto> otherDocuments, String subKind, String vehicleCategory, String vehicleApprovalCategoryCertificate, String purpose, String type, String origin, String isIdNumberStamped, String nameplate, String vehicleProductionMethod, String kWperkg, String fuelType, String firstAlternativeFuelType, String secondAlternativeFuelType, String isCatalyst, BigDecimal combinedFuelConsumption, BigDecimal combinedFuelConsumptionWLTP, BigDecimal co2Emission, String co2EmissionWLTP, BigDecimal maxWeight, BigDecimal maxAllowedWeight, BigDecimal maxLoad, BigDecimal standingPlaces, BigDecimal seats, BigDecimal allPlaces, BigDecimal axisQuantity, BigDecimal kerbWeight, BigDecimal maxAllowedWeightOfCarSet, BigDecimal maxWeigthOfTrailerWithBrake, BigDecimal maxWeigthOfTrailerWithoutBrake, BigDecimal wheelbase, BigDecimal minTrackWidth, BigDecimal maxTrackWidth, BigDecimal avgTrackWidth, BigDecimal maxAllowedAxisEmphasis, String isCarHook, BigDecimal imageCode, Integer meterValue, String meterUnit, String dataImporter, Date meterSavingDate, boolean isEuroNorm, String emissionLevelEuro, DistanceMeterDto distanceMeter, TimeMeterDto timeMeter) {
        return new VehicleFullDocumentDto(make, model, registrationNumber, vin, productionYear, engineCapacity, maxPower, kind, firstRegistrationDate, technicalExaminationActivityDate, technicalExaminationExpireDate, insurances, otherDocuments, subKind, vehicleCategory, vehicleApprovalCategoryCertificate, purpose, type, origin, isIdNumberStamped, nameplate, vehicleProductionMethod, kWperkg, fuelType, firstAlternativeFuelType, secondAlternativeFuelType, isCatalyst, combinedFuelConsumption, combinedFuelConsumptionWLTP, co2Emission, co2EmissionWLTP, maxWeight, maxAllowedWeight, maxLoad, standingPlaces, seats, allPlaces, axisQuantity, kerbWeight, maxAllowedWeightOfCarSet, maxWeigthOfTrailerWithBrake, maxWeigthOfTrailerWithoutBrake, wheelbase, minTrackWidth, maxTrackWidth, avgTrackWidth, maxAllowedAxisEmphasis, isCarHook, imageCode, meterValue, meterUnit, dataImporter, meterSavingDate, isEuroNorm, emissionLevelEuro, distanceMeter, timeMeter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleFullDocumentDto)) {
            return false;
        }
        VehicleFullDocumentDto vehicleFullDocumentDto = (VehicleFullDocumentDto) other;
        return t.c(this.make, vehicleFullDocumentDto.make) && t.c(this.model, vehicleFullDocumentDto.model) && t.c(this.registrationNumber, vehicleFullDocumentDto.registrationNumber) && t.c(this.vin, vehicleFullDocumentDto.vin) && t.c(this.productionYear, vehicleFullDocumentDto.productionYear) && t.c(this.engineCapacity, vehicleFullDocumentDto.engineCapacity) && t.c(this.maxPower, vehicleFullDocumentDto.maxPower) && t.c(this.kind, vehicleFullDocumentDto.kind) && t.c(this.firstRegistrationDate, vehicleFullDocumentDto.firstRegistrationDate) && t.c(this.technicalExaminationActivityDate, vehicleFullDocumentDto.technicalExaminationActivityDate) && t.c(this.technicalExaminationExpireDate, vehicleFullDocumentDto.technicalExaminationExpireDate) && t.c(this.insurances, vehicleFullDocumentDto.insurances) && t.c(this.otherDocuments, vehicleFullDocumentDto.otherDocuments) && t.c(this.subKind, vehicleFullDocumentDto.subKind) && t.c(this.vehicleCategory, vehicleFullDocumentDto.vehicleCategory) && t.c(this.vehicleApprovalCategoryCertificate, vehicleFullDocumentDto.vehicleApprovalCategoryCertificate) && t.c(this.purpose, vehicleFullDocumentDto.purpose) && t.c(this.type, vehicleFullDocumentDto.type) && t.c(this.origin, vehicleFullDocumentDto.origin) && t.c(this.isIdNumberStamped, vehicleFullDocumentDto.isIdNumberStamped) && t.c(this.nameplate, vehicleFullDocumentDto.nameplate) && t.c(this.vehicleProductionMethod, vehicleFullDocumentDto.vehicleProductionMethod) && t.c(this.kWperkg, vehicleFullDocumentDto.kWperkg) && t.c(this.fuelType, vehicleFullDocumentDto.fuelType) && t.c(this.firstAlternativeFuelType, vehicleFullDocumentDto.firstAlternativeFuelType) && t.c(this.secondAlternativeFuelType, vehicleFullDocumentDto.secondAlternativeFuelType) && t.c(this.isCatalyst, vehicleFullDocumentDto.isCatalyst) && t.c(this.combinedFuelConsumption, vehicleFullDocumentDto.combinedFuelConsumption) && t.c(this.combinedFuelConsumptionWLTP, vehicleFullDocumentDto.combinedFuelConsumptionWLTP) && t.c(this.co2Emission, vehicleFullDocumentDto.co2Emission) && t.c(this.co2EmissionWLTP, vehicleFullDocumentDto.co2EmissionWLTP) && t.c(this.maxWeight, vehicleFullDocumentDto.maxWeight) && t.c(this.maxAllowedWeight, vehicleFullDocumentDto.maxAllowedWeight) && t.c(this.maxLoad, vehicleFullDocumentDto.maxLoad) && t.c(this.standingPlaces, vehicleFullDocumentDto.standingPlaces) && t.c(this.seats, vehicleFullDocumentDto.seats) && t.c(this.allPlaces, vehicleFullDocumentDto.allPlaces) && t.c(this.axisQuantity, vehicleFullDocumentDto.axisQuantity) && t.c(this.kerbWeight, vehicleFullDocumentDto.kerbWeight) && t.c(this.maxAllowedWeightOfCarSet, vehicleFullDocumentDto.maxAllowedWeightOfCarSet) && t.c(this.maxWeigthOfTrailerWithBrake, vehicleFullDocumentDto.maxWeigthOfTrailerWithBrake) && t.c(this.maxWeigthOfTrailerWithoutBrake, vehicleFullDocumentDto.maxWeigthOfTrailerWithoutBrake) && t.c(this.wheelbase, vehicleFullDocumentDto.wheelbase) && t.c(this.minTrackWidth, vehicleFullDocumentDto.minTrackWidth) && t.c(this.maxTrackWidth, vehicleFullDocumentDto.maxTrackWidth) && t.c(this.avgTrackWidth, vehicleFullDocumentDto.avgTrackWidth) && t.c(this.maxAllowedAxisEmphasis, vehicleFullDocumentDto.maxAllowedAxisEmphasis) && t.c(this.isCarHook, vehicleFullDocumentDto.isCarHook) && t.c(this.imageCode, vehicleFullDocumentDto.imageCode) && t.c(this.meterValue, vehicleFullDocumentDto.meterValue) && t.c(this.meterUnit, vehicleFullDocumentDto.meterUnit) && t.c(this.dataImporter, vehicleFullDocumentDto.dataImporter) && t.c(this.meterSavingDate, vehicleFullDocumentDto.meterSavingDate) && this.isEuroNorm == vehicleFullDocumentDto.isEuroNorm && t.c(this.emissionLevelEuro, vehicleFullDocumentDto.emissionLevelEuro) && t.c(this.distanceMeter, vehicleFullDocumentDto.distanceMeter) && t.c(this.timeMeter, vehicleFullDocumentDto.timeMeter);
    }

    public final BigDecimal getAllPlaces() {
        return this.allPlaces;
    }

    public final BigDecimal getAvgTrackWidth() {
        return this.avgTrackWidth;
    }

    public final BigDecimal getAxisQuantity() {
        return this.axisQuantity;
    }

    public final BigDecimal getCo2Emission() {
        return this.co2Emission;
    }

    public final String getCo2EmissionWLTP() {
        return this.co2EmissionWLTP;
    }

    public final BigDecimal getCombinedFuelConsumption() {
        return this.combinedFuelConsumption;
    }

    public final BigDecimal getCombinedFuelConsumptionWLTP() {
        return this.combinedFuelConsumptionWLTP;
    }

    public final String getDataImporter() {
        return this.dataImporter;
    }

    public final DistanceMeterDto getDistanceMeter() {
        return this.distanceMeter;
    }

    public final String getEmissionLevelEuro() {
        return this.emissionLevelEuro;
    }

    public final BigDecimal getEngineCapacity() {
        return this.engineCapacity;
    }

    public final String getFirstAlternativeFuelType() {
        return this.firstAlternativeFuelType;
    }

    public final Date getFirstRegistrationDate() {
        return this.firstRegistrationDate;
    }

    public final String getFuelType() {
        return this.fuelType;
    }

    public final BigDecimal getImageCode() {
        return this.imageCode;
    }

    public final List<InsuranceDto> getInsurances() {
        return this.insurances;
    }

    public final String getKWperkg() {
        return this.kWperkg;
    }

    public final BigDecimal getKerbWeight() {
        return this.kerbWeight;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getMake() {
        return this.make;
    }

    public final BigDecimal getMaxAllowedAxisEmphasis() {
        return this.maxAllowedAxisEmphasis;
    }

    public final BigDecimal getMaxAllowedWeight() {
        return this.maxAllowedWeight;
    }

    public final BigDecimal getMaxAllowedWeightOfCarSet() {
        return this.maxAllowedWeightOfCarSet;
    }

    public final BigDecimal getMaxLoad() {
        return this.maxLoad;
    }

    public final BigDecimal getMaxPower() {
        return this.maxPower;
    }

    public final BigDecimal getMaxTrackWidth() {
        return this.maxTrackWidth;
    }

    public final BigDecimal getMaxWeight() {
        return this.maxWeight;
    }

    public final BigDecimal getMaxWeigthOfTrailerWithBrake() {
        return this.maxWeigthOfTrailerWithBrake;
    }

    public final BigDecimal getMaxWeigthOfTrailerWithoutBrake() {
        return this.maxWeigthOfTrailerWithoutBrake;
    }

    public final Date getMeterSavingDate() {
        return this.meterSavingDate;
    }

    public final String getMeterUnit() {
        return this.meterUnit;
    }

    public final Integer getMeterValue() {
        return this.meterValue;
    }

    public final BigDecimal getMinTrackWidth() {
        return this.minTrackWidth;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getNameplate() {
        return this.nameplate;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final List<OtherDocumentDto> getOtherDocuments() {
        return this.otherDocuments;
    }

    public final String getProductionYear() {
        return this.productionYear;
    }

    public final String getPurpose() {
        return this.purpose;
    }

    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public final BigDecimal getSeats() {
        return this.seats;
    }

    public final String getSecondAlternativeFuelType() {
        return this.secondAlternativeFuelType;
    }

    public final BigDecimal getStandingPlaces() {
        return this.standingPlaces;
    }

    public final String getSubKind() {
        return this.subKind;
    }

    public final Date getTechnicalExaminationActivityDate() {
        return this.technicalExaminationActivityDate;
    }

    public final Date getTechnicalExaminationExpireDate() {
        return this.technicalExaminationExpireDate;
    }

    public final TimeMeterDto getTimeMeter() {
        return this.timeMeter;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVehicleApprovalCategoryCertificate() {
        return this.vehicleApprovalCategoryCertificate;
    }

    public final String getVehicleCategory() {
        return this.vehicleCategory;
    }

    public final String getVehicleProductionMethod() {
        return this.vehicleProductionMethod;
    }

    public final String getVin() {
        return this.vin;
    }

    public final BigDecimal getWheelbase() {
        return this.wheelbase;
    }

    public int hashCode() {
        String str = this.make;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.model;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.registrationNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.vin;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productionYear;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.engineCapacity;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.maxPower;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str6 = this.kind;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Date date = this.firstRegistrationDate;
        int iHashCode9 = (iHashCode8 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.technicalExaminationActivityDate;
        int iHashCode10 = (iHashCode9 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.technicalExaminationExpireDate;
        int iHashCode11 = (iHashCode10 + (date3 == null ? 0 : date3.hashCode())) * 31;
        List<InsuranceDto> list = this.insurances;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List<OtherDocumentDto> list2 = this.otherDocuments;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.subKind;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.vehicleCategory;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.vehicleApprovalCategoryCertificate;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.purpose;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.type;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.origin;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.isIdNumberStamped;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.nameplate;
        int iHashCode21 = (iHashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.vehicleProductionMethod;
        int iHashCode22 = (iHashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.kWperkg;
        int iHashCode23 = (iHashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.fuelType;
        int iHashCode24 = (iHashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.firstAlternativeFuelType;
        int iHashCode25 = (iHashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.secondAlternativeFuelType;
        int iHashCode26 = (iHashCode25 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.isCatalyst;
        int iHashCode27 = (iHashCode26 + (str20 == null ? 0 : str20.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.combinedFuelConsumption;
        int iHashCode28 = (iHashCode27 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.combinedFuelConsumptionWLTP;
        int iHashCode29 = (iHashCode28 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.co2Emission;
        int iHashCode30 = (iHashCode29 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str21 = this.co2EmissionWLTP;
        int iHashCode31 = (iHashCode30 + (str21 == null ? 0 : str21.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.maxWeight;
        int iHashCode32 = (iHashCode31 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.maxAllowedWeight;
        int iHashCode33 = (iHashCode32 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.maxLoad;
        int iHashCode34 = (iHashCode33 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.standingPlaces;
        int iHashCode35 = (iHashCode34 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.seats;
        int iHashCode36 = (iHashCode35 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.allPlaces;
        int iHashCode37 = (iHashCode36 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.axisQuantity;
        int iHashCode38 = (iHashCode37 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.kerbWeight;
        int iHashCode39 = (iHashCode38 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.maxAllowedWeightOfCarSet;
        int iHashCode40 = (iHashCode39 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.maxWeigthOfTrailerWithBrake;
        int iHashCode41 = (iHashCode40 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.maxWeigthOfTrailerWithoutBrake;
        int iHashCode42 = (iHashCode41 + (bigDecimal16 == null ? 0 : bigDecimal16.hashCode())) * 31;
        BigDecimal bigDecimal17 = this.wheelbase;
        int iHashCode43 = (iHashCode42 + (bigDecimal17 == null ? 0 : bigDecimal17.hashCode())) * 31;
        BigDecimal bigDecimal18 = this.minTrackWidth;
        int iHashCode44 = (iHashCode43 + (bigDecimal18 == null ? 0 : bigDecimal18.hashCode())) * 31;
        BigDecimal bigDecimal19 = this.maxTrackWidth;
        int iHashCode45 = (iHashCode44 + (bigDecimal19 == null ? 0 : bigDecimal19.hashCode())) * 31;
        BigDecimal bigDecimal20 = this.avgTrackWidth;
        int iHashCode46 = (iHashCode45 + (bigDecimal20 == null ? 0 : bigDecimal20.hashCode())) * 31;
        BigDecimal bigDecimal21 = this.maxAllowedAxisEmphasis;
        int iHashCode47 = (iHashCode46 + (bigDecimal21 == null ? 0 : bigDecimal21.hashCode())) * 31;
        String str22 = this.isCarHook;
        int iHashCode48 = (iHashCode47 + (str22 == null ? 0 : str22.hashCode())) * 31;
        BigDecimal bigDecimal22 = this.imageCode;
        int iHashCode49 = (iHashCode48 + (bigDecimal22 == null ? 0 : bigDecimal22.hashCode())) * 31;
        Integer num = this.meterValue;
        int iHashCode50 = (iHashCode49 + (num == null ? 0 : num.hashCode())) * 31;
        String str23 = this.meterUnit;
        int iHashCode51 = (iHashCode50 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.dataImporter;
        int iHashCode52 = (iHashCode51 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Date date4 = this.meterSavingDate;
        int iHashCode53 = (((iHashCode52 + (date4 == null ? 0 : date4.hashCode())) * 31) + Boolean.hashCode(this.isEuroNorm)) * 31;
        String str25 = this.emissionLevelEuro;
        int iHashCode54 = (iHashCode53 + (str25 == null ? 0 : str25.hashCode())) * 31;
        DistanceMeterDto distanceMeterDto = this.distanceMeter;
        int iHashCode55 = (iHashCode54 + (distanceMeterDto == null ? 0 : distanceMeterDto.hashCode())) * 31;
        TimeMeterDto timeMeterDto = this.timeMeter;
        return iHashCode55 + (timeMeterDto != null ? timeMeterDto.hashCode() : 0);
    }

    public final String isCarHook() {
        return this.isCarHook;
    }

    public final String isCatalyst() {
        return this.isCatalyst;
    }

    public final boolean isEuroNorm() {
        return this.isEuroNorm;
    }

    public final String isIdNumberStamped() {
        return this.isIdNumberStamped;
    }

    public String toString() {
        return "VehicleFullDocumentDto(make=" + this.make + ", model=" + this.model + ", registrationNumber=" + this.registrationNumber + ", vin=" + this.vin + ", productionYear=" + this.productionYear + ", engineCapacity=" + this.engineCapacity + ", maxPower=" + this.maxPower + ", kind=" + this.kind + ", firstRegistrationDate=" + this.firstRegistrationDate + ", technicalExaminationActivityDate=" + this.technicalExaminationActivityDate + ", technicalExaminationExpireDate=" + this.technicalExaminationExpireDate + ", insurances=" + this.insurances + ", otherDocuments=" + this.otherDocuments + ", subKind=" + this.subKind + ", vehicleCategory=" + this.vehicleCategory + ", vehicleApprovalCategoryCertificate=" + this.vehicleApprovalCategoryCertificate + ", purpose=" + this.purpose + ", type=" + this.type + ", origin=" + this.origin + ", isIdNumberStamped=" + this.isIdNumberStamped + ", nameplate=" + this.nameplate + ", vehicleProductionMethod=" + this.vehicleProductionMethod + ", kWperkg=" + this.kWperkg + ", fuelType=" + this.fuelType + ", firstAlternativeFuelType=" + this.firstAlternativeFuelType + ", secondAlternativeFuelType=" + this.secondAlternativeFuelType + ", isCatalyst=" + this.isCatalyst + ", combinedFuelConsumption=" + this.combinedFuelConsumption + ", combinedFuelConsumptionWLTP=" + this.combinedFuelConsumptionWLTP + ", co2Emission=" + this.co2Emission + ", co2EmissionWLTP=" + this.co2EmissionWLTP + ", maxWeight=" + this.maxWeight + ", maxAllowedWeight=" + this.maxAllowedWeight + ", maxLoad=" + this.maxLoad + ", standingPlaces=" + this.standingPlaces + ", seats=" + this.seats + ", allPlaces=" + this.allPlaces + ", axisQuantity=" + this.axisQuantity + ", kerbWeight=" + this.kerbWeight + ", maxAllowedWeightOfCarSet=" + this.maxAllowedWeightOfCarSet + ", maxWeigthOfTrailerWithBrake=" + this.maxWeigthOfTrailerWithBrake + ", maxWeigthOfTrailerWithoutBrake=" + this.maxWeigthOfTrailerWithoutBrake + ", wheelbase=" + this.wheelbase + ", minTrackWidth=" + this.minTrackWidth + ", maxTrackWidth=" + this.maxTrackWidth + ", avgTrackWidth=" + this.avgTrackWidth + ", maxAllowedAxisEmphasis=" + this.maxAllowedAxisEmphasis + ", isCarHook=" + this.isCarHook + ", imageCode=" + this.imageCode + ", meterValue=" + this.meterValue + ", meterUnit=" + this.meterUnit + ", dataImporter=" + this.dataImporter + ", meterSavingDate=" + this.meterSavingDate + ", isEuroNorm=" + this.isEuroNorm + ", emissionLevelEuro=" + this.emissionLevelEuro + ", distanceMeter=" + this.distanceMeter + ", timeMeter=" + this.timeMeter + ')';
    }

    public /* synthetic */ VehicleFullDocumentDto(String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str6, Date date, Date date2, Date date3, List list, List list2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str21, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, BigDecimal bigDecimal18, BigDecimal bigDecimal19, BigDecimal bigDecimal20, BigDecimal bigDecimal21, String str22, BigDecimal bigDecimal22, Integer num, String str23, String str24, Date date4, boolean z15, String str25, DistanceMeterDto distanceMeterDto, TimeMeterDto timeMeterDto, int i15, int i16, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : str5, (i15 & 32) != 0 ? null : bigDecimal, (i15 & 64) != 0 ? null : bigDecimal2, (i15 & 128) != 0 ? null : str6, (i15 & 256) != 0 ? null : date, (i15 & 512) != 0 ? null : date2, (i15 & 1024) != 0 ? null : date3, (i15 & 2048) != 0 ? null : list, (i15 & PKIFailureInfo.certConfirmed) != 0 ? null : list2, (i15 & PKIFailureInfo.certRevoked) != 0 ? null : str7, (i15 & 16384) != 0 ? null : str8, (i15 & 32768) != 0 ? null : str9, (i15 & PKIFailureInfo.notAuthorized) != 0 ? null : str10, (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? null : str11, (i15 & PKIFailureInfo.transactionIdInUse) != 0 ? null : str12, (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? null : str13, (i15 & PKIFailureInfo.badCertTemplate) != 0 ? null : str14, (i15 & PKIFailureInfo.badSenderNonce) != 0 ? null : str15, (i15 & 4194304) != 0 ? null : str16, (i15 & 8388608) != 0 ? null : str17, (i15 & 16777216) != 0 ? null : str18, (i15 & 33554432) != 0 ? null : str19, (i15 & 67108864) != 0 ? null : str20, (i15 & 134217728) != 0 ? null : bigDecimal3, (i15 & 268435456) != 0 ? null : bigDecimal4, (i15 & PKIFailureInfo.duplicateCertReq) != 0 ? null : bigDecimal5, (i15 & 1073741824) != 0 ? null : str21, (i15 & PKIFailureInfo.systemUnavail) != 0 ? null : bigDecimal6, (i16 & 1) != 0 ? null : bigDecimal7, (i16 & 2) != 0 ? null : bigDecimal8, (i16 & 4) != 0 ? null : bigDecimal9, (i16 & 8) != 0 ? null : bigDecimal10, (i16 & 16) != 0 ? null : bigDecimal11, (i16 & 32) != 0 ? null : bigDecimal12, (i16 & 64) != 0 ? null : bigDecimal13, (i16 & 128) != 0 ? null : bigDecimal14, (i16 & 256) != 0 ? null : bigDecimal15, (i16 & 512) != 0 ? null : bigDecimal16, (i16 & 1024) != 0 ? null : bigDecimal17, (i16 & 2048) != 0 ? null : bigDecimal18, (i16 & PKIFailureInfo.certConfirmed) != 0 ? null : bigDecimal19, (i16 & PKIFailureInfo.certRevoked) != 0 ? null : bigDecimal20, (i16 & 16384) != 0 ? null : bigDecimal21, (i16 & 32768) != 0 ? null : str22, (i16 & PKIFailureInfo.notAuthorized) != 0 ? null : bigDecimal22, (i16 & PKIFailureInfo.unsupportedVersion) != 0 ? null : num, (i16 & PKIFailureInfo.transactionIdInUse) != 0 ? null : str23, (i16 & PKIFailureInfo.signerNotTrusted) != 0 ? null : str24, (i16 & PKIFailureInfo.badCertTemplate) != 0 ? null : date4, z15, (4194304 & i16) != 0 ? null : str25, (8388608 & i16) != 0 ? null : distanceMeterDto, (16777216 & i16) != 0 ? null : timeMeterDto);
    }
}
