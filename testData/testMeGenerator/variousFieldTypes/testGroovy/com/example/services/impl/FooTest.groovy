package com.example.services.impl

import org.junit.Test
import org.junit.Before
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import static org.mockito.Mockito.*

/** created by TestMe integration test on MMXVI */
class FooTest {
    @Mock
    com.example.warriers.FooFighter fooFighter
    @Mock
    com.example.warriers.FooFighter fooFighterProtected
    @Mock
    com.example.warriers.FooFighter fooFighterDefault
    @Mock
    com.example.warriers.FooFighter fooFighterPublic
    @Mock
    com.example.warriers.FooFighter fooFighterFinal
    @Mock
    com.example.warriers.FooFighter fooFighterStatic
    //Field byteFieldWrapper of type Byte - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    //Field shortFieldWrapper of type Short - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    //Field intFieldWrapper of type Integer - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    //Field longFieldWrapper of type Long - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    //Field floatFieldWrapper of type Float - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    //Field doubleFieldWrapper of type Double - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    //Field charFieldWrapper of type Character - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    //Field booleanFieldWrapper of type Boolean - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    @Mock
    com.example.services.impl.Foo.PublicInnerClass publicInnerClass
    @Mock
    com.example.services.impl.Foo.InnerStaticClass innerStaticClass
    @Mock
    com.example.services.impl.Foo.PublicInnerClass.InnerOfPublicInnerClass innerOfPublicInnerClass
    @Mock
    com.example.services.impl.Foo.InnerClass innerClass
    @Mock
    com.example.services.impl.Foo.PublicInnerClass anonymousPublicInnerClass
    @InjectMocks
    com.example.services.impl.Foo foo

    @Before
    void setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    void testFight() {
        java.lang.String result = foo.fight(new com.example.foes.Fire(), "foeName")
        assert result == "replaceMeWithExpectedResult"
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme