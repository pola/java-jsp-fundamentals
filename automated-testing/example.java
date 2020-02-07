@Test
public void testSetAndGetName() {
	Dog dog = new Dog("Fido", 4);
	Assert.assertEquals("Fido", dog.getName());
}
