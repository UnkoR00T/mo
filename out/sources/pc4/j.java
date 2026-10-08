package pc4;

import android.app.Application;
import android.content.Context;
import f00.SharedDestinationSpec;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.deserializer.ByteArrayDeserializer;
import pl.gov.coi.common.network.deserializer.EnumTypeAdapterFactory;
import pl.gov.coi.common.network.deserializer.LocalDateDeserializer;
import pl.gov.coi.common.network.deserializer.NullableTypeAdapterFactory;
import pl.gov.coi.common.network.deserializer.OffsetDateTimeDeserializer;
import pl.gov.coi.common.network.serializer.LocalDateSerializer;
import pl.gov.coi.common.network.serializer.OffsetDateTimeSerializer;
import pl.gov.coi.mobywatel.be.offlinedocumentsservice.deserializer.DocumentTypeDeserializer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¨\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\t\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b!\u0010\"J!\u0010'\u001a\u00020&2\b\b\u0001\u0010#\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010-J'\u00103\u001a\u0002022\u0006\u0010*\u001a\u00020)2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0007¢\u0006\u0004\b8\u00109JW\u0010M\u001a\u00020L2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0007¢\u0006\u0004\bM\u0010NJ'\u0010P\u001a\u00020O2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\bP\u0010QJ\u0019\u0010S\u001a\u00020R2\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\bS\u0010TJ\u0017\u0010X\u001a\u00020W2\u0006\u0010V\u001a\u00020UH\u0007¢\u0006\u0004\bX\u0010YJ\u0019\u0010[\u001a\u00020Z2\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020>2\u0006\u0010^\u001a\u00020]H\u0007¢\u0006\u0004\b_\u0010`J'\u0010e\u001a\u00020F2\u0006\u0010^\u001a\u00020]2\u0006\u0010b\u001a\u00020a2\u0006\u0010d\u001a\u00020cH\u0007¢\u0006\u0004\be\u0010fJ'\u0010i\u001a\u00020@2\u0006\u0010^\u001a\u00020]2\u0006\u0010h\u001a\u00020g2\u0006\u0010b\u001a\u00020aH\u0007¢\u0006\u0004\bi\u0010jJ'\u0010m\u001a\u00020B2\u0006\u0010^\u001a\u00020]2\u0006\u0010b\u001a\u00020a2\u0006\u0010l\u001a\u00020kH\u0007¢\u0006\u0004\bm\u0010nJ\u001f\u0010p\u001a\u00020H2\u0006\u0010^\u001a\u00020]2\u0006\u0010o\u001a\u00020\u0010H\u0007¢\u0006\u0004\bp\u0010qJÍ\u0001\u0010\u009b\u0001\u001a\u00030\u009a\u00012\u0006\u0010s\u001a\u00020r2\u0006\u0010u\u001a\u00020t2\u0006\u0010w\u001a\u00020v2\u0006\u0010y\u001a\u00020x2\u0006\u0010{\u001a\u00020z2\u0006\u0010}\u001a\u00020|2\u0006\u0010\u007f\u001a\u00020~2\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\b\u0010\u0089\u0001\u001a\u00030\u0088\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\b\u0010\u008d\u0001\u001a\u00030\u008c\u00012\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\b\u0010\u0091\u0001\u001a\u00030\u0090\u00012\b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\b\u0010\u0095\u0001\u001a\u00030\u0094\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u00012\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0007¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001JB\u0010§\u0001\u001a\u00030¦\u00012\b\u0010\u009e\u0001\u001a\u00030\u009d\u00012\u000f\u0010¡\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u009f\u00012\b\u0010£\u0001\u001a\u00030¢\u00012\b\u0010¥\u0001\u001a\u00030¤\u0001H\u0007¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001d\u0010«\u0001\u001a\u00030 \u00012\b\u0010ª\u0001\u001a\u00030©\u0001H\u0007¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001d\u0010°\u0001\u001a\u00030¯\u00012\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0007¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0093\u0001\u0010Ë\u0001\u001a\u00030Ê\u00012\b\u0010³\u0001\u001a\u00030²\u00012\b\u0010µ\u0001\u001a\u00030´\u00012\b\u0010·\u0001\u001a\u00030¶\u00012\b\u0010¹\u0001\u001a\u00030¸\u00012\b\u0010»\u0001\u001a\u00030º\u00012\b\u0010½\u0001\u001a\u00030¼\u00012\u0006\u0010o\u001a\u00020\u00102\b\u0010¿\u0001\u001a\u00030¾\u00012\b\u0010Á\u0001\u001a\u00030À\u00012\b\u0010Ã\u0001\u001a\u00030Â\u00012\b\u0010Å\u0001\u001a\u00030Ä\u00012\b\u0010Ç\u0001\u001a\u00030Æ\u00012\b\u0010É\u0001\u001a\u00030È\u0001H\u0007¢\u0006\u0006\bË\u0001\u0010Ì\u0001Jc\u0010Ø\u0001\u001a\u00030×\u00012\b\u0010»\u0001\u001a\u00030º\u00012\b\u0010Î\u0001\u001a\u00030Í\u00012\b\u0010£\u0001\u001a\u00030¢\u00012\b\u0010Ð\u0001\u001a\u00030Ï\u00012\b\u0010Ò\u0001\u001a\u00030Ñ\u00012\u0006\u00101\u001a\u0002002\b\u0010Ô\u0001\u001a\u00030Ó\u00012\n\b\u0001\u0010Ö\u0001\u001a\u00030Õ\u0001H\u0007¢\u0006\u0006\bØ\u0001\u0010Ù\u0001JY\u0010è\u0001\u001a\u00030Ä\u00012\b\u0010Û\u0001\u001a\u00030Ú\u00012\b\u0010Ý\u0001\u001a\u00030Ü\u00012\b\u0010ß\u0001\u001a\u00030Þ\u00012\b\u0010á\u0001\u001a\u00030à\u00012\b\u0010ã\u0001\u001a\u00030â\u00012\b\u0010å\u0001\u001a\u00030ä\u00012\b\u0010ç\u0001\u001a\u00030æ\u0001H\u0007¢\u0006\u0006\bè\u0001\u0010é\u0001J\u001d\u0010í\u0001\u001a\u00030ì\u00012\b\u0010ë\u0001\u001a\u00030ê\u0001H\u0007¢\u0006\u0006\bí\u0001\u0010î\u0001J\u0013\u0010ð\u0001\u001a\u00030ï\u0001H\u0007¢\u0006\u0006\bð\u0001\u0010ñ\u0001J;\u0010÷\u0001\u001a\u00030ö\u00012\b\u0010µ\u0001\u001a\u00030´\u00012\b\u0010Ð\u0001\u001a\u00030Ï\u00012\b\u0010ó\u0001\u001a\u00030ò\u00012\b\u0010õ\u0001\u001a\u00030ô\u0001H\u0007¢\u0006\u0006\b÷\u0001\u0010ø\u0001J7\u0010ü\u0001\u001a\u00030û\u00012\u0006\u0010\t\u001a\u00020\u00062\b\u0010Ð\u0001\u001a\u00030Ï\u00012\u0006\u0010o\u001a\u00020\u00102\b\u0010ú\u0001\u001a\u00030ù\u0001H\u0007¢\u0006\u0006\bü\u0001\u0010ý\u0001J\u001d\u0010\u0080\u0002\u001a\u00030À\u00012\b\u0010ÿ\u0001\u001a\u00030þ\u0001H\u0007¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u001d\u0010\u0083\u0002\u001a\u00030\u0082\u00022\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0007¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002J\u0013\u0010\u0086\u0002\u001a\u00030\u0085\u0002H\u0007¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002J/\u0010\u008d\u0002\u001a\u00030\u008c\u00022\u0006\u0010V\u001a\u00020U2\b\u0010\u0089\u0002\u001a\u00030\u0088\u00022\b\u0010\u008b\u0002\u001a\u00030\u008a\u0002H\u0007¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002J\u0013\u0010\u008f\u0002\u001a\u00030ô\u0001H\u0007¢\u0006\u0006\b\u008f\u0002\u0010\u0090\u0002J\u0013\u0010\u0092\u0002\u001a\u00030\u0091\u0002H\u0007¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002J\u0013\u0010\u0095\u0002\u001a\u00030\u0094\u0002H\u0007¢\u0006\u0006\b\u0095\u0002\u0010\u0096\u0002JM\u0010 \u0002\u001a\u00030\u009f\u00022\u0006\u00101\u001a\u0002002\b\u0010»\u0001\u001a\u00030º\u00012\b\u0010\u0098\u0002\u001a\u00030\u0097\u00022\b\u0010\u009a\u0002\u001a\u00030\u0099\u00022\b\u0010\u009c\u0002\u001a\u00030\u009b\u00022\b\u0010\u009e\u0002\u001a\u00030\u009d\u0002H\u0007¢\u0006\u0006\b \u0002\u0010¡\u0002J\u001a\u0010¢\u0002\u001a\u00020J2\u0006\u0010^\u001a\u00020]H\u0007¢\u0006\u0006\b¢\u0002\u0010£\u0002J\u001d\u0010¦\u0002\u001a\u00030Õ\u00012\b\u0010¥\u0002\u001a\u00030¤\u0002H\u0007¢\u0006\u0006\b¦\u0002\u0010§\u0002J\u001e\u0010ª\u0002\u001a\u00030©\u00022\t\b\u0001\u0010¨\u0002\u001a\u00020\u0006H\u0007¢\u0006\u0006\bª\u0002\u0010«\u0002¨\u0006¬\u0002"}, d2 = {"Lpc4/j;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Landroid/content/Context;", "j", "(Landroid/app/Application;)Landroid/content/Context;", "context", "Loc4/b;", "t", "(Landroid/content/Context;)Loc4/b;", "Lub/p0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Landroid/content/Context;)Lub/p0;", "Lpx/d;", "logger", "Liy/t;", "keyStoreProvider", "Ly00/j;", "certUpdaterConfig", "Ly00/i;", "e", "(Landroid/content/Context;Lpx/d;Liy/t;Ly00/j;)Ly00/i;", "Lsw/d;", "enabledDeveloperSettingsManager", "Lsw/b;", "disabledDeveloperSettingsManager", "Lsw/a;", "m", "(Lsw/d;Lsw/b;)Lsw/a;", "Lyw/b;", "a", "(Landroid/content/Context;)Lyw/b;", "appContext", "Lhj2/a;", "clearCertificatesUseCase", "Lv64/d;", "f", "(Landroid/content/Context;Lhj2/a;)Lv64/d;", "Lt10/m;", "sharedPreferencesRegistry", "Lv64/g;", "h", "(Lt10/m;)Lv64/g;", "Lq34/w1;", "removeSchoolCardIfExistUC", "Lc54/b;", "isFeatureEnabledUseCase", "Lv64/h;", "i", "(Lt10/m;Lq34/w1;Lc54/b;)Lv64/h;", "Lt10/f;", "dataStoreRegistry", "Lv64/e;", "g", "(Lt10/f;)Lv64/e;", "Lmz/l;", "intentManager", "Lyn3/d;", "verificationIntentHandler", "Lpl/gov/mc/fringers/mobywatel/g;", "launchAppIntentHandler", "Lpl/gov/mc/fringers/mobywatel/a0;", "pushNotificationIntentHandler", "Lpl/gov/mc/fringers/mobywatel/k;", "mJuniorPushNotificationIntentHandler", "Lno2/a;", "localNotificationIntentHandler", "Lpl/gov/mc/fringers/mobywatel/j;", "mJuniorInterceptorIntentHandler", "Lzy2/a;", "qualifiedSignatureIntentHandler", "Lus2/a;", "peselRestrictionIntentHandler", "Lpd4/g;", "K", "(Lmz/l;Lyn3/d;Lpl/gov/mc/fringers/mobywatel/g;Lpl/gov/mc/fringers/mobywatel/a0;Lpl/gov/mc/fringers/mobywatel/k;Lno2/a;Lpl/gov/mc/fringers/mobywatel/j;Lzy2/a;Lus2/a;)Lpd4/g;", "Lpd4/h;", "N", "(Lmz/l;Lyn3/d;Lpl/gov/mc/fringers/mobywatel/g;)Lpd4/h;", "Lrz/a;", "d", "(Landroid/content/Context;)Lrz/a;", "Ljx/d;", "deviceInfo", "Lpl/gov/coi/common/network/u;", "n", "(Ljx/d;)Lpl/gov/coi/common/network/u;", "Lxj2/a;", "z", "(Landroid/content/Context;)Lxj2/a;", "La14/s;", "launchAppUseCase", "C", "(La14/s;)Lpl/gov/mc/fringers/mobywatel/g;", "Ln90/a;", "isMJuniorAppActivatedUC", "Lyg0/a;", "consumeForceConfigChangeUC", ip.a.f96138c, "(La14/s;Ln90/a;Lyg0/a;)Lpl/gov/mc/fringers/mobywatel/j;", "Lt74/b;", "updateNotDisplayedPushCountUC", "I", "(La14/s;Lt74/b;Ln90/a;)Lpl/gov/mc/fringers/mobywatel/a0;", "Ly70/h4;", "setPendingNavigationUC", "F", "(La14/s;Ln90/a;Ly70/h4;)Lpl/gov/mc/fringers/mobywatel/k;", "remoteLogger", "J", "(La14/s;Lpx/d;)Lzy2/a;", "Loz/d;", "activityViewLifecycleConnector", "Ly00/a0;", "secureWindowConnector", "Lw00/a;", "permissionManagerActivityLifecycleConnector", "Lb00/p;", "photoTakerManagerActivityLifecycleConnector", "Lb00/u;", "takePictureOrPickMediaManagerConnector", "Lzz/c;", "filePickerManagerActivityLifecycleConnector", "Lb00/h;", "mediaPickerManagerConnector", "Lb00/m;", "multipleMediaPickerManagerConnector", "Lmz/m;", "intentManagerConnector", "Lpz/c;", "loaderManagerConnector", "Lqw/b;", "biometricManagerConnector", "Lmz/h;", "intentActionManagerConnector", "Lkz/b;", "inAppReviewPromptManagerConnector", "Ls00/c;", "nfcManagerConnector", "Lnz/a;", "keyboardManagerConnector", "Li70/f;", "globalSnackBarManagerConnector", "Ly00/t;", "keyguardManagerActivityLifecycleConnector", "Lrw/a;", "bluetoothManagerConnector", "Lv44/b;", "googlePayManagerConnector", "Loz/s;", "restartApplicationConnector", "Loz/c;", "b", "(Loz/d;Ly00/a0;Lw00/a;Lb00/p;Lb00/u;Lzz/c;Lb00/h;Lb00/m;Lmz/m;Lpz/c;Lqw/b;Lmz/h;Lkz/b;Ls00/c;Lnz/a;Li70/f;Ly00/t;Lrw/a;Lv44/b;Loz/s;)Loz/c;", "Lv64/c;", "checkIsActivatedUseCase", "Laq/a;", "Lwy/d;", "sessionTokenLoader", "Lez/a;", "currentTimeProvider", "Lzz3/a;", "authenticationContainersInteractor", "Lwy/b;", "G", "(Lv64/c;Laq/a;Lez/a;Lzz3/a;)Lwy/b;", "Lwz3/h;", "loadAccessTokenUseCase", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lwz3/h;)Lwy/d;", "Ly04/a;", "buildConfigRepository", "Lox0/t;", "O", "(Ly04/a;)Lox0/t;", "Liy/e0;", "signedDataDecoder", "Lay/j;", "jsonSerializer", "Liy/a;", "base64Coder", "Liy/c;", "bytesConverter", "Lg34/c;", "identityManager", "Lpl/gov/coi/mobywatel/feature/legacy/storage/l;", "serviceToContainerIdMapper", "Liy/v;", "pkcs12Manager", "Lyi2/a;", "legacyExceptionParser", "Lvm3/a;", "vehicleCategoryMapper", "Lay/h;", "jsonFactory", "Lpl/gov/coi/common/network/deserializer/NullableTypeAdapterFactory;", "nullableTypeAdapterFactory", "Lez/c;", "dateConverter", "Lnd4/k;", "r", "(Liy/e0;Lay/j;Liy/a;Liy/c;Lg34/c;Lpl/gov/coi/mobywatel/feature/legacy/storage/l;Lpx/d;Liy/v;Lyi2/a;Lvm3/a;Lay/h;Lpl/gov/coi/common/network/deserializer/NullableTypeAdapterFactory;Lez/c;)Lnd4/k;", "Laz/f;", "fileManager", "Lez/e;", "dateFormatter", "Lf10/b;", "masterKeyCipher", "Laz/a;", "bytesCompressor", "Ls10/a;", "fileRegistry", "Lz04/a;", "w", "(Lg34/c;Laz/f;Lez/a;Lez/e;Lf10/b;Lc54/b;Laz/a;Ls10/a;)Lz04/a;", "Lpl/gov/coi/common/network/deserializer/OffsetDateTimeDeserializer;", "offsetDateTimeDeserializer", "Lpl/gov/coi/common/network/serializer/OffsetDateTimeSerializer;", "offsetDateTimeSerializer", "Lpl/gov/coi/common/network/deserializer/LocalDateDeserializer;", "localDateDeserializer", "Lpl/gov/coi/common/network/serializer/LocalDateSerializer;", "localDateSerializer", "Lpl/gov/coi/common/network/deserializer/ByteArrayDeserializer;", "byteArrayDeserializer", "Lpl/gov/coi/common/network/deserializer/EnumTypeAdapterFactory;", "enumTypeAdapterFactory", "Lpl/gov/coi/mobywatel/be/offlinedocumentsservice/deserializer/DocumentTypeDeserializer;", "documentTypeDeserializer", "B", "(Lpl/gov/coi/common/network/deserializer/OffsetDateTimeDeserializer;Lpl/gov/coi/common/network/serializer/OffsetDateTimeSerializer;Lpl/gov/coi/common/network/deserializer/LocalDateDeserializer;Lpl/gov/coi/common/network/serializer/LocalDateSerializer;Lpl/gov/coi/common/network/deserializer/ByteArrayDeserializer;Lpl/gov/coi/common/network/deserializer/EnumTypeAdapterFactory;Lpl/gov/coi/mobywatel/be/offlinedocumentsservice/deserializer/DocumentTypeDeserializer;)Lay/h;", "Lc44/a;", "getBaseUrlUseCase", "Lpl/gov/coi/common/network/k;", "s", "(Lc44/a;)Lpl/gov/coi/common/network/k;", "Lt10/g;", "u", "()Lt10/g;", "Lev1/a;", "dynamicDocumentSchemaDecoder", "Lxw/d;", "dispatcherProvider", "Lh34/a;", "q", "(Lay/j;Lez/e;Lev1/a;Lxw/d;)Lh34/a;", "Liy/w;", "secureRandomFactory", "Lq54/a;", "E", "(Landroid/content/Context;Lez/e;Lpx/d;Liy/w;)Lq54/a;", "Lmx/c;", "labelProvider", "c", "(Lmx/c;)Lyi2/a;", "Lqo2/a;", "y", "(Ly04/a;)Lqo2/a;", "Lez/g;", "M", "()Lez/g;", "Ljx/a;", "appInfo", "Ljx/g;", "systemInfo", "Lp00/c;", "A", "(Ljx/d;Ljx/a;Ljx/g;)Lp00/c;", "o", "()Lxw/d;", "Lj34/b;", "p", "()Lj34/b;", "Lch1/b0;", "x", "()Lch1/b0;", "Lq34/g1;", "hasDocumentWithActiveCertUseCase", "Lk24/i;", "hasAnyActiveCertificateUC", "Lk24/g;", "getMainCertificateTypeUC", "Ls24/a;", "containersErrorInteractor", "Ldx/a;", "l", "(Lc54/b;Lg34/c;Lq34/g1;Lk24/i;Lk24/g;Ls24/a;)Ldx/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(La14/s;)Lus2/a;", "Lcz/c;", "storageFactory", "v", "(Lcz/c;)Ls10/a;", "applicationContext", "Lq10/a;", "k", "(Landroid/content/Context;)Lq10/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f155026a = new j();

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, d2 = {"pc4/j$a", "Lxw/d;", "Lju/n2;", "a", "Lju/n2;", "getMain", "()Lju/n2;", "main", "Lju/l0;", "b", "Lju/l0;", "()Lju/l0;", "io", "c", "getDefault", "default", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements xw.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ju.n2 main = ju.g1.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ju.l0 io = ju.g1.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ju.l0 default = ju.g1.a();

        a() {
        }

        @Override // xw.d
        public /* bridge */ <T> Object a(er.p<? super ju.p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
            return super.a(pVar, eVar);
        }

        @Override // xw.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public ju.l0 getIo() {
            return this.io;
        }

        @Override // xw.d
        public /* bridge */ <T> Object d(er.p<? super ju.p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
            return super.d(pVar, eVar);
        }

        @Override // xw.d
        public ju.l0 getDefault() {
            return this.default;
        }
    }

    static {
        f00.r.K().add(new SharedDestinationSpec(cb4.e.class, eb4.i.class, l2.f155100a.b()));
    }

    private j() {
    }

    public final p00.c A(jx.d deviceInfo, jx.a appInfo, jx.g systemInfo) {
        return new k14.a(deviceInfo, appInfo, systemInfo);
    }

    public final ay.h B(OffsetDateTimeDeserializer offsetDateTimeDeserializer, OffsetDateTimeSerializer offsetDateTimeSerializer, LocalDateDeserializer localDateDeserializer, LocalDateSerializer localDateSerializer, ByteArrayDeserializer byteArrayDeserializer, EnumTypeAdapterFactory enumTypeAdapterFactory, DocumentTypeDeserializer documentTypeDeserializer) {
        return new ed4.a(new pl.gov.coi.common.network.m(offsetDateTimeDeserializer, offsetDateTimeSerializer, localDateDeserializer, localDateSerializer, byteArrayDeserializer, enumTypeAdapterFactory), documentTypeDeserializer);
    }

    public final pl.gov.mc.fringers.mobywatel.g C(a14.s launchAppUseCase) {
        return new pl.gov.mc.fringers.mobywatel.h(launchAppUseCase);
    }

    public final pl.gov.mc.fringers.mobywatel.j D(a14.s launchAppUseCase, n90.a isMJuniorAppActivatedUC, yg0.a consumeForceConfigChangeUC) {
        return new pl.gov.mc.fringers.mobywatel.i(isMJuniorAppActivatedUC, launchAppUseCase, consumeForceConfigChangeUC);
    }

    public final q54.a E(Context context, ez.e dateFormatter, px.d remoteLogger, iy.w secureRandomFactory) {
        return new fd4.c(context, dateFormatter, remoteLogger, secureRandomFactory, ub.p0.INSTANCE.a(context));
    }

    public final pl.gov.mc.fringers.mobywatel.k F(a14.s launchAppUseCase, n90.a isMJuniorAppActivatedUC, p135y70.h4 setPendingNavigationUC) {
        return new pl.gov.mc.fringers.mobywatel.k(isMJuniorAppActivatedUC, launchAppUseCase, setPendingNavigationUC);
    }

    public final wy.b G(v64.c checkIsActivatedUseCase, aq.a<wy.d> sessionTokenLoader, ez.a currentTimeProvider, zz3.a authenticationContainersInteractor) {
        return new fd4.d(checkIsActivatedUseCase, sessionTokenLoader, currentTimeProvider, authenticationContainersInteractor);
    }

    public final us2.a H(a14.s launchAppUseCase) {
        return new us2.b(launchAppUseCase);
    }

    public final pl.gov.mc.fringers.mobywatel.a0 I(a14.s launchAppUseCase, t74.b updateNotDisplayedPushCountUC, n90.a isMJuniorAppActivatedUC) {
        return new pl.gov.mc.fringers.mobywatel.b0(isMJuniorAppActivatedUC, launchAppUseCase, updateNotDisplayedPushCountUC);
    }

    public final zy2.a J(a14.s launchAppUseCase, px.d remoteLogger) {
        return new zy2.b(launchAppUseCase, remoteLogger);
    }

    public final pd4.g K(mz.l intentManager, yn3.d verificationIntentHandler, pl.gov.mc.fringers.mobywatel.g launchAppIntentHandler, pl.gov.mc.fringers.mobywatel.a0 pushNotificationIntentHandler, pl.gov.mc.fringers.mobywatel.k mJuniorPushNotificationIntentHandler, no2.a localNotificationIntentHandler, pl.gov.mc.fringers.mobywatel.j mJuniorInterceptorIntentHandler, zy2.a qualifiedSignatureIntentHandler, us2.a peselRestrictionIntentHandler) {
        return new pd4.g(intentManager, verificationIntentHandler, pushNotificationIntentHandler, mJuniorPushNotificationIntentHandler, localNotificationIntentHandler, launchAppIntentHandler, mJuniorInterceptorIntentHandler, qualifiedSignatureIntentHandler, peselRestrictionIntentHandler);
    }

    public final wy.d L(wz3.h loadAccessTokenUseCase) {
        return new fd4.e(loadAccessTokenUseCase);
    }

    public final ez.g M() {
        return new b20.f();
    }

    public final pd4.h N(mz.l intentManager, yn3.d verificationIntentHandler, pl.gov.mc.fringers.mobywatel.g launchAppIntentHandler) {
        return new pd4.h(intentManager, verificationIntentHandler, launchAppIntentHandler);
    }

    public final ox0.t O(y04.a buildConfigRepository) {
        return new md4.b(buildConfigRepository);
    }

    public final ub.p0 P(Context context) {
        return ub.p0.INSTANCE.a(context);
    }

    public final yw.b a(Context context) {
        return new pw.b(context);
    }

    public final oz.c b(oz.d activityViewLifecycleConnector, y00.a0 secureWindowConnector, w00.a permissionManagerActivityLifecycleConnector, b00.p photoTakerManagerActivityLifecycleConnector, b00.u takePictureOrPickMediaManagerConnector, zz.c filePickerManagerActivityLifecycleConnector, b00.h mediaPickerManagerConnector, b00.m multipleMediaPickerManagerConnector, mz.m intentManagerConnector, pz.c loaderManagerConnector, qw.b biometricManagerConnector, mz.h intentActionManagerConnector, kz.b inAppReviewPromptManagerConnector, s00.c nfcManagerConnector, nz.a keyboardManagerConnector, i70.f globalSnackBarManagerConnector, y00.t keyguardManagerActivityLifecycleConnector, rw.a bluetoothManagerConnector, v44.b googlePayManagerConnector, oz.s restartApplicationConnector) {
        return new pl.gov.mc.fringers.mobywatel.a(activityViewLifecycleConnector, secureWindowConnector, permissionManagerActivityLifecycleConnector, photoTakerManagerActivityLifecycleConnector, takePictureOrPickMediaManagerConnector, filePickerManagerActivityLifecycleConnector, mediaPickerManagerConnector, multipleMediaPickerManagerConnector, intentManagerConnector, loaderManagerConnector, biometricManagerConnector, intentActionManagerConnector, inAppReviewPromptManagerConnector, nfcManagerConnector, keyboardManagerConnector, globalSnackBarManagerConnector, keyguardManagerActivityLifecycleConnector, bluetoothManagerConnector, googlePayManagerConnector, restartApplicationConnector);
    }

    public final yi2.a c(mx.c labelProvider) {
        return new yi2.b(labelProvider);
    }

    public final rz.a d(Context context) {
        return new rz.b(context);
    }

    public final y00.i e(Context context, px.d logger, iy.t keyStoreProvider, y00.j certUpdaterConfig) {
        return new y00.y(context, logger, keyStoreProvider, certUpdaterConfig);
    }

    public final v64.d f(Context appContext, hj2.a clearCertificatesUseCase) {
        return new pd4.a(appContext, clearCertificatesUseCase);
    }

    public final v64.e g(t10.f dataStoreRegistry) {
        return new pd4.b(dataStoreRegistry);
    }

    public final v64.g h(t10.m sharedPreferencesRegistry) {
        return new pd4.c(sharedPreferencesRegistry);
    }

    public final v64.h i(t10.m sharedPreferencesRegistry, q34.w1 removeSchoolCardIfExistUC, c54.b isFeatureEnabledUseCase) {
        return new pd4.d(sharedPreferencesRegistry, removeSchoolCardIfExistUC, isFeatureEnabledUseCase);
    }

    public final Context j(Application application) {
        return application.getApplicationContext();
    }

    public final q10.a k(Context applicationContext) {
        return new q10.c(applicationContext, "mob_document_database_registry");
    }

    public final dx.a l(c54.b isFeatureEnabledUseCase, g34.c identityManager, q34.g1 hasDocumentWithActiveCertUseCase, k24.i hasAnyActiveCertificateUC, k24.g getMainCertificateTypeUC, s24.a containersErrorInteractor) {
        boolean zBooleanValue = isFeatureEnabledUseCase.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
        if (zBooleanValue) {
            return new r24.a(getMainCertificateTypeUC, containersErrorInteractor, hasAnyActiveCertificateUC);
        }
        if (zBooleanValue) {
            throw new oq.p();
        }
        return new w34.a(identityManager, hasDocumentWithActiveCertUseCase);
    }

    public final sw.a m(sw.d enabledDeveloperSettingsManager, sw.b disabledDeveloperSettingsManager) {
        return disabledDeveloperSettingsManager;
    }

    public final pl.gov.coi.common.network.u n(jx.d deviceInfo) {
        return new fd4.a(deviceInfo);
    }

    public final xw.d o() {
        return new a();
    }

    public final j34.b p() {
        return new hd4.a();
    }

    public final h34.a q(ay.j jsonSerializer, ez.e dateFormatter, ev1.a dynamicDocumentSchemaDecoder, xw.d dispatcherProvider) {
        return new nd4.b(jsonSerializer, dateFormatter, dynamicDocumentSchemaDecoder, dispatcherProvider);
    }

    public final nd4.k r(iy.e0 signedDataDecoder, ay.j jsonSerializer, iy.a base64Coder, iy.c bytesConverter, g34.c identityManager, pl.gov.coi.mobywatel.feature.legacy.storage.l serviceToContainerIdMapper, px.d remoteLogger, iy.v pkcs12Manager, yi2.a legacyExceptionParser, vm3.a vehicleCategoryMapper, ay.h jsonFactory, NullableTypeAdapterFactory nullableTypeAdapterFactory, ez.c dateConverter) {
        return new nd4.k(signedDataDecoder, jsonSerializer, bytesConverter, base64Coder, identityManager, serviceToContainerIdMapper, remoteLogger, pkcs12Manager, legacyExceptionParser, vehicleCategoryMapper, dateConverter, jsonFactory, nullableTypeAdapterFactory);
    }

    public final pl.gov.coi.common.network.k s(c44.a getBaseUrlUseCase) {
        return new f44.a(getBaseUrlUseCase);
    }

    public final oc4.b t(Context context) {
        return new oc4.b(context.getResources());
    }

    public final t10.g u() {
        return new pl.gov.mc.fringers.mobywatel.d();
    }

    public final s10.a v(cz.c storageFactory) {
        return new s10.c("mob_document_file_registry", storageFactory);
    }

    public final z04.a w(g34.c identityManager, az.f fileManager, ez.a currentTimeProvider, ez.e dateFormatter, f10.b masterKeyCipher, c54.b isFeatureEnabledUseCase, az.a bytesCompressor, s10.a fileRegistry) {
        return isFeatureEnabledUseCase.a(b54.c.MOB_DB_CONTAINERS).booleanValue() ? new nd4.p(fileManager, currentTimeProvider, dateFormatter, masterKeyCipher, bytesCompressor, fileRegistry) : new pl.gov.coi.mobywatel.feature.legacy.storage.f(identityManager, currentTimeProvider, dateFormatter);
    }

    public final ch1.b0 x() {
        return new pd4.e();
    }

    public final qo2.a y(y04.a buildConfigRepository) {
        return new pd4.f(buildConfigRepository);
    }

    public final xj2.a z(Context context) {
        return new fd4.b(context);
    }
}
