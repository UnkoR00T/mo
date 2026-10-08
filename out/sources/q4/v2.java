package q4;

import androidx.compose.ui.graphics.Color;
import b5.LineHeightStyle;
import b5.TextGeometricTransform;
import b5.TextIndent;
import java.util.ArrayList;
import java.util.List;
import n3.Shadow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import u4.FontWeight;
import x4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ø\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\t\u001a\u00020\u0003\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0004*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0004*\u00020\u00032\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\".\u0010\u001d\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u001b0\u001a\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016\".\u0010!\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u001b\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u0012\u0004\b\u001f\u0010 \" \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0016\"&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b&\u0010\u0016\u0012\u0004\b'\u0010 \" \u0010+\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0016\" \u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0016\"&\u00102\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010\u0016\u001a\u0004\b1\u0010\u0018\"&\u00106\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010\u0016\u001a\u0004\b5\u0010\u0018\"&\u0010:\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010\u0016\u001a\u0004\b9\u0010\u0018\" \u0010=\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0016\" \u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0016\" \u0010C\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0016\" \u0010F\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0016\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0016\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0016\" \u0010O\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0016\" \u0010S\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R\" \u0010V\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010R\" \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010R\" \u0010\\\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010R\"&\u0010`\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010\u0016\u001a\u0004\b_\u0010\u0018\"&\u0010d\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010\u0016\u001a\u0004\bc\u0010\u0018\" \u0010g\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010R\"&\u0010l\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u00030\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010R\u001a\u0004\bj\u0010k\" \u0010o\u001a\u000e\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010R\" \u0010r\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0016\" \u0010u\u001a\u000e\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0016\" \u0010x\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0016\" \u0010{\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010R\" \u0010~\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010R\"\"\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u007f\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010R\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u0082\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u0086\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u0089\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u008c\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u008f\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u0092\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u0095\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u0098\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u009b\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u009e\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u00030\u0000*\u00030¡\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00030\u0000*\u00030¤\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00030\u0000*\u00030§\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020\u00030\u0000*\u00030ª\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u00ad\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020\u00030\u0000*\u00030°\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020\u00030\u0000*\u00030³\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u00030\u0000*\u00030¶\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\u00030\u0000*\u00030¹\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00030\u0000*\u00030¼\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020\u00030\u0000*\u00030¿\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u007f\u0012\u0004\u0012\u00020\u00030\u0000*\u00030Â\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001¨\u0006Å\u0001"}, d2 = {"Lb3/x;", "T", "Original", "", "Saveable", "value", "saver", "Lb3/b0;", "scope", "T1", "(Ljava/lang/Object;Lb3/x;Lb3/b0;)Ljava/lang/Object;", "Lkotlin/Function2;", "save", "Lkotlin/Function1;", "restore", "Lq4/x;", "Q0", "(Ler/p;Ler/l;)Lq4/x;", "S1", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lq4/e;", "a", "Lb3/x;", "v1", "()Lb3/x;", "AnnotatedStringSaver", "", "Lq4/e$d;", "b", "AnnotationRangeListSaver", "c", "getAnnotationRangeSaver$annotations", "()V", "AnnotationRangeSaver", "Lq4/f4;", "d", "VerbatimTtsAnnotationSaver", "Lq4/e4;", "e", "getUrlAnnotationSaver$annotations", "UrlAnnotationSaver", "Lq4/m$b;", "f", "LinkSaver", "Lq4/m$a;", "g", "ClickableSaver", "Lq4/e0;", "h", "getParagraphStyleSaver", "ParagraphStyleSaver", "Lq4/h3;", "i", "getSpanStyleSaver", "SpanStyleSaver", "Lq4/u3;", "j", "getTextLinkStylesSaver", "TextLinkStylesSaver", "Lb5/k;", "k", "TextDecorationSaver", "Lb5/q;", "l", "TextGeometricTransformSaver", "Lb5/s;", "m", "TextIndentSaver", "Lu4/d0;", "n", "FontWeightSaver", "Lb5/a;", "o", "BaselineShiftSaver", "Lq4/z3;", "p", "TextRangeSaver", "Ln3/w2;", "q", "ShadowSaver", "Landroidx/compose/ui/graphics/Color;", "r", "Lq4/x;", "ColorSaver", "Lb5/j;", "s", "TextAlignSaver", "Lb5/l;", "t", "TextDirectionSaver", "Lb5/e;", "u", "HyphensSaver", "Lu4/y;", "v", "getFontStyleSaver", "FontStyleSaver", "Lu4/z;", "w", "getFontSynthesisSaver", "FontSynthesisSaver", "Lc5/v;", "x", "TextUnitSaver", "Lc5/x;", "y", "getTextUnitTypeSaver", "()Lq4/x;", "TextUnitTypeSaver", "Lm3/e;", "z", "OffsetSaver", "Lx4/d;", "A", "LocaleListSaver", "Lx4/c;", "B", "LocaleSaver", "Lb5/h;", "C", "LineHeightStyleSaver", "Lb5/h$a;", ip.a.f96138c, "LineHeightStyleAlignmentSaver", "Lb5/h$d;", "E", "LineHeightStyleTrimSaver", "Lb5/h$c;", "F", "LineHeightStyleModeSaver", "Lb5/k$a;", "E1", "(Lb5/k$a;)Lb3/x;", "Saver", "Lb5/q$a;", "G1", "(Lb5/q$a;)Lb3/x;", "Lb5/s$a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37088o, "(Lb5/s$a;)Lb3/x;", "Lu4/d0$a;", "P1", "(Lu4/d0$a;)Lb3/x;", "Lb5/a$a;", "x1", "(Lb5/a$a;)Lb3/x;", "Lq4/z3$a;", "M1", "(Lq4/z3$a;)Lb3/x;", "Ln3/w2$a;", "L1", "(Ln3/w2$a;)Lb3/x;", "Landroidx/compose/ui/graphics/Color$a;", "w1", "(Landroidx/compose/ui/graphics/Color$a;)Lb3/x;", "Lb5/j$a;", "D1", "(Lb5/j$a;)Lb3/x;", "Lb5/l$a;", "F1", "(Lb5/l$a;)Lb3/x;", "Lb5/e$a;", "y1", "(Lb5/e$a;)Lb3/x;", "Lu4/y$a;", "N1", "(Lu4/y$a;)Lb3/x;", "Lu4/z$a;", "O1", "(Lu4/z$a;)Lb3/x;", "Lc5/v$a;", "I1", "(Lc5/v$a;)Lb3/x;", "Lc5/x$a;", "J1", "(Lc5/x$a;)Lb3/x;", "Lm3/e$a;", "K1", "(Lm3/e$a;)Lb3/x;", "Lx4/d$a;", "R1", "(Lx4/d$a;)Lb3/x;", "Lx4/c$a;", "Q1", "(Lx4/c$a;)Lb3/x;", "Lb5/h$b;", "A1", "(Lb5/h$b;)Lb3/x;", "Lb5/h$a$a;", "z1", "(Lb5/h$a$a;)Lb3/x;", "Lb5/h$d$a;", "C1", "(Lb5/h$d$a;)Lb3/x;", "Lb5/h$c$a;", "B1", "(Lb5/h$c$a;)Lb3/x;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b3.x<e, Object> f164610a = b3.a0.e(new er.p() { // from class: q4.l0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.k0((b3.b0) obj, (e) obj2);
        }
    }, new er.l() { // from class: q4.n0
        @Override // er.l
        public final Object b(Object obj) {
            return v2.l0(obj);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b3.x<List<e.Range<? extends Object>>, Object> f164611b = b3.a0.e(new er.p() { // from class: q4.z0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.m0((b3.b0) obj, (List) obj2);
        }
    }, new er.l() { // from class: q4.l1
        @Override // er.l
        public final Object b(Object obj) {
            return v2.n0(obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b3.x<e.Range<? extends Object>, Object> f164612c = b3.a0.e(new er.p() { // from class: q4.x1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.o0((b3.b0) obj, (e.Range) obj2);
        }
    }, new er.l() { // from class: q4.j2
        @Override // er.l
        public final Object b(Object obj) {
            return v2.p0(obj);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b3.x<VerbatimTtsAnnotation, Object> f164613d = b3.a0.e(new er.p() { // from class: q4.m2
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.t1((b3.b0) obj, (VerbatimTtsAnnotation) obj2);
        }
    }, new er.l() { // from class: q4.n2
        @Override // er.l
        public final Object b(Object obj) {
            return v2.u1(obj);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b3.x<UrlAnnotation, Object> f164614e = b3.a0.e(new er.p() { // from class: q4.p2
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.r1((b3.b0) obj, (UrlAnnotation) obj2);
        }
    }, new er.l() { // from class: q4.q2
        @Override // er.l
        public final Object b(Object obj) {
            return v2.s1(obj);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b3.x<m.b, Object> f164615f = b3.a0.e(new er.p() { // from class: q4.w0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.K0((b3.b0) obj, (m.b) obj2);
        }
    }, new er.l() { // from class: q4.h1
        @Override // er.l
        public final Object b(Object obj) {
            return v2.L0(obj);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b3.x<m.a, Object> f164616g = b3.a0.e(new er.p() { // from class: q4.s1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.s0((b3.b0) obj, (m.a) obj2);
        }
    }, new er.l() { // from class: q4.d2
        @Override // er.l
        public final Object b(Object obj) {
            return v2.t0(obj);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b3.x<ParagraphStyle, Object> f164617h = b3.a0.e(new er.p() { // from class: q4.o2
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.T0((b3.b0) obj, (ParagraphStyle) obj2);
        }
    }, new er.l() { // from class: q4.r2
        @Override // er.l
        public final Object b(Object obj) {
            return v2.U0(obj);
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final b3.x<SpanStyle, Object> f164618i = b3.a0.e(new er.p() { // from class: q4.s2
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.X0((b3.b0) obj, (SpanStyle) obj2);
        }
    }, new er.l() { // from class: q4.t2
        @Override // er.l
        public final Object b(Object obj) {
            return v2.Y0(obj);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final b3.x<u3, Object> f164619j = b3.a0.e(new er.p() { // from class: q4.u2
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.j1((b3.b0) obj, (u3) obj2);
        }
    }, new er.l() { // from class: q4.m0
        @Override // er.l
        public final Object b(Object obj) {
            return v2.k1(obj);
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final b3.x<b5.k, Object> f164620k = b3.a0.e(new er.p() { // from class: q4.o0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.b1((b3.b0) obj, (b5.k) obj2);
        }
    }, new er.l() { // from class: q4.p0
        @Override // er.l
        public final Object b(Object obj) {
            return v2.c1(obj);
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b3.x<TextGeometricTransform, Object> f164621l = b3.a0.e(new er.p() { // from class: q4.q0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.f1((b3.b0) obj, (TextGeometricTransform) obj2);
        }
    }, new er.l() { // from class: q4.r0
        @Override // er.l
        public final Object b(Object obj) {
            return v2.g1(obj);
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final b3.x<TextIndent, Object> f164622m = b3.a0.e(new er.p() { // from class: q4.s0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.h1((b3.b0) obj, (TextIndent) obj2);
        }
    }, new er.l() { // from class: q4.t0
        @Override // er.l
        public final Object b(Object obj) {
            return v2.i1(obj);
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final b3.x<FontWeight, Object> f164623n = b3.a0.e(new er.p() { // from class: q4.u0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.y0((b3.b0) obj, (FontWeight) obj2);
        }
    }, new er.l() { // from class: q4.v0
        @Override // er.l
        public final Object b(Object obj) {
            return v2.z0(obj);
        }
    });

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final b3.x<b5.a, Object> f164624o = b3.a0.e(new er.p() { // from class: q4.x0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.q0((b3.b0) obj, (b5.a) obj2);
        }
    }, new er.l() { // from class: q4.y0
        @Override // er.l
        public final Object b(Object obj) {
            return v2.r0(obj);
        }
    });

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final b3.x<z3, Object> f164625p = b3.a0.e(new er.p() { // from class: q4.a1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.l1((b3.b0) obj, (z3) obj2);
        }
    }, new er.l() { // from class: q4.b1
        @Override // er.l
        public final Object b(Object obj) {
            return v2.m1(obj);
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final b3.x<Shadow, Object> f164626q = b3.a0.e(new er.p() { // from class: q4.c1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.V0((b3.b0) obj, (Shadow) obj2);
        }
    }, new er.l() { // from class: q4.d1
        @Override // er.l
        public final Object b(Object obj) {
            return v2.W0(obj);
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final x<Color, Object> f164627r = Q0(a.f164636a, b.f164637a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final x<b5.j, Object> f164628s = Q0(new er.p() { // from class: q4.e1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.Z0((b3.b0) obj, (b5.j) obj2);
        }
    }, new er.l() { // from class: q4.f1
        @Override // er.l
        public final Object b(Object obj) {
            return v2.a1(obj);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final x<b5.l, Object> f164629t = Q0(new er.p() { // from class: q4.g1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.d1((b3.b0) obj, (b5.l) obj2);
        }
    }, new er.l() { // from class: q4.i1
        @Override // er.l
        public final Object b(Object obj) {
            return v2.e1(obj);
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final x<b5.e, Object> f164630u = Q0(new er.p() { // from class: q4.j1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.A0((b3.b0) obj, (b5.e) obj2);
        }
    }, new er.l() { // from class: q4.k1
        @Override // er.l
        public final Object b(Object obj) {
            return v2.B0(obj);
        }
    });

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final b3.x<u4.y, Object> f164631v = b3.a0.e(new er.p() { // from class: q4.m1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.u0((b3.b0) obj, (u4.y) obj2);
        }
    }, new er.l() { // from class: q4.n1
        @Override // er.l
        public final Object b(Object obj) {
            return v2.v0(obj);
        }
    });

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final b3.x<u4.z, Object> f164632w = b3.a0.e(new er.p() { // from class: q4.o1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.w0((b3.b0) obj, (u4.z) obj2);
        }
    }, new er.l() { // from class: q4.p1
        @Override // er.l
        public final Object b(Object obj) {
            return v2.x0(obj);
        }
    });

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final x<c5.v, Object> f164633x = Q0(new er.p() { // from class: q4.q1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.n1((b3.b0) obj, (c5.v) obj2);
        }
    }, new er.l() { // from class: q4.r1
        @Override // er.l
        public final Object b(Object obj) {
            return v2.o1(obj);
        }
    });

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final x<c5.x, Object> f164634y = Q0(new er.p() { // from class: q4.t1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.p1((b3.b0) obj, (c5.x) obj2);
        }
    }, new er.l() { // from class: q4.u1
        @Override // er.l
        public final Object b(Object obj) {
            return v2.q1(obj);
        }
    });

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final x<m3.e, Object> f164635z = Q0(new er.p() { // from class: q4.v1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.R0((b3.b0) obj, (m3.e) obj2);
        }
    }, new er.l() { // from class: q4.w1
        @Override // er.l
        public final Object b(Object obj) {
            return v2.S0(obj);
        }
    });
    private static final b3.x<LocaleList, Object> A = b3.a0.e(new er.p() { // from class: q4.y1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.M0((b3.b0) obj, (LocaleList) obj2);
        }
    }, new er.l() { // from class: q4.z1
        @Override // er.l
        public final Object b(Object obj) {
            return v2.N0(obj);
        }
    });
    private static final b3.x<x4.c, Object> B = b3.a0.e(new er.p() { // from class: q4.a2
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.O0((b3.b0) obj, (x4.c) obj2);
        }
    }, new er.l() { // from class: q4.b2
        @Override // er.l
        public final Object b(Object obj) {
            return v2.P0(obj);
        }
    });
    private static final b3.x<LineHeightStyle, Object> C = b3.a0.e(new er.p() { // from class: q4.c2
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.G0((b3.b0) obj, (LineHeightStyle) obj2);
        }
    }, new er.l() { // from class: q4.e2
        @Override // er.l
        public final Object b(Object obj) {
            return v2.H0(obj);
        }
    });
    private static final x<LineHeightStyle.a, Object> D = Q0(new er.p() { // from class: q4.f2
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.C0((b3.b0) obj, (LineHeightStyle.a) obj2);
        }
    }, new er.l() { // from class: q4.g2
        @Override // er.l
        public final Object b(Object obj) {
            return v2.D0(obj);
        }
    });
    private static final x<LineHeightStyle.d, Object> E = Q0(new er.p() { // from class: q4.h2
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.I0((b3.b0) obj, (LineHeightStyle.d) obj2);
        }
    }, new er.l() { // from class: q4.i2
        @Override // er.l
        public final Object b(Object obj) {
            return v2.J0(obj);
        }
    });
    private static final x<LineHeightStyle.c, Object> F = Q0(new er.p() { // from class: q4.k2
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return v2.E0((b3.b0) obj, (LineHeightStyle.c) obj2);
        }
    }, new er.l() { // from class: q4.l2
        @Override // er.l
        public final Object b(Object obj) {
            return v2.F0(obj);
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements er.p<b3.b0, Color, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f164636a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(b3.b0 b0Var, Color color) {
            return c(b0Var, color.m20unboximpl());
        }

        public final Object c(b3.b0 b0Var, long j15) {
            return j15 == 16 ? Boolean.FALSE : Integer.valueOf(n3.o1.j(j15));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements er.l<Object, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f164637a = new b();

        b() {
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Color b(Object obj) {
            return fr.t.c(obj, Boolean.FALSE) ? Color.m0boximpl(Color.INSTANCE.h()) : Color.m0boximpl(n3.o1.b(((Integer) obj).intValue()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"q4/v2$c", "Lq4/x;", "Lb3/b0;", "value", "a", "(Lb3/b0;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<Original, Saveable> implements x<Original, Saveable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.p<b3.b0, Original, Saveable> f164638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<Saveable, Original> f164639b;

        /* JADX WARN: Multi-variable type inference failed */
        c(er.p<? super b3.b0, ? super Original, ? extends Saveable> pVar, er.l<? super Saveable, ? extends Original> lVar) {
            this.f164638a = pVar;
            this.f164639b = lVar;
        }

        @Override // b3.x
        public Saveable a(b3.b0 b0Var, Original original) {
            return this.f164638a.B(b0Var, original);
        }

        @Override // b3.x
        public Original b(Saveable value) {
            return this.f164639b.b(value);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f164640a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.Paragraph.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.Span.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.VerbatimTts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.Url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.Clickable.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.String.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f164640a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object A0(b3.b0 b0Var, b5.e eVar) {
        return Integer.valueOf(eVar.getValue());
    }

    public static final b3.x<LineHeightStyle, Object> A1(LineHeightStyle.Companion companion) {
        return C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b5.e B0(Object obj) {
        return b5.e.d(b5.e.e(((Integer) obj).intValue()));
    }

    private static final b3.x<LineHeightStyle.c, Object> B1(LineHeightStyle.c.Companion companion) {
        return F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object C0(b3.b0 b0Var, LineHeightStyle.a aVar) {
        return Float.valueOf(aVar.getTopRatio());
    }

    private static final b3.x<LineHeightStyle.d, Object> C1(LineHeightStyle.d.Companion companion) {
        return E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.a D0(Object obj) {
        return LineHeightStyle.a.c(LineHeightStyle.a.d(((Float) obj).floatValue()));
    }

    public static final b3.x<b5.j, Object> D1(b5.j.Companion companion) {
        return f164628s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object E0(b3.b0 b0Var, LineHeightStyle.c cVar) {
        return Integer.valueOf(cVar.getValue());
    }

    public static final b3.x<b5.k, Object> E1(b5.k.Companion companion) {
        return f164620k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.c F0(Object obj) {
        return LineHeightStyle.c.d(LineHeightStyle.c.e(((Integer) obj).intValue()));
    }

    public static final b3.x<b5.l, Object> F1(b5.l.Companion companion) {
        return f164629t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object G0(b3.b0 b0Var, LineHeightStyle lineHeightStyle) {
        return pq.v.g(T1(LineHeightStyle.a.c(lineHeightStyle.getAlignment()), z1(LineHeightStyle.a.INSTANCE), b0Var), T1(LineHeightStyle.d.c(lineHeightStyle.getTrim()), C1(LineHeightStyle.d.INSTANCE), b0Var), T1(LineHeightStyle.c.d(lineHeightStyle.getMode()), B1(LineHeightStyle.c.INSTANCE), b0Var));
    }

    public static final b3.x<TextGeometricTransform, Object> G1(TextGeometricTransform.Companion companion) {
        return f164621l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle H0(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        b3.x<LineHeightStyle.a, Object> xVarZ1 = z1(LineHeightStyle.a.INSTANCE);
        Boolean bool = Boolean.FALSE;
        float topRatio = (((!fr.t.c(obj2, bool) || (xVarZ1 instanceof x)) && obj2 != null) ? xVarZ1.b(obj2) : null).getTopRatio();
        Object obj3 = list.get(1);
        b3.x<LineHeightStyle.d, Object> xVarC1 = C1(LineHeightStyle.d.INSTANCE);
        int value = (((!fr.t.c(obj3, bool) || (xVarC1 instanceof x)) && obj3 != null) ? xVarC1.b(obj3) : null).getValue();
        Object obj4 = list.get(2);
        b3.x<LineHeightStyle.c, Object> xVarB1 = B1(LineHeightStyle.c.INSTANCE);
        return new LineHeightStyle(topRatio, value, (((!fr.t.c(obj4, bool) || (xVarB1 instanceof x)) && obj4 != null) ? xVarB1.b(obj4) : null).getValue(), null);
    }

    public static final b3.x<TextIndent, Object> H1(TextIndent.Companion companion) {
        return f164622m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object I0(b3.b0 b0Var, LineHeightStyle.d dVar) {
        return Integer.valueOf(dVar.getValue());
    }

    public static final b3.x<c5.v, Object> I1(c5.v.Companion companion) {
        return f164633x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.d J0(Object obj) {
        return LineHeightStyle.d.c(LineHeightStyle.d.d(((Integer) obj).intValue()));
    }

    public static final b3.x<c5.x, Object> J1(c5.x.Companion companion) {
        return f164634y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K0(b3.b0 b0Var, m.b bVar) {
        return pq.v.g(S1(bVar.getUrl()), T1(bVar.getStyles(), f164619j, b0Var));
    }

    public static final b3.x<m3.e, Object> K1(m3.e.Companion companion) {
        return f164635z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m.b L0(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        u3 u3VarB = null;
        String str = obj2 != null ? (String) obj2 : null;
        Object obj3 = list.get(1);
        b3.x<u3, Object> xVar = f164619j;
        if ((!fr.t.c(obj3, Boolean.FALSE) || (xVar instanceof x)) && obj3 != null) {
            u3VarB = xVar.b(obj3);
        }
        return new m.b(str, u3VarB, null, 4, null);
    }

    public static final b3.x<Shadow, Object> L1(Shadow.Companion companion) {
        return f164626q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object M0(b3.b0 b0Var, LocaleList localeList) {
        List<x4.c> listH = localeList.h();
        ArrayList arrayList = new ArrayList(listH.size());
        int size = listH.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(T1(listH.get(i15), Q1(x4.c.INSTANCE), b0Var));
        }
        return arrayList;
    }

    public static final b3.x<z3, Object> M1(z3.Companion companion) {
        return f164625p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocaleList N0(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            Object obj2 = list.get(i15);
            b3.x<x4.c, Object> xVarQ1 = Q1(x4.c.INSTANCE);
            x4.c cVarB = null;
            if ((!fr.t.c(obj2, Boolean.FALSE) || (xVarQ1 instanceof x)) && obj2 != null) {
                cVarB = xVarQ1.b(obj2);
            }
            arrayList.add(cVarB);
        }
        return new LocaleList(arrayList);
    }

    public static final b3.x<u4.y, Object> N1(u4.y.Companion companion) {
        return f164631v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object O0(b3.b0 b0Var, x4.c cVar) {
        return cVar.b();
    }

    public static final b3.x<u4.z, Object> O1(u4.z.Companion companion) {
        return f164632w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x4.c P0(Object obj) {
        return new x4.c((String) obj);
    }

    public static final b3.x<FontWeight, Object> P1(FontWeight.Companion companion) {
        return f164623n;
    }

    private static final <Original, Saveable> x<Original, Saveable> Q0(er.p<? super b3.b0, ? super Original, ? extends Saveable> pVar, er.l<? super Saveable, ? extends Original> lVar) {
        return new c(pVar, lVar);
    }

    public static final b3.x<x4.c, Object> Q1(x4.c.Companion companion) {
        return B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object R0(b3.b0 b0Var, m3.e eVar) {
        return eVar == null ? false : m3.e.j(eVar.getPackedValue(), m3.e.INSTANCE.b()) ? Boolean.FALSE : pq.v.g(S1(Float.valueOf(Float.intBitsToFloat((int) (eVar.getPackedValue() >> 32)))), S1(Float.valueOf(Float.intBitsToFloat((int) (eVar.getPackedValue() & BodyPartID.bodyIdMax)))));
    }

    public static final b3.x<LocaleList, Object> R1(LocaleList.Companion companion) {
        return A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.e S0(Object obj) {
        if (fr.t.c(obj, Boolean.FALSE)) {
            return m3.e.d(m3.e.INSTANCE.b());
        }
        List list = (List) obj;
        Object obj2 = list.get(0);
        float fFloatValue = (obj2 != null ? (Float) obj2 : null).floatValue();
        Object obj3 = list.get(1);
        return m3.e.d(m3.e.e((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits((obj3 != null ? (Float) obj3 : null).floatValue())) & BodyPartID.bodyIdMax)));
    }

    public static final <T> T S1(T t15) {
        return t15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object T0(b3.b0 b0Var, ParagraphStyle e0Var) {
        return pq.v.g(T1(b5.j.h(e0Var.getTextAlign()), D1(b5.j.INSTANCE), b0Var), T1(b5.l.g(e0Var.getTextDirection()), F1(b5.l.INSTANCE), b0Var), T1(c5.v.b(e0Var.getLineHeight()), I1(c5.v.INSTANCE), b0Var), T1(e0Var.getTextIndent(), H1(TextIndent.INSTANCE), b0Var), T1(e0Var.getPlatformStyle(), g3.y(PlatformParagraphStyle.INSTANCE), b0Var), T1(e0Var.getLineHeightStyle(), A1(LineHeightStyle.INSTANCE), b0Var), T1(b5.f.c(e0Var.getLineBreak()), g3.u(b5.f.INSTANCE), b0Var), T1(b5.e.d(e0Var.getHyphens()), y1(b5.e.INSTANCE), b0Var), T1(e0Var.getTextMotion(), g3.v(b5.u.INSTANCE), b0Var));
    }

    public static final <T extends b3.x<Original, Saveable>, Original, Saveable> Object T1(Original original, T t15, b3.b0 b0Var) {
        Object objA;
        return (original == null || (objA = t15.a(b0Var, original)) == null) ? Boolean.FALSE : objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParagraphStyle U0(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        b3.x<b5.j, Object> xVarD1 = D1(b5.j.INSTANCE);
        Boolean bool = Boolean.FALSE;
        b5.u uVarB = null;
        int value = (((!fr.t.c(obj2, bool) || (xVarD1 instanceof x)) && obj2 != null) ? xVarD1.b(obj2) : null).getValue();
        Object obj3 = list.get(1);
        b3.x<b5.l, Object> xVarF1 = F1(b5.l.INSTANCE);
        int value2 = (((!fr.t.c(obj3, bool) || (xVarF1 instanceof x)) && obj3 != null) ? xVarF1.b(obj3) : null).getValue();
        Object obj4 = list.get(2);
        b3.x<c5.v, Object> xVarI1 = I1(c5.v.INSTANCE);
        long packedValue = (((!fr.t.c(obj4, bool) || (xVarI1 instanceof x)) && obj4 != null) ? xVarI1.b(obj4) : null).getPackedValue();
        Object obj5 = list.get(3);
        b3.x<TextIndent, Object> xVarH1 = H1(TextIndent.INSTANCE);
        TextIndent textIndentB = ((!fr.t.c(obj5, bool) || (xVarH1 instanceof x)) && obj5 != null) ? xVarH1.b(obj5) : null;
        Object obj6 = list.get(4);
        b3.x<PlatformParagraphStyle, Object> xVarY = g3.y(PlatformParagraphStyle.INSTANCE);
        PlatformParagraphStyle platformParagraphStyleB = ((!fr.t.c(obj6, bool) || (xVarY instanceof x)) && obj6 != null) ? xVarY.b(obj6) : null;
        Object obj7 = list.get(5);
        b3.x<LineHeightStyle, Object> xVarA1 = A1(LineHeightStyle.INSTANCE);
        LineHeightStyle lineHeightStyleB = ((!fr.t.c(obj7, bool) || (xVarA1 instanceof x)) && obj7 != null) ? xVarA1.b(obj7) : null;
        Object obj8 = list.get(6);
        b3.x<b5.f, Object> xVarU = g3.u(b5.f.INSTANCE);
        int mask = (((!fr.t.c(obj8, bool) || (xVarU instanceof x)) && obj8 != null) ? xVarU.b(obj8) : null).getMask();
        Object obj9 = list.get(7);
        b3.x<b5.e, Object> xVarY1 = y1(b5.e.INSTANCE);
        int value3 = (((!fr.t.c(obj9, bool) || (xVarY1 instanceof x)) && obj9 != null) ? xVarY1.b(obj9) : null).getValue();
        Object obj10 = list.get(8);
        b3.x<b5.u, Object> xVarV = g3.v(b5.u.INSTANCE);
        if ((!fr.t.c(obj10, bool) || (xVarV instanceof x)) && obj10 != null) {
            uVarB = xVarV.b(obj10);
        }
        return new ParagraphStyle(value, value2, packedValue, textIndentB, platformParagraphStyleB, lineHeightStyleB, mask, value3, uVarB, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object V0(b3.b0 b0Var, Shadow shadow) {
        return pq.v.g(T1(Color.m0boximpl(shadow.getColor()), w1(Color.INSTANCE), b0Var), T1(m3.e.d(shadow.getOffset()), K1(m3.e.INSTANCE), b0Var), S1(Float.valueOf(shadow.getBlurRadius())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shadow W0(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        b3.x<Color, Object> xVarW1 = w1(Color.INSTANCE);
        Boolean bool = Boolean.FALSE;
        long jM20unboximpl = (((!fr.t.c(obj2, bool) || (xVarW1 instanceof x)) && obj2 != null) ? xVarW1.b(obj2) : null).m20unboximpl();
        Object obj3 = list.get(1);
        b3.x<m3.e, Object> xVarK1 = K1(m3.e.INSTANCE);
        long packedValue = (((!fr.t.c(obj3, bool) || (xVarK1 instanceof x)) && obj3 != null) ? xVarK1.b(obj3) : null).getPackedValue();
        Object obj4 = list.get(2);
        return new Shadow(jM20unboximpl, packedValue, (obj4 != null ? (Float) obj4 : null).floatValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object X0(b3.b0 b0Var, SpanStyle spanStyle) {
        Color colorM0boximpl = Color.m0boximpl(spanStyle.g());
        Color.Companion companion = Color.INSTANCE;
        Object objT1 = T1(colorM0boximpl, w1(companion), b0Var);
        c5.v vVarB = c5.v.b(spanStyle.getFontSize());
        c5.v.Companion companion2 = c5.v.INSTANCE;
        return pq.v.g(objT1, T1(vVarB, I1(companion2), b0Var), T1(spanStyle.getFontWeight(), P1(FontWeight.INSTANCE), b0Var), T1(spanStyle.getFontStyle(), N1(u4.y.INSTANCE), b0Var), T1(spanStyle.getFontSynthesis(), O1(u4.z.INSTANCE), b0Var), S1(-1), S1(spanStyle.getFontFeatureSettings()), T1(c5.v.b(spanStyle.getLetterSpacing()), I1(companion2), b0Var), T1(spanStyle.getBaselineShift(), x1(b5.a.INSTANCE), b0Var), T1(spanStyle.getTextGeometricTransform(), G1(TextGeometricTransform.INSTANCE), b0Var), T1(spanStyle.getLocaleList(), R1(LocaleList.INSTANCE), b0Var), T1(Color.m0boximpl(spanStyle.getBackground()), w1(companion), b0Var), T1(spanStyle.getTextDecoration(), E1(b5.k.INSTANCE), b0Var), T1(spanStyle.getShadow(), L1(Shadow.INSTANCE), b0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 q4.h3, still in use, count: 2, list:
          (r1v0 q4.h3) from 0x00f2: MOVE (r16v2 q4.h3) = (r1v0 q4.h3)
          (r1v0 q4.h3) from 0x00ea: MOVE (r16v7 q4.h3) = (r1v0 q4.h3)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final q4.SpanStyle Y0(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.v2.Y0(java.lang.Object):q4.h3");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object Z0(b3.b0 b0Var, b5.j jVar) {
        return Integer.valueOf(jVar.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b5.j a1(Object obj) {
        return b5.j.h(b5.j.i(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object b1(b3.b0 b0Var, b5.k kVar) {
        return Integer.valueOf(kVar.getMask());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b5.k c1(Object obj) {
        return new b5.k(((Integer) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d1(b3.b0 b0Var, b5.l lVar) {
        return Integer.valueOf(lVar.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b5.l e1(Object obj) {
        return b5.l.g(b5.l.h(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f1(b3.b0 b0Var, TextGeometricTransform textGeometricTransform) {
        return pq.v.g(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextGeometricTransform g1(Object obj) {
        List list = (List) obj;
        return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h1(b3.b0 b0Var, TextIndent textIndent) {
        c5.v vVarB = c5.v.b(textIndent.getFirstLine());
        c5.v.Companion companion = c5.v.INSTANCE;
        return pq.v.g(T1(vVarB, I1(companion), b0Var), T1(c5.v.b(textIndent.getRestLine()), I1(companion), b0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextIndent i1(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        c5.v.Companion companion = c5.v.INSTANCE;
        b3.x<c5.v, Object> xVarI1 = I1(companion);
        Boolean bool = Boolean.FALSE;
        c5.v vVarB = null;
        long packedValue = (((!fr.t.c(obj2, bool) || (xVarI1 instanceof x)) && obj2 != null) ? xVarI1.b(obj2) : null).getPackedValue();
        Object obj3 = list.get(1);
        b3.x<c5.v, Object> xVarI2 = I1(companion);
        if ((!fr.t.c(obj3, bool) || (xVarI2 instanceof x)) && obj3 != null) {
            vVarB = xVarI2.b(obj3);
        }
        return new TextIndent(packedValue, vVarB.getPackedValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object j1(b3.b0 b0Var, u3 u3Var) {
        SpanStyle style = u3Var.getStyle();
        b3.x<SpanStyle, Object> xVar = f164618i;
        return pq.v.g(T1(style, xVar, b0Var), T1(u3Var.getFocusedStyle(), xVar, b0Var), T1(u3Var.getHoveredStyle(), xVar, b0Var), T1(u3Var.getPressedStyle(), xVar, b0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k0(b3.b0 b0Var, e eVar) {
        return pq.v.g(S1(eVar.getText()), T1(eVar.c(), f164611b, b0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u3 k1(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        b3.x<SpanStyle, Object> xVar = f164618i;
        Boolean bool = Boolean.FALSE;
        SpanStyle spanStyleB = null;
        SpanStyle spanStyleB2 = ((!fr.t.c(obj2, bool) || (xVar instanceof x)) && obj2 != null) ? xVar.b(obj2) : null;
        Object obj3 = list.get(1);
        SpanStyle spanStyleB3 = ((!fr.t.c(obj3, bool) || (xVar instanceof x)) && obj3 != null) ? xVar.b(obj3) : null;
        Object obj4 = list.get(2);
        SpanStyle spanStyleB4 = ((!fr.t.c(obj4, bool) || (xVar instanceof x)) && obj4 != null) ? xVar.b(obj4) : null;
        Object obj5 = list.get(3);
        if ((!fr.t.c(obj5, bool) || (xVar instanceof x)) && obj5 != null) {
            spanStyleB = xVar.b(obj5);
        }
        return new u3(spanStyleB2, spanStyleB3, spanStyleB4, spanStyleB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e l0(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(1);
        b3.x<List<e.Range<? extends Object>>, Object> xVar = f164611b;
        List<e.Range<? extends Object>> listB = ((!fr.t.c(obj2, Boolean.FALSE) || (xVar instanceof x)) && obj2 != null) ? xVar.b(obj2) : null;
        Object obj3 = list.get(0);
        return new e(listB, obj3 != null ? (String) obj3 : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object l1(b3.b0 b0Var, z3 z3Var) {
        return pq.v.g(S1(Integer.valueOf(z3.n(z3Var.getPackedValue()))), S1(Integer.valueOf(z3.i(z3Var.getPackedValue()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m0(b3.b0 b0Var, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(T1((e.Range) list.get(i15), f164612c, b0Var));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z3 m1(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        int iIntValue = (obj2 != null ? (Integer) obj2 : null).intValue();
        Object obj3 = list.get(1);
        return z3.b(a4.b(iIntValue, (obj3 != null ? (Integer) obj3 : null).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n0(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            Object obj2 = list.get(i15);
            b3.x<e.Range<? extends Object>, Object> xVar = f164612c;
            e.Range<? extends Object> rangeB = null;
            if ((!fr.t.c(obj2, Boolean.FALSE) || (xVar instanceof x)) && obj2 != null) {
                rangeB = xVar.b(obj2);
            }
            arrayList.add(rangeB);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object n1(b3.b0 b0Var, c5.v vVar) {
        return vVar == null ? false : c5.v.e(vVar.getPackedValue(), c5.v.INSTANCE.a()) ? Boolean.FALSE : pq.v.g(S1(Float.valueOf(c5.v.h(vVar.getPackedValue()))), T1(c5.x.d(c5.v.g(vVar.getPackedValue())), J1(c5.x.INSTANCE), b0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o0(b3.b0 b0Var, e.Range range) {
        h hVar;
        Object objT1;
        Object objG = range.g();
        if (objG instanceof ParagraphStyle) {
            hVar = h.Paragraph;
        } else if (objG instanceof SpanStyle) {
            hVar = h.Span;
        } else if (objG instanceof VerbatimTtsAnnotation) {
            hVar = h.VerbatimTts;
        } else if (objG instanceof UrlAnnotation) {
            hVar = h.Url;
        } else if (objG instanceof m.b) {
            hVar = h.Link;
        } else if (objG instanceof m.a) {
            hVar = h.Clickable;
        } else {
            if (!(objG instanceof k3)) {
                throw new UnsupportedOperationException();
            }
            hVar = h.String;
        }
        switch (d.f164640a[hVar.ordinal()]) {
            case 1:
                objT1 = T1((ParagraphStyle) range.g(), f164617h, b0Var);
                break;
            case 2:
                objT1 = T1((SpanStyle) range.g(), f164618i, b0Var);
                break;
            case 3:
                objT1 = T1((VerbatimTtsAnnotation) range.g(), f164613d, b0Var);
                break;
            case 4:
                objT1 = T1((UrlAnnotation) range.g(), f164614e, b0Var);
                break;
            case 5:
                objT1 = T1((m.b) range.g(), f164615f, b0Var);
                break;
            case 6:
                objT1 = T1((m.a) range.g(), f164616g, b0Var);
                break;
            case 7:
                objT1 = S1(((k3) range.g()).getValue());
                break;
            default:
                throw new oq.p();
        }
        return pq.v.g(S1(hVar), objT1, S1(Integer.valueOf(range.h())), S1(Integer.valueOf(range.f())), S1(range.getTag()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.v o1(Object obj) {
        Boolean bool = Boolean.FALSE;
        if (fr.t.c(obj, bool)) {
            return c5.v.b(c5.v.INSTANCE.a());
        }
        List list = (List) obj;
        Object obj2 = list.get(0);
        c5.x xVarB = null;
        float fFloatValue = (obj2 != null ? (Float) obj2 : null).floatValue();
        Object obj3 = list.get(1);
        b3.x<c5.x, Object> xVarJ1 = J1(c5.x.INSTANCE);
        if ((!fr.t.c(obj3, bool) || (xVarJ1 instanceof x)) && obj3 != null) {
            xVarB = xVarJ1.b(obj3);
        }
        return c5.v.b(c5.w.a(fFloatValue, xVarB.getType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e.Range p0(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        ParagraphStyle e0VarB = null;
        aVarB = null;
        m.a aVarB = null;
        bVarB = null;
        m.b bVarB = null;
        e4VarB = null;
        UrlAnnotation e4VarB = null;
        verbatimTtsAnnotationB = null;
        VerbatimTtsAnnotation verbatimTtsAnnotationB = null;
        spanStyleB = null;
        SpanStyle spanStyleB = null;
        e0VarB = null;
        h hVar = obj2 != null ? (h) obj2 : null;
        Object obj3 = list.get(2);
        int iIntValue = (obj3 != null ? (Integer) obj3 : null).intValue();
        Object obj4 = list.get(3);
        int iIntValue2 = (obj4 != null ? (Integer) obj4 : null).intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        switch (d.f164640a[hVar.ordinal()]) {
            case 1:
                Object obj6 = list.get(1);
                b3.x<ParagraphStyle, Object> xVar = f164617h;
                if ((!fr.t.c(obj6, Boolean.FALSE) || (xVar instanceof x)) && obj6 != null) {
                    e0VarB = xVar.b(obj6);
                }
                return new e.Range(e0VarB, iIntValue, iIntValue2, str);
            case 2:
                Object obj7 = list.get(1);
                b3.x<SpanStyle, Object> xVar2 = f164618i;
                if ((!fr.t.c(obj7, Boolean.FALSE) || (xVar2 instanceof x)) && obj7 != null) {
                    spanStyleB = xVar2.b(obj7);
                }
                return new e.Range(spanStyleB, iIntValue, iIntValue2, str);
            case 3:
                Object obj8 = list.get(1);
                b3.x<VerbatimTtsAnnotation, Object> xVar3 = f164613d;
                if ((!fr.t.c(obj8, Boolean.FALSE) || (xVar3 instanceof x)) && obj8 != null) {
                    verbatimTtsAnnotationB = xVar3.b(obj8);
                }
                return new e.Range(verbatimTtsAnnotationB, iIntValue, iIntValue2, str);
            case 4:
                Object obj9 = list.get(1);
                b3.x<UrlAnnotation, Object> xVar4 = f164614e;
                if ((!fr.t.c(obj9, Boolean.FALSE) || (xVar4 instanceof x)) && obj9 != null) {
                    e4VarB = xVar4.b(obj9);
                }
                return new e.Range(e4VarB, iIntValue, iIntValue2, str);
            case 5:
                Object obj10 = list.get(1);
                b3.x<m.b, Object> xVar5 = f164615f;
                if ((!fr.t.c(obj10, Boolean.FALSE) || (xVar5 instanceof x)) && obj10 != null) {
                    bVarB = xVar5.b(obj10);
                }
                return new e.Range(bVarB, iIntValue, iIntValue2, str);
            case 6:
                Object obj11 = list.get(1);
                b3.x<m.a, Object> xVar6 = f164616g;
                if ((!fr.t.c(obj11, Boolean.FALSE) || (xVar6 instanceof x)) && obj11 != null) {
                    aVarB = xVar6.b(obj11);
                }
                return new e.Range(aVarB, iIntValue, iIntValue2, str);
            case 7:
                Object obj12 = list.get(1);
                return new e.Range(k3.a(k3.b(obj12 != null ? (String) obj12 : null)), iIntValue, iIntValue2, str);
            default:
                throw new oq.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p1(b3.b0 b0Var, c5.x xVar) {
        long type = xVar.getType();
        c5.x.Companion companion = c5.x.INSTANCE;
        if (c5.x.g(type, companion.a())) {
            return 0;
        }
        if (c5.x.g(type, companion.b())) {
            return 1;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q0(b3.b0 b0Var, b5.a aVar) {
        return Float.valueOf(aVar.getMultiplier());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.x q1(Object obj) {
        if (fr.t.c(obj, 0)) {
            return c5.x.d(c5.x.INSTANCE.a());
        }
        return fr.t.c(obj, 1) ? c5.x.d(c5.x.INSTANCE.b()) : c5.x.d(c5.x.INSTANCE.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b5.a r0(Object obj) {
        return b5.a.c(b5.a.d(((Float) obj).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object r1(b3.b0 b0Var, UrlAnnotation e4Var) {
        return S1(e4Var.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object s0(b3.b0 b0Var, m.a aVar) {
        return pq.v.g(S1(aVar.getTag()), T1(aVar.getStyles(), f164619j, b0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UrlAnnotation s1(Object obj) {
        return new UrlAnnotation(obj != null ? (String) obj : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m.a t0(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        String str = obj2 != null ? (String) obj2 : null;
        Object obj3 = list.get(1);
        b3.x<u3, Object> xVar = f164619j;
        return new m.a(str, ((!fr.t.c(obj3, Boolean.FALSE) || (xVar instanceof x)) && obj3 != null) ? xVar.b(obj3) : null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t1(b3.b0 b0Var, VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return S1(verbatimTtsAnnotation.getVerbatim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object u0(b3.b0 b0Var, u4.y yVar) {
        return S1(Integer.valueOf(yVar.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerbatimTtsAnnotation u1(Object obj) {
        return new VerbatimTtsAnnotation(obj != null ? (String) obj : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u4.y v0(Object obj) {
        return u4.y.c(u4.y.d(((Integer) obj).intValue()));
    }

    public static final b3.x<e, Object> v1() {
        return f164610a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object w0(b3.b0 b0Var, u4.z zVar) {
        return Integer.valueOf(zVar.getValue());
    }

    public static final b3.x<Color, Object> w1(Color.Companion companion) {
        return f164627r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u4.z x0(Object obj) {
        return u4.z.e(u4.z.f(((Integer) obj).intValue()));
    }

    public static final b3.x<b5.a, Object> x1(b5.a.Companion companion) {
        return f164624o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object y0(b3.b0 b0Var, FontWeight fontWeight) {
        return Integer.valueOf(fontWeight.p());
    }

    public static final b3.x<b5.e, Object> y1(b5.e.Companion companion) {
        return f164630u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontWeight z0(Object obj) {
        return new FontWeight(((Integer) obj).intValue());
    }

    private static final b3.x<LineHeightStyle.a, Object> z1(LineHeightStyle.a.Companion companion) {
        return D;
    }
}
