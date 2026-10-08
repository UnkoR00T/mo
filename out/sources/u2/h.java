package u2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p071kotlin.Metadata;
import p076m2.w3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0012\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0001\u0010 JA\u0010%\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b%\u0010&JA\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010*J?\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010+\u001a\u00020\n2\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070,H\u0002¢\u0006\u0004\b.\u0010/JG\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0014\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b2\u00103JO\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0014\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060,H\u0002¢\u0006\u0004\b5\u00106J1\u00108\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00107\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b8\u00109JI\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J]\u0010C\u001a\u00020$2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u00107\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n2\u0016\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010A\u001a\u00020\n2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bC\u0010DJW\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010E\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n2\u0016\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010A\u001a\u00020\n2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bF\u0010GJm\u0010J\u001a\u00020$2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u00107\u001a\u00020\n2\u000e\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010I\u001a\u00020\n2\u0016\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010A\u001a\u00020\n2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\bL\u0010MJ;\u0010N\u001a\u0004\u0018\u00010\u00072\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\bN\u0010OJ?\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010P\u001a\u00020:H\u0002¢\u0006\u0004\bQ\u0010RJ1\u0010S\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\bS\u0010TJA\u0010U\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u0010P\u001a\u00020:H\u0002¢\u0006\u0004\bU\u0010RJ#\u0010X\u001a\u00020\u00152\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150VH\u0002¢\u0006\u0004\bX\u0010YJ1\u0010Z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\bZ\u0010\u001cJ7\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00107\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\\J3\u0010_\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V2\u0006\u0010]\u001a\u00020\n2\u0006\u0010^\u001a\u00020:H\u0002¢\u0006\u0004\b_\u0010`JC\u0010b\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010a\u001a\u00020\n2\u0006\u0010^\u001a\u00020:H\u0002¢\u0006\u0004\bb\u0010cJw\u0010g\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010a\u001a\u00020\n2\u0006\u0010d\u001a\u00020\n2\u0006\u0010^\u001a\u00020:2\u0014\u0010f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060e2\u0014\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060eH\u0002¢\u0006\u0004\bg\u0010hJG\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010i\u001a\u00028\u00002\u0006\u0010j\u001a\u00020:H\u0002¢\u0006\u0004\bk\u0010=J%\u0010m\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060l2\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\nH\u0000¢\u0006\u0004\bo\u0010\u000fJ\u0015\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\br\u0010sJ\u001d\u0010t\u001a\u00020\u00152\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016¢\u0006\u0004\bt\u0010uJ\u001f\u0010r\u001a\u00020$2\u0006\u00107\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\br\u0010vJ%\u0010t\u001a\u00020\u00152\u0006\u00107\u001a\u00020\n2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016¢\u0006\u0004\bt\u0010wJ\u0018\u0010x\u001a\u00028\u00002\u0006\u00107\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00028\u00002\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\bz\u0010yJ\u001d\u0010{\u001a\u00020\u00152\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016¢\u0006\u0004\b{\u0010uJ!\u0010|\u001a\u00020\u00152\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V¢\u0006\u0004\b|\u0010YJ \u0010}\u001a\u00028\u00002\u0006\u00107\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007fH\u0096\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0019\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J \u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u00012\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0083\u0001\u0010nR\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\"\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001R'\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010\u000f\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u0091\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bi\u0010\u0090\u0001R;\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0011\u0010\u0092\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\bz\u0010\u0088\u0001\u001a\u0005\b\u0093\u0001\u0010 R8\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000f\u0010\u0092\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0094\u0001\u0010\u0088\u0001\u001a\u0005\b\u0095\u0001\u0010 R&\u0010\u0010\u001a\u00020\n2\u0007\u0010\u0092\u0001\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\r\n\u0005\bL\u0010\u008b\u0001\u001a\u0004\bi\u0010\u000f¨\u0006\u0096\u0001"}, d2 = {"Lu2/h;", "E", "Lpq/h;", "Lt2/e$a;", "Lt2/e;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(Lt2/e;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "i0", "()I", "size", "o0", "(I)I", "m0", "buffer", "", "w", "([Ljava/lang/Object;)Z", "B", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "C", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "G", "(Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "Loq/i0;", "U", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "V", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "i", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "rootSize", "buffers", "T", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "R", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "v", "([Ljava/lang/Object;ILjava/lang/Object;)V", "Lu2/e;", "elementCarry", "u", "([Ljava/lang/Object;IILjava/lang/Object;Lu2/e;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "t", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "k0", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "l0", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "h", "(I)[Ljava/lang/Object;", "g0", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "f0", "([Ljava/lang/Object;IILu2/e;)[Ljava/lang/Object;", "Q", "([Ljava/lang/Object;II)V", "M", "Lkotlin/Function1;", "predicate", "Y", "(Ler/l;)Z", "h0", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "([Ljava/lang/Object;II)[Ljava/lang/Object;", "tailSize", "bufferRef", "b0", "(Ler/l;ILu2/e;)I", "bufferSize", "X", "(Ler/l;[Ljava/lang/Object;ILu2/e;)I", "toBufferSize", "", "recyclableBuffers", "W", "(Ler/l;[Ljava/lang/Object;IILu2/e;Ljava/util/List;Ljava/util/List;)I", "e", "oldElementCarry", "j0", "", "A", "(I)Ljava/util/ListIterator;", "k", "build", "()Lt2/e;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/lang/Object;)V", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "f", "removeAll", "e0", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "a", "Lt2/e;", "b", "[Ljava/lang/Object;", "c", "d", "I", "o", "setRootShift$runtime", "(I)V", "Lx2/e;", "Lx2/e;", "ownership", "value", "n", "g", "s", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h<E> extends pq.h<E> implements t2.e.a<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private t2.e<? extends E> vector;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] vectorRoot;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object[] vectorTail;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int rootShift;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private x2.e ownership = new x2.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Object[] root;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Object[] tail;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int size;

    public h(t2.e<? extends E> eVar, Object[] objArr, Object[] objArr2, int i15) {
        this.vector = eVar;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i15;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final ListIterator<Object[]> A(int index) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iI0 = i0() >> 5;
        x2.d.b(index, iI0);
        int i15 = this.rootShift;
        return i15 == 0 ? new k(objArr, index) : new m(objArr, index, iI0, i15 / 5);
    }

    private final Object[] B(Object[] buffer) {
        if (buffer == null) {
            return E();
        }
        return w(buffer) ? buffer : pq.n.s(buffer, E(), 0, 0, lr.m.j(buffer.length, 32), 6, null);
    }

    private final Object[] C(Object[] buffer, int distance) {
        return w(buffer) ? pq.n.n(buffer, buffer, distance, 0, 32 - distance) : pq.n.n(buffer, E(), distance, 0, 32 - distance);
    }

    private final Object[] E() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] G(Object element) {
        Object[] objArr = new Object[33];
        objArr[0] = element;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] L(Object[] root, int index, int shift) {
        if (!(shift >= 0)) {
            w3.a("shift should be positive");
        }
        if (shift == 0) {
            return root;
        }
        int iA = n.a(index, shift);
        Object objL = L((Object[]) root[iA], index, shift - 5);
        if (iA < 31) {
            int i15 = iA + 1;
            if (root[i15] != null) {
                if (w(root)) {
                    pq.n.z(root, null, i15, 32);
                }
                root = pq.n.n(root, E(), 0, 0, i15);
            }
        }
        if (objL == root[iA]) {
            return root;
        }
        Object[] objArrB = B(root);
        objArrB[iA] = objL;
        return objArrB;
    }

    private final Object[] M(Object[] root, int shift, int rootSize, e tailCarry) {
        Object[] objArrM;
        int iA = n.a(rootSize - 1, shift);
        if (shift == 5) {
            tailCarry.b(root[iA]);
            objArrM = null;
        } else {
            objArrM = M((Object[]) root[iA], shift - 5, rootSize, tailCarry);
        }
        if (objArrM == null && iA == 0) {
            return null;
        }
        Object[] objArrB = B(root);
        objArrB[iA] = objArrM;
        return objArrB;
    }

    private final void Q(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            this.root = null;
            if (root == null) {
                root = new Object[0];
            }
            this.tail = root;
            this.size = rootSize;
            this.rootShift = shift;
            return;
        }
        e eVar = new e(null);
        Object[] objArrM = M(root, shift, rootSize, eVar);
        this.tail = (Object[]) eVar.getValue();
        this.size = rootSize;
        if (objArrM[1] == null) {
            this.root = (Object[]) objArrM[0];
            this.rootShift = shift - 5;
        } else {
            this.root = objArrM;
            this.rootShift = shift;
        }
    }

    private final Object[] R(Object[] root, int rootSize, int shift, Iterator<Object[]> buffersIterator) {
        if (!buffersIterator.hasNext()) {
            w3.a("invalid buffersIterator");
        }
        if (!(shift >= 0)) {
            w3.a("negative shift");
        }
        if (shift == 0) {
            return buffersIterator.next();
        }
        Object[] objArrB = B(root);
        int iA = n.a(rootSize, shift);
        int i15 = shift - 5;
        objArrB[iA] = R((Object[]) objArrB[iA], rootSize, i15, buffersIterator);
        while (true) {
            iA++;
            if (iA >= 32 || !buffersIterator.hasNext()) {
                break;
            }
            objArrB[iA] = R((Object[]) objArrB[iA], 0, i15, buffersIterator);
        }
        return objArrB;
    }

    private final Object[] T(Object[] root, int rootSize, Object[][] buffers) {
        Iterator<Object[]> itA = fr.c.a(buffers);
        int i15 = rootSize >> 5;
        int i16 = this.rootShift;
        Object[] objArrR = i15 < (1 << i16) ? R(root, rootSize, i16, itA) : B(root);
        while (itA.hasNext()) {
            this.rootShift += 5;
            objArrR = G(objArrR);
            int i17 = this.rootShift;
            R(objArrR, 1 << i17, i17, itA);
        }
        return objArrR;
    }

    private final void U(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i15 = this.rootShift;
        if (size > (1 << i15)) {
            this.root = V(G(root), filledTail, this.rootShift + 5);
            this.tail = newTail;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (root == null) {
            this.root = filledTail;
            this.tail = newTail;
            this.size = size() + 1;
        } else {
            this.root = V(root, filledTail, i15);
            this.tail = newTail;
            this.size = size() + 1;
        }
    }

    private final Object[] V(Object[] root, Object[] tail, int shift) {
        int iA = n.a(size() - 1, shift);
        Object[] objArrB = B(root);
        if (shift == 5) {
            objArrB[iA] = tail;
            return objArrB;
        }
        objArrB[iA] = V((Object[]) objArrB[iA], tail, shift - 5);
        return objArrB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int W(er.l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, int toBufferSize, e bufferRef, List<Object[]> recyclableBuffers, List<Object[]> buffers) {
        if (w(buffer)) {
            recyclableBuffers.add(buffer);
        }
        Object[] objArr = (Object[]) bufferRef.getValue();
        Object[] objArrRemove = objArr;
        for (int i15 = 0; i15 < bufferSize; i15++) {
            Object obj = buffer[i15];
            if (!predicate.b(obj).booleanValue()) {
                if (toBufferSize == 32) {
                    objArrRemove = !recyclableBuffers.isEmpty() ? recyclableBuffers.remove(recyclableBuffers.size() - 1) : E();
                    toBufferSize = 0;
                }
                objArrRemove[toBufferSize] = obj;
                toBufferSize++;
            }
        }
        bufferRef.b(objArrRemove);
        if (objArr != bufferRef.getValue()) {
            buffers.add(objArr);
        }
        return toBufferSize;
    }

    private final int X(er.l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, e bufferRef) {
        Object[] objArrB = buffer;
        int i15 = bufferSize;
        boolean z15 = false;
        for (int i16 = 0; i16 < bufferSize; i16++) {
            Object obj = buffer[i16];
            if (predicate.b(obj).booleanValue()) {
                if (!z15) {
                    objArrB = B(buffer);
                    z15 = true;
                    i15 = i16;
                }
            } else if (z15) {
                objArrB[i15] = obj;
                i15++;
            }
        }
        bufferRef.b(objArrB);
        return i15;
    }

    private final boolean Y(er.l<? super E, Boolean> predicate) {
        int iM0 = m0();
        e eVar = new e(null);
        if (this.root == null) {
            return b0(predicate, iM0, eVar) != iM0;
        }
        ListIterator<Object[]> listIteratorA = A(0);
        int iX = 32;
        while (iX == 32 && listIteratorA.hasNext()) {
            iX = X(predicate, listIteratorA.next(), 32, eVar);
        }
        if (iX == 32) {
            x2.a.a(!listIteratorA.hasNext());
            int iB0 = b0(predicate, iM0, eVar);
            if (iB0 == 0) {
                Q(this.root, size(), this.rootShift);
            }
            return iB0 != iM0;
        }
        int iPreviousIndex = listIteratorA.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iW = iX;
        while (listIteratorA.hasNext()) {
            iW = W(predicate, listIteratorA.next(), 32, iW, eVar, arrayList2, arrayList);
        }
        int iW2 = W(predicate, this.tail, iM0, iW, eVar, arrayList2, arrayList);
        Object[] objArr = (Object[]) eVar.getValue();
        pq.n.z(objArr, null, iW2, 32);
        Object[] objArrR = arrayList.isEmpty() ? this.root : R(this.root, iPreviousIndex, this.rootShift, arrayList.iterator());
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.root = h0(objArrR, size);
        this.tail = objArr;
        this.size = size + iW2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    private final int b0(er.l<? super E, Boolean> predicate, int tailSize, e bufferRef) {
        int iX = X(predicate, this.tail, tailSize, bufferRef);
        if (iX == tailSize) {
            x2.a.a(bufferRef.getValue() == this.tail);
            return tailSize;
        }
        Object[] objArr = (Object[]) bufferRef.getValue();
        pq.n.z(objArr, null, iX, tailSize);
        this.tail = objArr;
        this.size = size() - (tailSize - iX);
        return iX;
    }

    private final Object[] f0(Object[] root, int shift, int index, e tailCarry) {
        int iA = n.a(index, shift);
        if (shift == 0) {
            Object obj = root[iA];
            Object[] objArrN = pq.n.n(root, B(root), iA, iA + 1, 32);
            objArrN[31] = tailCarry.getValue();
            tailCarry.b(obj);
            return objArrN;
        }
        int iA2 = root[31] == null ? n.a(i0() - 1, shift) : 31;
        Object[] objArrB = B(root);
        int i15 = shift - 5;
        int i16 = iA + 1;
        if (i16 <= iA2) {
            while (true) {
                objArrB[iA2] = f0((Object[]) objArrB[iA2], i15, 0, tailCarry);
                if (iA2 == i16) {
                    break;
                }
                iA2--;
            }
        }
        objArrB[iA] = f0((Object[]) objArrB[iA], i15, index, tailCarry);
        return objArrB;
    }

    private final Object g0(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        x2.a.a(index < size);
        if (size == 1) {
            Object obj = this.tail[0];
            Q(root, rootSize, shift);
            return obj;
        }
        Object[] objArr = this.tail;
        Object obj2 = objArr[index];
        Object[] objArrN = pq.n.n(objArr, B(objArr), index, index + 1, size);
        objArrN[size - 1] = null;
        this.root = root;
        this.tail = objArrN;
        this.size = (rootSize + size) - 1;
        this.rootShift = shift;
        return obj2;
    }

    private final Object[] h(int index) {
        if (i0() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i15 = this.rootShift; i15 > 0; i15 -= 5) {
            objArr = objArr[n.a(index, i15)];
        }
        return objArr;
    }

    private final Object[] h0(Object[] root, int size) {
        if (!((size & 31) == 0)) {
            w3.a("invalid size");
        }
        if (size == 0) {
            this.rootShift = 0;
            return null;
        }
        int i15 = size - 1;
        while (true) {
            int i16 = this.rootShift;
            if ((i15 >> i16) != 0) {
                return L(root, i15, i16);
            }
            this.rootShift = i16 - 5;
            root = root[0];
        }
    }

    private final Object[] i(Object[] buffer, int bufferIndex, Iterator<? extends Object> sourceIterator) {
        while (bufferIndex < 32 && sourceIterator.hasNext()) {
            buffer[bufferIndex] = sourceIterator.next();
            bufferIndex++;
        }
        return buffer;
    }

    private final int i0() {
        if (size() <= 32) {
            return 0;
        }
        return n.d(size());
    }

    private final Object[] j0(Object[] root, int shift, int index, E e15, e oldElementCarry) {
        int iA = n.a(index, shift);
        Object[] objArrB = B(root);
        if (shift != 0) {
            objArrB[iA] = j0((Object[]) objArrB[iA], shift - 5, index, e15, oldElementCarry);
            return objArrB;
        }
        if (objArrB != root) {
            ((AbstractList) this).modCount++;
        }
        oldElementCarry.b(objArrB[iA]);
        objArrB[iA] = e15;
        return objArrB;
    }

    private final Object[] k0(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator<Object[]> listIteratorA = A(i0() >> 5);
        while (listIteratorA.previousIndex() != startLeafIndex) {
            Object[] objArrPrevious = listIteratorA.previous();
            pq.n.n(objArrPrevious, nextBuffer, 0, 32 - rightShift, 32);
            nextBuffer = C(objArrPrevious, rightShift);
            nullBuffers--;
            buffers[nullBuffers] = nextBuffer;
        }
        return listIteratorA.previous();
    }

    private final void l0(Collection<? extends E> elements, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArrE;
        if (!(nullBuffers >= 1)) {
            w3.a("requires at least one nullBuffer");
        }
        Object[] objArrB = B(startBuffer);
        buffers[0] = objArrB;
        int i15 = index & 31;
        int size = ((index + elements.size()) - 1) & 31;
        int i16 = (startBufferSize - i15) + size;
        if (i16 < 32) {
            pq.n.n(objArrB, nextBuffer, size + 1, i15, startBufferSize);
        } else {
            int i17 = i16 - 31;
            if (nullBuffers == 1) {
                objArrE = objArrB;
            } else {
                objArrE = E();
                nullBuffers--;
                buffers[nullBuffers] = objArrE;
            }
            int i18 = startBufferSize - i17;
            pq.n.n(objArrB, nextBuffer, 0, i18, startBufferSize);
            pq.n.n(objArrB, objArrE, size + 1, i15, i18);
            nextBuffer = objArrE;
        }
        Iterator<? extends E> it = elements.iterator();
        i(objArrB, i15, it);
        for (int i19 = 1; i19 < nullBuffers; i19++) {
            buffers[i19] = i(E(), 0, it);
        }
        i(nextBuffer, 0, it);
    }

    private final int m0() {
        return o0(size());
    }

    private final int o0(int size) {
        return size <= 32 ? size : size - n.d(size);
    }

    private final void t(Collection<? extends E> elements, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        int i15 = index >> 5;
        Object[] objArrK0 = k0(i15, rightShift, buffers, nullBuffers, nextBuffer);
        int iI0 = nullBuffers - (((i0() >> 5) - 1) - i15);
        l0(elements, index, objArrK0, 32, buffers, iI0, iI0 < nullBuffers ? buffers[iI0] : nextBuffer);
    }

    private final Object[] u(Object[] root, int shift, int index, Object element, e elementCarry) {
        Object obj;
        int iA = n.a(index, shift);
        if (shift == 0) {
            elementCarry.b(root[31]);
            Object[] objArrN = pq.n.n(root, B(root), iA + 1, iA, 31);
            objArrN[iA] = element;
            return objArrN;
        }
        Object[] objArrB = B(root);
        int i15 = shift - 5;
        objArrB[iA] = u((Object[]) objArrB[iA], i15, index, element, elementCarry);
        while (true) {
            iA++;
            if (iA >= 32 || (obj = objArrB[iA]) == null) {
                break;
            }
            objArrB[iA] = u((Object[]) obj, i15, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrB;
    }

    private final void v(Object[] root, int index, E element) {
        int iM0 = m0();
        Object[] objArrB = B(this.tail);
        if (iM0 < 32) {
            pq.n.n(this.tail, objArrB, index + 1, index, iM0);
            objArrB[index] = element;
            this.root = root;
            this.tail = objArrB;
            this.size = size() + 1;
            return;
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        pq.n.n(objArr, objArrB, index + 1, index, 31);
        objArrB[index] = element;
        U(root, objArrB, G(obj));
    }

    private final boolean w(Object[] buffer) {
        return buffer.length == 33 && buffer[32] == this.ownership;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        ((AbstractList) this).modCount++;
        int iM0 = m0();
        if (iM0 < 32) {
            Object[] objArrB = B(this.tail);
            objArrB[iM0] = element;
            this.tail = objArrB;
            this.size = size() + 1;
        } else {
            U(this.root, this.tail, G(element));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM0 = m0();
        Iterator<? extends E> it = elements.iterator();
        if (32 - iM0 >= elements.size()) {
            this.tail = i(B(this.tail), iM0, it);
            this.size = size() + elements.size();
        } else {
            int size = ((elements.size() + iM0) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = i(B(this.tail), iM0, it);
            for (int i15 = 1; i15 < size; i15++) {
                objArr[i15] = i(E(), 0, it);
            }
            this.root = T(this.root, i0(), objArr);
            this.tail = i(E(), 0, it);
            this.size = size() + elements.size();
        }
        return true;
    }

    @Override // t2.e.a
    public t2.e<E> build() {
        f fVar;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            fVar = this.vector;
        } else {
            this.ownership = new x2.e();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                fVar = objArr2.length == 0 ? n.b() : new l(Arrays.copyOf(this.tail, size()));
            } else {
                fVar = new f(this.root, this.tail, size(), this.rootShift);
            }
        }
        this.vector = fVar;
        return (t2.e<E>) fVar;
    }

    @Override // pq.h
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public final boolean e0(er.l<? super E, Boolean> predicate) {
        boolean zY = Y(predicate);
        if (zY) {
            ((AbstractList) this).modCount++;
        }
        return zY;
    }

    @Override // pq.h
    public E f(int index) {
        x2.d.a(index, size());
        ((AbstractList) this).modCount++;
        int iI0 = i0();
        if (index >= iI0) {
            return (E) g0(this.root, iI0, this.rootShift, index - iI0);
        }
        e eVar = new e(this.tail[0]);
        g0(f0(this.root, this.rootShift, index, eVar), iI0, this.rootShift, 0);
        return (E) eVar.getValue();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        x2.d.a(index, size());
        return (E) h(index)[index & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    public final int k() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection<?> elements) {
        return e0(new er.l() { // from class: u2.g
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(h.Z(elements, obj));
            }
        });
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        x2.d.a(index, size());
        if (i0() > index) {
            e eVar = new e(null);
            this.root = j0(this.root, this.rootShift, index, element, eVar);
            return (E) eVar.getValue();
        }
        Object[] objArrB = B(this.tail);
        if (objArrB != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i15 = index & 31;
        E e15 = (E) objArrB[i15];
        objArrB[i15] = element;
        this.tail = objArrB;
        return e15;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        x2.d.b(index, size());
        return new j(this, index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        x2.d.b(index, size());
        if (index == size()) {
            add(element);
            return;
        }
        ((AbstractList) this).modCount++;
        int iI0 = i0();
        if (index >= iI0) {
            v(this.root, index - iI0, element);
        } else {
            e eVar = new e(null);
            v(u(this.root, this.rootShift, index, element, eVar), 0, eVar.getValue());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        h<E> hVar;
        Collection<? extends E> collection;
        Object[] objArrN;
        Object[][] objArr;
        x2.d.b(index, size());
        if (index == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i15 = (index >> 5) << 5;
        int size = (((size() - i15) + elements.size()) - 1) / 32;
        if (size == 0) {
            x2.a.a(index >= i0());
            int i16 = index & 31;
            int size2 = ((index + elements.size()) - 1) & 31;
            Object[] objArr2 = this.tail;
            Object[] objArrN2 = pq.n.n(objArr2, B(objArr2), size2 + 1, i16, m0());
            i(objArrN2, i16, elements.iterator());
            this.tail = objArrN2;
            this.size = size() + elements.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iM0 = m0();
        int iO0 = o0(size() + elements.size());
        if (index >= i0()) {
            objArrN = E();
            objArr = objArr3;
            hVar = this;
            collection = elements;
            hVar.l0(collection, index, this.tail, iM0, objArr, size, objArrN);
        } else {
            hVar = this;
            collection = elements;
            if (iO0 > iM0) {
                int i17 = iO0 - iM0;
                Object[] objArrC = C(hVar.tail, i17);
                hVar.t(collection, index, i17, objArr3, size, objArrC);
                objArr = objArr3;
                objArrN = objArrC;
            } else {
                int i18 = iM0 - iO0;
                objArrN = pq.n.n(hVar.tail, E(), 0, i18, iM0);
                int i19 = 32 - i18;
                Object[] objArrC2 = C(hVar.tail, i19);
                int i25 = size - 1;
                objArr3[i25] = objArrC2;
                hVar.t(collection, index, i19, objArr3, i25, objArrC2);
                collection = collection;
                objArr = objArr3;
                hVar = hVar;
            }
        }
        hVar.root = T(hVar.root, i15, objArr);
        hVar.tail = objArrN;
        hVar.size = size() + collection.size();
        return true;
    }
}
